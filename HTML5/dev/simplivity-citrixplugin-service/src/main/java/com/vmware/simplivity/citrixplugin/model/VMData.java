package com.vmware.simplivity.citrixplugin.model;

public class VMData 
{
	public String vmName;
	public String vmUsername;
	public String vmPassword;
	public String vmCluster;
	public String vmHost;
	public boolean isStatic;
	public String ipAddr;
	public String subnet;
	public String gateway;
	public String dnsServerAddress;
	public String modelName;
	
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

	public VMData(String vmName, String vmUsername, String vmPassword,
			String vmCluster, String vmHost, String ipaddr, String subnet, String gateway, String dnsServerAddress) {
		super();
		this.vmName = vmName;
		this.vmUsername = vmUsername;
		this.vmPassword = vmPassword;
		this.vmCluster = vmCluster;
		this.vmHost = vmHost;
		this.ipAddr = ipaddr;
		this.subnet = subnet;
		this.gateway = gateway;
		this.dnsServerAddress = dnsServerAddress;
		this.isStatic = true;
	}
	public String getVmName() {
		return vmName;
	}
	
	public void setVmName(String vmName) {
		this.vmName = vmName;
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
	
	public String getVmUsername() {
		return vmUsername;
	}

	public void setVmUsername(String vmUsername) {
		this.vmUsername = vmUsername;
	}

	public boolean isStatic() {
		return this.isStatic;
	}

	public void setIpAssign(boolean isStatic) {
		this.isStatic = isStatic;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public String getSubnet() {
		return subnet;
	}

	public void setSubnet(String subnet) {
		this.subnet = subnet;
	}

	public String getGateway() {
		return gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public String getDnsServerAddress() {
		return dnsServerAddress;
	}

	public void setDnsServerAddress(String dnsServerAddress) {
		this.dnsServerAddress = dnsServerAddress;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "VMData = {VmName:"+vmName+", "+
						"VmUserName:"+vmUsername+", "+
						//"VmPassword:"+vmPassword+", "+
						"VmCluster:"+vmCluster+", "+
						"VmHost:"+vmHost+", "+
						"Model:"+modelName+", "+
						"IsIPStatic:"+isStatic+", "+
						"IP:"+ipAddr+", "+
						"Subnet:"+subnet+", "+
						"Gateway:"+gateway+
						"DnsServerAddress:"+dnsServerAddress+
						"}";
	}
	
	public boolean isEmpty()
	{
		if(vmName == null || vmName.isEmpty() ||
				vmUsername == null || vmUsername.isEmpty() ||
						vmPassword == null || vmPassword.isEmpty() ||
								vmHost == null || vmHost.isEmpty())
		{
			if(isStatic)
			{
				//System.out.println("Came into ");
				if(subnet == null || subnet.isEmpty() ||
						gateway == null || gateway.isEmpty() ||
							ipAddr == null || ipAddr.isEmpty() ||
							dnsServerAddress == null || dnsServerAddress.isEmpty())
				{
					return true;
				}
			}
			return true;
		}
		return false;
	}
}
