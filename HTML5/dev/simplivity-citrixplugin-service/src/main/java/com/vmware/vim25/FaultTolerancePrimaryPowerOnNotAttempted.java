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
public class FaultTolerancePrimaryPowerOnNotAttempted
    extends VmFaultToleranceIssue
{

    public ManagedObjectReference secondaryVm;
    public ManagedObjectReference primaryVm;

    public ManagedObjectReference getSecondaryVm() {
        return secondaryVm;
    }

    public void setSecondaryVm(ManagedObjectReference secondaryVm) {
        this.secondaryVm = secondaryVm;
    }

    public ManagedObjectReference getPrimaryVm() {
        return primaryVm;
    }

    public void setPrimaryVm(ManagedObjectReference primaryVm) {
        this.primaryVm = primaryVm;
    }

}