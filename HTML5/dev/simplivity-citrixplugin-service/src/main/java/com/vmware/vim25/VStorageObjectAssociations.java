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
public class VStorageObjectAssociations
    extends DynamicData
{

    public ID id;
    private final static VStorageObjectAssociationsVmDiskAssociations[] NULL_VM_DISK_ASSOCIATIONS_ARRAY = new VStorageObjectAssociationsVmDiskAssociations[ 0 ] ;
    public VStorageObjectAssociationsVmDiskAssociations[] vmDiskAssociations;
    public LocalizedMethodFault fault;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public VStorageObjectAssociationsVmDiskAssociations[] getVmDiskAssociations() {
        if ((vmDiskAssociations) == null) {
            return (NULL_VM_DISK_ASSOCIATIONS_ARRAY);
        }
        return vmDiskAssociations;
    }

    public void setVmDiskAssociations(VStorageObjectAssociationsVmDiskAssociations[] vmDiskAssociations) {
        this.vmDiskAssociations = vmDiskAssociations;
    }

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(LocalizedMethodFault fault) {
        this.fault = fault;
    }

}
