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
public class ArrayOfHostSystemIdentificationInfo {

    private final static com.vmware.vim25.HostSystemIdentificationInfo[] NULL_HOST_SYSTEM_IDENTIFICATION_INFO_ARRAY = new com.vmware.vim25.HostSystemIdentificationInfo[ 0 ] ;
    public com.vmware.vim25.HostSystemIdentificationInfo[] HostSystemIdentificationInfo;

    public com.vmware.vim25.HostSystemIdentificationInfo[] getHostSystemIdentificationInfo() {
        if ((HostSystemIdentificationInfo) == null) {
            return (NULL_HOST_SYSTEM_IDENTIFICATION_INFO_ARRAY);
        }
        return HostSystemIdentificationInfo;
    }

    public void setHostSystemIdentificationInfo(com.vmware.vim25.HostSystemIdentificationInfo[] HostSystemIdentificationInfo) {
        this.HostSystemIdentificationInfo = HostSystemIdentificationInfo;
    }

}