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
public class ArrayOfFaultsByHost {

    private final static com.vmware.vim25.FaultsByHost[] NULL_FAULTS_BY_HOST_ARRAY = new com.vmware.vim25.FaultsByHost[ 0 ] ;
    public com.vmware.vim25.FaultsByHost[] FaultsByHost;

    public com.vmware.vim25.FaultsByHost[] getFaultsByHost() {
        if ((FaultsByHost) == null) {
            return (NULL_FAULTS_BY_HOST_ARRAY);
        }
        return FaultsByHost;
    }

    public void setFaultsByHost(com.vmware.vim25.FaultsByHost[] FaultsByHost) {
        this.FaultsByHost = FaultsByHost;
    }

}
