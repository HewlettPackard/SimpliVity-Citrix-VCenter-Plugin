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
public class ArrayOfHostInternetScsiHbaParamValue {

    private final static com.vmware.vim25.HostInternetScsiHbaParamValue[] NULL_HOST_INTERNET_SCSI_HBA_PARAM_VALUE_ARRAY = new com.vmware.vim25.HostInternetScsiHbaParamValue[ 0 ] ;
    public com.vmware.vim25.HostInternetScsiHbaParamValue[] HostInternetScsiHbaParamValue;

    public com.vmware.vim25.HostInternetScsiHbaParamValue[] getHostInternetScsiHbaParamValue() {
        if ((HostInternetScsiHbaParamValue) == null) {
            return (NULL_HOST_INTERNET_SCSI_HBA_PARAM_VALUE_ARRAY);
        }
        return HostInternetScsiHbaParamValue;
    }

    public void setHostInternetScsiHbaParamValue(com.vmware.vim25.HostInternetScsiHbaParamValue[] HostInternetScsiHbaParamValue) {
        this.HostInternetScsiHbaParamValue = HostInternetScsiHbaParamValue;
    }

}