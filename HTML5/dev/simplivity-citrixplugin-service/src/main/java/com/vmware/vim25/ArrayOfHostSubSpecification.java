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
public class ArrayOfHostSubSpecification {

    private final static com.vmware.vim25.HostSubSpecification[] NULL_HOST_SUB_SPECIFICATION_ARRAY = new com.vmware.vim25.HostSubSpecification[ 0 ] ;
    public com.vmware.vim25.HostSubSpecification[] HostSubSpecification;

    public com.vmware.vim25.HostSubSpecification[] getHostSubSpecification() {
        if ((HostSubSpecification) == null) {
            return (NULL_HOST_SUB_SPECIFICATION_ARRAY);
        }
        return HostSubSpecification;
    }

    public void setHostSubSpecification(com.vmware.vim25.HostSubSpecification[] HostSubSpecification) {
        this.HostSubSpecification = HostSubSpecification;
    }

}