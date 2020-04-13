package com.vmware.simplivity.citrixplugin.enums;

public enum ConfigurationConstants
{

	DOMAIN_NAME("DOMAIN_NAME"),
	DOMAIN_USERNAME("DOMAIN_USERNAME"),
	DOMAIN_PASSWORD("DOMAIN_PASSWORD"),
	
	CITRIX_KEY("CITRIX_KEY"),
	CUSTOMER_NAME("CUSTOMER_NAME"),
	CLIENT_ID("CLIENT_ID"),
	RESOURCE_LOCATION("RESOURCE_LOCATION"),
	
	VM_NETWORK("VM_NETWORK"),
	VM_TEMPLATE("VM_TEMPLATE"),
	
	OVC_IP("OVC_IP"),
	OVC_USERNAME("OVC_USERNAME"),
	OVC_PASSWORD("OVC_PASSWORD");
	
	private String constant;
	
	public String getConstant()
	{
		return this.constant;
	}
	
	ConfigurationConstants(String constant) 
	{
		this.constant = constant;
	}
}
