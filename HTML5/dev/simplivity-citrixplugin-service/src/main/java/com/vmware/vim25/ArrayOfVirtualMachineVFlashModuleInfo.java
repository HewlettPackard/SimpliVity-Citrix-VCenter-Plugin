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
public class ArrayOfVirtualMachineVFlashModuleInfo {

    private final static com.vmware.vim25.VirtualMachineVFlashModuleInfo[] NULL_VIRTUAL_MACHINE_VFLASH_MODULE_INFO_ARRAY = new com.vmware.vim25.VirtualMachineVFlashModuleInfo[ 0 ] ;
    public com.vmware.vim25.VirtualMachineVFlashModuleInfo[] VirtualMachineVFlashModuleInfo;

    public com.vmware.vim25.VirtualMachineVFlashModuleInfo[] getVirtualMachineVFlashModuleInfo() {
        if ((VirtualMachineVFlashModuleInfo) == null) {
            return (NULL_VIRTUAL_MACHINE_VFLASH_MODULE_INFO_ARRAY);
        }
        return VirtualMachineVFlashModuleInfo;
    }

    public void setVirtualMachineVFlashModuleInfo(com.vmware.vim25.VirtualMachineVFlashModuleInfo[] VirtualMachineVFlashModuleInfo) {
        this.VirtualMachineVFlashModuleInfo = VirtualMachineVFlashModuleInfo;
    }

}