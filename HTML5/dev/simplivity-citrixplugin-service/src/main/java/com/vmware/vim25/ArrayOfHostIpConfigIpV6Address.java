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
public class ArrayOfHostIpConfigIpV6Address {

    private final static com.vmware.vim25.HostIpConfigIpV6Address[] NULL_HOST_IP_CONFIG_IP_V6_ADDRESS_ARRAY = new com.vmware.vim25.HostIpConfigIpV6Address[ 0 ] ;
    public com.vmware.vim25.HostIpConfigIpV6Address[] HostIpConfigIpV6Address;

    public com.vmware.vim25.HostIpConfigIpV6Address[] getHostIpConfigIpV6Address() {
        if ((HostIpConfigIpV6Address) == null) {
            return (NULL_HOST_IP_CONFIG_IP_V6_ADDRESS_ARRAY);
        }
        return HostIpConfigIpV6Address;
    }

    public void setHostIpConfigIpV6Address(com.vmware.vim25.HostIpConfigIpV6Address[] HostIpConfigIpV6Address) {
        this.HostIpConfigIpV6Address = HostIpConfigIpV6Address;
    }

}
