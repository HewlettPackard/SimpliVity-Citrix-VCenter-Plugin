package com.vmware.simplivity.citrixplugin.services;

import com.vmware.simplivity.citrixplugin.model.ConfigureInputData;
import com.vmware.simplivity.citrixplugin.model.Message;

public interface ConfigurationService 
{
	public Message configure(ConfigureInputData configureInputData);
}
