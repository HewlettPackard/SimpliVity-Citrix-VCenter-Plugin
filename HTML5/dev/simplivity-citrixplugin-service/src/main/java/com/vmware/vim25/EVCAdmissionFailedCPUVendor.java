//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;



/**
 * 
 */
@SuppressWarnings("all")
public class EVCAdmissionFailedCPUVendor
    extends EVCAdmissionFailed
{

    public String clusterCPUVendor;
    public String hostCPUVendor;

    public String getClusterCPUVendor() {
        return clusterCPUVendor;
    }

    public void setClusterCPUVendor(String clusterCPUVendor) {
        this.clusterCPUVendor = clusterCPUVendor;
    }

    public String getHostCPUVendor() {
        return hostCPUVendor;
    }

    public void setHostCPUVendor(String hostCPUVendor) {
        this.hostCPUVendor = hostCPUVendor;
    }

}
