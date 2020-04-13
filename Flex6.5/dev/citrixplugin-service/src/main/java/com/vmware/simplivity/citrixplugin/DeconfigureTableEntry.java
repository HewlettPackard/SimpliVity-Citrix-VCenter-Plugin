package com.vmware.simplivity.citrixplugin;

public class DeconfigureTableEntry 
{
	public String vmName;
	
	public String vmUserName;
	
	public String vmHost;
	
	public String vmCluster;
	
	public String domainName;
	
	public String domainUserName;
	
	public int rowNumber;

	public DeconfigureTableEntry(){}
	
	public DeconfigureTableEntry(String vmName, String vmUserName,
			String vmHost, String vmCluster, String domainName,
			String domainUserName, int rowNumber) {
		super();
		this.vmName = vmName;
		this.vmUserName = vmUserName;
		this.vmHost = vmHost;
		this.vmCluster = vmCluster;
		this.domainName = domainName;
		this.domainUserName = domainUserName;
		this.rowNumber = rowNumber;
	}

	public String getVmName() {
		return vmName;
	}

	public void setVmName(String vmName) 
	{
		this.vmName = vmName;
	}

	public String getVmUserName() 
	{
		return vmUserName;
	}

	public void setVmUserName(String vmUserName) 
	{
		this.vmUserName = vmUserName;
	}

	public String getVmHost() 
	{
		return vmHost;
	}

	public void setVmHost(String vmHost) 
	{
		this.vmHost = vmHost;
	}

	public String getVmCluster() 
	{
		return vmCluster;
	}

	public void setVmCluster(String vmCluster) 
	{
		this.vmCluster = vmCluster;
	}

	public String getDomainName() 
	{
		return domainName;
	}

	public void setDomainName(String domainName) 
	{
		this.domainName = domainName;
	}

	public String getDomainUserName() 
	{
		return domainUserName;
	}

	public void setDomainUserName(String domainUserName) 
	{
		this.domainUserName = domainUserName;
	}
	
	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	@Override
	public String toString() {
		return "VMData = {VmName:"+vmName+", "+
						"VMUserName:"+vmUserName+", "+
						"VmHost:"+vmHost+", "+
						"Cluster:"+vmCluster+", "+
						"DomainName:"+domainName+", "+
						"DomainUserName:"+domainUserName+", "+
						"RowNumber:"+rowNumber+"}";
	}
	
	public boolean isEmpty()
	{
		if(vmName == null || vmName.isEmpty() ||
				vmUserName == null || vmUserName.isEmpty() ||
						vmHost == null || vmHost.isEmpty() ||
						vmCluster == null || vmCluster.isEmpty() ||
						domainName == null || domainName.isEmpty() ||
						domainUserName == null || domainUserName.isEmpty())
		{
			return true;
		}
		return false;
	}
}
