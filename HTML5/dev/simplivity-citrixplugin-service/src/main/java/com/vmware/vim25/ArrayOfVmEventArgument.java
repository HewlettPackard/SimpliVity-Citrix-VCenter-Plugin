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
public class ArrayOfVmEventArgument {

    private final static com.vmware.vim25.VmEventArgument[] NULL_VM_EVENT_ARGUMENT_ARRAY = new com.vmware.vim25.VmEventArgument[ 0 ] ;
    public com.vmware.vim25.VmEventArgument[] VmEventArgument;

    public com.vmware.vim25.VmEventArgument[] getVmEventArgument() {
        if ((VmEventArgument) == null) {
            return (NULL_VM_EVENT_ARGUMENT_ARRAY);
        }
        return VmEventArgument;
    }

    public void setVmEventArgument(com.vmware.vim25.VmEventArgument[] VmEventArgument) {
        this.VmEventArgument = VmEventArgument;
    }

}
