package com.vmware.simplivity.citrixplugin;

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
						"InputFileList:"+inputFileList+"}";
	}
	
	public boolean isEmpty()
	{
		if( domainData == null || domainData.isEmpty() ||
				vmData == null || vmData.isEmpty() ||
				inputFileList == null || inputFileList.isEmpty())
		{
			return true;
		}
		return false;
	}
}
