package com.vmware.simplivity.citrixplugin.model;


public class CitrixData {

	public String citrixKey;
	public String customerName;
	public String clientId;
	public String resourceLocation;
	
	public CitrixData(){}
	
	public CitrixData(String citrixKey, String customerName, String clientId,
			String resourceLocation) {
		super();
		this.citrixKey = citrixKey;
		this.customerName = customerName;
		this.clientId = clientId;
		this.resourceLocation = resourceLocation;
	}

	public String getCitrixKey() {
		return citrixKey;
	}
	
	public void setCitrixKey(String citrixKey) {
		this.citrixKey = citrixKey;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getClientId() {
		return clientId;
	}
	
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	public String getResourceLocation() {
		return resourceLocation;
	}
	
	public void setResourceLocation(String resourceLocation) {
		this.resourceLocation = resourceLocation;
	}
	
	@Override
	public String toString() {
		return "CitrixData = {CitrixKey:"+citrixKey+", "+
						"CustomerName:"+customerName+", "+
						"ClientId:"+clientId+", "+
						"ResourceLocation:"+resourceLocation+"}";
	}
	
	public boolean isEmpty()
	{
		if(citrixKey == null || citrixKey.isEmpty() ||
				customerName == null || customerName.isEmpty() ||
						clientId == null || clientId.isEmpty() ||
						resourceLocation == null || resourceLocation.isEmpty())
		{
			return true;
		}
		return false;
	}
}
