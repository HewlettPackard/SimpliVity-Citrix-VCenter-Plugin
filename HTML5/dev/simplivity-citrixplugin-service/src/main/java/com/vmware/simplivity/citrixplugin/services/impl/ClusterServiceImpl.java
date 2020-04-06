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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.vmware.simplivity.citrixplugin.model.ClusterAndHostInfo;
import com.vmware.simplivity.citrixplugin.model.OVCData;
import com.vmware.simplivity.citrixplugin.model.RemoteWindowsVMData;
import com.vmware.simplivity.citrixplugin.services.ClusterService;
import com.vmware.simplivity.citrixplugin.util.BasicCfgFileUtil;

public class ClusterServiceImpl implements ClusterService {

	private Logger logger = Logger.getLogger(ClusterServiceImpl.class);
	private BasicCfgFileUtil fileUtil;
	private boolean ovcDataNotSet = false;

	public void setFileUtil(BasicCfgFileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}

	private String msg = null;
	String tempScriptPath = null;
	Map<String, List<String>> clusterMap = null;

	ClusterAndHostInfo clusterAndHostInfo = null;

	public ClusterServiceImpl() {
	}

	@Override
	public ClusterAndHostInfo getClusterInfo() {
		msg = "Enetering getClusterInfo method ..";
		logger.debug(msg);
		
		OVCData ovcData = fileUtil.getOVCData();
		logger.debug("OVC DATA from fileUtil: "+ovcData);
		
		if (ovcData == null) {
			msg = "OVC/ILO details are not set. Please got to OVC/ILO Details page and enter OVC details";
			logger.error(msg);
			return null;
		}
		if (fileUtil.isWindows()) {
			buildClusterMap();
			fileUtil.deleteFile(tempScriptPath);
			fileUtil.deleteFile(fileUtil.getClusterInputPath());
			fileUtil.deleteFile(fileUtil.getClusterOutputPath());
		} else {
			buildClusterMapForNonWindowsSystem();
			RemoteWindowsVMData rwvd = fileUtil.getOVCData().getRemoteWindowsVMData();
			fileUtil.deleteRemoteFile(rwvd.getWinUsername(), rwvd.getWinIP(), rwvd.getWinPassword(), "./clusterInput.psd1");
			fileUtil.deleteRemoteFile(rwvd.getWinUsername(), rwvd.getWinIP(), rwvd.getWinPassword(), "./cluterOutput.csv");
			//fileUtil.deleteRemoteFile("Administrator", "10.20.6.243", "HP1nvent", "./cluster.ps1");
		}
		clusterMap = fileUtil.getClusterMap();
		logger.debug("ClusterMap:|:" + clusterMap);
		if (clusterMap != null && !clusterMap.isEmpty()) {
			//System.out.println("Enetered IF condition" + clusterMap);
			String[] clusters = new String[clusterMap.keySet().size() + 1];
			int i = 0;
			clusters[i++] = "Select Cluster";
			for (String item : clusterMap.keySet()) {
				clusters[i++] = item;
			}
			clusterAndHostInfo = new ClusterAndHostInfo();
			clusterAndHostInfo.setClusters(clusters);
		}
		msg = "Returning from getClusterInfo method" + clusterAndHostInfo;
		//System.out.println(msg);
		logger.debug(msg);
		return clusterAndHostInfo;
	}

	@Override
	public ClusterAndHostInfo getHosts(String clusterName) {
		msg = "Enetered get Hosts method..." + clusterName;
		//System.out.println(msg);
		logger.debug(msg);

		if (clusterName == null || clusterName.equals("Select Cluster")) {
			msg = "No cluster Selected";
			System.out.println(msg);
			logger.error(msg);
			return null;
		}
		clusterMap = fileUtil.getClusterMap();
		List<String> hosts = clusterMap.get(clusterName);
		String[] ret = new String[hosts.size() + 1];
		int index = 0;
		ret[index++] = "Select Host";
		for (String host : hosts) {
			ret[index++] = host;
		}
		msg = "Returning from getHosts  method" + ret;
		//System.out.println(msg);
		logger.info(msg);
		clusterAndHostInfo = new ClusterAndHostInfo();
		clusterAndHostInfo.setHosts(ret);
		return clusterAndHostInfo;
	}

	private boolean executeScriptOnRemoteSystem() {
		boolean retVal = false;
		String inputFile = "./clusterInput.psd1";
		String outputFile = "./cluterOutput.csv";
		String clusterScript = fileUtil.getClusterScriptPath();
		RemoteWindowsVMData rwd = fileUtil.getOVCData().getRemoteWindowsVMData();
		String hostname = rwd.getWinIP();//"10.20.6.243";
		String username = rwd.getWinUsername(), password = rwd.getWinPassword();
		InputStream stdout = null;
		BufferedReader br = null;
		InputStream stderr = null;
		BufferedReader err = null;

		if (clusterScript == null) {
			msg = "Error in reading the ClusterScript file";
			logger.error(msg);
			//System.out.println(msg);
			ovcDataNotSet = true;
			return false;
		}
		OVCData ovcData = fileUtil.getOVCData();
		if (ovcData == null) {
			msg = "OVC/ILO Details not set";
			logger.error(msg);
			//System.out.println(msg);
			return false;
		}

		String sFileLine = "@{\r\ncluster = \r\n\t@{\r\n";

		sFileLine += "\tusername = " + "\'"+ fileUtil.getOVCData().getOVCUserName() + "\'\r\n";
		sFileLine += "\tpassword = " + "\'"+ fileUtil.getOVCData().getOVCPassword() + "\'\r\n";
		sFileLine += "\thostname = " + "\'" + fileUtil.getHostname() +"\'\r\n" ;
		sFileLine += "\tclusterOutput = " + "\'" + outputFile+ "\'\r\n \t}\r\n}\r";

		fileUtil.writeRemoteFile(username, hostname, password, inputFile, sFileLine);
		//fileUtil.copyRemoteFile(username, hostname, password, "./cluster.ps1",
			//	clusterScript);

		try {
			Connection conn = new Connection(hostname);
			conn.connect();
			boolean isAuthenticated = conn.authenticateWithPassword(username,
					password);
			if (isAuthenticated == false) {
				logger.error("authentication failed");
			}
			logger.debug(isAuthenticated);
			Session sess = conn.openSession();
			sess.execCommand("powershell "+clusterScript+" -inputFile " + inputFile
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
			while ((line = err.readLine()) != null) {
				//System.out.println("ERROR::" + line);
				logger.error("ERRPR:"+line);
			}
			// System.out.println("Exit code" + sess.getExitStatus());
			sess.close();
			conn.close();
			retVal = true;
			err.close();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception occured while executing Cluster script", e);
			retVal = false;
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
				logger.debug("Error while closing streams whiel executing ClusterScript remotely");
			}
		}
		return retVal;
	}

	public void buildClusterMapForNonWindowsSystem() {
		msg = "Entered into buildClusterMapForNonWindowsSystem method";
		//System.out.println(msg);
		logger.debug(msg);
		boolean executeFlag = executeScriptOnRemoteSystem();

		if (!executeFlag) {
			msg = "Error occured while retreiving the cluster info. Check the log for more info";
			//System.out.println(msg);
			logger.error(msg);
			return;
		}
		String line = "";
		String csvSplit = ",";
		int count = 0;
		JSch jsch = new JSch();
	    com.jcraft.jsch.Session session = null;
		String csvFile = "./cluterOutput.csv";
		Map<String, List<String>> map = fileUtil.getClusterMap();
		RemoteWindowsVMData rwd = fileUtil.getOVCData().getRemoteWindowsVMData();
		InputStream stream = null;
		BufferedReader br = null;
		InputStreamReader reader = null;

		try {
			session = jsch.getSession(rwd.getWinUsername(), rwd.getWinIP(), 22);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword(rwd.getWinPassword());
			session.connect();

			logger.debug("Connected to " + rwd.getWinIP());
			Channel channel = session.openChannel("sftp");
			channel.connect();
			logger.debug("Connected to SFTP");
			ChannelSftp sftpChannel = (ChannelSftp) channel;
			stream = sftpChannel.get(csvFile);
			reader = new InputStreamReader(stream);
			br = new BufferedReader(reader);

			// Cleaning the map
			map = null;
			map = new HashMap<String, List<String>>();
			while ((line = br.readLine()) != null) {
				count++;
				// Ignoring the first two lines of file which have headers and
				// comments
				if (count < 3)
					continue;
				String[] data = line.split(csvSplit);
				String key = data[1].replaceAll("\"", "");
				String value = data[0].replaceAll("\"", "");

				if (map.containsKey(key)) {
					List<String> list = map.get(key);
					if (!list.contains(value)) {
						list.add(value);
					}
					map.put(key, list);
				} else {
					List<String> list = new ArrayList<String>();
					list.add(value);
					map.put(key, list);
				}
			}
			msg = "ClusterMap: " + map;
			logger.debug(msg);
			if (!map.isEmpty()) {
				fileUtil.setClusterMap(map);
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
			msg = "ClusterInfo csv file not found";
			fnfe.printStackTrace();
			logger.error(msg, fnfe);
		} catch (IOException ioe) {
			msg = "Error occured while reading the csv file containing csv file";
			ioe.printStackTrace();
			logger.error(msg, ioe);
		}
		catch(Exception e)
		{
			msg = "Error occured while reading the csv file containing csv file";
			e.printStackTrace();
			logger.error(msg, e);
		}
		finally
		{
			try
			{
				if(stream != null)
					stream.close();
				if(reader != null)
					reader.close();
				if(br != null)
					br.close();
			}
			catch(Exception e)
			{
				logger.error("Exception while closing the CSV file", e);
			}
		}
	}

	/**
	 * Method: executeClusterInfoScript
	 * 
	 * Description: Execute the ClusterInfo script and store the result in a csv
	 * file.
	 */
	private boolean executeClusterInfoScript() {
		boolean retVal = false;
		String inputFile = fileUtil.getClusterInputPath();
		String outputFile = fileUtil.getClusterOutputPath();
		String clusterScript = fileUtil.getClusterScriptPath();

		if (clusterScript == null) {
			msg = "Error in reading the ClusterScript file";
			logger.error(msg);
			//System.out.println(msg);
			ovcDataNotSet = true;
			return false;
		}
		tempScriptPath = fileUtil.getTempLocation() + "tempClusterscript.ps1";

		fileUtil.copyFileUsingFileChannels(clusterScript, tempScriptPath);

		try {
			OVCData ovcData = fileUtil.getOVCData();
			if (ovcData == null) {
				msg = "OVC/ILO Details not set";
				logger.error(msg);
				//System.out.println(msg);
				return false;
			}
			/* Creating input file foe cluster Script */
			File inputFileObj = new File(inputFile);
			inputFileObj.setWritable(true);
			FileWriter fw = new FileWriter(inputFile);
			String sFileLine = "@{\r\ncluster = \r\n\t@{\r\n";

			sFileLine += "\tusername = " + "\'"+ fileUtil.getOVCData().getOVCUserName() + "\'\r\n";
			sFileLine += "\tpassword = " + "\'"+ fileUtil.getOVCData().getOVCPassword() + "\'\r\n";
			sFileLine  += "\thostname = " + "\'" + fileUtil.getHostname() +"\'\r\n" ;
			sFileLine += "\tclusterOutput = " + "\'" + outputFile+ "\'\r\n \t}\r\n}\r";
			logger.debug("Cluster Input::" + sFileLine);
			fw.write(sFileLine);
			fw.close();

			// RollingFileAppender ra = (RollingFileAppender)
			// Logger.getRootLogger().getAppender("file");

			// Command to execute the powercli script to get cluster info
			String sCommand = "powershell.exe \"" + tempScriptPath + "\""
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
		return retVal;
	}

	/**
	 * Method: buildClusterMap
	 * 
	 * Description: Prepare a cluster Map instance by reading the entries read
	 * from csv file.
	 */
	private void buildClusterMap() {
		msg = "Entered into buildClusterMap method";
		logger.debug(msg);
		boolean executeFlag = executeClusterInfoScript();

		if (!executeFlag) {
			msg = "Error occured while retreiving the cluster info. Check the log for more info";
			logger.error(msg);
			return;
		}
		String line = "";
		String csvSplit = ",";
		int count = 0;
		String csvFile = fileUtil.getClusterOutputPath();
		Map<String, List<String>> map = fileUtil.getClusterMap();

		try {
			BufferedReader br = new BufferedReader(new FileReader(csvFile));

			// Cleaning the map
			map = null;
			map = new HashMap<String, List<String>>();
			while ((line = br.readLine()) != null) {
				count++;
				// Ignoring the first two lines of file which have headers and
				// comments
				if (count < 3)
					continue;
				String[] data = line.split(csvSplit);
				String key = data[1].replaceAll("\"", "");
				String value = data[0].replaceAll("\"", "");

				if (map.containsKey(key)) {
					List<String> list = map.get(key);
					if (!list.contains(value)) {
						list.add(value);
					}
					map.put(key, list);
				} else {
					List<String> list = new ArrayList<String>();
					list.add(value);
					map.put(key, list);
				}
			}
			msg = "ClusterMap: " + map;
			logger.debug(msg);
			if (!map.isEmpty()) {
				fileUtil.setClusterMap(map);
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
			msg = "ClusterInfo csv file not found";
			fnfe.printStackTrace();
			logger.error(msg, fnfe);
		} catch (IOException ioe) {
			msg = "Error occured while reading the csv file containing csv file";
			ioe.printStackTrace();
			logger.error(msg, ioe);
		}
	}
}
