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
public class ArrayOfHostDhcpService {

    private final static com.vmware.vim25.HostDhcpService[] NULL_HOST_DHCP_SERVICE_ARRAY = new com.vmware.vim25.HostDhcpService[ 0 ] ;
    public com.vmware.vim25.HostDhcpService[] HostDhcpService;

    public com.vmware.vim25.HostDhcpService[] getHostDhcpService() {
        if ((HostDhcpService) == null) {
            return (NULL_HOST_DHCP_SERVICE_ARRAY);
        }
        return HostDhcpService;
    }

    public void setHostDhcpService(com.vmware.vim25.HostDhcpService[] HostDhcpService) {
        this.HostDhcpService = HostDhcpService;
    }

}
