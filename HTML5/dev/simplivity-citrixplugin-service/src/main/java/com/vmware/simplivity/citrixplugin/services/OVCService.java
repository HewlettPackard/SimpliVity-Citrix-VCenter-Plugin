package com.vmware.simplivity.citrixplugin.services;

import com.vmware.simplivity.citrixplugin.model.Message;
import com.vmware.simplivity.citrixplugin.model.OVCData;

public interface OVCService {
	Message setOVCData(OVCData ovcData);
	
	Message isOVCDataSet();
	
	Message isNonSimplivityPlatform();
}
