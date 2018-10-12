package com.vmware.simplivity.citrixplugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DeconfigureTableServiceImpl implements DeconfigureTableService 
{
	private LogUtil logUtil;
	private BasicCfgFileUtil fileUtil;
	private final Class clazz = DeconfigureTableServiceImpl.class;
	private String msg = null;
	
	public DeconfigureTableServiceImpl(){}
	
	public void setLogUtil(LogUtil logUtil) 
	{
		this.logUtil = logUtil;
	}

	public void setFileUtil(BasicCfgFileUtil fileUtil) 
	{
		this.fileUtil = fileUtil;
	}
	
	@Override
	public List<DeconfigureTableEntry> getDeconfigureEntries() 
	{
		msg = "Entered getDeconfigureEntries method";
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		
		List<DeconfigureTableEntry> list = new ArrayList<DeconfigureTableEntry>();

		BufferedReader br = null;
		String file = fileUtil.getDeconfigureEntryFilePath();
		String line = "";
	   	String csvSplit = ",";
	   	boolean flag = false;
	   	int count = 0;
	   	
	   	try
	   	{
	   		File fileObj = new File(file);
	   		fileObj.setReadable(true);
	   		msg = "Reading from DEconfigureFile:"+file;
	   		System.out.println(msg);
	   		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
	   		
	   		br = new BufferedReader(new FileReader(fileObj));
	   		while((line = br.readLine()) != null)
	   		{
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
	   		if(flag)
	   		{
	   			msg = count+" improper entries were found in the deconfigure entry file";
	   			System.out.println(msg);
	   			logUtil.log(LEVEL.WARN, msg, clazz, logUtil.getLineNumber());
	   		}
	   		msg = "DeconfigureEnry List: "+list;
	   		System.out.println(msg);
	   		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
	   	}
	   	catch(Exception e)
	   	{
	   		msg = "Exception occured during reading from DeconfigureEntry File: "+e.getMessage();
	   		System.out.println(msg);
	   		e.printStackTrace();
	   		logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
	   	}	
	   	finally
	   	{
	   		try
	   		{
	   			br.close();
	   		}
	   		catch(Exception e)
	   		{
	   			msg = "Erro while closing the file "+e.getMessage();
	   			System.out.println(msg);
	   			logUtil.log(LEVEL.WARN, msg, clazz, logUtil.getLineNumber());
	   		}
	   	}
	   	msg = "DeconfigureEntries List: "+list;
	   	System.out.println(msg);
	   	logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		return list;
	}
}
