package com.vmware.simplivity.citrixplugin.model;

import java.util.List;

/**
 * @author anusha.y
 *
 * 
 */
public class BaseInputData 
{
	public List<VMData> vmData;
	
	public DomainData domainData;
	
	public OVCData ovcData;
	
	public List<String> inputFileList;
	
	public int rowNumber;

	public BaseInputData(){}
	
	public BaseInputData(List<VMData> vmData, DomainData domainData,
			List<String> inputFileList) {
		super();
		this.vmData = vmData;
		this.domainData = domainData;
		this.inputFileList = inputFileList;
	}

	public DomainData getDomainData() {
		return domainData;
	}

	public void setDomainData(DomainData domainData) {
		this.domainData = domainData;
	}

	public List<VMData> getVmData() {
		return vmData;
	}

	public void setVmData(List<VMData> vmData) {
		this.vmData = vmData;
	}
	
	public OVCData getOvcData() {
		return ovcData;
	}

	public void setOvcData(OVCData ovcData) {
		this.ovcData = ovcData;
	}

	public List<String> getInputFileList() {
		return inputFileList;
	}

	public void setInputFileList(List<String> inputFileList) {
		this.inputFileList = inputFileList;
	}
	
	@Override
	public String toString() {
		return "InputData = {vmData:"+vmData+", "+
						"DomainData:"+domainData+", "+
						"OvcData: "+ovcData+", "+
						"InputFileList:"+inputFileList+
						"RowNumber:"+rowNumber+"}";
	}
	
	public boolean isEmpty()
	{
		if( domainData == null || domainData.isEmpty() ||
				vmData == null || vmData.isEmpty())// ||
				//inputFileList == null || inputFileList.isEmpty())
		{
			return true;
		}
		if(vmData != null && !vmData.isEmpty())
		{
			for(int i = 0;i<vmData.size();i++)
			{
				if(vmData.get(i) == null)
				{
					return true;
				}
				if(vmData.get(i).vmName == null || vmData.get(i).vmName.isEmpty() ||
					vmData.get(i).vmPassword == null || vmData.get(i).vmPassword.isEmpty() || vmData.get(i).vmUsername == null ||
					vmData.get(i).vmUsername.isEmpty() || vmData.get(i).vmHost == null || vmData.get(i).vmHost.isEmpty())
				{
					if(vmData.get(i).isStatic)
					{
						if(vmData.get(i).ipAddr == null || vmData.get(i).ipAddr.isEmpty() || vmData.get(i).subnet == null || vmData.get(i).subnet.isEmpty() ||
							vmData.get(i).gateway == null || vmData.get(i).gateway.isEmpty() || vmData.get(i).dnsServerAddress == null ||
							vmData.get(i).dnsServerAddress.isEmpty())
						{
							return true;
						}
					}
					else
					{
						return true;
					}
				}
			}
		}
		return false;
	}
}
