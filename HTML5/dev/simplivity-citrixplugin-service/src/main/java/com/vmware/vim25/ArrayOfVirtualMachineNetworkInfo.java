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
public class ArrayOfVirtualMachineNetworkInfo {

    private final static com.vmware.vim25.VirtualMachineNetworkInfo[] NULL_VIRTUAL_MACHINE_NETWORK_INFO_ARRAY = new com.vmware.vim25.VirtualMachineNetworkInfo[ 0 ] ;
    public com.vmware.vim25.VirtualMachineNetworkInfo[] VirtualMachineNetworkInfo;

    public com.vmware.vim25.VirtualMachineNetworkInfo[] getVirtualMachineNetworkInfo() {
        if ((VirtualMachineNetworkInfo) == null) {
            return (NULL_VIRTUAL_MACHINE_NETWORK_INFO_ARRAY);
        }
        return VirtualMachineNetworkInfo;
    }

    public void setVirtualMachineNetworkInfo(com.vmware.vim25.VirtualMachineNetworkInfo[] VirtualMachineNetworkInfo) {
        this.VirtualMachineNetworkInfo = VirtualMachineNetworkInfo;
    }

}