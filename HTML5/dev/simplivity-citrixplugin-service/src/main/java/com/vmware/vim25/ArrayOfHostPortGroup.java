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
public class ArrayOfHostPortGroup {

    private final static com.vmware.vim25.HostPortGroup[] NULL_HOST_PORT_GROUP_ARRAY = new com.vmware.vim25.HostPortGroup[ 0 ] ;
    public com.vmware.vim25.HostPortGroup[] HostPortGroup;

    public com.vmware.vim25.HostPortGroup[] getHostPortGroup() {
        if ((HostPortGroup) == null) {
            return (NULL_HOST_PORT_GROUP_ARRAY);
        }
        return HostPortGroup;
    }

    public void setHostPortGroup(com.vmware.vim25.HostPortGroup[] HostPortGroup) {
        this.HostPortGroup = HostPortGroup;
    }

}
