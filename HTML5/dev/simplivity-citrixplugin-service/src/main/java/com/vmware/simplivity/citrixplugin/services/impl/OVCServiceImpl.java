package com.vmware.simplivity.citrixplugin.services.impl;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;

import org.apache.log4j.Logger;

import com.vmware.simplivity.citrixplugin.model.Message;
import com.vmware.simplivity.citrixplugin.model.OVCData;
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
			msg = "Empty OVC data received!";
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
			InetAddress inetAddress;
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
		
		fileUtil.setOVCData(ovcData);
		msg = "OVC/ILO Data is set to "+ovcData;
		logger.debug(msg);
		msg = "OVC/ILO data is saved!";
		ret.message = msg;
		return ret;
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
