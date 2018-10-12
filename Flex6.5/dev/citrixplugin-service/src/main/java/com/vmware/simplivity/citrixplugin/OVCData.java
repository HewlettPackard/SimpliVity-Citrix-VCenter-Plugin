package com.vmware.simplivity.citrixplugin;

public class OVCData 
{
	public String ovcIP;
	
	public String ovcUsername;
	
	public String ovcPassword;

	public OVCData(){}
	
	public OVCData(String ovcIP, String ovcUsername, String ovcPassword) 
	{
		this.ovcIP = ovcIP;
		this.ovcUsername = ovcUsername;
		this.ovcPassword = ovcPassword;
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
	
	@Override
	public String toString() {
		return "OVCData = {OVCIP:"+ovcIP+", "+
						"OVCUserName:"+ovcUsername+", "+
						"OVCPassword:"+ovcPassword+"}";
	}
	
	public boolean isEmpty()
	{
		if(ovcIP == null || ovcIP.isEmpty() ||
				ovcUsername == null || ovcUsername.isEmpty() ||
						ovcPassword == null || ovcPassword.isEmpty())
		{
			return true;
		}
		return false;
	}
}
