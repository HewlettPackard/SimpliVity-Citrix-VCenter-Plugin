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
public class ArrayOfHostNetStackInstance {

    private final static com.vmware.vim25.HostNetStackInstance[] NULL_HOST_NET_STACK_INSTANCE_ARRAY = new com.vmware.vim25.HostNetStackInstance[ 0 ] ;
    public com.vmware.vim25.HostNetStackInstance[] HostNetStackInstance;

    public com.vmware.vim25.HostNetStackInstance[] getHostNetStackInstance() {
        if ((HostNetStackInstance) == null) {
            return (NULL_HOST_NET_STACK_INSTANCE_ARRAY);
        }
        return HostNetStackInstance;
    }

    public void setHostNetStackInstance(com.vmware.vim25.HostNetStackInstance[] HostNetStackInstance) {
        this.HostNetStackInstance = HostNetStackInstance;
    }

}
