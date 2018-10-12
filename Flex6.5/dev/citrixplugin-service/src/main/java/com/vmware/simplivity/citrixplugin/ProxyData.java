package com.vmware.simplivity.citrixplugin;

public class ProxyData 
{
	public String proxyIP;
	
	public String proxyUsername;
	
	public String proxyPassword;
	
	public String proxyPort;

	public ProxyData(){}
	
	public ProxyData(String ovcIP, String ovcUsername, String ovcPassword, String proxyPort) 
	{
		this.proxyIP = ovcIP;
		this.proxyUsername = ovcUsername;
		this.proxyPassword = ovcPassword;
		this.proxyPort = proxyPort;
	}

	public String getProxyIP() {
		return proxyIP;
	}

	public void setProxyIP(String ovcIP) {
		this.proxyIP = ovcIP;
	}

	public String getProxyUserName() {
		return proxyUsername;
	}

	public void setProxyUserName(String userName) {
		this.proxyUsername = userName;
	}

	public String getProxyPassword() {
		return proxyPassword;
	}

	public void setProxyPassword(String password) {
		this.proxyPassword = password;
	}
	
	public String getProxyPort() {
		return proxyPort;
	}

	public void setProxyPort(String proxyPort) {
		this.proxyPort = proxyPort;
	}

	@Override
	public String toString() {
		return "ProxyData = {ProxyIP:"+proxyIP+", "+
						"ProxyUserName:"+proxyUsername+", "+
						"ProxyPassword:"+proxyPassword+", "+
						"ProxyPort:"+proxyPort+
						"}";
	}
	
	public boolean isEmpty()
	{
		if(proxyIP == null || proxyIP.isEmpty() ||
				proxyUsername == null || proxyUsername.isEmpty() ||
						proxyPassword == null || proxyPassword.isEmpty() ||
						proxyPort == null || proxyPort.isEmpty())
		{
			return true;
		}
		return false;
	}
}
