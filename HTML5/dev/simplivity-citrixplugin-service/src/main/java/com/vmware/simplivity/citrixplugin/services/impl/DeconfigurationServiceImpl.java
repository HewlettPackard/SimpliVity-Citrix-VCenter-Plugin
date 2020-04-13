package com.vmware.simplivity.citrixplugin.services.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.vmware.simplivity.citrixplugin.model.BaseInputData;
import com.vmware.simplivity.citrixplugin.model.Message;
import com.vmware.simplivity.citrixplugin.model.OVCData;
import com.vmware.simplivity.citrixplugin.model.RemoteWindowsVMData;
import com.vmware.simplivity.citrixplugin.model.ScriptInfo;
import com.vmware.simplivity.citrixplugin.services.DeconfigurationService;
import com.vmware.simplivity.citrixplugin.util.BasicCfgFileUtil;
import com.vmware.simplivity.citrixplugin.util.PowershellExecutionUtil;
import com.vmware.simplivity.citrixplugin.util.RemotePowershellExecutionUtil;

public class DeconfigurationServiceImpl implements DeconfigurationService 
{

	private Logger logger = Logger.getLogger(DeconfigureTableServiceImpl.class);
	private BasicCfgFileUtil fileUtil;
	private Message msg =null;
	private RemoteWindowsVMData remoteVmData;
	private String RWD_ERROR = null;
	
	public DeconfigurationServiceImpl(){}
	
	public void setFileUtil(BasicCfgFileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}
	
	@Override
	public Message deconfigure(BaseInputData baseInputData) 
	{
		logger.info("Entering deconfiguration ..."+baseInputData);
		msg = new Message();
		if(baseInputData == null) 
		{
			msg.error = "Empty data";
			logger.error(msg.error);
			return msg;
		}
		int rowNumber = baseInputData.rowNumber;
		if(rowNumber == -1)
		{
			msg.error = "Invalid entry in the deconfigure Entry table. Select the correct data from the table";
			logger.error(msg.error);
			return msg;
		}
		
		OVCData ovcData = fileUtil.getOVCData();
		
		if(ovcData != null)
		{
			logger.debug("Setting OVC Data in Deconfiguration Service:"+ovcData);
			baseInputData.setOvcData(ovcData);
		}
		else
		{
			msg.error = "Please enter ovc or ILO details";
			logger.error(msg.error);
			return msg;
		}
		
		if (!fileUtil.isWindows()) {
			remoteVmData = ovcData.getRemoteWindowsVMData();
			if ( remoteVmData == null || ovcData.getRemoteWindowsVMData().isEmpty()) {
				msg.error = "Windows details not set. Please submit Windows details along with OVC/ILO details";
				logger.error(msg.error);
				return msg;
			}
		}
		
		if(!prepareInputFile(baseInputData))
		{
			if(RWD_ERROR != null)
			{
				msg.error = RWD_ERROR;
				logger.error(RWD_ERROR);
				return msg;
			}
			msg.error = "Error in creating input file for Deconfigure";
			logger.error(msg.error);
			return msg;
		}

		List<ScriptInfo> scriptList = fileUtil.getDeconfigureScriptList();
		/*if(!prepareDeconfigureScriptList(scriptList))
		{
			msg.error = "Error in accessing the deconfigure files from jar";
			logger.error(msg.error);
			return msg;
			
		}*/
		
		
		// Copy the PsExec.exe to the temporary location
		 
		String tempPsExecFile = fileUtil.getTempLocation()+"PsExec.exe";
		if(fileUtil.isWindows())
		{
			fileUtil.copyFileUsingFileChannels(fileUtil.getPsexecPath(), tempPsExecFile);
		}
		else
		{
			//fileUtil.copyRemoteFile(remoteVmData.winUsername, remoteVmData.winIP, remoteVmData.winPassword, "./PsExec.exe", fileUtil.getPsexecPath());
		}
		
		String result = null;
		if(fileUtil.isWindows())
		{
			PowershellExecutionUtil powershellUtil = new PowershellExecutionUtil();
			result = powershellUtil.callPowerShellScript(baseInputData, scriptList, fileUtil.getHostname(),
					fileUtil.getErrorMap());
		}
		else
		{
			/*if(!prepareDeconfigureScriptList(scriptList)) { 
				msg.error ="Error in accessing the configure file from jar"; 
				logger.error(msg.error);
			    return msg;
			}*/
			RemotePowershellExecutionUtil powershellUtil = new RemotePowershellExecutionUtil();
			result = powershellUtil.callPowerShellScript(baseInputData, scriptList, fileUtil.getHostname(),
					fileUtil.getErrorMap());
		}
		
		logger.debug("RESULT: "+result);
		if(result == null || result == "")
		{
			msg.error = "Error occured while deconfiguring. Please check the logs"+fileUtil.getLogFile()+" for more information.";
			logger.error(msg.error);
		}
		else if(result.endsWith("success"))
		{
			if(!deleteDeconfigureEntry(rowNumber, fileUtil.getDeconfigureEntryFilePath()))
			{
				msg.message = "Deconfiguration is successful but error occured while deleting the entry from the DeconfigureEntry file. Please check the logs for more information.";
				logger.error(msg.message);
			}
			else
			{
				msg.message = "Donfiguration done. Check the log file for more information.";
				logger.debug(msg);
			}
		}
		else
		{
			if(result.startsWith("Exceptions"))
			{
				result = result.replaceAll("operation", "Deconfiguration");
				logger.error(result);
				msg.error = result;
			}
			else
			{
				result = "Deconfiguration Failed. Please check teh logs for more information";
				logger.error(result);
				msg.error = result;
			}
		}
		
		logger.debug("Deleteing the scripts and input files");
		if(fileUtil.isWindows())
		{
			fileUtil.deleteFile(tempPsExecFile);
			for(String file: baseInputData.getInputFileList())
			{
				fileUtil.deleteFile(file);
			}
		}
		else
		{
			for(String file: baseInputData.getInputFileList())
			{
				if(!fileUtil.deleteRemoteFile(remoteVmData.getWinUsername()	, remoteVmData.getWinIP(), remoteVmData.getWinPassword(), file))
				{
					logger.error("\nUnable to establish a session with remote Windows VM while deleting the input file. \n Please restart the remote Windows VM and make sure the OpenSSH server is up and running.");
					if(msg != null)
					{
						if(msg.message != null)
						{
							msg.message += "\nWARN:Unable to establish a session with remote Windows VM while deleting the input file. \n Please restart the remote Windows VM and make sure the OpenSSH server is up and running.";
						}
						else if(msg.error != null)
						{
							msg.error += "\nWARN: Unable to establish a session with remote Windows VM while deleting the input file. \n Please restart the remote Windows VM and make sure the OpenSSH server is up and running.";
						}
					}
				}
			}
		}
		//fileUtil.setOVCData(null);

		//deleteDeconfigureEntry(rowNumber, fileUtil.getDeconfigureEntryFilePath());
		return msg;
	}
	
	@SuppressWarnings("unused")
	private boolean prepareDeconfigureScriptList(List<ScriptInfo> deconfigureScriptList) 
	{
		logger.debug("Entered prepareDeconfigureScriptList method:"+ deconfigureScriptList);
		String[] tempScriptList = new String[] { "UninstallCWConnector.ps1","UnregisterFromDomain.ps1"};
		for (int i = 0; i < deconfigureScriptList.size(); i++) {
			String tempSrcPath = fileUtil.getTempLocation() + tempScriptList[i];
			fileUtil.copyRemoteFile(remoteVmData.getWinUsername(), remoteVmData.getWinIP(), remoteVmData.getWinPassword(), tempSrcPath, deconfigureScriptList.get(i).scriptName);
			deconfigureScriptList.get(i).setScriptName(tempSrcPath);
		}
		logger.debug("Prepared DeconfigureScriptList:" + deconfigureScriptList);
		return true;
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
		logger.debug("Entered prepareInputFile method."+baseInputData);
		List<String> filenameList = new ArrayList<String>();
        for ( int ix = 0; ix < baseInputData.getVmData().size(); ix++ )
        {   
            String sFileLine = "@{\r\nvm = \r\n\t@{\r\n";
            sFileLine += "\tname = " + "\'" + baseInputData.getVmData().get(ix).getVmName()  + "\'\r\n" +
                        "\thost = " + "\'" + baseInputData.getVmData().get(ix).getVmHost() +"\'\r\n" +
                        "\tusername =  " + "\'" + baseInputData.getVmData().get(ix).getVmUsername() +"\'\r\n" +
                        "\tpassword = " + "\'" + baseInputData.getVmData().get(ix).getVmPassword() +"\'\r\n \t}\r\n";
            
            sFileLine += "ovc = \r\n\t@{\r\n";
            if(baseInputData.getOvcData().getOVCIP() == null)
            	baseInputData.getOvcData().setOVCIP("");
            sFileLine += "\tovcip = " + "\'" + baseInputData.getOvcData().getOVCIP() +"\'\r\n" +
                        "\tovcusername = " + "\'" + baseInputData.getOvcData().ovcUsername +"\'\r\n" +
                        "\thostname = " + "\'" + fileUtil.getHostname() +"\'\r\n";
            if(fileUtil.isWindows())
            {
            	sFileLine += "\tpsexepath = " + "\'" + "C:\\Users\\Public\\PsExec.exe" +"\'\r\n" ;
            }
            else
            {
            	sFileLine += "\tpsexepath = " + "\'" + "C:/SimplivityCitrixScripts/PsExec.exe" +"\'\r\n" ;
            	
            }
                        
            sFileLine += "\tovcpassword = " + "\'" + baseInputData.getOvcData().getOVCPassword() +"\'\r\n \t}\r\n";
            
            sFileLine += "ad = \r\n\t@{\r\n";
            sFileLine += "\tdomain = " + "\'" + baseInputData.getDomainData().getDomainName() +"\'\r\n" +
                        "\tusername = " + "\'" + baseInputData.getDomainData().getDomainUserName() +"\'\r\n" +
                        "\tpassword = " + "\'" + baseInputData.getDomainData().getDomainPassword() +"\'\r\n \t}\r\n}\r";

            logger.debug(sFileLine);
           String inputFilename = null;
			
			if(fileUtil.isWindows())
			{
				inputFilename = fileUtil.writeToFile(baseInputData.getVmData().get(ix).getVmName()+ ".psd1", sFileLine, "DeconfigPlugin");
				logger.debug("inputFilename: " + inputFilename);
				if (inputFilename == null) {
					logger.error("Error while creating input file for the VM: "+ baseInputData.getVmData());
					return false;
				}
			}
			else
			{
				logger.debug("Writing inputFiles to remote windows machine");
				inputFilename = "./"+baseInputData.getVmData().get(ix).getVmName()+ ".psd1";
				RemoteWindowsVMData winData = baseInputData.getOvcData().getRemoteWindowsVMData();
				if(!fileUtil.writeRemoteFile(winData.getWinUsername(), winData.getWinIP(), winData.getWinPassword(), inputFilename, sFileLine))
				{
					logger.error("Error occured while writing input file to remotw windows VM. Please restart the remote Windows VM and try again.");
					RWD_ERROR = "Error occured while writing input file to remotw windows VM. Please restart the remote Windows VM and try again.";
					return false;
				}
			}
            filenameList.add(inputFilename);
        } // Loop
        baseInputData.setInputFileList(filenameList);
        logger.debug("Input files for Deconfigure: "+filenameList);
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
		logger.debug("Entering deleteDeconfigureEntry method.."+rowNumber+", "+filePath);
		
		if(rowNumber == -1 || filePath == null)
		{
			logger.error("Deconfigure entry path is empty");
			return false;
		}
		
		/*if(!fileUtil.isWindows())
		{
			logger.debug("Non Windows System");
			return deleteDeconfigureEntryRemotely(rowNumber, filePath);
		}
		*/
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
			logger.error("Exception occured while deleteing the entry from the DeconfigureEntry file"+e.getMessage(), e);
			flag = false;
			e.printStackTrace();
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
				logger.error("Error while closing the deconfigureEntry file while deleting the entry "+e.getLocalizedMessage(), e);
				flag = false;
				e.printStackTrace();
			}
		}
		return flag;
	}

	private boolean deleteDeconfigureEntryRemotely(int rowNumber, String filePath) 
	{
		boolean flag = false;
		logger.debug("Entering deleteDeconfigureEntryRemotely method.."+rowNumber+", "+filePath);
		
		if(rowNumber == -1 || filePath == null)
		{
			logger.error("Deconfigure entry path is empty");
			return false;
		}
		
		String line = null;
		String newContent = "";
		BufferedReader br = null;
		JSch jsch = new JSch();
		Session session = null;
		RemoteWindowsVMData rwd = fileUtil.getOVCData().getRemoteWindowsVMData();
		try
		{
			logger.debug("Starting new Session..");
			session = jsch.getSession(rwd.getWinUsername(), rwd.getWinIP(), 22);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword(rwd.getWinPassword());
			session.connect();

			logger.debug("Connected to " + rwd.getWinIP());
			Channel channel = session.openChannel("sftp");
			channel.connect();
			logger.debug("Connected to SFTP");
			ChannelSftp sftpChannel = (ChannelSftp) channel;
			InputStream stream = sftpChannel.get(filePath);
			br = new BufferedReader(new InputStreamReader(stream));

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
			br.close();
			stream.close();
			fileUtil.writeRemoteFile(rwd.getWinUsername(), rwd.getWinIP(), rwd.getWinPassword(), filePath, newContent);
			flag = true;
		}
		
		catch(Exception e)
		{
			logger.error("Exception occured while deleteing the entry from the DeconfigureEntry file"+e.getMessage(), e);
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

}
