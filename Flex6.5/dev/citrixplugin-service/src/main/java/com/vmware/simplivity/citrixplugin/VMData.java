package com.vmware.simplivity.citrixplugin;

public class VMData 
{
	public String vmName;
	public String vmUsername;
	public String vmPassword;
	public String vmCluster;
	public String vmHost;
	
	public VMData(){}
	
	public VMData(String vmName, String vmUsername, String vmPassword,
			String vmCluster, String vmHost) {
		super();
		this.vmName = vmName;
		this.vmUsername = vmUsername;
		this.vmPassword = vmPassword;
		this.vmCluster = vmCluster;
		this.vmHost = vmHost;
	}

	public String getVmName() {
		return vmName;
	}
	
	public void setVmName(String vmName) {
		this.vmName = vmName;
	}
	
	public String getVmUserName() {
		return vmUsername;
	}
	
	public void setVmUserName(String vmUsername) {
		this.vmUsername = vmUsername;
	}
	
	public String getVmPassword() {
		return vmPassword;
	}
	
	public void setVmPassword(String vmPassword) {
		this.vmPassword = vmPassword;
	}
	
	public String getVmCluster() {
		return vmCluster;
	}
	
	public void setVmCluster(String vmCluster) {
		this.vmCluster = vmCluster;
	}
	
	public String getVmHost() {
		return vmHost;
	}
	
	public void setVmHost(String vmHost) {
		this.vmHost = vmHost;
	}
	
	@Override
	public String toString() {
		return "VMData = {VmName:"+vmName+", "+
						"VmUserName:"+vmUsername+", "+
						"VmPassword:"+vmPassword+", "+
						"VmCluster:"+vmCluster+", "+
						"VmHost:"+vmHost+"}";
	}
	
	public boolean isEmpty()
	{
		if(vmName == null || vmName.isEmpty() ||
				vmUsername == null || vmUsername.isEmpty() ||
						vmPassword == null || vmPassword.isEmpty() ||
								vmHost == null || vmHost.isEmpty())
		{
			return true;
		}
		return false;
	}
}
