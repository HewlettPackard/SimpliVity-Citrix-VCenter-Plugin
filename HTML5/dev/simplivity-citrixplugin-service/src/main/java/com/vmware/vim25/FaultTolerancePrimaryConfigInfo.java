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
public class FaultTolerancePrimaryConfigInfo
    extends FaultToleranceConfigInfo
{

    private final static ManagedObjectReference[] NULL_SECONDARIES_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] secondaries;

    public ManagedObjectReference[] getSecondaries() {
        if ((secondaries) == null) {
            return (NULL_SECONDARIES_ARRAY);
        }
        return secondaries;
    }

    public void setSecondaries(ManagedObjectReference[] secondaries) {
        this.secondaries = secondaries;
    }

}