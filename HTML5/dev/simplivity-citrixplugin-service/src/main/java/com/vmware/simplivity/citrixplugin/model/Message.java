package com.vmware.simplivity.citrixplugin.model;

public class Message {

	public String message;
	
	public String error;
	
	public Message(){}
	
	public Message(String message, String error)
	{
		this.message = message;
		this.error = error;
	}
	
	public String toString() {
		return "Message = {Message:" + message + ", " +", Error:"+this.error+"}";
	}
}
