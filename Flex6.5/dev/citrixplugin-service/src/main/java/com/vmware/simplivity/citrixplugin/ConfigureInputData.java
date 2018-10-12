package com.vmware.simplivity.citrixplugin;

public class ConfigureInputData extends BaseInputData
{
	public CitrixData citrixData;
	
	public String template;
	
	public ProxyData proxyData;
	
	public ConfigureInputData(){}
	
	public ConfigureInputData(CitrixData citrixData, String template) 
	{
		super();
		this.citrixData = citrixData;
		this.template = template;
	}

	public CitrixData getCitrixData() {
		return citrixData;
	}

	public void setCitrixData(CitrixData citrixData) {
		this.citrixData = citrixData;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}
	
	public ProxyData getProxyData() {
		return proxyData;
	}

	public void setProxyData(ProxyData proxyData) {
		this.proxyData = proxyData;
	}

	@Override
	public String toString() {
		return "ConfigureInputData = {DomainData:"+super.getDomainData()+", "+
						"CitrixData:"+citrixData+", "+
						"VmData:"+super.getVmData()+", "+
						"OVCData:"+super.getOvcData()+", "+
						"Template:"+template+", "+
						"ProxyData:"+proxyData+", "+
						"InputFileList:"+super.getInputFileList()+"}";
	}
	
	public boolean isEmpty()
	{
		if(super.isEmpty() || citrixData == null || citrixData.isEmpty() ||
				template == null || template.isEmpty())
		{
			return true;
		}
		return false;
	}
}
