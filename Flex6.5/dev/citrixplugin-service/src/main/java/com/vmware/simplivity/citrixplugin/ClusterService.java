package com.vmware.simplivity.citrixplugin;

import java.util.List;
import java.util.Map;

public interface ClusterService 
{
	Map<String, List<String>> getClusterInfo();
	
	List<String> getHosts(String aClusterName);
}
