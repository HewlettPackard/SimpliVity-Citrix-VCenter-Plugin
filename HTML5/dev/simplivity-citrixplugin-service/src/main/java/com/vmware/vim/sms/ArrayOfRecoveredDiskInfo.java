//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;



/**
 * 
 */
@SuppressWarnings("all")
public class ArrayOfRecoveredDiskInfo {

    private final static com.vmware.vim.sms.RecoveredDiskInfo[] NULL_RECOVERED_DISK_INFO_ARRAY = new com.vmware.vim.sms.RecoveredDiskInfo[ 0 ] ;
    public com.vmware.vim.sms.RecoveredDiskInfo[] RecoveredDiskInfo;

    public com.vmware.vim.sms.RecoveredDiskInfo[] getRecoveredDiskInfo() {
        if ((RecoveredDiskInfo) == null) {
            return (NULL_RECOVERED_DISK_INFO_ARRAY);
        }
        return RecoveredDiskInfo;
    }

    public void setRecoveredDiskInfo(com.vmware.vim.sms.RecoveredDiskInfo[] RecoveredDiskInfo) {
        this.RecoveredDiskInfo = RecoveredDiskInfo;
    }

}
