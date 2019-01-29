package com.vmware.simplivity.citrixplugin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;


public class PowershellExecutionUtil 
{
	static LogUtil logUtil;
	private BasicCfgFileUtil fileUtil;
	private final Class clazz = PowershellExecutionUtil.class;
	private String msg = null;
	static int flag = 0;
	
	public PowershellExecutionUtil() {}
	
	public void setLogUtil(LogUtil logUtil) 
	{
		this.logUtil = logUtil;
	}


	public void setFileUtil(BasicCfgFileUtil fileUtil) 
	{
		System.out.println("Entering the setter of fileutil in PowershellExecutionUtil");
		this.fileUtil = fileUtil;
	}
	
	/**
	 * 	Method: callPowerShellScript
	 * 
	 * Description: call the powershell script
	 * 
	 * @param baseInputData
	 * @param scriptPath
	 * @return RETURNSTATE
	 */
	public RETURNSTATE callPowerShellScript(BaseInputData baseInputData, String scriptPath)
	{
		System.out.println("Entered callPowerShellScript method: "+baseInputData+" "+scriptPath);
		if(baseInputData == null || baseInputData.isEmpty())
		{
			msg = "Empty data";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return RETURNSTATE.FAILURE;
		}
		
		if(scriptPath == null || scriptPath.isEmpty())
		{
			msg = "No source script file found!";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return RETURNSTATE.FAILURE;
		}
		try
		{
			int numberOfThreads = baseInputData.getInputFileList().size();
			PowershellExecutor[] arrayOfThreads = new PowershellExecutor[numberOfThreads];
			
			for(int index=0; index < numberOfThreads; index++)
			{
				arrayOfThreads[index] = new PowershellExecutor(baseInputData, index, scriptPath);
				arrayOfThreads[index].start();
			}
			
			for(int index=0; index < numberOfThreads; index++)
			{
				System.out.println("Came into join loop"+index);
				arrayOfThreads[index].join();
				System.out.println("Join over"+index);
			}
		}
		catch(Exception e)
		{
			msg = "Error occured in execution "+e;
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return RETURNSTATE.FAILURE;
		}
		if(flag == -1)
		{
			flag = 0;
			msg = "Exceptions occured while executing the thread(s). Please check the logs";
			System.out.println(msg);
			return RETURNSTATE.PARTIALSUCCESS;
		}
				
		return RETURNSTATE.SUCCESS;
	}
	
	/** 
	 * Method: copyFileUsingFileChannels
	 * 
	 * Description: copies the files
	 * 
	 * @param source
	 * @param dest
	 * @return
	 */
	static boolean  copyFileUsingFileChannels(String source, String dest)
	{
		System.out.println("Enetered copyFileUsingFileChannels method: "+dest+" "+source);
		FileChannel inputChannel = null;
		FileChannel outputChannel = null;
		File srcFile = null;
		File destFile = null;
		
		try {
			srcFile = new File(source);
			destFile = new File(dest);
			inputChannel = new FileInputStream(srcFile).getChannel();
			outputChannel = new FileOutputStream(destFile).getChannel();
			outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
		} 
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			return false;
		}
		finally {
			try {
				inputChannel.close();
				outputChannel.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
				
			}
		}
		return true;
	}
	
	/**
	 * Thread class to run the scripts
	 *
	 */
	static class PowershellExecutor extends Thread
	{
		BaseInputData baseInputData;
		int index = -1;
		String scriptPath = null;
		String msg = null;
		
		public PowershellExecutor() {}
		
		PowershellExecutor(BaseInputData inputData, int index, String scriptPath)
		{
			this.baseInputData = inputData;
			this.index = index;
			this.scriptPath = scriptPath;
		}

		@Override
		public void run() 
		{
			String inputFileName = null;
			System.out.println("Entered run method..");
			synchronized (this) 
			{
				System.out.println("Entered synchronized block ...");
				
				try
				{
					msg = baseInputData.getVmData().get(index).getVmName()+" ==> Thread started...\n";
					
					PowershellExecutionUtil.logUtil.log(LEVEL.DEBUG, msg, PowershellExecutor.class, PowershellExecutionUtil.logUtil.getLineNumber());
					
					inputFileName = baseInputData.getInputFileList().get(index);
					
					String sCommand = "powershell.exe \"" +  scriptPath + "\"" +
			                " -inputfile " + "\"" + "\'" + inputFileName + 
			                "\'" + "\""  + " -logfile " + "\"" + "\'" +
			                logUtil.getLogFilePath() + "\'" + "\""; 
					
					msg = "Command to execute: "+sCommand;
					System.out.println(msg);
					PowershellExecutionUtil.logUtil.log(LEVEL.DEBUG, msg, PowershellExecutor.class, PowershellExecutionUtil.logUtil.getLineNumber());
					Process powerShellProcess = Runtime.getRuntime().exec(sCommand);
	                // Getting the results
	                powerShellProcess.getOutputStream().close(); 
	                
	                String line = "";
	                java.io.BufferedReader stdout = new java.io.BufferedReader( 
	                            new java.io.InputStreamReader(powerShellProcess.getInputStream()) );

	                while ((line = stdout.readLine()) != null) {
	                	System.out.println(line);
	                	PowershellExecutionUtil.logUtil.log(LEVEL.DEBUG, line, PowershellExecutor.class, PowershellExecutionUtil.logUtil.getLineNumber());
	                }
	                stdout.close();

	                java.io.BufferedReader stderr = new java.io.BufferedReader( 
	                            new java.io.InputStreamReader( powerShellProcess.getErrorStream()) );

	                while ((line = stderr.readLine()) != null) {
	                	PowershellExecutionUtil.flag = -1;
	                	System.out.println("ERROR:::"+line);
	                	PowershellExecutionUtil.logUtil.log(LEVEL.DEBUG, "ERROR:::"+line, PowershellExecutor.class, PowershellExecutionUtil.logUtil.getLineNumber());
	                }

	                stderr.close();
	                msg = "Finished Execution of Thread"+index;
	                System.out.println(msg);
	                PowershellExecutionUtil.logUtil.log(LEVEL.DEBUG, msg, PowershellExecutor.class, PowershellExecutionUtil.logUtil.getLineNumber());
				}
				catch(Exception e) 
				{
					msg = baseInputData.getVmData().get(index).getVmName()+" ==> Thread Terminated with an exception..."+e;
					System.out.println(msg);
					e.printStackTrace();
					PowershellExecutionUtil.logUtil.log(LEVEL.ERROR, msg, PowershellExecutor.class, PowershellExecutionUtil.logUtil.getLineNumber());
				}
				finally 
				{
	                try 
	                {
	                    java.io.File file = new java.io.File(inputFileName);
	                    if ( file.isFile() )
	                    {
	                    	//file.delete(); 
	                    }
	                }
	                catch(Exception ex) 
	                {
	                	msg = "PowerShell input file exception: "+ ex;
	                	PowershellExecutionUtil.logUtil.log(LEVEL.ERROR, msg, PowershellExecutor.class, PowershellExecutionUtil.logUtil.getLineNumber());
	                	ex.printStackTrace();
	                    return;
	                }
	            }//finally
			}//synchronized
		}//run
	}//class

}