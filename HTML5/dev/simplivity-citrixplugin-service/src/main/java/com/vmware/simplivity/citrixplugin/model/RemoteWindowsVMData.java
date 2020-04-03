package com.vmware.simplivity.citrixplugin.model;

public class RemoteWindowsVMData {
	public String winIP;

	public String winUsername;

	public String winPassword;
	

	public RemoteWindowsVMData(String winIP, String winUsername, String winPassword) {
		this.winIP = winIP;
		this.winUsername = winUsername;
		this.winPassword = winPassword;
	}
	public RemoteWindowsVMData() {
	}
	
	public String getWinIP() {
		return winIP;
	}
	public void setWinIP(String winIP) {
		this.winIP = winIP;
	}
	public String getWinUsername() {
		return winUsername;
	}
	public void setWinUsername(String winUsername) {
		this.winUsername = winUsername;
	}
	public String getWinPassword() {
		return winPassword;
	}
	public void setWinPassword(String winPassword) {
		this.winPassword = winPassword;
	}
	@Override
	public String toString() {
		return "RemoteWindowsVMData = {IPAddress:" + winIP + ", " + "UserName:"
				+ winUsername +"}";
	}

	public boolean isEmpty() {
		if( winIP == null || winIP.isEmpty() || winUsername == null
				|| winUsername.isEmpty() || winPassword == null
				|| winPassword.isEmpty())
		{
			return true;
		}
		
		return false;
	}
}
