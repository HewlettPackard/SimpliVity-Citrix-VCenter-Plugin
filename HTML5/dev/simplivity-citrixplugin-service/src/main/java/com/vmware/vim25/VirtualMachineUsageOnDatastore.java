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
public class VirtualMachineUsageOnDatastore
    extends DynamicData
{

    public ManagedObjectReference datastore;
    public long committed;
    public long uncommitted;
    public long unshared;

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public long getCommitted() {
        return committed;
    }

    public void setCommitted(long committed) {
        this.committed = committed;
    }

    public long getUncommitted() {
        return uncommitted;
    }

    public void setUncommitted(long uncommitted) {
        this.uncommitted = uncommitted;
    }

    public long getUnshared() {
        return unshared;
    }

    public void setUnshared(long unshared) {
        this.unshared = unshared;
    }

}
