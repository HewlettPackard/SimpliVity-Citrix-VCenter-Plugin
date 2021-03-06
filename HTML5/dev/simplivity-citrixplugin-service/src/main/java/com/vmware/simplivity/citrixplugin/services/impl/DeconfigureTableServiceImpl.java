package com.vmware.simplivity.citrixplugin.services.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.vmware.simplivity.citrixplugin.model.DeconfigureTableEntries;
import com.vmware.simplivity.citrixplugin.model.DeconfigureTableEntry;
import com.vmware.simplivity.citrixplugin.model.RemoteWindowsVMData;
import com.vmware.simplivity.citrixplugin.services.DeconfigureTableService;
import com.vmware.simplivity.citrixplugin.util.BasicCfgFileUtil;

public class DeconfigureTableServiceImpl implements DeconfigureTableService 
{
	private Logger logger= Logger.getLogger(DeconfigureTableServiceImpl.class);
	private BasicCfgFileUtil fileUtil;
	private String msg = null;
	private DeconfigureTableEntries deconfigureTableEntries = null;
	
	public DeconfigureTableServiceImpl(){}
	
	public void setFileUtil(BasicCfgFileUtil fileUtil) 
	{
		this.fileUtil = fileUtil;
	}
	
	@Override
	public DeconfigureTableEntries getDeconfigureEntries() 
	{
		msg = "Entered getDeconfigureEntries method";
		logger.debug(msg);
		
		List<DeconfigureTableEntry> list = null;
		

		BufferedReader br = null;
		String file = fileUtil.getDeconfigureEntryFilePath();
		logger.debug("getDeconfigureEntryFilePath: "+file);
		String line = "";
	   	String csvSplit = ",";
	   	File fileObj = null;	
	   	boolean flag = false;
	   	int count = 0;
	   	RemoteWindowsVMData rwd = fileUtil.getOVCData().getRemoteWindowsVMData();
	   	logger.debug("Remote Windows Data:"+rwd);
	   	JSch jsch = new JSch();
		Session session = null;
		InputStream stream = null;
		FileReader fileReader = null;
		InputStreamReader inputStreamReader = null;
	   	
	   	try
	   	{
	   		msg = "Reading from DeconfigureFile:"+file;
	   		logger.debug(msg);
	   		
	   		/*if(fileUtil.isWindows())
	   		{
	   			fileObj = new File(file);
		   		fileObj.setReadable(true);
		   		fileReader = new FileReader(fileObj);
	   			br = new BufferedReader(fileReader);
	   		}
	   		else
	   		{
	   			logger.debug("Non windows system");
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
				stream = sftpChannel.get(file);
				inputStreamReader = new InputStreamReader(stream);
				br = new BufferedReader(inputStreamReader);
	   			logger.debug("Non windows system");
	   			fileObj = new File(file);
		   		fileObj.setReadable(true);
		   		fileReader = new FileReader(fileObj);
	   			br = new BufferedReader(fileReader);
	   		}*/
	   		fileObj = new File(file);
	   		if(!fileObj.exists())
	   		{
	   			logger.warn("Deconfigure entries not created yet.");
		   		return null;
	   		}
	   		fileObj.setReadable(true);
	   		fileReader = new FileReader(fileObj);
   			br = new BufferedReader(fileReader);
	   		
	   		if(br != null)
	   		{
	   			while((line = br.readLine()) != null)
		   		{
	   				if(list == null)
	   				{
	   					list = new ArrayList<DeconfigureTableEntry>();
	   				}
		   			String []split = line.split(csvSplit);
		   			if(split.length == 7)
		   			{
			   			DeconfigureTableEntry entry = new DeconfigureTableEntry();
			   			entry.setVmName(split[0]);
			   			entry.setVmUserName(split[1]);
			   			entry.setVmHost(split[2]);
			   			entry.setVmCluster(split[3]);
			   			entry.setDomainName(split[4]);
			   			entry.setDomainUserName(split[5]);
			   			entry.setRowNumber(Integer.parseInt(split[6]));
			   			
			   			list.add(entry);
		   			}
		   			else
		   			{
		   				flag = true;
		   				count++;
		   			}
		   		}
	   		}
	   		if(flag)
	   		{
	   			msg = count+" improper entries were found in the deconfigure entry file";
	   			logger.warn(msg);
	   		}
	   		msg = "DeconfigureEnry List: "+list;
	   		logger.debug(msg);
	   	}
	   	catch(FileNotFoundException foe)
	   	{
	   		logger.warn("Deconfigure entries not created yet.");
	   		return null;
	   	}
	   	catch(Exception e)
	   	{
	   		msg = "Exception occured during reading from DeconfigureEntry File: "+e.getMessage();
	   		e.printStackTrace();
	   		logger.error(msg, e);
	   	}	
	   	finally
	   	{
	   		try
	   		{
	   			if(br != null)
	   			{
	   				br.close();
	   			}
	   			if(inputStreamReader != null)
	   			{
	   				inputStreamReader.close();
	   			}
	   			if(stream != null)
	   			{
	   				stream.close();
	   			}
	   			if(fileReader != null)
	   			{
	   				fileReader.close();
	   			}
	   		}
	   		catch(Exception e)
	   		{
	   			msg = "Erro while closing the file "+e.getMessage();
	   			logger.warn(msg);
	   		}
	   	}
	   	msg = "DeconfigureEntries List: "+list;
	   	logger.debug(msg);
	   	if(list == null || list.isEmpty())
	   	{
	   		logger.debug("Deconfigure entries are empty!");
	   		return null;
	   	}
	   	if(list != null && !list.isEmpty() && list.size() >0)
	   	{
	   		deconfigureTableEntries = new DeconfigureTableEntries();
	   		deconfigureTableEntries.setDeconfigureTableEntries(list);
	   	}
	   	list = null;
	   	
	   	logger.debug("Returning from getDeconfigureEntries method:"+deconfigureTableEntries);
		return deconfigureTableEntries;
	}
	
}
