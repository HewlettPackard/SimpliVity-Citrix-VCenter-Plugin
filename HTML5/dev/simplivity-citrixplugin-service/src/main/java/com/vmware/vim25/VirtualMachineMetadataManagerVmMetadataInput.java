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
public class VirtualMachineMetadataManagerVmMetadataInput
    extends DynamicData
{

    public String operation;
    public VirtualMachineMetadataManagerVmMetadata vmMetadata;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public VirtualMachineMetadataManagerVmMetadata getVmMetadata() {
        return vmMetadata;
    }

    public void setVmMetadata(VirtualMachineMetadataManagerVmMetadata vmMetadata) {
        this.vmMetadata = vmMetadata;
    }

}
