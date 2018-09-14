package com.vmware.simplivity.citrixplugin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadCfgFileServiceImpl implements ReadCfgFileService 
{
	private LogUtil logUtil;
	private BasicCfgFileUtil fileUtil;
	private final Class clazz = ReadCfgFileServiceImpl.class;
	private String msg = null;
	private Map <String, String> cfgEntryMap = null;
	private ConfigureInputData configureInputData = null;
	
	public ReadCfgFileServiceImpl(){}
	
	public void setLogUtil(LogUtil logUtil) {
		this.logUtil = logUtil;
	}


	public void setFileUtil(BasicCfgFileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}

	@Override
	public ConfigureInputData readcfgfile() 
	{
		String retStatus = readConfigFileContent();
		if(!retStatus.equals("success"))
		{
			System.out.println(retStatus);
			logUtil.log(LEVEL.ERROR, retStatus, BasicCfgFileUtil.class, logUtil.getLineNumber());
		}
		
		prepareData();
		return configureInputData;
	}

	private void prepareData() 
	{
		if(cfgEntryMap == null || cfgEntryMap.isEmpty())
		{
			msg = "Configuration file is empty";
			System.out.println(msg);
			logUtil.log(LEVEL.WARN, msg, clazz, logUtil.getLineNumber());
			return;
		}
		
		configureInputData = new ConfigureInputData();
		
		DomainData domainData = new DomainData();
		domainData.setDomainName(cfgEntryMap.get(ConfigurationConstants.DOMAIN_NAME.toString()));
		domainData.setDomainUserName(cfgEntryMap.get(ConfigurationConstants.DOMAIN_USERNAME.toString()));
		domainData.setDomainPassword(cfgEntryMap.get(ConfigurationConstants.DOMAIN_PASSWORD.toString()));
		
		CitrixData citrixData = new CitrixData();
		citrixData.setCitrixKey(cfgEntryMap.get(ConfigurationConstants.CITRIX_KEY.toString()));
		citrixData.setClientId(cfgEntryMap.get(ConfigurationConstants.CLIENT_ID.toString()));
		citrixData.setCustomerName(cfgEntryMap.get(ConfigurationConstants.CUSTOMER_NAME.toString()));
		citrixData.setResourceLocation(cfgEntryMap.get(ConfigurationConstants.RESOURCE_LOCATION.toString()));
		
		OVCData ovcData = new OVCData();
		ovcData.setOVCIP(cfgEntryMap.get(ConfigurationConstants.OVC_IP.toString()));
		ovcData.setOVCUserName(cfgEntryMap.get(ConfigurationConstants.OVC_USERNAME.toString()));
		ovcData.setOVCPassword(cfgEntryMap.get(ConfigurationConstants.OVC_PASSWORD.toString()));
		
		configureInputData.setDomainData(domainData);
		configureInputData.setCitrixData(citrixData);
		configureInputData.setOvcData(ovcData);
		configureInputData.setTemplate(cfgEntryMap.get(ConfigurationConstants.VM_TEMPLATE.toString()));
		
		msg = "Content read from cfg file: "+configureInputData;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
	}

	private String readConfigFileContent() 
	{
		cfgEntryMap = new HashMap<String, String>();
		// prepare for the configuration file path and filename
		String sFileName = fileUtil.getCfgPath();
		java.io.BufferedReader bReader = null;

		try {
			// open streams for reading the content from the file
			File file = new File(sFileName);
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
			msg = "Contents read from cfg file: "+cfgEntryMap;
			System.out.println(msg);
			logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		}
		catch(FileNotFoundException foe)
		{
			msg =  "Configuration File not found!";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, BasicCfgFileUtil.class, logUtil.getLineNumber());
			return msg;
		}
		catch (Exception ex) 
		{
			msg = "Exception occured while reading the cfg file: " + ex.toString();
			return msg;
		} 
		finally 
		{
			try {
				bReader.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		return "success";
	}
}
