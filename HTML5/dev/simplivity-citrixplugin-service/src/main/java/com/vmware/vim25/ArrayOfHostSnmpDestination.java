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
public class ArrayOfHostSnmpDestination {

    private final static com.vmware.vim25.HostSnmpDestination[] NULL_HOST_SNMP_DESTINATION_ARRAY = new com.vmware.vim25.HostSnmpDestination[ 0 ] ;
    public com.vmware.vim25.HostSnmpDestination[] HostSnmpDestination;

    public com.vmware.vim25.HostSnmpDestination[] getHostSnmpDestination() {
        if ((HostSnmpDestination) == null) {
            return (NULL_HOST_SNMP_DESTINATION_ARRAY);
        }
        return HostSnmpDestination;
    }

    public void setHostSnmpDestination(com.vmware.vim25.HostSnmpDestination[] HostSnmpDestination) {
        this.HostSnmpDestination = HostSnmpDestination;
    }

}