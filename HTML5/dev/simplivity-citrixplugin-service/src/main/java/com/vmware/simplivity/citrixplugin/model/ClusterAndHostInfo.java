package com.vmware.simplivity.citrixplugin.model;


public class ClusterAndHostInfo 
{
	public String[] hosts;
	public String[] clusters;
	
	public String[] getHosts() {
		return hosts;
	}
	public void setHosts(String[] hosts) {
		this.hosts = hosts;
	}
	public String[] getClusters() {
		return clusters;
	}
	public void setClusters(String[] clusters) {
		this.clusters = clusters;
	}

	@Override
	public String toString() {
		String ret = "ClusterAndHostInfo=[";
		if(this.clusters != null && this.clusters.length != 0)
		{
			ret = "Clusters=[";
			for(int i = 0;i<clusters.length; i++)
			{
				ret  += clusters[i]+", ";
			}
			ret += "], ";
		}
		if(this.hosts != null && this.hosts.length != 0)
		{
			ret = "Hosts=[";
			for(int i = 0;i<hosts.length; i++)
			{
				ret  += hosts[i]+", ";
			}
			ret += "], ";
		}
		ret += "]";
		return ret;
	}
	
}
