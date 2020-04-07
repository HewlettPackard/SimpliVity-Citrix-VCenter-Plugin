package com.vmware.simplivity.citrixplugin.services;

import com.vmware.simplivity.citrixplugin.model.ClusterAndHostInfo;


public interface ClusterService 
{
	ClusterAndHostInfo getClusterInfo();
	
	ClusterAndHostInfo getHosts(String aClusterName);
}
