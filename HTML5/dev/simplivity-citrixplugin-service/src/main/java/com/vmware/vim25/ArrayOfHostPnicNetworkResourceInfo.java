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
public class ArrayOfHostPnicNetworkResourceInfo {

    private final static com.vmware.vim25.HostPnicNetworkResourceInfo[] NULL_HOST_PNIC_NETWORK_RESOURCE_INFO_ARRAY = new com.vmware.vim25.HostPnicNetworkResourceInfo[ 0 ] ;
    public com.vmware.vim25.HostPnicNetworkResourceInfo[] HostPnicNetworkResourceInfo;

    public com.vmware.vim25.HostPnicNetworkResourceInfo[] getHostPnicNetworkResourceInfo() {
        if ((HostPnicNetworkResourceInfo) == null) {
            return (NULL_HOST_PNIC_NETWORK_RESOURCE_INFO_ARRAY);
        }
        return HostPnicNetworkResourceInfo;
    }

    public void setHostPnicNetworkResourceInfo(com.vmware.vim25.HostPnicNetworkResourceInfo[] HostPnicNetworkResourceInfo) {
        this.HostPnicNetworkResourceInfo = HostPnicNetworkResourceInfo;
    }

}