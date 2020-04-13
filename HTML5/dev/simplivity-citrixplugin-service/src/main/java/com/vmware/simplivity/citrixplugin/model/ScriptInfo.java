package com.vmware.simplivity.citrixplugin.model;

public class ScriptInfo 
{
	public String scriptName;
	
	public String taskID;
	
	public ScriptInfo(String scriptName, String taskID)
	{
		this.scriptName = scriptName;
		this.taskID = taskID;
	}

	public String getScriptName() 
	{
		return scriptName;
	}

	public void setScriptName(String scriptName) 
	{
		this.scriptName = scriptName;
	}

	public String getTaskID() 
	{
		return taskID;
	}

	public void setTaskID(String taskID) 
	{
		this.taskID = taskID;
	}
	
	@Override
	public String toString()
	{
		return "ScriptInfo = {ScriptName:"+scriptName+", "+
				"TaskID:"+taskID+
				"}";
	}
}
