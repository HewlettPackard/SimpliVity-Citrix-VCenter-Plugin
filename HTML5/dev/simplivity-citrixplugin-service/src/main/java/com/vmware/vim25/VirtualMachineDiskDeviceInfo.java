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
public class VirtualMachineDiskDeviceInfo
    extends VirtualMachineTargetInfo
{

    public Long capacity;
    private final static ManagedObjectReference[] NULL_VM_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] vm;

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public ManagedObjectReference[] getVm() {
        if ((vm) == null) {
            return (NULL_VM_ARRAY);
        }
        return vm;
    }

    public void setVm(ManagedObjectReference[] vm) {
        this.vm = vm;
    }

}
