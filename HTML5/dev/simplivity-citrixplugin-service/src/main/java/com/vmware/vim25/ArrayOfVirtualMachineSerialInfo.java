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
public class ArrayOfVirtualMachineSerialInfo {

    private final static com.vmware.vim25.VirtualMachineSerialInfo[] NULL_VIRTUAL_MACHINE_SERIAL_INFO_ARRAY = new com.vmware.vim25.VirtualMachineSerialInfo[ 0 ] ;
    public com.vmware.vim25.VirtualMachineSerialInfo[] VirtualMachineSerialInfo;

    public com.vmware.vim25.VirtualMachineSerialInfo[] getVirtualMachineSerialInfo() {
        if ((VirtualMachineSerialInfo) == null) {
            return (NULL_VIRTUAL_MACHINE_SERIAL_INFO_ARRAY);
        }
        return VirtualMachineSerialInfo;
    }

    public void setVirtualMachineSerialInfo(com.vmware.vim25.VirtualMachineSerialInfo[] VirtualMachineSerialInfo) {
        this.VirtualMachineSerialInfo = VirtualMachineSerialInfo;
    }

}