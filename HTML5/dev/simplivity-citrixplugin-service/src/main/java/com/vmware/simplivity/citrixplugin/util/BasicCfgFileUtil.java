package com.vmware.simplivity.citrixplugin.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;
import com.vmware.simplivity.citrixplugin.model.OVCData;
import com.vmware.simplivity.citrixplugin.model.ProxyData;
import com.vmware.simplivity.citrixplugin.model.ScriptInfo;


public class BasicCfgFileUtil 
{
	private Logger logger = Logger.getLogger(BasicCfgFileUtil.class);
    
    private String msg = null;
       
    private ProxyData proxyData; 

    private OVCData ovcData = null;
    
    private List<ScriptInfo> configureScriptList;
    
    private List<ScriptInfo> deconfigureScriptList;
    
    private RollingFileAppender rollingFileAppender;
    
    private String hostname = null;
    
    // File content Holder, appends as KEY=VALUE pair
    private Map <String, String> cfgEntryMap 
                                = new HashMap<String, String>();
    
    Map<String,String> ERROR_MAP = null;
    
    private Map<String,List<String>> clusterMap;// = new HashMap<String, List<String>>();
    
    public String hpModel= null;
    
	private BasicCfgFileUtil() 
    {
    	System.out.println("Got into BasicCfgFileUtil constructor");
    	prepareScriptList();
    	initLogger();
    	String hostname = "";
  		if(isWindows())
  		{
  			try {
  	  			hostname = InetAddress.getLocalHost().getHostAddress();
  	  		} catch (UnknownHostException e) {
  	  			e.printStackTrace();
  	  			logger.error("Error getting localhost IP", e);
  	  		}
  		}
  		else
  		{
  			try {
  	  			hostname = InetAddress.getLocalHost().getHostName();
  	  		} catch (UnknownHostException e) {
  	  			e.printStackTrace();
  	  			logger.error("Error getting localhost IP", e);
  	  		}
  		}
  		initiateErroMap();  		
  		logger.debug("HOSTNAME:"+hostname);
  		setHostname(hostname);
    }

    public void initLogger()
	{
    	System.out.println("Enetered InitLogger function");
    	logger.debug("Entered InitLogger function");
		try
		{
			String filePath = "";
			if(isWindows())
			{
				filePath = "C:/ProgramData/VMware/vCenterServer/logs/vsphere-client/logs/CitrixH5PluginLog.log";
			}
			else
			{
				filePath = "/var/log/vmware/vsphere-ui/logs/CitrixH5PluginLog.log";
			}
			System.out.println("LogFilePath::"+filePath);
			PatternLayout patternLayout = new PatternLayout("%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n");
			rollingFileAppender = new RollingFileAppender(patternLayout, filePath);
			rollingFileAppender.setMaxFileSize("60MB");
			rollingFileAppender.setMaxBackupIndex(10);
			rollingFileAppender.activateOptions();
			Logger.getRootLogger().addAppender(rollingFileAppender);
			
			ConsoleAppender consoleAppender = new ConsoleAppender(patternLayout);
			consoleAppender.setTarget("System.out");
			consoleAppender.activateOptions();
			Logger.getRootLogger().addAppender(consoleAppender);
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    public boolean isWindows()
    {
		if (System.getProperty("os.name").contains("Windows")) {
			System.out.println("Windows System!!!!!");
			return true;
		}
		System.out.println("Non Windows System!!!");
		return false;
    }
    private void prepareScriptList()
    {
    	
    	try
    	{
    		if(isWindows())
    		{
    			configureScriptList = new ArrayList<ScriptInfo>(5);
            	configureScriptList.add(0,new ScriptInfo("C:/Users/Public/SimpliVityCitrixScripts/CloningOfVM.ps1", "CloningVMTask"));
            	configureScriptList.add(1,new ScriptInfo("C:/Users/Public/SimpliVityCitrixScripts/ComputerNameChange.ps1", "ComputerNameChangeTask"));
            	configureScriptList.add(2,new ScriptInfo("C:/Users/Public/SimpliVityCitrixScripts/AddDomain.ps1", "DomainChangeVMTask"));
            	configureScriptList.add(3, new ScriptInfo("C:/Users/Public/SimpliVityCitrixScripts/ResourceLocation.ps1", "ResourceLocationTask"));
            	configureScriptList.add(4,new ScriptInfo("C:/Users/Public/SimpliVityCitrixScripts/InstallCWConnector.ps1", "DownloadCWCConnectorTask"));
            	
            	deconfigureScriptList = new ArrayList<ScriptInfo>(2);
            	/*deconfigureScriptList.add(0, new ScriptInfo(getCitrixPluginDataFolder("UninstallCWConnector.ps1"), "UnistallCWConnectorTask1"));
            	deconfigureScriptList.add(1,new ScriptInfo(getCitrixPluginDataFolder("UnregisterFromDomain.ps1"), "UnregisterFromDomainTask1"));*/
            	//For Temp pupose changing order
            	deconfigureScriptList.add(0, new ScriptInfo("C:/Users/Public/SimpliVityCitrixScripts/UninstallCWConnector.ps1", "UnistallCWConnectorTask"));
            	deconfigureScriptList.add(1,new ScriptInfo("C:/Users/Public/SimpliVityCitrixScripts/UnregisterFromDomain.ps1", "UnregisterFromDomainTask"));
    		}
    		else
    		{
    			configureScriptList = new ArrayList<ScriptInfo>(5);
            	configureScriptList.add(0,new ScriptInfo("C:/SimpliVityCitrixScripts/CloningOfVM.ps1", "CloningVMTask"));
            	configureScriptList.add(1,new ScriptInfo("C:/SimpliVityCitrixScripts/ComputerNameChange.ps1", "ComputerNameChangeTask"));
            	configureScriptList.add(2,new ScriptInfo("C:/SimpliVityCitrixScripts/AddDomain.ps1", "DomainChangeVMTask"));
            	configureScriptList.add(3, new ScriptInfo("C:/SimpliVityCitrixScripts/ResourceLocation.ps1", "ResourceLocationTask"));
            	configureScriptList.add(4,new ScriptInfo("C:/SimpliVityCitrixScripts/InstallCWConnector.ps1", "DownloadCWCConnectorTask"));
            	
            	deconfigureScriptList = new ArrayList<ScriptInfo>(2);
            	/*deconfigureScriptList.add(0, new ScriptInfo(getCitrixPluginDataFolder("UninstallCWConnector.ps1"), "UnistallCWConnectorTask1"));
            	deconfigureScriptList.add(1,new ScriptInfo(getCitrixPluginDataFolder("UnregisterFromDomain.ps1"), "UnregisterFromDomainTask1"));*/
            	//For Temp pupose changing order
            	deconfigureScriptList.add(0, new ScriptInfo("C:/SimpliVityCitrixScripts/UninstallCWConnector.ps1", "UnistallCWConnectorTask"));
            	deconfigureScriptList.add(1,new ScriptInfo("C:/SimpliVityCitrixScripts/UnregisterFromDomain.ps1", "UnregisterFromDomainTask"));
    		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

    public String getLogFile()
    {
    	if(isWindows())
    	{
    		return "C:\\ProgramData\\VMware\\vCenterServer\\logs\\vsphere-client\\logs\\CitrixPluginLog.log";
    	}
    	else
    	{
    		return "/var/log/vmware/vsphere-ui/logs/CitrixH5PluginLog.log";
    	}
    }
    
    public String getHpModel() {
		return hpModel;
	}

	public void setHpModel(String hpModel) {
		this.hpModel = hpModel;
	}
	
	public boolean readConfigFileContent() throws java.io.IOException 
	{
		// prepare for the configuration file path and filename
		String sFileName = getCfgPath();
		java.io.BufferedReader bReader = null;

		try 
		{
			File file = new File(sFileName);
			// open streams for reading the content from the file
			bReader = new java.io.BufferedReader(new java.io.FileReader(file));
			String sLine;
			while (null != (sLine = bReader.readLine())) 
			{
				if (true == sLine.isEmpty())
					continue;
				String sTmp0 = sLine.trim();
				if ((sTmp0.charAt(0)) == '#')
					continue;

				int ix = sTmp0.indexOf("=");
				if (ix > 0) {
					// lets populate the values into map datastructures
					// we need to remove trailing spaces before we add it
					String sKey = sTmp0.substring(0, ix);
					String sValue = sTmp0.substring(++ix, sTmp0.length());
					cfgEntryMap.put(sKey.trim(), sValue.trim());
				}
			}
		}
		catch(FileNotFoundException foe)
		{
			logger.error("Configuration File not found!",foe);
			return false;
		}
		catch (Exception ex) {
			System.out.println("Exception: " + ex.toString());
			logger.error("WException", ex);
		} finally {
			bReader.close();
		}

		return true;
	}
	
	public List<ScriptInfo> getConfigureScriptList() {
		return configureScriptList;
	}

	public List<ScriptInfo> getDeconfigureScriptList() {
		logger.debug("DeonfigureScripList::"+deconfigureScriptList);
		return deconfigureScriptList;
	}

	public ProxyData getProxyData() 
	{
		return proxyData;
	}

	public void setProxyData(ProxyData proxyData) 
	{
		this.proxyData = proxyData;
	}

	public void setOVCData(OVCData ovcData) 
	{
		logger.debug("Setting OVC DATA:"+ovcData);
		this.ovcData = ovcData;
	}

	public OVCData getOVCData() 
	{
		return ovcData;
	}
	
	
	
	public String writeToFile( String sFileName, String sContent, String sSourceInfo )
	{
		System.out.println("Entered into writeToFile method: "+sFileName+" "+sSourceInfo);
		String fileInput = getTempLocation()+ File.separator + 
		                                sFileName;
		
		logger.debug( sSourceInfo + ": PrepareInputFile: "  + fileInput);
		try {
			File file = new File(fileInput);
			java.io.FileOutputStream outFile = new java.io.FileOutputStream(file);
			
			java.io.DataOutputStream outStream = new java.io.DataOutputStream(new java.io.BufferedOutputStream(outFile));
			outStream.writeBytes(sContent);
			outStream.close();
		}
		catch(IOException ioe)
		{
			System.out.println("Exception occured while writing to file ");
			ioe.printStackTrace();
			logger.error( "Exception occured while writing to file "+sFileName, ioe);
			return null;
		}
		
		return fileInput;
	}
	
	public boolean isCfgFileExists(String fileName)
	{
		msg = "Entering isCfgFileExists method: "+fileName;
		System.out.println(msg);
		logger.debug( msg);
		try
		{
			File file = new File(fileName);
			if(file.isFile())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			msg = "Exception while checking for Cfg File: "+e.getLocalizedMessage();
			System.out.println(msg);
			logger.error( msg, e);
			return false;
		}
		return false;
	}

	/*public String getCitrixPluginDataFolder(String file) 
   {
	   String dataFolder = null;
	    
	   System.out.println("File:"+file);
	   	logger.debug("Class: "+this.getClass());
	   try
	   {
		   logger.debug("Resource::"+this.getClass().getResource("/"));
			   
		   ClassLoader cl = BasicCfgFileUtil.class.getClassLoader();
		   File f = new File(cl.getResource(file).getFile());
		   dataFolder = f.getAbsolutePath();
		   logger.debug("PATH1::"+dataFolder);
		   URL res = getClass().getClassLoader().getResource(file);
		   if(res != null)
		   {
			   logger.debug("URL::"+res.toURI());
			   File ff = Paths.get(res.toURI()).toFile();
			   String absolutePath = ff.getAbsolutePath();
	           logger.debug("PATH2: "+absolutePath);
		   }
		  
		   File fff = new File("resources/abc.txt");
		   if(fff != null)
		   {
			   String absolutePath = fff.getAbsolutePath();
			   logger.debug("PATH3:"+absolutePath);
		   }
		   
	   }
	   catch(Exception e)
	   {
		   logger.error("Error occured while reading scriptFile",e);
		   e.printStackTrace();
	   }
	      return dataFolder;
   }*/
   
	public String getDeconfigureEntryFilePath()
	{
		//return getTempLocation()+"deconfigureEntry.csv";
		if(isWindows())
		{
			return getTempLocation()+"deconfigureEntry.csv";
		}
		else
		{
			//return "./deconfigureEntry.csv";
			return "/var/log/vmware/vsphere-ui/logs/deconfigureEntry.csv";
		}
		
	}
	
	public Map<String,List<String>> getClusterMap() 
	{
		return clusterMap;
	}

	public void setClusterMap(Map<String,List<String>> clusterMap) 
	{
		System.out.println("Setting cluster Map"+clusterMap);
		this.clusterMap = clusterMap;
	}
		
	public String getClusterInputPath()
	{
		return getTempLocation()+"clusterInput.psd1";
	}
	
	public String getClusterOutputPath()
	{
		return getTempLocation()+"clusteroutput.csv";
	}
	
	public String getClusterScriptPath()
	{
		if(isWindows())
		{
			return "C:/Users/Public/SimpliVityCitrixScripts/ClusterScript.ps1";
		}
		return "C:/SimplivityCitrixScripts/ClusterScript.ps1";
	}
	
	public String getPlatformScriptPath() 
	{
		if(isWindows())
		{
			return "C:/Users/Public/SimpliVityCitrixScripts/NonSimplivityScript.ps1";
		}
		return "C:/SimplivityCitrixScripts/NonSimplivityScript.ps1";
	}
	
	public String getPlatformInputPath()
	{
		return getTempLocation()+"platformInput.psd1";
	}
	
	public String getPlatformOutputPath()
	{
		return getTempLocation()+"platformoutput.csv";
	}
	
	public String getPsexecPath()
	{
		return "C:/Users/Public/SimpliVityCitrixScripts/PsExec.exe";
	}
	
	public String getTempLocation()
	{
		if(isWindows())
		{
			return "C:\\Users\\Public\\";
		}
		else
		{
			return "./";
		}
	}
	public String getCfgPath()
	{
		if(isWindows())
		{
			return getTempLocation()+"citrixPlugincfg.cfg";
		}
		else
		{
			return "/var/log/vmware/vsphere-ui/logs/citrixPlugincfg.cfg";
		}
	}
	public Map<String, String> getErrorMap()
	{
		return ERROR_MAP;
	}
	private void initiateErroMap()
	{
		ERROR_MAP = new HashMap<String,String>();
		ERROR_MAP.put("SERVER_CONNECTION_ERROR", "Couldn't resolve the server name/OVC IP address.  Please provide the correct details in OVC/ILO page.");
		ERROR_MAP.put("INVALID_LOGIN", "Unable to connec to vCenter Server. Invalid credentials provided. Please provide the correct details.");
		ERROR_MAP.put("UNABLE_TO_CONNECT_SERVER", "Unable to connec to vCenter Server. Please provide the correct details in OVC/ILO page.");
		ERROR_MAP.put("INVALID_OVC_IP", "Cannot resolve the OVC IP address. Please provide a valid OVC IP Address.");
		/*  CLONING OF VM SCRIPT*/
		ERROR_MAP.put("NO_REQUIRED_PARAMETERS_FOR_CLONING", "Few or all the required parameters are missing for VM_NAME.");
		ERROR_MAP.put("NO_TEMPLATE_FOUND", "Failed to get the template for VM_NAME.");
		ERROR_MAP.put("ACCESS_TOKEN_CREATION_FAILED", "SimpliVity Access Token creation failed for VM_NAME, please make sure that you provide correct credentials of OVC.");
		ERROR_MAP.put("NO_TEMPLATE_FOUND_FROM_API", "Failed to get the template for VM_NAME using SimpliVity API. Make sure that the VM template provided is proper.");
		ERROR_MAP.put("SIMPLIVITY_CLONE_FAILED", "VM creation using SimpliVity API failed for VM_NAME.");
		ERROR_MAP.put("VM_CREATION_FAILED", "Creation of VM VM_Name failed.");
		ERROR_MAP.put("UNABLE_TO_PING_IP", "Unable to ping the IP Address of VM_NAME.");
		ERROR_MAP.put("EXCEPTION_PING_IP", "Exception occured while pinging IP Address of VM_NAME.");
		ERROR_MAP.put("VM_DIDNT_COMEUP", "VM VM_NAME didnt come up after assigning static IP Address. Please make sure that the static IP given is free and other details are correct.");
		ERROR_MAP.put("STATIC_IP_ASSGIGNMENT_FAILED", "Static IP assignment failed for VM_NAME. Please make sure that the static IP given is free.");
		ERROR_MAP.put("IPV6_ASSIGNMENT", "IPV6 address is assigned for the VM VM_NAME instead of IPV4 Address.");
		
		/* COMPUTER NAME CHANGE SCRIPT */
		ERROR_MAP.put("NO_REQUIRED_PARAMETERS_FOR_CHANGING_COMPUTER_NAME", "Few or all the required parameters are missing for VM_NAME.");
		ERROR_MAP.put("COMPUTER_NAME_CHANGE_FAILED", "Changing the computer name for VM_NAME failed.");
		
		/* ADD DOMAIN SCRIPT */
		ERROR_MAP.put("NO_REQUIRED_PARAMETERS_ADD_DOMAIN", "Few or all the required parameters are missing for VM_NAME.");
		ERROR_MAP.put("GOT_IPV6_ADDRESS", "Got IPv6 address instead of IPv4 address for VM VM_NAME.");
		ERROR_MAP.put("UNABLE_TO_PING_VM", "Unable to ping the VM using IP Address.");
		ERROR_MAP.put("EXCEPTION_PING_IP", "Exception occured while pinging IP Address of VM_NAME.");
		ERROR_MAP.put("VM_DIDNT_COME_UP_POST_DOMAIN_ADDITION", "VM VM_NAME didnt come up after adding VM to domain.");
		ERROR_MAP.put("VM_NOT_ADDED_TO_DOMAIN", "VM VM_NAME didn't get added to domain.");
		
		/* RESOURCE LOCATION SCRIPT */
		ERROR_MAP.put("NO_REQUIRED_PARAMETERS_RESOURCE_LOCATION", "Few or all the required parameters are missing for VM_NAME.");
		ERROR_MAP.put("RESOURCE_LOCATION_TAG_FAILED", "Updating the resource location to resource location tag creation failed for VM_NAME.");
		ERROR_MAP.put("RESOURCE_LOCATION_CREATION_FAILED", "Resource location creation failed for VM VM_NAME.");
		
		/* INSTALLATION OF CWC CONNECTOR SCRIPT*/
		ERROR_MAP.put("NO_REQUIRED_PARAMETERS_INSTALL_CWC", "Few or all the required parameters are missing for VM_NAME.");
		ERROR_MAP.put("CWC_INSTALLATION_FAILED", "Citric CWC Connector failed for VM VM_NAME.");
		
		/* UNNISTALL CWC Connector */
		ERROR_MAP.put("NO_REQUIRED_PARAMETERS_UNINSTALL_CWC", "Few or all the required parameters are missing for VM_NAME.");
		ERROR_MAP.put("FAILED_TO_GET_VM", "Failed to getVM VM_NAME.");
		ERROR_MAP.put("GOT_IPV6_ADDRESS", "Got IPv6 address instead of IPv4 address for VM VM_NAME.");
		ERROR_MAP.put("UNINSTALL_FAILED", "CWCConnector didn't get uninstalled frm VM VM_NAME.");
		
		/* UNREGISTER FROM DOMAIN */
		ERROR_MAP.put("NO_REQUIRED_PARAMETERS_REMOVE_DOMAIN", "Few or all the required parameters are missing for VM_NAME.");
		ERROR_MAP.put("UNABLE_TO_POWER_OFF_VM", "Unable to poweroff the VM VM_NAME.");
		ERROR_MAP.put("GOT_IPV6_ADDRESS", "Got IPv6 address instead of IPv4 address for VM VM_NAME.");
		ERROR_MAP.put("VM_DIDNT_COME_UP_POST_UNREGISTERING_FROM_DOMAIN", "VM VM_NAME didnt come up after unregistering VM from domain.");
		ERROR_MAP.put("UNABLE_TO_UNREGISTER_FROM_DOMAIN", "VM VM_NAME didnt get unjoined from domain.");
	}

	public String getErrorDescription(String error)
	{
		if(error != null)
		{
			for(Map.Entry<String,String> entry: ERROR_MAP.entrySet())
			{
				if( error.contains(entry.getKey()))
				{
					System.out.println("VALUE:"+entry.getValue());
					return entry.getValue(); 
				}
			}
		}
		return null;
	}
	public boolean  copyFileUsingFileChannels(String source, String dest)
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
			System.out.println("OutputChannel: "+outputChannel);
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
				e.printStackTrace();
				return false;
				
			}
		}
		return true;
	}
	
	public void deleteFile(String fileName)
	{
		String msg = "Entered deleteFile method "+fileName;
		System.out.println(msg);
		logger.debug( msg);
		
		try {
			msg = "Enetered try block in delete file";
			System.out.println(msg);
			logger.debug( msg);
            java.io.File file = new java.io.File(fileName);
            if ( file.isFile() )
            {
            	msg = "Before deleteing File "+fileName;
            	System.out.println(msg);
            	logger.debug( msg);
            	file.delete();
            	msg = "Deleted file"+fileName;
            	System.out.println(msg);
            	logger.debug( msg);
            }
		 }
		 catch(Exception e)
		 {
			 msg = "Error in deleteing tempScrScript path"+fileName;
			 logger.error( msg, e);
			 System.out.println(msg);
			 e.printStackTrace();
		 }
		msg = "Exiting deleteFile method "+fileName;
		System.out.println(msg);
		logger.debug( msg);
	}

	public boolean deleteRemoteFile(String username, String host, String password, String remotefile){
		logger.debug("Enetered into deleteRemoteFile method: "+remotefile);
	    JSch jsch = new JSch();
	    Session session = null;
	    try {
	    	System.out.println("Starting new Session..");
	          session = jsch.getSession(username, host, 22);
	          session.setConfig("StrictHostKeyChecking", "no");
	          session.setPassword(password);
	          session.connect();

	          System.out.println("Connected to "+host);
	          Channel channel = session.openChannel("sftp");
	          channel.connect();
	          System.out.println("Connected to SFTP");
	          ChannelSftp sftpChannel = (ChannelSftp) channel;
	          sftpChannel.rm(remotefile);
	          System.out.println("Deleted the file "+remotefile+ "on "+host);
	          sftpChannel.exit();
	          session.disconnect();
	          System.out.println("Disconnected from "+host);
	     } catch (JSchException j) {
	    	 logger.error("Exp while deleting file..",j);
	          j.printStackTrace();
	          return false;
	     } catch (SftpException s) {
	    	 logger.error("Exp while deleting file..",s);
	          s.printStackTrace();
	          return false;
	     }
	    catch(Exception e)
	    {
	    	logger.error("Exp while deleting file..",e);
	    	e.printStackTrace();
	    	return false;
	    }
	    return true;
	}

	public boolean writeRemoteFile(String username, String host, String password, String remotefile, String content){
	    logger.debug("Entered into writeRemoteFile method: "+remotefile);
	    boolean flag = false;
		JSch jsch = new JSch();
	    Session session = null;
	    ByteArrayInputStream bais = null;
	    try {
	    	logger.debug("Starting new Session..");
	          session = jsch.getSession(username, host, 22);
	          session.setConfig("StrictHostKeyChecking", "no");
	          session.setPassword(password);
	          session.connect();

	          logger.debug("Connected to "+host);
	          Channel channel = session.openChannel("sftp");
	          channel.connect();
	          System.out.println("Connected to SFTP");
	          ChannelSftp sftpChannel = (ChannelSftp) channel;
	          bais = new ByteArrayInputStream(content.getBytes());
	          sftpChannel.put(bais, remotefile);
	          logger.debug("Writing to "+host+" file");
	          bais.close();
	          sftpChannel.exit();
	          session.disconnect();
	          logger.debug("Disconnected from "+host);
	     } catch (JSchException j) {
	    	 logger.error("Error while writing file "+remotefile+" remotely ", j);
	          j.printStackTrace(); 
	          return false;
	     } catch (SftpException s) {
	    	 logger.error("Error while writing file "+remotefile+" remotely ", s);
	          s.printStackTrace();
	          return false;
	     }
	    catch(Exception e)
	    {
	    	logger.error("Error while writing file "+remotefile+" remotely ", e);
	    	e.printStackTrace();
	    	return false;
	    }
	    finally
	    {
	    	try
	    	{
	    		if(bais != null)
	    			bais.close();
	    	}
	    	catch(Exception e)
	    	{
	    		logger.error("Error while closing the file "+remotefile+" while writing", e);
	    	}
	    }
	    return true;
	}
	
	public void appendRemoteFile(String username, String host, String password, String remotefile, String content){
	    JSch jsch = new JSch();
	    Session session = null;
	    ByteArrayInputStream byteArrayInputStream = null;
	    try {
	    	logger.debug("Starting new Session..");
	          session = jsch.getSession(username, host, 22);
	          session.setConfig("StrictHostKeyChecking", "no");
	          session.setPassword(password);
	          session.connect();

	          logger.debug("Connected to "+host);
	          Channel channel = session.openChannel("sftp");
	          channel.connect();
	          logger.debug("Connected to SFTP");
	          ChannelSftp sftpChannel = (ChannelSftp) channel;
	          byteArrayInputStream = new ByteArrayInputStream(content.getBytes());
	          sftpChannel.put(byteArrayInputStream, remotefile, ChannelSftp.APPEND);
	          System.out.println("Writing to "+host+" file");
	          sftpChannel.exit();
	          session.disconnect();
	          logger.debug("Disconnected from "+host);
	     } catch (JSchException j) {
	    	 logger.error("Exp while appending file..",j);
	          j.printStackTrace();  
	     } catch (SftpException s) {
	    	 logger.error("Exp while appending file..",s);
	          s.printStackTrace();
	     }
	    catch(Exception e)
	    {
	    	logger.error("Exp while appending file..",e);
	    	e.printStackTrace();
	    }
	    finally
	    {
	    	try
	    	{
	    		if(byteArrayInputStream != null)
	    			byteArrayInputStream.close();
	    	}
	    	catch(Exception e)
	    	{
	    		logger.error("Error while closing the file "+remotefile+" while appending", e);
	    	}
	    }
	}
	
	public void copyRemoteFile(String username, String host, String password, String remotefile, String localfile){
		logger.debug("Entered into copyRemoteFile method....."+remotefile+" LocalFile: "+localfile);
	    JSch jsch = new JSch();
	    Session session = null;
	    try {
	    	logger.debug("Starting new Session for copying..");
	          session = jsch.getSession(username, host, 22);
	          session.setConfig("StrictHostKeyChecking", "no");
	          session.setPassword(password);
	          session.connect();

	          logger.debug("Connected to "+host);
	          Channel channel = session.openChannel("sftp");
	          channel.connect();
	          logger.debug("Connected to SFTP");
	          ChannelSftp sftpChannel = (ChannelSftp) channel;
	          sftpChannel.put(localfile, remotefile);
	          logger.debug("Copied the file "+localfile+" to "+host);
	          sftpChannel.exit();
	          session.disconnect();
	          logger.debug("Disconnected from "+host);
	     } catch (JSchException j) {
	    	 logger.error("Exp while copying file..",j);
	          j.printStackTrace();  
	     } catch (SftpException s) {
	    	 System.out.println("SFTP Exception while copying !");
	    	 logger.error("Exp while copying file..",s);
	          s.printStackTrace();
	     }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	logger.error("Exp while copying file..",e);
	    }
	}
	
	public boolean checkRemoteFileExists(String username, String host, String password, String remotefile){
		logger.debug("Entered into checkRemoteFileExists.....");
	    JSch jsch = new JSch();
	    Session session = null;
	    SftpATTRS attrs = null;
	    boolean retVal = false;
	    try {
	    	logger.debug("Starting new Session for checking whether file exists..");
	          session = jsch.getSession(username, host, 22);
	          session.setConfig("StrictHostKeyChecking", "no");
	          session.setPassword(password);
	          session.connect();

	          logger.debug("Connected to "+host);
	          Channel channel = session.openChannel("sftp");
	          channel.connect();
	          logger.debug("Connected to SFTP");
	          ChannelSftp sftpChannel = (ChannelSftp) channel;
	          attrs = sftpChannel.stat(remotefile);
	          if(attrs != null)
	          {
	        	  retVal = true;
	        	  logger.debug("File "+remotefile+"Exists on remote system "+host);
	          }
	          else
	          {
	        	  logger.debug("File "+remotefile+" does not exists on remote machine "+host);
	          }
	          sftpChannel.exit();
	          session.disconnect();
	          logger.debug("Disconnected from "+host);
	     } catch (JSchException j) {
	    	 logger.error("Exp while checking  file..",j);
	          j.printStackTrace();  
	     } catch (SftpException s) {
	    	 logger.error("Exp while checking file..",s);
	          s.printStackTrace();
	     }
	    catch(Exception e)
	    {
	    	logger.error("Exp while checking file..",e);
	    	e.printStackTrace();
	    }
	    return retVal;
	}

	public String getHostname() {
		System.out.println("HOSTNAME: "+hostname);
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

}
