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
public class ArrayOfFaultToleranceDiskSpec {

    private final static com.vmware.vim25.FaultToleranceDiskSpec[] NULL_FAULT_TOLERANCE_DISK_SPEC_ARRAY = new com.vmware.vim25.FaultToleranceDiskSpec[ 0 ] ;
    public com.vmware.vim25.FaultToleranceDiskSpec[] FaultToleranceDiskSpec;

    public com.vmware.vim25.FaultToleranceDiskSpec[] getFaultToleranceDiskSpec() {
        if ((FaultToleranceDiskSpec) == null) {
            return (NULL_FAULT_TOLERANCE_DISK_SPEC_ARRAY);
        }
        return FaultToleranceDiskSpec;
    }

    public void setFaultToleranceDiskSpec(com.vmware.vim25.FaultToleranceDiskSpec[] FaultToleranceDiskSpec) {
        this.FaultToleranceDiskSpec = FaultToleranceDiskSpec;
    }

}
