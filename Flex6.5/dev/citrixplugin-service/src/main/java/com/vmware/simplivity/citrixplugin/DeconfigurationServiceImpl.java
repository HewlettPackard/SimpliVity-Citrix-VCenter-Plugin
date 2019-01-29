package com.vmware.simplivity.citrixplugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class DeconfigurationServiceImpl implements DeconfigurationService 
{

	private LogUtil logUtil;
	private BasicCfgFileUtil fileUtil;
	private final Class clazz = DeconfigurationServiceImpl.class;
	private String msg = null;
	
	public DeconfigurationServiceImpl(){}
	
	
	public void setLogUtil(LogUtil logUtil) {
		this.logUtil = logUtil;
	}


	public void setFileUtil(BasicCfgFileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}
	
	@Override
	public String deconfigure(BaseInputData baseInputData, int rowNumber) 
	{
		msg = "Entering deconfiguration ..."+baseInputData;
		if(baseInputData == null) 
		{
			msg = "Empty data";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return msg;
		}
		
		if(rowNumber == -1)
		{
			msg = "Invalid entry in the deconfigure Entry table. Select teh correct data from teh table";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return msg;
		}
		
		OVCData ovcData = fileUtil.getOVCData();
		
		if(ovcData != null)
		{
			msg = "Setting OVC Data in Deconfiguration Service:"+ovcData;
			System.out.println(msg);
			logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
			baseInputData.setOvcData(ovcData);
		}
		
		if(!prepareInputFile(baseInputData))
		{
			msg = "Error in creating input file for Deconfigure";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return msg;
		}
		
		/*
		 * Copy the PsExec.exe to the temporary location
		 */
		String tempPsExecFile = fileUtil.getTempLocation()+"PsExec.exe";
		fileUtil.copyFileUsingFileChannels(fileUtil.getPsexecPath(), tempPsExecFile);
		String srcPath = fileUtil.getDeConfigScrPath();
		String tempSrcPath = fileUtil.getTempLocation()+"tempDeconfigure.ps1";
		if(!fileUtil.copyFileUsingFileChannels(srcPath, tempSrcPath))
		{
			msg = "Error in accessing the deconfigure file from jar";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return msg;
		}
		PowershellExecutionUtil powershellUtil = new PowershellExecutionUtil();
		RETURNSTATE result = powershellUtil.callPowerShellScript(baseInputData, tempSrcPath);
		
		switch(result)
		{
			case SUCCESS:
			{
				if(!deleteDeconfigureEntry(rowNumber, fileUtil.getDeconfigureEntryFilePath()))
				{
					msg = "Error occured while deleting the entry from the DeconfigureEntry file. Please check the logs for more information.";
					System.out.println(msg);
					logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
					return msg;
				}
				msg = "Deconfiguration done. Check the log file for more information";
				System.out.println(msg);
				logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
				break;
			}
			case FAILURE:
			case PARTIALSUCCESS:
			{
				msg = "Error occured while deconfiguring. Please check the logs"+logUtil.getLogFilePath()+" for more information.";
				System.out.println(msg);
				logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			}
			default:
		}
		
		fileUtil.deleteFile(tempPsExecFile);
		fileUtil.deleteFile(tempSrcPath);
		
		return msg;
	}

	/** Method: prepareInputFile
	 * 
	 *  Description: Prepared input (*.psd1) files for deconfiguration.
	 *  
	 * @param baseInputData
	 * @return boolean
	 */
	private boolean prepareInputFile(BaseInputData baseInputData) 
	{
		msg = "Entered prepareInputFile method."+baseInputData;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		List<String> filenameList = new ArrayList<String>();
        for ( int ix = 0; ix < baseInputData.getVmData().size(); ix++ )
        {   
            String sFileLine = "@{\r\nvm = \r\n\t@{\r\n";
            sFileLine += "\tname = " + "\'" + baseInputData.getVmData().get(ix).getVmName()  + "\'\r\n" +
                        "\thost = " + "\'" + baseInputData.getVmData().get(ix).getVmHost() +"\'\r\n" +
                        "\tusername =  " + "\'" + baseInputData.getVmData().get(ix).getVmUsername() +"\'\r\n" +
                        "\tpassword = " + "\'" + baseInputData.getVmData().get(ix).getVmPassword() +"\'\r\n \t}\r\n";
            
            sFileLine += "ovc = \r\n\t@{\r\n";
            sFileLine += "\tovcip = " + "\'" + baseInputData.getOvcData().getOVCIP() +"\'\r\n" +
                        "\tovcusername = " + "\'" + baseInputData.getOvcData().ovcUsername +"\'\r\n" +
                        "\tovcpassword = " + "\'" + baseInputData.getOvcData().getOVCPassword() +"\'\r\n \t}\r\n";
            
            sFileLine += "ad = \r\n\t@{\r\n";
            sFileLine += "\tdomain = " + "\'" + baseInputData.getDomainData().getDomainName() +"\'\r\n" +
                        "\tusername = " + "\'" + baseInputData.getDomainData().getDomainUserName() +"\'\r\n" +
                        "\tpassword = " + "\'" + baseInputData.getDomainData().getDomainPassword() +"\'\r\n \t}\r\n}\r";

            System.out.println(sFileLine);
            String inputFilename = fileUtil.writeToFile(baseInputData.getVmData().get(ix).getVmName()+".psd1", sFileLine, "DeconfigPlugin");
            if(inputFilename == null)
            {
            	msg = "Error while creating input file for deconfiguring the VM: "+baseInputData.getVmData();
            	System.out.println(msg);
            	logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
            	return false;
            }
            filenameList.add(inputFilename);
        } // Loop
        baseInputData.setInputFileList(filenameList);
        msg = "Input files for Deconfigure: "+filenameList;
        logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
        return true;
	}
	
	/**
	 *  Method: deleteDeconfigureEntry
	 *  
	 *  Description: deletes the entry from the deconfigureEntry File
	 *  
	 * @param rowNumber
	 * @param filePath
	 * @return
	 */
	private boolean deleteDeconfigureEntry(int rowNumber, String filePath) 
	{
		boolean flag = false;
		msg = "Entering deleteDeconfigureEntry method.."+rowNumber+", "+filePath;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		
		if(rowNumber == -1 || filePath == null)
		{
			msg = "Deconfigure entry path is empty";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
		}
		
		FileWriter fw = null;
		String line = null;
		String newContent = "";
		BufferedReader br = null;
		File file = new File(filePath);
		
		try
		{
			br = new BufferedReader(new FileReader(file));
			
			while((line = br.readLine()) != null)
			{
				if(line.length() > 1)
				{
					String index = line.substring(line.lastIndexOf(',')+1);
					if(rowNumber == Integer.parseInt(index))
					{
						continue;
					}
					newContent = newContent + line + System.lineSeparator();
				}
			}
			
			fw = new FileWriter(file);
			fw.write(newContent);
			flag = true;
		}
		
		catch(Exception e)
		{
			msg = "Exception occured while deleteing the entry from the DeconfigureEntry file"+e.getMessage();
			System.out.println(msg);
			e.printStackTrace();
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			flag = false;
		}
		finally
		{
			try
			{
				br.close();
				fw.close();
				flag = true;
			}
			catch(Exception e)
			{
				msg = "Error while closing the deconfigureEntry file while deleting the entry "+e.getLocalizedMessage();
				System.out.println(msg);
				logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
				flag = false;
			}
		}
		return flag;
	}


}
