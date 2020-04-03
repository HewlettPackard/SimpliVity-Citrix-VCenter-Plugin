package com.vmware.simplivity.citrixplugin.services.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import com.vmware.simplivity.citrixplugin.model.ConfigureInputData;
import com.vmware.simplivity.citrixplugin.model.DeconfigureTableEntry;
import com.vmware.simplivity.citrixplugin.model.DomainData;
import com.vmware.simplivity.citrixplugin.model.Message;
import com.vmware.simplivity.citrixplugin.model.OVCData;
import com.vmware.simplivity.citrixplugin.model.RemoteWindowsVMData;
import com.vmware.simplivity.citrixplugin.model.ScriptInfo;
import com.vmware.simplivity.citrixplugin.model.VMData;
import com.vmware.simplivity.citrixplugin.services.ConfigurationService;
import com.vmware.simplivity.citrixplugin.util.BasicCfgFileUtil;
import com.vmware.simplivity.citrixplugin.util.PowershellExecutionUtil;
import com.vmware.simplivity.citrixplugin.util.RemotePowershellExecutionUtil;

public class ConfigurationServiceImpl implements ConfigurationService {

	private Logger logger = Logger.getLogger(ConfigurationServiceImpl.class);
	private BasicCfgFileUtil fileUtil;
	private Message message = null;
	private String msg = null;
	private RemoteWindowsVMData remoteVmData;

	public ConfigurationServiceImpl() {
	}

	public void setFileUtil(BasicCfgFileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}

	@Override
	public Message configure(ConfigureInputData configureInputData) {
		message = new Message();
		msg = "Entering configuration ..." + configureInputData;
		logger.debug(msg);

		if (configureInputData == null || configureInputData.isEmpty()) {
			msg = "Empty Configuration data received";
			logger.error(msg);
			message.error = msg;
			return message;
		}

		/*
		 * ProxyData proxyData = fileUtil.getProxyData();
		 * 
		 * if(proxyData != null) { msg = "Setting Proxy Data:"+proxyData;
		 * System.out.println(msg); logUtil.log(LEVEL.DEBUG, msg, clazz,
		 * logUtil.getLineNumber()); configureInputData.setProxyData(proxyData);
		 * }
		 */

		OVCData ovcData = fileUtil.getOVCData();
		logger.debug("Getting ovcData from BasicFileUtil:" + ovcData);

		if (ovcData != null) {
			msg = "Setting OVC Data:" + ovcData;
			logger.debug(msg);
			configureInputData.setOvcData(ovcData);
		} else {
			msg = "OVC/ILO Data is not set. Please submit the OVC/ILO details";
			logger.error(msg);
			message.error = msg;
			return message;
		}

		if (!fileUtil.isWindows()) {
			remoteVmData = ovcData.getRemoteWindowsVMData();
			if ( remoteVmData == null
					|| ovcData.getRemoteWindowsVMData().isEmpty()) {
				msg = "Windows details not set. Please submit Windows details along with OVC/ILO details";
				logger.error(msg);
				message.error = msg;
				return message;
			}
		}

		if (ovcData.isNonSimplivityPlatformSet()) {
			if(fileUtil.isWindows())
			{
				if (!fetchModelName(configureInputData)) {
					msg = "Invalid HPE platform found";
					logger.error(msg);
					message.error = msg;
					return message;
				}
			}
			else
			{
				if(!remotelyFetchModelName(configureInputData))
				{
					msg = "Invalid HPE platform found";
					logger.error(msg);
					message.error = msg;
					return message;
				}
			}
		}

		if (!prepareInputFile(configureInputData)) {
			msg = "Error in creating input file for Configure";
			logger.error(msg);
			message.error = msg;
			return message;
		}

		List<ScriptInfo> scriptList = fileUtil.getConfigureScriptList();
		
		String result = null;
		if(fileUtil.isWindows())
		{
			PowershellExecutionUtil powershellUtil = new PowershellExecutionUtil();
			result = powershellUtil.callPowerShellScript(configureInputData,
					scriptList);
		}
		else
		{
			/*if(!prepareConfigureScriptList(scriptList)) { 
				msg ="Error in accessing the configure file from jar"; 
				logger.error(msg);
			    message.error =msg; 
			    return message;
			}*/
			RemotePowershellExecutionUtil powershellUtil = new RemotePowershellExecutionUtil();
			result = powershellUtil.callPowerShellScript(configureInputData, scriptList, fileUtil.getHostname());
		}

		if (result == null || result == "") {
			msg = "Error occured while configuring. Please check the logs"
					+ fileUtil.getLogFile() + " for more information.";
			logger.error(msg);
			message.error = msg;
		} else if (result.endsWith("success")) {
			List<DeconfigureTableEntry> deconfigTableEntries = constructDeconfigureTableEntries(
					configureInputData.getVmData(),
					configureInputData.getDomainData());
			writeDeconfigureEntryToFile(deconfigTableEntries);
			msg = "Configuration done. Check the log file for more information.";
			logger.debug(msg);
			message.message = msg;
		} else {
			if (result.startsWith("Exceptions")) {
				result = result.replaceAll("operation", "Configuration");
				logger.error(result);
			}
			if (result.startsWith("Error")) {
				if (result
						.contains(configureInputData.getVmData().get(0).vmName)) {
					result = result.replaceAll("operation", "Configuration");
					List<VMData> vmList = new ArrayList<VMData>();
					vmList.add(configureInputData.getVmData().get(1));
					List<DeconfigureTableEntry> deconfigTableEntries = constructDeconfigureTableEntries(
							vmList, configureInputData.getDomainData());
					writeDeconfigureEntryToFile(deconfigTableEntries);
					logger.error(result);
				} else if (result.contains(configureInputData.getVmData()
						.get(1).vmName)) {
					result = result.replaceAll("operation", "Configuration");
					List<VMData> vmList = new ArrayList<VMData>();
					vmList.add(configureInputData.getVmData().get(0));
					List<DeconfigureTableEntry> deconfigTableEntries = constructDeconfigureTableEntries(
							vmList, configureInputData.getDomainData());
					writeDeconfigureEntryToFile(deconfigTableEntries);
					logger.error(result);
				}
			}
			message.error = result;
		}

		logger.debug("Deleteing the scripts and input files");
		if(fileUtil.isWindows())
		{
			for(String file: configureInputData.getInputFileList())
			{
				fileUtil.deleteFile(file);
			}
		}else {
			/*for(String file: configureInputData.getInputFileList())
			{
				fileUtil.deleteRemoteFile(remoteVmData.getWinUsername()	, remoteVmData.getWinIP(), remoteVmData.getWinPassword(), file);
			}
			for(int i = 0; i< scriptList.size(); i++)
			{
				fileUtil.deleteRemoteFile(remoteVmData.winUsername, remoteVmData.winIP, remoteVmData.winPassword, scriptList.get(i).scriptName);
			}*/
		}
		//fileUtil.setOVCData(null);
		logger.debug("Return from ConfigureServiceImpl: " + message);
		return message;
	}

	
	private boolean prepareConfigureScriptList(List<ScriptInfo> configureScriptList) 
	{
		logger.debug("Entered prepareConfigureScriptList method:"+ configureScriptList);
		String[] tempScriptList = new String[] { "CloningOfVM.ps1","ComputerNameChange.ps1", "AddDomain.ps1",
				"ResourceLocation.ps1", "InstallCWConnector.ps1" };
		for (int i = 0; i < configureScriptList.size(); i++) {
			String tempSrcPath = fileUtil.getTempLocation() + tempScriptList[i];
			fileUtil.copyRemoteFile(remoteVmData.getWinUsername(), remoteVmData.getWinIP(), remoteVmData.getWinPassword(), tempSrcPath, configureScriptList.get(i).scriptName);
			configureScriptList.get(i).setScriptName(tempSrcPath);
		}
		logger.debug("Prepared ConfigureScriptList:" + configureScriptList);
		return true;
	}
	
	/**
	 * Method: prepareInputFile
	 * 
	 * Description: Prepared input (*.psd1) files for configuration.
	 * 
	 * @param configureInputData
	 * @return boolean
	 */
	private boolean prepareInputFile(ConfigureInputData configureInputData) {
		msg = "Entered prepareInputFile method." + configureInputData;
		logger.debug(msg);
		List<String> filenameList = new ArrayList<String>();
		for (int ix = 0; ix < configureInputData.getVmData().size(); ix++) {

			String sFileLine = "@{\r\nvm = \r\n\t@{\r\n";
			sFileLine += "\tname = " + "\'"+ configureInputData.getVmData().get(ix).getVmName()+
					"\'\r\n" + "\ttemplate = " + "\'"+ configureInputData.getTemplate() + "\'\r\n" +
					"\thost = "+ "\'" + configureInputData.getVmData().get(ix).getVmHost()+ "\'\r\n" + 
					"\tusername =  " + "\'"+ configureInputData.getVmData().get(ix).getVmUsername()+ "\'\r\n" +
					"\tpassword = " + "\'"+ configureInputData.getVmData().get(ix).getVmPassword()+ "\'\r\n" +
					"\tisstatic = " + "\'"+ configureInputData.getVmData().get(ix).isStatic()+ "\'\r\n";

			if (configureInputData.getVmData().get(ix).isStatic()) {
				sFileLine += "\tip = "+ "\'"+ configureInputData.getVmData().get(ix).getIpAddr()+ "\'\r\n"
						+ "\tprefixlength = "+ "\'"+ getSubnetPrefix(configureInputData.getVmData().get(ix).getSubnet())+ "\'\r\n"
						+ "\tgateway =  "+ "\'"+ configureInputData.getVmData().get(ix).getGateway()+ "\'\r\n"
						+ "\tdnsserver =  "+ "\'"+ configureInputData.getVmData().get(ix).getDnsServerAddress() + "\'\r\n";
			}
			sFileLine += " \t}\r\n";

			sFileLine += "ad = \r\n\t@{\r\n";
			sFileLine += "\tdomain = " + "\'"+ configureInputData.getDomainData().getDomainName()+ "\'\r\n" +
					"\tusername = " + "\'"+ configureInputData.getDomainData().getDomainUserName()+ "\'\r\n" +
					"\tpassword = " + "\'"+ configureInputData.getDomainData().getDomainPassword()+ "\'\r\n \t}\r\n";

			sFileLine += "ovc = \r\n\t@{\r\n";
			if (configureInputData.getOvcData().getOVCIP() == null)
				configureInputData.getOvcData().setOVCIP("");
			sFileLine += "\tovcip = " + "\'"+ configureInputData.getOvcData().getOVCIP() + "\'\r\n"
					+ "\tplatform = " + "\'"+ configureInputData.getOvcData().getPlatform() + "\'\r\n"
					+ "\tovcusername = " + "\'"+ configureInputData.getOvcData().ovcUsername + "\'\r\n"
					+ "\thostname = " + "\'" + fileUtil.getHostname()+ "\'\r\n" + 
					"\tovcpassword = " + "\'"+ configureInputData.getOvcData().getOVCPassword()+ "\'\r\n \t}\r\n";

			if (configureInputData.getOvcData().isNonSimplivityPlatformSet()) {
				sFileLine += "platform = \r\n\t@{\r\n";
				sFileLine += "\tmodel = " + "\'"+ configureInputData.getVmData().get(ix).getModelName()+ "\'\r\n \t}\r\n";
			}

			if (configureInputData.getProxyData() != null) {
				sFileLine += "proxy = \r\n\t@{\r\n";
				sFileLine += "\tproxyip = " + "\'"+ configureInputData.getProxyData().getProxyIP()+ "\'\r\n" + 
						"\tproxyport = " + "\'"+ configureInputData.getProxyData().getProxyPort()+ "\'\r\n" + 
						"\tproxyusername = " + "\'"+ configureInputData.getProxyData().getProxyUserName()+ "\'\r\n" +
						"\tproxypassword = " + "\'"+ configureInputData.getProxyData().getProxyPassword()+ "\'\r\n \t}\r\n";
			}

			sFileLine += "citrix = \r\n\t@{\r\n";
			sFileLine += "\tclientId = " + "\'"+ configureInputData.getCitrixData().getClientId()+ "\'\r\n" + 
					"\tclientKey = " + "\'"+ configureInputData.getCitrixData().getCitrixKey()+ "\'\r\n" +
					"\tcustomerName = " + "\'"+ configureInputData.getCitrixData().getCustomerName()+ "\'\r\n" + 
					"\tresourceLocation = " + "\'"+ configureInputData.getCitrixData().getResourceLocation()+ "\'\r\n \t}\r\n}\r";
			String inputFilename = null;
			
			if(fileUtil.isWindows())
			{
				inputFilename = fileUtil.writeToFile(configureInputData.getVmData().get(ix).getVmName()+ ".psd1", sFileLine, "ConfigPlugin");
				logger.debug("inputFilename: " + inputFilename);
				if (inputFilename == null) {
					msg = "Error while creating input file for the VM: "+ configureInputData.getVmData();
					logger.error(msg);
					return false;
				}
			}
			else
			{
				inputFilename = "./"+configureInputData.getVmData().get(ix).getVmName()+ ".psd1";
				RemoteWindowsVMData winData = configureInputData.getOvcData().getRemoteWindowsVMData();
				fileUtil.writeRemoteFile(winData.getWinUsername(), winData.getWinIP(), winData.getWinPassword(), inputFilename, sFileLine);
			}
			filenameList.add(inputFilename);
		} // Loop
		configureInputData.setInputFileList(filenameList);
		return true;
	}

	private int getSubnetPrefix(String subnet) {
		msg = "Entered getSubnetPrefix method: " + subnet;
		logger.debug(msg);

		StringTokenizer st = new StringTokenizer(subnet, ".");
		int octs[] = new int[4];
		int i = 0, prefixLength = 0;
		try {
			while (st.hasMoreElements()) {
				octs[i] = Integer.valueOf(st.nextToken());
				i++;
			}
		} catch (NumberFormatException noe) {
			msg = "Error in converting IP octtes " + noe;
			logger.error(msg);
			noe.printStackTrace();
		}

		for (int j = 0; j < octs.length; j++) {
			String binary = Integer.toBinaryString(octs[j]);
			for (int k = 0; k < binary.length(); k++) {
				if (binary.charAt(k) == '1') {
					prefixLength++;
				}
			}
		}
		return prefixLength;
	}

	/**
	 * Method: constructDeconfigureTableEntries
	 * 
	 * Description: Creates the DeconfigureEntries that needs to be saved.
	 * 
	 * @param configureInputData
	 * @return List<DeconfigureTableEntry>
	 */
	private List<DeconfigureTableEntry> constructDeconfigureTableEntries(
			List<VMData> vmData, DomainData domainData) {
		msg = "Entering constructDeconfigureTableEntries method...";
		logger.debug(msg);
		if (vmData == null || vmData.isEmpty() || domainData == null
				|| domainData.isEmpty()) {
			msg = "Empty data [VMData=" + vmData + ", DomainData=" + domainData
					+ "]";
			logger.error(msg);
			return null;
		}

		List<DeconfigureTableEntry> list = new ArrayList<DeconfigureTableEntry>();
		for (int i = 0; i < vmData.size(); i++) {
			DeconfigureTableEntry entry = new DeconfigureTableEntry();
			entry.setVmName(vmData.get(i).getVmName());
			entry.setVmUserName(vmData.get(i).getVmUsername());
			entry.setVmHost(vmData.get(i).getVmHost());
			entry.setVmCluster(vmData.get(i).getVmCluster());
			entry.setDomainName(domainData.getDomainName());
			entry.setDomainUserName(domainData.getDomainUserName());
			list.add(entry);
		}
		msg = "Deconfigure entry List created: " + list;
		logger.debug(msg);
		return list;
	}

	/**
	 * Method: writeDeconfigureEntryToFile
	 * 
	 * Description: writes the DeconfigureEntries to a flat file.
	 * 
	 * @param List
	 *            <DeconfigureTableEntry>
	 */
	private void writeDeconfigureEntryToFile(List<DeconfigureTableEntry> list) {
		msg = "Entering writeDeconfigureEntryToFile method...";
		logger.debug(msg);
		if (list == null || list.isEmpty()) {
			msg = "DeconfigureEntryList is empty " + list;
			logger.error(msg);
			return;
		}

		String CSV_SEPERATOR = ",";
		String NEW_LINE = "\n";
		String fileName = fileUtil.getDeconfigureEntryFilePath();
		int identifier = -1; 
		FileWriter fw = null;
		String line = "";
		
		if(fileUtil.isWindows())
		{
			identifier = getUniqueIdentifier() + 1;
		}
		else
		{
			identifier = getUniqueIdentifierFromRemoteFile() + 1;
		}
		if (identifier != -1) {
			try {
				
				for (DeconfigureTableEntry entry : list) {
					//fw.write(
							line += entry.getVmName() + CSV_SEPERATOR
							+ entry.getVmUserName() + CSV_SEPERATOR
							+ entry.getVmHost() + CSV_SEPERATOR
							+ entry.getVmCluster() + CSV_SEPERATOR
							+ entry.getDomainName() + CSV_SEPERATOR
							+ entry.getDomainUserName() + CSV_SEPERATOR
							+ identifier + NEW_LINE;//);
					identifier++;
				}
				if(fileUtil.isWindows())
				{
					File fileObj = new File(fileName);
					fw = new FileWriter(fileObj, true);
					fw.write(line);
				}
				else
				{
					RemoteWindowsVMData rwd = fileUtil.getOVCData().getRemoteWindowsVMData();
					fileUtil.appendRemoteFile(rwd.getWinUsername(), rwd.getWinIP(), rwd.getWinPassword(), fileName, line);
				}
				
			} catch (IOException ioe) {
				msg = "Error while witing to deconfigure entry file";
				logger.error(msg, ioe);
			} catch (Exception e) {
				msg = "Error while witing to deconfigure entry file";
				logger.error(msg, e);
			} finally {
				try {
					fw.close();
				} catch (Exception e) {
					msg = "Error while closing the deconfigure entry file while writing entries to the file";
					logger.error(msg, e);
				}
			}

		} else {
			msg = "Error occured while writing to deconfigure entries";
			logger.error(msg);
		}

	}

	/**
	 * Method: getUniqueIdentifier
	 * 
	 * Description: Get the last index of the deconfigure entries in teh
	 * deconfigureEntry File.
	 * 
	 * @return identifier
	 */
	private int getUniqueIdentifier() {
		String currentLine = null, lastLine = null;
		int identifier = -1;
		boolean flag = false;
		BufferedReader br = null;
		File f = null;

		try {
			f = new File(fileUtil.getDeconfigureEntryFilePath());
			if (f.exists()) {
				
				br = new BufferedReader(new FileReader(
						fileUtil.getDeconfigureEntryFilePath()));
				try {
					while ((currentLine = br.readLine()) != null) {
						lastLine = currentLine;
						flag = true;
					}

					if (!flag) {
						msg = "Writing decnfigure entries for the first time";
						logger.debug(msg);
						return 1;
					}
					if (lastLine != null) {
						String temp = lastLine.substring(lastLine
								.lastIndexOf(",") + 1);
						identifier = Integer.parseInt(temp);
					}
				} catch (NumberFormatException nfe) {
					msg = "Invalid entries found while reading the Deconfigure entries.";
					logger.error(msg, nfe);
					nfe.printStackTrace();
				} catch (IOException e) {
					logger.error(
							"Error while writing to Deconfigire Entry Table", e);
					System.out
							.println("Error while writing to Deconfigire Entry Table"
									+ e);
					e.printStackTrace();
				}
			} else {
				msg = "Writing decnfigure entries for the first time";
				logger.debug(msg);
				return 0;
			}

		} catch (FileNotFoundException fne) {
			msg = "Deconfigure Entry file not found!";
			logger.error(msg, fne);
			fne.printStackTrace();
		} catch (Exception e) {
			msg = "Error while reading from Deconfigure File entry"
					+ e.getLocalizedMessage();
			logger.error(msg, e);
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				msg = "error in closing the Deconfigure entry file"
						+ e.toString();
				e.printStackTrace();
				logger.error(msg, e);
			}
		}
		return identifier;
	}

	/**
	 * Method: getUniqueIdentifierFromRemoteFile
	 * 
	 * Description: Get the last index of the deconfigure entries in teh
	 * deconfigureEntry File.
	 * 
	 * @return identifier
	 */
	private int getUniqueIdentifierFromRemoteFile() {
		String currentLine = null, lastLine = null;
		int identifier = -1;
		boolean flag = false;
		BufferedReader br = null;
		JSch jsch = new JSch();
		com.jcraft.jsch.Session session = null;
		RemoteWindowsVMData rwd = fileUtil.getOVCData().remoteWindowsVMData;
		try {

			if (fileUtil.checkRemoteFileExists(rwd.getWinUsername(),
					rwd.getWinIP(), rwd.getWinPassword(),
					fileUtil.getDeconfigureEntryFilePath())) {
				try {
					logger.debug("Starting new Session..");
					session = jsch.getSession(rwd.getWinUsername(),
							rwd.getWinIP(), 22);
					session.setConfig("StrictHostKeyChecking", "no");
					session.setPassword(rwd.winPassword);
					session.connect();

					logger.debug("Connected to " + rwd.winIP);
					Channel channel = session.openChannel("sftp");
					channel.connect();
					logger.debug("Connected to SFTP");
					ChannelSftp sftpChannel = (ChannelSftp) channel;
					InputStream stream = sftpChannel.get(fileUtil
							.getDeconfigureEntryFilePath());
					br = new BufferedReader(new InputStreamReader(stream));
					while ((currentLine = br.readLine()) != null) {
						lastLine = currentLine;
						flag = true;
					}

					if (!flag) {
						msg = "Writing decnfigure entries for the first time";
						logger.debug(msg);
						return 1;
					}
					if (lastLine != null) {
						String temp = lastLine.substring(lastLine
								.lastIndexOf(",") + 1);
						identifier = Integer.parseInt(temp);
					}
					logger.debug("Read from the file "
							+ fileUtil.getDeconfigureEntryFilePath() + " to "
							+ rwd.winIP);
					sftpChannel.exit();
					session.disconnect();
				} catch (NumberFormatException nfe) {
					msg = "Invalid entries found while reading the Deconfigure entries.";
					logger.error(msg, nfe);
					nfe.printStackTrace();
				} catch (IOException e) {
					logger.error(
							"Error while reading from Deconfigire Entry Table",
							e);

					e.printStackTrace();
				} catch (JSchException e) {
					e.printStackTrace();
				} catch (SftpException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}

			} else {
				msg = "Writing decnfigure entries for the first time";
				logger.debug(msg);
				return 0;
			}
		} catch (Exception e) {
			msg = "Error while reading from Deconfigure File entry"
					+ e.getLocalizedMessage();
			logger.error(msg, e);
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				msg = "error in closing the Deconfigure entry file"
						+ e.toString();
				e.printStackTrace();
				System.out.println(msg);
				logger.error(msg, e);
			}
		}
		logger.debug("returning identifier "+identifier);
		return identifier;
	}

	public boolean fetchModelName(ConfigureInputData configureInputData) {
		logger.debug("Enetered into fetchModelName method");
		boolean flag = false;
		if (!executePlatformInfoScript(configureInputData)) {
			logger.error("Error occured while retreiving the platform info. Check the log for more info");
			return flag;
		}

		String line = "";
		String csvSplit = "|";
		String vendor = null, modelName = null;
		String csvFile = fileUtil.getPlatformOutputPath();
		int count = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader(csvFile));

			while ((line = br.readLine()) != null) {
				logger.debug("LINE:" + line);
				StringTokenizer st = new StringTokenizer(line, csvSplit);
				while (st.hasMoreElements()) {
					vendor = st.nextToken();
					modelName = st.nextToken();
				}

				logger.debug("Vendor:" + vendor + " ModelName:" + modelName);
				if (vendor.equals("HPE")) {
					logger.debug("HP model confirmed. Saving model Name:"
							+ modelName);
					flag = true;
					configureInputData.getVmData().get(count)
							.setModelName(modelName);
					fileUtil.setHpModel(modelName);
				} else {
					flag = false;
					logger.debug("Invalid HPE platform");
				}
				count++;
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
			logger.error("PlatformOutputFile not found", fnfe);
		} catch (IOException ioe) {
			logger.error(
					"Error occured while reading the csv file containing csv file",
					ioe);
		}

		fileUtil.deleteFile(fileUtil.getPlatformInputPath());
		fileUtil.deleteFile(fileUtil.getPlatformOutputPath());
		return flag;
	}

	/**
	 * Method: executeClusterInfoScript
	 * 
	 * Description: Execute the ClusterInfo script and store the result in a csv
	 * file.
	 */
	private boolean executePlatformInfoScript(
			ConfigureInputData configureInputData) {
		boolean retVal = false;
		String inputFile = fileUtil.getPlatformInputPath();
		String outputFile = fileUtil.getPlatformOutputPath();
		String platformScript = fileUtil.getPlatformScriptPath();

		if (platformScript == null) {
			msg = "Error in reading the PlatformScript file";
			logger.error(msg);
			return false;
		}
		String tempScriptPath = fileUtil.getTempLocation()
				+ "tempPlatformscript.ps1";

		fileUtil.copyFileUsingFileChannels(platformScript, tempScriptPath);

		try {
			OVCData ovcData = fileUtil.getOVCData();
			if (ovcData == null) {
				msg = "OVC/ILO Details not set";
				logger.error(msg);
				return false;
			}
			/* Creating input file foe cluster Script */
			File inputFileObj = new File(inputFile);
			inputFileObj.setWritable(true);
			FileWriter fw = new FileWriter(inputFile);
			String sFileLine = "@{\r\nplatform = \r\n\t@{\r\n";
			int count = configureInputData.vmData.size();

			sFileLine += "\tusername = " + "\'"+ fileUtil.getOVCData().getOVCUserName() + "\'\r\n";
			sFileLine += "\tpassword = " + "\'"+ fileUtil.getOVCData().getOVCPassword() + "\'\r\n";
			sFileLine += "\tcount = " + "\'" + count + "\'\r\n";
			sFileLine += "\thostname1 = " + "\'"+ configureInputData.getVmData().get(0).vmHost + "\'\r\n";
			if (count == 2) {
				sFileLine += "\thostname2 = " + "\'"+ configureInputData.getVmData().get(1).vmHost+ "\'\r\n";
			}
			sFileLine += "\tplatformOutput = " + "\'" + outputFile+ "\'\r\n \t}\r\n}\r";
			logger.debug("Platform Input::" + sFileLine);
			fw.write(sFileLine);
			fw.close();

			// Command to execute the powercli script to get cluster info
			String sCommand = "powershell.exe \"" + tempScriptPath + "\""
					+ " -inputfile " + "\"" + "\'" + inputFile + "\'" + "\""
					+ " -logfile " + "\"" + "\'" +
					/* ra.getFile() */fileUtil.getLogFile() + "\'" + "\"";
			logger.debug(sCommand);
			logger.debug("ClusterScript Command:" + sCommand);
			Process powerShellProcess = Runtime.getRuntime().exec(sCommand);
			// Getting the results
			powerShellProcess.getOutputStream().close();

			String line = "";
			java.io.BufferedReader stdout = new java.io.BufferedReader(
					new java.io.InputStreamReader(
							powerShellProcess.getInputStream()));

			while ((line = stdout.readLine()) != null) {
				logger.debug(line);
			}
			stdout.close();

			java.io.BufferedReader stderr = new java.io.BufferedReader(
					new java.io.InputStreamReader(
							powerShellProcess.getErrorStream()));

			while ((line = stderr.readLine()) != null) {
				logger.error(line);
			}

			stderr.close();
			retVal = true;
		} catch (IOException ioe) {
			msg = "Error occured while writing to file";
			logger.error(msg, ioe);
			ioe.printStackTrace();
			retVal = false;
		} catch (Exception e) {
			msg = "Error occured while getting the cluster info";
			logger.error(msg, e);
			e.printStackTrace();
			retVal = false;
		}
		fileUtil.deleteFile(tempScriptPath);
		return retVal;
	}

	public boolean remotelyFetchModelName(ConfigureInputData configureInputData) {
		logger.debug("Enetered into remotelyFetchModelName method");
		boolean flag = false;
		if (!remotelyExecutePlatformScript(configureInputData)) {
			logger.error("Error occured while retreiving the platform info. Check the log for more info");
			return flag;
		}

		String line = "";
		String csvSplit = "|";
		String vendor = null, modelName = null;
		String csvFile = fileUtil.getPlatformOutputPath();
		int count = 0;
		JSch jsch = new JSch();
	    com.jcraft.jsch.Session session = null;
	    RemoteWindowsVMData winData = fileUtil.getOVCData().getRemoteWindowsVMData();

		try {
			session = jsch.getSession(winData.getWinUsername(), winData.getWinIP(), 22);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword(winData.getWinPassword());
			session.connect();

			logger.debug("Connected to " + winData.getWinIP());
			Channel channel = session.openChannel("sftp");
			channel.connect();
			logger.debug("Connected to SFTP");
			ChannelSftp sftpChannel = (ChannelSftp) channel;
			InputStream stream = sftpChannel.get(csvFile);
			BufferedReader br = new BufferedReader(new InputStreamReader(stream));

			while ((line = br.readLine()) != null) {
				logger.debug("LINE:" + line);
				line = "HPE|ProLiant DL380 Gen10";
				StringTokenizer st = new StringTokenizer(line, csvSplit);
				while (st.hasMoreElements()) {
					vendor = st.nextToken();
					modelName = st.nextToken();
				}

				logger.debug("Vendor:" + vendor + " ModelName:" + modelName);
				if (vendor.equals("HPE")) {
					logger.debug("HP model confirmed. Saving model Name:"
							+ modelName);
					flag = true;
					configureInputData.getVmData().get(count)
							.setModelName(modelName);
					fileUtil.setHpModel(modelName);
				} else {
					flag = false;
					logger.debug("Invalid HPE platform");
				}
				count++;
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
			logger.error("PlatformOutputFile not found", fnfe);
		} catch (IOException ioe) {
			logger.error(
					"Error occured while reading the csv file containing csv file",
					ioe);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error occured while reading the csv file containing csv file",e);
		}

		fileUtil.deleteRemoteFile(winData.getWinUsername(), winData.getWinIP(), winData.getWinPassword(), fileUtil.getPlatformInputPath());
		fileUtil.deleteRemoteFile(winData.getWinUsername(), winData.getWinIP(), winData.getWinPassword(),fileUtil.getPlatformOutputPath());
		return flag;
	}

	private boolean remotelyExecutePlatformScript(
			ConfigureInputData configureInputData) {
		logger.debug("Entered into remotelyExecutePlatformScript method.."+configureInputData);
		boolean retVal = false;
		String inputFile = fileUtil.getPlatformInputPath();
		String outputFile = fileUtil.getPlatformOutputPath();
		String platformScript = fileUtil.getPlatformScriptPath();

		if (platformScript == null) {
			msg = "Error in reading the PlatformScript file";
			logger.error(msg);
			return false;
		}
		RemoteWindowsVMData remoteWindowsVMData = fileUtil.getOVCData()
				.getRemoteWindowsVMData();

		/*String tempScriptPath = "./NonSimplivityScript.ps1";
		fileUtil.copyRemoteFile(remoteWindowsVMData.winUsername,
				remoteWindowsVMData.getWinIP(),
				remoteWindowsVMData.getWinPassword(), tempScriptPath,
				platformScript);*/

		try {
			OVCData ovcData = fileUtil.getOVCData();
			if (ovcData == null) {
				msg = "OVC/ILO Details not set";
				logger.error(msg);
				return false;
			}
			/* Creating input file foe cluster Script */
			String sFileLine = "@{\r\nplatform = \r\n\t@{\r\n";
			int count = configureInputData.vmData.size();

			sFileLine += "\tusername = " + "\'"
					+ fileUtil.getOVCData().getOVCUserName() + "\'\r\n";
			sFileLine += "\tpassword = " + "\'"
					+ fileUtil.getOVCData().getOVCPassword() + "\'\r\n";
			sFileLine += "\tcount = " + "\'" + count + "\'\r\n";
			sFileLine += "\thostname = " + "\'" + fileUtil.getHostname()
					+ "\'\r\n";
			sFileLine += "\thostname1 = " + "\'"
					+ configureInputData.getVmData().get(0).vmHost + "\'\r\n";
			if (count == 2) {
				sFileLine += "\thostname2 = " + "\'"
						+ configureInputData.getVmData().get(1).vmHost
						+ "\'\r\n";
			}
			sFileLine += "\tplatformOutput = " + "\'" + outputFile
					+ "\'\r\n \t}\r\n}\r";
			logger.debug("Platform Input::" + sFileLine);
			fileUtil.writeRemoteFile(remoteWindowsVMData.winUsername,
					remoteWindowsVMData.winIP, remoteWindowsVMData.winPassword,
					inputFile, sFileLine);

			Connection conn = new Connection(remoteWindowsVMData.getWinIP());
			conn.connect();
			boolean isAuthenticated = conn.authenticateWithPassword(
					remoteWindowsVMData.getWinUsername(),
					remoteWindowsVMData.getWinPassword());
			if (isAuthenticated == false) {
				logger.error("authentication failed");
			}
			logger.debug(isAuthenticated);
			Session sess = conn.openSession();
			sess.execCommand("powershell " + platformScript + " -inputFile "
					+ inputFile + " -logFile " + fileUtil.getLogFile());
			// sess.execCommand("powershell.exe");
			InputStream stdout = new StreamGobbler(sess.getStdout());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(stdout));

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				logger.debug(line);
			}
			InputStream stderr = new StreamGobbler(sess.getStderr());
			BufferedReader err = new BufferedReader(new InputStreamReader(
					stderr));

			String line = null;
			while ((line = err.readLine()) != null) {
				logger.error("ERROR::" + line);
			}
			logger.debug("Exit code" + sess.getExitStatus());
			br.close();
			sess.close();
			conn.close();
			err.close();
			retVal = true;
		} catch (IOException ioe) {
			msg = "Error occured while writing to file";
			logger.error(msg, ioe);
			ioe.printStackTrace();
			retVal = false;
		} catch (Exception e) {
			msg = "Error occured while getting the cluster info";
			logger.error(msg, e);
			e.printStackTrace();
			retVal = false;
		}
		/*fileUtil.deleteRemoteFile(remoteWindowsVMData.getWinUsername(),
				remoteWindowsVMData.winIP, remoteWindowsVMData.winPassword,
				platformScript);*/
		return retVal;
	}
}