package com.vmware.simplivity.citrixplugin.model;

public class OVCData {
	public String ovcIP;

	public String ovcUsername;

	public String ovcPassword;
	
	public boolean platform;
	
	public String iloAddress;
	
	public RemoteWindowsVMData remoteWindowsVMData;

	public OVCData(String ovcIP, String ovcUsername, String ovcPassword, boolean platform, String iloAddress, RemoteWindowsVMData remoteWindowsVMData) {
		this.ovcIP = ovcIP;
		this.ovcUsername = ovcUsername;
		this.ovcPassword = ovcPassword;
		this.platform = platform;
		this.iloAddress = iloAddress;
		this.remoteWindowsVMData = remoteWindowsVMData;
	}

	public String getOVCIP() {
		return ovcIP;
	}

	public void setOVCIP(String ovcIP) {
		this.ovcIP = ovcIP;
	}

	public String getOVCUserName() {
		return ovcUsername;
	}

	public void setOVCUserName(String userName) {
		this.ovcUsername = userName;
	}

	public String getOVCPassword() {
		return ovcPassword;
	}

	public void setOVCPassword(String password) {
		this.ovcPassword = password;
	}

	public boolean getPlatform() {
		return platform;
	}

	public void setPlatform(boolean platform) {
		this.platform = platform;
	}
	
	public String getIloAddress() {
		return iloAddress;
	}

	public void setIloAddress(String iloAddress) {
		this.iloAddress = iloAddress;
	}
	
	public boolean isNonSimplivityPlatformSet()
	{
		return this.platform;
	}

	public OVCData() {
	}
	
	public RemoteWindowsVMData getRemoteWindowsVMData() {
		return remoteWindowsVMData;
	}

	public void setRemoteWindowsVMData(RemoteWindowsVMData remoteWindowsVMData) {
		this.remoteWindowsVMData = remoteWindowsVMData;
	}

	@Override
	public String toString() {
		return "OVCData = {OVCIP:" + ovcIP + ", " + "OVCUserName:"
				+ ovcUsername + ", Simplivity Platform"+platform+
					", ILOAddress:"+this.iloAddress//+"}";
		 +"OVCPassword:"+ovcPassword+", "+remoteWindowsVMData+"}";
	}

	public boolean isEmpty() {
		if(platform)
		{
			//System.out.println("Platform::"+this.platform);
			if(ovcUsername == null
					|| ovcUsername.isEmpty() || ovcPassword == null
					|| ovcPassword.isEmpty() ||ovcPassword == null)
			{
				return true;
			}
		}
		else
		{
			if( ovcIP == null || ovcIP.isEmpty() || ovcUsername == null
					|| ovcUsername.isEmpty() || ovcPassword == null
					|| ovcPassword.isEmpty() ||ovcPassword == null)
			{
				return true;
			}
		}
		return false;
	}
}
