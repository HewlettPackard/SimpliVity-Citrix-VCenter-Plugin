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
public class ArrayOfHostService {

    private final static com.vmware.vim25.HostService[] NULL_HOST_SERVICE_ARRAY = new com.vmware.vim25.HostService[ 0 ] ;
    public com.vmware.vim25.HostService[] HostService;

    public com.vmware.vim25.HostService[] getHostService() {
        if ((HostService) == null) {
            return (NULL_HOST_SERVICE_ARRAY);
        }
        return HostService;
    }

    public void setHostService(com.vmware.vim25.HostService[] HostService) {
        this.HostService = HostService;
    }

}
