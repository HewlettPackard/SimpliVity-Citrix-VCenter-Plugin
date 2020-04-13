package com.vmware.simplivity.citrixplugin.services.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.vmware.simplivity.citrixplugin.enums.ConfigurationConstants;
import com.vmware.simplivity.citrixplugin.model.CitrixData;
import com.vmware.simplivity.citrixplugin.model.ConfigureInputData;
import com.vmware.simplivity.citrixplugin.model.DomainData;
import com.vmware.simplivity.citrixplugin.services.ReadCfgFileService;
import com.vmware.simplivity.citrixplugin.util.BasicCfgFileUtil;

public class ReadCfgFileServiceImpl implements ReadCfgFileService 
{
	private Logger logger = Logger.getLogger(ReadCfgFileServiceImpl.class);
	private BasicCfgFileUtil fileUtil;
	private String msg = null;
	private Map <String, String> cfgEntryMap = null;
	private ConfigureInputData configureInputData = null;
	
	public ReadCfgFileServiceImpl(){}

	public void setFileUtil(BasicCfgFileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}

	@Override
	public ConfigureInputData readcfgfile() 
	{
		msg = "Entered into readCfgfile methos..";
		logger.debug(msg);
		String retStatus = readConfigFileContent();
		if(!retStatus.equals("success"))
		{
			logger.error(retStatus);
		}
		
		prepareData();
		msg = "Prepared Data read from cfg file"+configureInputData;
		logger.debug(msg);
		return configureInputData;
	}

	private void prepareData() 
	{
		logger.info("Enetered prepareData"+cfgEntryMap);
		if(cfgEntryMap == null || cfgEntryMap.isEmpty())
		{
			msg = "Configuration file is empty";
			logger.warn(msg);
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
		
		/*OVCData ovcData = new OVCData();
		ovcData.setOVCIP(cfgEntryMap.get(ConfigurationConstants.OVC_IP.toString()));
		ovcData.setOVCUserName(cfgEntryMap.get(ConfigurationConstants.OVC_USERNAME.toString()));
		ovcData.setOVCPassword(cfgEntryMap.get(ConfigurationConstants.OVC_PASSWORD.toString()));*/
		
		configureInputData.setDomainData(domainData);
		configureInputData.setCitrixData(citrixData);
		//configureInputData.setOvcData(ovcData);
		configureInputData.setTemplate(cfgEntryMap.get(ConfigurationConstants.VM_TEMPLATE.toString()));
		
		msg = "ConfigureInputData read from cfg file: "+configureInputData;
		logger.debug(msg);
	}

	private String readConfigFileContent() 
	{
		cfgEntryMap = new HashMap<String, String>();
		// prepare for the configuration file path and filename
		String sFileName = fileUtil.getCfgPath();
		//Remove it post testing 
		//sFileName = "C:\\Users\\Public\\citrixPlugincfg.cfg";
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
			logger.debug(msg);
			msg = "success";
		}
		catch(FileNotFoundException foe)
		{
			msg =  "Configuration File not found!";
			System.out.println(msg);
			logger.error(msg, foe);
		}
		catch (Exception ex) 
		{
			msg = "Exception occured while reading the cfg file: " + ex.toString();
			logger.error(msg, ex);
			System.out.println(msg);
			ex.printStackTrace();
			
		} 
		finally 
		{
			try {
				bReader.close();
			} 
			catch (IOException e) 
			{
				msg = "Error while closing the file";
				logger.error(msg, e);
			}
		}
		return msg;
	}
}
