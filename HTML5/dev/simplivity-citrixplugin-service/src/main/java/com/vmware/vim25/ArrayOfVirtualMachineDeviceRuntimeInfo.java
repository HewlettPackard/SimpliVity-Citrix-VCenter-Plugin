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
public class ArrayOfVirtualMachineDeviceRuntimeInfo {

    private final static com.vmware.vim25.VirtualMachineDeviceRuntimeInfo[] NULL_VIRTUAL_MACHINE_DEVICE_RUNTIME_INFO_ARRAY = new com.vmware.vim25.VirtualMachineDeviceRuntimeInfo[ 0 ] ;
    public com.vmware.vim25.VirtualMachineDeviceRuntimeInfo[] VirtualMachineDeviceRuntimeInfo;

    public com.vmware.vim25.VirtualMachineDeviceRuntimeInfo[] getVirtualMachineDeviceRuntimeInfo() {
        if ((VirtualMachineDeviceRuntimeInfo) == null) {
            return (NULL_VIRTUAL_MACHINE_DEVICE_RUNTIME_INFO_ARRAY);
        }
        return VirtualMachineDeviceRuntimeInfo;
    }

    public void setVirtualMachineDeviceRuntimeInfo(com.vmware.vim25.VirtualMachineDeviceRuntimeInfo[] VirtualMachineDeviceRuntimeInfo) {
        this.VirtualMachineDeviceRuntimeInfo = VirtualMachineDeviceRuntimeInfo;
    }

}