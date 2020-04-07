package com.vmware.simplivity.citrixplugin.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.vmware.simplivity.citrixplugin.model.BaseInputData;
import com.vmware.simplivity.citrixplugin.model.ScriptInfo;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.Task;
import com.vmware.vim25.mo.TaskManager;


public class PowershellExecutionUtil 
{
	static Logger logger = Logger.getLogger(PowershellExecutionUtil.class);
	private String msg = null;
	static int flag1 = 0;
	static int flag2= 0;
	ServiceInstance si;
	HostSystem host;
	static Map<String, String> ERROR_MAP = null;
	static String error1 = "";
	static String error2 = "";

	
	public PowershellExecutionUtil() {}
	
	/**
	 * 	Method: callPowerShellScript
	 * 
	 * Description: call the powershell script
	 * 
	 * @param baseInputData
	 * @param scriptPath
	 * @return RETURNSTATE
	 */
	public String callPowerShellScript(BaseInputData baseInputData, List<ScriptInfo> scriptList,String hostname, Map<String, String> erroMap)
	{
		logger.debug("Entered callPowerShellScript method: "+baseInputData+" "+scriptList);
		if(baseInputData == null || baseInputData.isEmpty())
		{
			msg = "Empty data received";
			logger.error(msg);
			return msg;
		}
		
		if(scriptList == null || scriptList.size() < 1)
		{
			msg = "No source script files found!";
			logger.error(msg);
			return msg;
		}
		try
		{
			int numberOfThreads = baseInputData.getInputFileList().size();
			logger.debug("Number of Threads::"+numberOfThreads);
			PowershellExecutor[] arrayOfThreads = new PowershellExecutor[numberOfThreads];
			
			/*InetAddress inetAddress = InetAddress.getLocalHost();
			logger.debug("inetAddress:"+inetAddress);
			String url = inetAddress.getHostAddress();*/
			//System.out.println("URL:"+url);
			//Remove this post testing
			//url = "albanyvc.demo.local";
			String url = "https://"+hostname+"/sdk";
			//System.out.println("POST Modification URL:"+url);
			logger.debug("OVCData:"+baseInputData.getOvcData());
			si = new ServiceInstance(new URL(url), baseInputData.getOvcData().getOVCUserName(), baseInputData.getOvcData().getOVCPassword());
			logger.debug("Serevr Instance: "+si);
			ManagedEntity[] mes = new InventoryNavigator(si.getRootFolder()).searchManagedEntities("HostSystem");
			logger.debug("Mes:: "+mes);
			host = (HostSystem)mes[0];
			logger.debug("Host:"+host);
			ERROR_MAP = erroMap;
			for(int index=0; index < numberOfThreads; index++)
			{
				arrayOfThreads[index] = new PowershellExecutor(baseInputData, index, scriptList, si, host);
				arrayOfThreads[index].start();
			}
			
			for(int index=0; index < numberOfThreads; index++)
			{
				logger.debug("Came into join loop"+index);
				arrayOfThreads[index].join();
				logger.debug("Join over"+index);
			}
		}
		catch(Exception e)
		{
			msg = "Error occured in execution. Please check the logs";
			logger.error(msg, e);
			e.printStackTrace();
			return msg;
		}
		if( baseInputData.getVmData().size() == 1)
		{
			if(flag1 == -1)
			{
				flag1 = 0;
				msg = "Exceptions occured during operation for the VM "+baseInputData.getVmData().get(0).getVmName()+". Please check the logs for more information.";
				error1 = getErrorDescription(error1, baseInputData.getVmData().get(0).getVmName()); 
				if(error1 != null )
					msg = msg +"\n"+"Breif Error Information: "+error1;
				logger.debug(msg);
				return msg;
			}
		}
		else if(baseInputData.getVmData().size() == 2)
		{
			if(flag1 == -1 && flag2 == -1)
			{
				flag1 = 0; flag2 = 0;
				msg = "Exceptions occured during operation on both the VMs. Please check the logs for more information.";
				error1 = getErrorDescription(error1, baseInputData.getVmData().get(0).getVmName());
				error2 = getErrorDescription(error2, baseInputData.getVmData().get(1).getVmName());
				if(error1 != null && error2 != null)
					msg = msg +"\n"+"Breif Error Information: \n1. "+error1+"\n2. "+error2;
				else if(error1 == null && error2 != null)
					msg = msg +"\n"+"Breif Error Information: \n1. "+error2;
				else if( error1 != null && error2 == null)
					msg = msg +"\n"+"Breif Error Information: \n1. "+error1;
				logger.debug(msg);
				return msg;
			}
			if(flag1 == -1 && flag2 == 0)
			{
				flag1 = 0;
				msg = "Error occured while performing operation on VM "+baseInputData.getVmData().get(0).getVmName()+". Please check logs for more info.";
				error1 = getErrorDescription(error1, baseInputData.getVmData().get(0).getVmName());
				if(error1 != null )
					msg = msg +"\n"+"Breif Error Information: "+error1;
				logger.error(msg);
				return msg;
			}
			if(flag1 == 0 && flag2 == -1)
			{
				flag2 = 0;
				msg = "Error occured while performing operation on VM "+baseInputData.getVmData().get(1).getVmName()+". Please check logs for more info.";
				error2 = getErrorDescription(error2, baseInputData.getVmData().get(1).getVmName());
				if(error2 != null )
					msg = msg +"\n"+"Breif Error Information: "+error2;
				logger.error(msg);
				return msg;
			}
		}
		PowershellExecutionUtil.error1 = "";
        PowershellExecutionUtil.error2 = "";		
		return "success";
	}
	
	public static String getErrorDescription(String error, String vmName)
	{
		if(error != null)
		{
			for(Map.Entry<String,String> entry: ERROR_MAP.entrySet())
			{
				if( error.contains(entry.getKey()))
				{
					System.out.println("VALUE:"+entry.getValue());
					return entry.getValue().replaceAll("VM_NAME", vmName); 
				}
			}
		}
		return null;
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
		logger.debug("Enetered copyFileUsingFileChannels method: "+dest+" "+source);
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
				logger.error("Error while copying", e);
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
		List<ScriptInfo> scriptList = null;
		String msg = null;
		ServiceInstance si;
		HostSystem host;
		Task task;
		String logFile = "C:/ProgramData/VMware/vCenterServer/logs/vsphere-client/logs/CitrixPluginLog.log";
		boolean failure = false;
		
		public PowershellExecutor() {}
		
		PowershellExecutor(BaseInputData inputData, int index, List<ScriptInfo> scriptList, ServiceInstance si, HostSystem host)
		{
			this.baseInputData = inputData;
			this.index = index;
			this.scriptList = scriptList;
			this.si = si;
			this.host = host;
		}

		@Override
		public void run() 
		{
			String inputFileName = null;
			logger.debug("Entered run method..");
			synchronized (this) 
			{
				logger.debug("Entered synchronized block ...");
				
				try
				{
					for(int i=0; i<scriptList.size(); i++)
					{

						logger.debug("Enetered for loop :"+scriptList.get(i));
						msg = baseInputData.getVmData().get(index).getVmName()+" ==> Thread started...\n";
						
						PowershellExecutionUtil.logger.debug( msg);
						
						inputFileName = baseInputData.getInputFileList().get(index);
						//RollingFileAppender ra = (RollingFileAppender) Logger.getRootLogger().getAppender("file");
						logFile = "C:\\ProgramData\\VMware\\vCenterServer\\logs\\vsphere-client\\logs\\PowershellCitrixPluginLog.log";
						String sCommand = "powershell.exe \"" +  scriptList.get(i).scriptName + "\"" +
				                " -inputfile " + "\"" + "\'" + inputFileName + 
				                "\'" + "\""  + " -logfile " + "\"" + "\'" +
				                logFile + "\'" + "\"";
						//  */"C:\\ProgramData\\VMware\\vCenterServer\\logs\\vsphere-client\\logs\\CitrixPluginLog.log"
						
						msg = "Command to execute: "+sCommand;
						System.out.println(msg);
						
						TaskManager tm = si.getTaskManager();
						/*System.out.println("TASK MANAGER:"+tm);
						System.out.println("Host::"+host);
						System.out.println("TASKID: "+scriptList.get(i).taskID);*/
						TaskInfo ti = tm.createTask(host, scriptList.get(i).taskID, "Administrator", true);
						//System.out.println("TASKINFO: "+ti);
						task = new Task(si.getServerConnection(), ti.getTask());
						//System.out.println("TASK:"+task);						
						PowershellExecutionUtil.logger.debug( msg);
						Process powerShellProcess = Runtime.getRuntime().exec(sCommand);
		                // Getting the results
		                powerShellProcess.getOutputStream().close(); 
		                task.setTaskState(TaskInfoState.running, null, null);
		                task.updateProgress(10);
		                
		                String line = "";
		                java.io.BufferedReader stdout = new java.io.BufferedReader( 
		                            new java.io.InputStreamReader(powerShellProcess.getInputStream()) );

		                while ((line = stdout.readLine()) != null) {
		                	PowershellExecutionUtil.logger.debug( line);
		                }
		                stdout.close();

		                java.io.BufferedReader stderr = new java.io.BufferedReader( 
		                            new java.io.InputStreamReader( powerShellProcess.getErrorStream()) );

		                while ((line = stderr.readLine()) != null) {
		                	if(index == 0)
		                	{
		                		PowershellExecutionUtil.flag1 = -1;
		                		PowershellExecutionUtil.error1 += line;
		                	}
		                	else if (index == 1)
		                	{
		                		PowershellExecutionUtil.flag2 = -1;
		                		PowershellExecutionUtil.error2 += line;
		                	}
		                	failure = true;
		                	PowershellExecutionUtil.logger.error(line);
		                	logger.debug("FLAG1:"+PowershellExecutionUtil.flag1+" FLAG2:"+PowershellExecutionUtil.flag2);
		                }

		                stderr.close();
		                msg = "Finished Execution of Thread"+index+" Flag:"+PowershellExecutionUtil.flag1;
		                logger.debug(msg);
		                if(failure)
		                {
		                	logger.debug("Error occured while executing the script"+scriptList.get(i).scriptName);
		                	logger.debug("TASK STATUS::"+task.getTaskInfo().toString());
		                	//task.setTaskState(TaskInfoState., null, null);
		                	task.cancelTask();
		                	logger.error("Error occured during execution of "+scriptList.get(i).scriptName);
		                	return;
		                }
		                else
		                {
		                	task.setTaskState(TaskInfoState.success, null, null);
		                	logger.debug(scriptList.get(i).scriptName+" executed successfully");
		                }
		                PowershellExecutionUtil.logger.debug( msg);
					
					}
				}
				catch(Exception e) 
				{
					if(index == 0)
                	{
                		PowershellExecutionUtil.flag1 = -1;
                	}
                	else if (index == 1)
                	{
                		PowershellExecutionUtil.flag2 = -1;
                	}
					msg = baseInputData.getVmData().get(index).getVmName()+" ==> Thread Terminated with an exception..."+e;
					e.printStackTrace();
					PowershellExecutionUtil.logger.error( msg, e);
					try {
						//task.setTaskState(TaskInfoState.error, null, null);
						task.cancelTask();
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
						
					}
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
	                	PowershellExecutionUtil.logger.error( msg, ex);
	                    return;
	                }
	            }//finally
			}//synchronized
		}//run
	}//class

}