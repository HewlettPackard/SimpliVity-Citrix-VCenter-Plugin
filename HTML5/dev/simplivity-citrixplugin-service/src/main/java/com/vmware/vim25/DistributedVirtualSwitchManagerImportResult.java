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
public class DistributedVirtualSwitchManagerImportResult
    extends DynamicData
{

    private final static ManagedObjectReference[] NULL_DISTRIBUTED_VIRTUAL_SWITCH_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] distributedVirtualSwitch;
    private final static ManagedObjectReference[] NULL_DISTRIBUTED_VIRTUAL_PORTGROUP_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] distributedVirtualPortgroup;
    private final static ImportOperationBulkFaultFaultOnImport[] NULL_IMPORT_FAULT_ARRAY = new ImportOperationBulkFaultFaultOnImport[ 0 ] ;
    public ImportOperationBulkFaultFaultOnImport[] importFault;

    public ManagedObjectReference[] getDistributedVirtualSwitch() {
        if ((distributedVirtualSwitch) == null) {
            return (NULL_DISTRIBUTED_VIRTUAL_SWITCH_ARRAY);
        }
        return distributedVirtualSwitch;
    }

    public void setDistributedVirtualSwitch(ManagedObjectReference[] distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    public ManagedObjectReference[] getDistributedVirtualPortgroup() {
        if ((distributedVirtualPortgroup) == null) {
            return (NULL_DISTRIBUTED_VIRTUAL_PORTGROUP_ARRAY);
        }
        return distributedVirtualPortgroup;
    }

    public void setDistributedVirtualPortgroup(ManagedObjectReference[] distributedVirtualPortgroup) {
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
    }

    public ImportOperationBulkFaultFaultOnImport[] getImportFault() {
        if ((importFault) == null) {
            return (NULL_IMPORT_FAULT_ARRAY);
        }
        return importFault;
    }

    public void setImportFault(ImportOperationBulkFaultFaultOnImport[] importFault) {
        this.importFault = importFault;
    }

}
