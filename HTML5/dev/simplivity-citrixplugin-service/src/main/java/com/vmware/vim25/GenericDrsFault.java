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
public class GenericDrsFault
    extends VimFault
{

    private final static LocalizedMethodFault[] NULL_HOST_FAULTS_ARRAY = new LocalizedMethodFault[ 0 ] ;
    public LocalizedMethodFault[] hostFaults;

    public LocalizedMethodFault[] getHostFaults() {
        if ((hostFaults) == null) {
            return (NULL_HOST_FAULTS_ARRAY);
        }
        return hostFaults;
    }

    public void setHostFaults(LocalizedMethodFault[] hostFaults) {
        this.hostFaults = hostFaults;
    }

}
