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
public class MountError
    extends CustomizationFault
{

    public ManagedObjectReference vm;
    public int diskIndex;

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(ManagedObjectReference vm) {
        this.vm = vm;
    }

    public int getDiskIndex() {
        return diskIndex;
    }

    public void setDiskIndex(int diskIndex) {
        this.diskIndex = diskIndex;
    }

}
