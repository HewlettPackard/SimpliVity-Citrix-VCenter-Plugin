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
public class ArrayOfHostInternetScsiHbaSendTarget {

    private final static com.vmware.vim25.HostInternetScsiHbaSendTarget[] NULL_HOST_INTERNET_SCSI_HBA_SEND_TARGET_ARRAY = new com.vmware.vim25.HostInternetScsiHbaSendTarget[ 0 ] ;
    public com.vmware.vim25.HostInternetScsiHbaSendTarget[] HostInternetScsiHbaSendTarget;

    public com.vmware.vim25.HostInternetScsiHbaSendTarget[] getHostInternetScsiHbaSendTarget() {
        if ((HostInternetScsiHbaSendTarget) == null) {
            return (NULL_HOST_INTERNET_SCSI_HBA_SEND_TARGET_ARRAY);
        }
        return HostInternetScsiHbaSendTarget;
    }

    public void setHostInternetScsiHbaSendTarget(com.vmware.vim25.HostInternetScsiHbaSendTarget[] HostInternetScsiHbaSendTarget) {
        this.HostInternetScsiHbaSendTarget = HostInternetScsiHbaSendTarget;
    }

}
