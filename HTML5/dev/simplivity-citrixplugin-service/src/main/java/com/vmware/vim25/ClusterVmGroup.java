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
public class ClusterVmGroup
    extends ClusterGroupInfo
{

    private final static ManagedObjectReference[] NULL_VM_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] vm;

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
