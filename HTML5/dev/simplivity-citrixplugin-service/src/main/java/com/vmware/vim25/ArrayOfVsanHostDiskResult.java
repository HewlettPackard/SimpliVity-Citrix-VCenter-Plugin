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
public class ArrayOfVsanHostDiskResult {

    private final static com.vmware.vim25.VsanHostDiskResult[] NULL_VSAN_HOST_DISK_RESULT_ARRAY = new com.vmware.vim25.VsanHostDiskResult[ 0 ] ;
    public com.vmware.vim25.VsanHostDiskResult[] VsanHostDiskResult;

    public com.vmware.vim25.VsanHostDiskResult[] getVsanHostDiskResult() {
        if ((VsanHostDiskResult) == null) {
            return (NULL_VSAN_HOST_DISK_RESULT_ARRAY);
        }
        return VsanHostDiskResult;
    }

    public void setVsanHostDiskResult(com.vmware.vim25.VsanHostDiskResult[] VsanHostDiskResult) {
        this.VsanHostDiskResult = VsanHostDiskResult;
    }

}
