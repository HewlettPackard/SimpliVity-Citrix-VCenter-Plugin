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
public class ArrayOfHostEventArgument {

    private final static com.vmware.vim25.HostEventArgument[] NULL_HOST_EVENT_ARGUMENT_ARRAY = new com.vmware.vim25.HostEventArgument[ 0 ] ;
    public com.vmware.vim25.HostEventArgument[] HostEventArgument;

    public com.vmware.vim25.HostEventArgument[] getHostEventArgument() {
        if ((HostEventArgument) == null) {
            return (NULL_HOST_EVENT_ARGUMENT_ARRAY);
        }
        return HostEventArgument;
    }

    public void setHostEventArgument(com.vmware.vim25.HostEventArgument[] HostEventArgument) {
        this.HostEventArgument = HostEventArgument;
    }

}
