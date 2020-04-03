package com.vmware.simplivity.citrixplugin.services;

import com.vmware.simplivity.citrixplugin.model.BaseInputData;
import com.vmware.simplivity.citrixplugin.model.Message;

public interface DeconfigurationService 
{
	Message deconfigure(BaseInputData baseInputData);
}
