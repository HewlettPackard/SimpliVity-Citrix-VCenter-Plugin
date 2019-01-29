package com.vmware.simplivity.citrixplugin;

public class DomainData {

	public String domainName;
	public String dmnUserName;
	public String dmnPassword;
	
	public DomainData(){}
	
	public DomainData(String domainName, String dmnUserName, String dmnPassword) {
		super();
		this.domainName = domainName;
		this.dmnUserName = dmnUserName;
		this.dmnPassword = dmnPassword;
	}

	public String getDomainName() {
		return domainName;
	}
	
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	
	public String getDomainUserName() {
		return dmnUserName;
	}
	
	public void setDomainUserName(String dmnUserName) {
		this.dmnUserName = dmnUserName;
	}
	
	public String getDomainPassword() {
		return dmnPassword;
	}
	
	public void setDomainPassword(String dmnPassword) {
		this.dmnPassword = dmnPassword;
	}
	
	@Override
	public String toString() {
		return "DomainData = {DomainName:"+domainName+", "+
						"DomainUserName:"+dmnUserName+", "+"}";
						//"DomainPassword:"+dmnPassword+"}";
	}
	
	public boolean isEmpty()
	{
		if(domainName == null || domainName.isEmpty() ||
			dmnUserName == null || dmnUserName.isEmpty() ||
			dmnPassword == null || dmnPassword.isEmpty())
		{
			return true;
		}
		return false;
	}
}
