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
public class ArrayOfHostServiceConfig {

    private final static com.vmware.vim25.HostServiceConfig[] NULL_HOST_SERVICE_CONFIG_ARRAY = new com.vmware.vim25.HostServiceConfig[ 0 ] ;
    public com.vmware.vim25.HostServiceConfig[] HostServiceConfig;

    public com.vmware.vim25.HostServiceConfig[] getHostServiceConfig() {
        if ((HostServiceConfig) == null) {
            return (NULL_HOST_SERVICE_CONFIG_ARRAY);
        }
        return HostServiceConfig;
    }

    public void setHostServiceConfig(com.vmware.vim25.HostServiceConfig[] HostServiceConfig) {
        this.HostServiceConfig = HostServiceConfig;
    }

}
