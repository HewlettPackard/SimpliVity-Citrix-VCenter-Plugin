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
public class ArrayOfVirtualMachineDatastoreInfo {

    private final static com.vmware.vim25.VirtualMachineDatastoreInfo[] NULL_VIRTUAL_MACHINE_DATASTORE_INFO_ARRAY = new com.vmware.vim25.VirtualMachineDatastoreInfo[ 0 ] ;
    public com.vmware.vim25.VirtualMachineDatastoreInfo[] VirtualMachineDatastoreInfo;

    public com.vmware.vim25.VirtualMachineDatastoreInfo[] getVirtualMachineDatastoreInfo() {
        if ((VirtualMachineDatastoreInfo) == null) {
            return (NULL_VIRTUAL_MACHINE_DATASTORE_INFO_ARRAY);
        }
        return VirtualMachineDatastoreInfo;
    }

    public void setVirtualMachineDatastoreInfo(com.vmware.vim25.VirtualMachineDatastoreInfo[] VirtualMachineDatastoreInfo) {
        this.VirtualMachineDatastoreInfo = VirtualMachineDatastoreInfo;
    }

}
