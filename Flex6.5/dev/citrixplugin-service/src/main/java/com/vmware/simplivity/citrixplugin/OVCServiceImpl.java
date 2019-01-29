package com.vmware.simplivity.citrixplugin;

public class OVCServiceImpl implements OVCService 
{
	private LogUtil logUtil;
	private BasicCfgFileUtil fileUtil;
	private final Class clazz = OVCServiceImpl.class;
	private String msg = null;
	
	public OVCServiceImpl(){}
	
	
	public void setLogUtil(LogUtil logUtil) {
		this.logUtil = logUtil;
	}


	public void setFileUtil(BasicCfgFileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}

	@Override
	public String setOVCData(OVCData ovcData) 
	{
		msg = "Entering into OVCServiceImpl:"+ovcData;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		
		if(ovcData == null || ovcData.isEmpty())
		{
			msg = "Empty OVC data received!";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return msg;
		}
		
		fileUtil.setOVCData(ovcData);
		msg = "OVC Data is set to "+ovcData;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		msg = "OVC data is saved!";
		return msg;
	}

}
