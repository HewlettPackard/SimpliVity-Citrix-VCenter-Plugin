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
public class VirtualMachineSnapshotInfo
    extends DynamicData
{

    public ManagedObjectReference currentSnapshot;
    private final static VirtualMachineSnapshotTree[] NULL_ROOT_SNAPSHOT_LIST_ARRAY = new VirtualMachineSnapshotTree[ 0 ] ;
    public VirtualMachineSnapshotTree[] rootSnapshotList;

    public ManagedObjectReference getCurrentSnapshot() {
        return currentSnapshot;
    }

    public void setCurrentSnapshot(ManagedObjectReference currentSnapshot) {
        this.currentSnapshot = currentSnapshot;
    }

    public VirtualMachineSnapshotTree[] getRootSnapshotList() {
        if ((rootSnapshotList) == null) {
            return (NULL_ROOT_SNAPSHOT_LIST_ARRAY);
        }
        return rootSnapshotList;
    }

    public void setRootSnapshotList(VirtualMachineSnapshotTree[] rootSnapshotList) {
        this.rootSnapshotList = rootSnapshotList;
    }

}