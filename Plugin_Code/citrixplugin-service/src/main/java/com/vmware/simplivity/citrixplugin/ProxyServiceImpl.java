package com.vmware.simplivity.citrixplugin;

public class ProxyServiceImpl implements ProxyService 
{
	private LogUtil logUtil;
	private BasicCfgFileUtil fileUtil;
	private final Class clazz = ProxyServiceImpl.class;
	private String msg = null;
	
	public ProxyServiceImpl(){}
	
	
	public void setLogUtil(LogUtil logUtil) {
		this.logUtil = logUtil;
	}


	public void setFileUtil(BasicCfgFileUtil fileUtil) {
		this.fileUtil = fileUtil;
	}

	@Override
	public String setProxyData(ProxyData proxyData) 
	{
		msg = "Entering into ProxyServiceImpl:"+proxyData;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		
		if(proxyData == null || proxyData.isEmpty())
		{
			msg = "Empty Proxy data received!";
			System.out.println(msg);
			logUtil.log(LEVEL.ERROR, msg, clazz, logUtil.getLineNumber());
			return msg;
		}
		
		fileUtil.setProxyData(proxyData);
		msg = "Proxy Data is set to "+proxyData;
		System.out.println(msg);
		logUtil.log(LEVEL.DEBUG, msg, clazz, logUtil.getLineNumber());
		msg = "Proxy data is saved!";
		return msg;
	}

}
