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
public class ArrayOfHostPciPassthruConfig {

    private final static com.vmware.vim25.HostPciPassthruConfig[] NULL_HOST_PCI_PASSTHRU_CONFIG_ARRAY = new com.vmware.vim25.HostPciPassthruConfig[ 0 ] ;
    public com.vmware.vim25.HostPciPassthruConfig[] HostPciPassthruConfig;

    public com.vmware.vim25.HostPciPassthruConfig[] getHostPciPassthruConfig() {
        if ((HostPciPassthruConfig) == null) {
            return (NULL_HOST_PCI_PASSTHRU_CONFIG_ARRAY);
        }
        return HostPciPassthruConfig;
    }

    public void setHostPciPassthruConfig(com.vmware.vim25.HostPciPassthruConfig[] HostPciPassthruConfig) {
        this.HostPciPassthruConfig = HostPciPassthruConfig;
    }

}