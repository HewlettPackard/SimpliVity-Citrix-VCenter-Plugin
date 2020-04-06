package com.vmware.simplivity.citrixplugin.services.impl;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;

import org.apache.log4j.Logger;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;

import com.vmware.simplivity.citrixplugin.model.Message;
import com.vmware.simplivity.citrixplugin.model.OVCData;
import com.vmware.simplivity.citrixplugin.model.RemoteWindowsVMData;
import com.vmware.simplivity.citrixplugin.services.OVCService;
import com.vmware.simplivity.citrixplugin.util.BasicCfgFileUtil;

public class OVCServiceImpl implements OVCService 
{
	private Logger logger = Logger.getLogger(OVCServiceImpl.class);
	private BasicCfgFileUtil fileUtil;
	private String msg = null;
	
	public OVCServiceImpl(){}

	public void setFileUtil(BasicCfgFileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}

	public BasicCfgFileUtil getFileUtil() {
		return fileUtil;
	}

	@Override
	public Message setOVCData(OVCData ovcData) 
	{
		//fileUtil.initLogger();
		Message ret = new Message();
		msg = "Entering into OVCServiceImpl:"+ovcData;
		logger.debug(msg);
		
		if(ovcData == null || ovcData.isEmpty())
		{
			msg = "Empty platform data received!";
			logger.error(msg);
			ret.error = msg;
			return ret;
		}
		
		if(!System.getProperty("os.name").contains("Windows"))
		{
			if(ovcData.remoteWindowsVMData.isEmpty())
			{
				msg = "Please provide the remote Windows VM details!";
				logger.error(msg);
				ret.error = msg;
				return ret;
			}
		}
		
		if(ovcData.getPlatform())
		{
			InetAddress inetAddress = null;
			String url = null;
			try {
				inetAddress = InetAddress.getLocalHost();
				ovcData.setOVCIP(url);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
			ovcData.setOVCIP(url);
			/// Remove this once ILO is added
			//ovcData.setOVCIP(ovcData.getIloAddress());
		}
		
		String validationError = validateCredentials(ovcData);
		if(validationError != null)
		{
			logger.debug(validationError);
			ret.error = validationError;
			return ret;
		}
		
		fileUtil.setOVCData(ovcData);
		msg = "Platform data is set to "+ovcData;
		logger.debug(msg);
		msg = "Platform details are saved!";
		ret.message = msg;
		return ret;
	}

	private String validateCredentials(OVCData ovcData) {
		logger.debug("Entered validateCredentials method:"+ovcData);
		
		String retVal = null;
		String validateRWD = null;
		
		String sFileLine = "@{\r\novc = \r\n\t@{\r\n";
		sFileLine += "\tovcip = " + "\'"+ ovcData.getOVCIP() + "\'\r\n"
				+ "\tplatform = " + "\'"+ ovcData.getPlatform() + "\'\r\n"
				+ "\tovcusername = " + "\'"+ ovcData.ovcUsername + "\'\r\n";
		sFileLine += "\thostname = " + "\'" + fileUtil.getHostname()+ "\'\r\n" ;
		sFileLine += "\tovcpassword = " + "\'"+ ovcData.getOVCPassword()+ "\'\r\n \t}\r\n}\r";
		logger.debug("SCRIPT INPUT::"+sFileLine);
		if(fileUtil.isWindows())
		{
			logger.debug("Windows system!!!");
			retVal = executeValidationScript(sFileLine);
		}
		else
		{
			logger.debug("Non-Windows System!!");
			validateRWD = validateRemoteVMDetails(ovcData.getRemoteWindowsVMData());
			if(validateRWD == null)
			{
				retVal = executeValidationScriptRemotely(sFileLine, ovcData.getRemoteWindowsVMData());
			}
			else
			{
				retVal = validateRWD;
			}
			
		}
		logger.debug("Returning from  validateCredentials method:"+retVal);
		return retVal;
	}

	private String validateRemoteVMDetails(
			RemoteWindowsVMData remoteWindowsVMData) {
		logger.debug("Entereing into validateRemoteVMDetails method:"+remoteWindowsVMData);
		String hostname = remoteWindowsVMData.getWinIP();
		String username = remoteWindowsVMData.getWinUsername();
		String password = remoteWindowsVMData.getWinPassword();
		String retVal = null;
		
		try {
			Connection conn = new Connection(hostname);
			conn.connect();
			boolean isAuthenticated = conn.authenticateWithPassword(username,
					password);
			if (isAuthenticated == false) {
				logger.error("authentication failed");
				retVal = "Invalid credentials are provided for Remote Windows VM. Please make sure that you provide correct details.";
				return retVal;
			}
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			logger.error("IOE Exception");
			retVal = "Unable to make connection to remote Windows machine. Please make sure that you provide correct details and OpenSSh server is up and running on the remote Windows VM.";
		}
		catch(Exception e)
		{
			logger.error("Exception");
			retVal = "Unable to make connection to remote Windows machine. Please make sure that you provide correct details and OpenSSh server is up and running on the remote Windows VM.";
		}
		logger.debug("Returning from validateRemoteVMDetails method: "+retVal);
		return retVal;
	}

	private String executeValidationScriptRemotely(String sFileLine, RemoteWindowsVMData rwd) {
		logger.debug("Entering into executeValidationScriptRemotely method: "+rwd+", "+sFileLine);
		String inputFile = "./validateInput.psd1";
		String scriptPath = "C:/SimplivityCitrixScripts/ValidateCredentials.ps1";
		String hostname = rwd.getWinIP();
		String username = rwd.getWinUsername(), password = rwd.getWinPassword();
		InputStream stdout = null;
		BufferedReader br = null;
		InputStream stderr = null;
		BufferedReader err = null;
		String retVal = null;
		
		try {
			fileUtil.writeRemoteFile(username, hostname, password, inputFile, sFileLine);
			Connection conn = new Connection(hostname);
			conn.connect();
			boolean isAuthenticated = conn.authenticateWithPassword(username,
					password);
			if (isAuthenticated == false) {
				logger.error("authentication failed");
			}
			logger.debug(isAuthenticated);
			Session sess = conn.openSession();
			sess.execCommand("powershell "+scriptPath+" -inputFile " + inputFile
					+ " -logFile ./info.log");
			stdout = new StreamGobbler(sess.getStdout());
			br = new BufferedReader(
					new InputStreamReader(stdout));
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				logger.debug(line);
			}
			stderr = new StreamGobbler(sess.getStderr());
			err = new BufferedReader(new InputStreamReader(
					stderr));

			String line = null;
			String error = "";
			while ((line = err.readLine()) != null) {
				//System.out.println("ERROR::" + line);
				logger.error("ERRPR:"+line);
				error += line;
			}
			if(error.length() > 0)
			{
				retVal = fileUtil.getErrorDescription(error);
			}
			// System.out.println("Exit code" + sess.getExitStatus());
			sess.close();
			conn.close();
			err.close();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception occured while executing executeValidationScriptRemotely script");
			retVal = "Unable to make connection to remote Windows machine. Please make sure that you provide correct details and OpenSSh server is up and running on the remote Windows VM.";
		}
		finally{
			try
			{
				if(stdout != null) stdout.close();
				if(stderr != null) stderr.close();
				if(br != null) br.close();
				if(err != null) err.close();
			}
			catch(Exception e)
			{
				logger.debug("Error while closing streams whiel executing executeValidationScriptRemotely");
			}
			fileUtil.deleteRemoteFile(rwd.getWinUsername(), rwd.getWinIP(), rwd.getWinPassword(), inputFile);
		}
		return retVal;
	}

	private String executeValidationScript(String sFileLine) {
		String inputFile = "C:\\Users\\Public\\validateInput.psd1";
		String scriptPath = "C:/Users/Public/SimpliVityCitrixScripts/ValidateCredentials.ps1";
		FileWriter fw = null;
		String retVal = null;
		String error = "";
		try
		{
			fw = new FileWriter(inputFile);
			fw.write(sFileLine);
			fw.close();
			
			String sCommand = "powershell.exe \"" + scriptPath + "\""
					+ " -inputfile " + "\"" + "\'" + inputFile + "\'" + "\""
					+ " -logfile " + "\"" + "\'" +
					/* ra.getFile() */fileUtil.getLogFile() + "\'" + "\"";
			logger.debug("Command to execute ClusterScript:"+sCommand);
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
				error += line;
				
			}
			if(error.length() >0)
			{
				retVal = fileUtil.getErrorDescription(error);
			}
			stderr.close();
		}
		catch (IOException ioe) {
			msg = "Error occured while writing to file";
			logger.error(msg, ioe);
			ioe.printStackTrace();
		} catch (Exception e) {
			msg = "Error occured while getting the cluster info";
			logger.error(msg, e);
			e.printStackTrace();
		}
		finally
		{
			fileUtil.deleteFile(inputFile);
		}
		return retVal;
	}

	@Override
	public Message isOVCDataSet()
	{
		Message msg = new Message();
		logger.debug("Entered into isOVCDataSet method");
		OVCData ovcData = fileUtil.getOVCData();
		if( ovcData == null)
		{
			msg.error = "OVC/ILO Data not provided. So please provide the ILO/OVC details in OVC/ILO page";
			return msg;
		}
		return null;
	}
	
	@Override
	public Message isNonSimplivityPlatform()
	{
		Message msg = null;
		logger.debug("Entered into isNonSimplivityPlatform method");
		OVCData ovcData = fileUtil.getOVCData();
		if( ovcData == null)
		{
			msg = new Message();
			msg.error = "OVC/ILO Data not provided. So please provide the ILO/OVC details in OVC/ILO page";
			return msg;
		}
		
		if(ovcData.isNonSimplivityPlatformSet())
		{
			msg = new Message();
			msg.message = "set";
		}
		return msg;
	}
}
