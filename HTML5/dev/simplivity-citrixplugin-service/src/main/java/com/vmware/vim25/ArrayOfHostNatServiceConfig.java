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
public class ArrayOfHostNatServiceConfig {

    private final static com.vmware.vim25.HostNatServiceConfig[] NULL_HOST_NAT_SERVICE_CONFIG_ARRAY = new com.vmware.vim25.HostNatServiceConfig[ 0 ] ;
    public com.vmware.vim25.HostNatServiceConfig[] HostNatServiceConfig;

    public com.vmware.vim25.HostNatServiceConfig[] getHostNatServiceConfig() {
        if ((HostNatServiceConfig) == null) {
            return (NULL_HOST_NAT_SERVICE_CONFIG_ARRAY);
        }
        return HostNatServiceConfig;
    }

    public void setHostNatServiceConfig(com.vmware.vim25.HostNatServiceConfig[] HostNatServiceConfig) {
        this.HostNatServiceConfig = HostNatServiceConfig;
    }

}
