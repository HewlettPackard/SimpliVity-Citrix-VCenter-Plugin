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
public class ArrayOfVirtualMachineConfigInfoDatastoreUrlPair {

    private final static com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] NULL_VIRTUAL_MACHINE_CONFIG_INFO_DATASTORE_URL_PAIR_ARRAY = new com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[ 0 ] ;
    public com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] VirtualMachineConfigInfoDatastoreUrlPair;

    public com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] getVirtualMachineConfigInfoDatastoreUrlPair() {
        if ((VirtualMachineConfigInfoDatastoreUrlPair) == null) {
            return (NULL_VIRTUAL_MACHINE_CONFIG_INFO_DATASTORE_URL_PAIR_ARRAY);
        }
        return VirtualMachineConfigInfoDatastoreUrlPair;
    }

    public void setVirtualMachineConfigInfoDatastoreUrlPair(com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] VirtualMachineConfigInfoDatastoreUrlPair) {
        this.VirtualMachineConfigInfoDatastoreUrlPair = VirtualMachineConfigInfoDatastoreUrlPair;
    }

}