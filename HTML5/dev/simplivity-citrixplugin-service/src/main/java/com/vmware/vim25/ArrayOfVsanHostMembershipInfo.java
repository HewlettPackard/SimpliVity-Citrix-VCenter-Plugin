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
public class ArrayOfVsanHostMembershipInfo {

    private final static com.vmware.vim25.VsanHostMembershipInfo[] NULL_VSAN_HOST_MEMBERSHIP_INFO_ARRAY = new com.vmware.vim25.VsanHostMembershipInfo[ 0 ] ;
    public com.vmware.vim25.VsanHostMembershipInfo[] VsanHostMembershipInfo;

    public com.vmware.vim25.VsanHostMembershipInfo[] getVsanHostMembershipInfo() {
        if ((VsanHostMembershipInfo) == null) {
            return (NULL_VSAN_HOST_MEMBERSHIP_INFO_ARRAY);
        }
        return VsanHostMembershipInfo;
    }

    public void setVsanHostMembershipInfo(com.vmware.vim25.VsanHostMembershipInfo[] VsanHostMembershipInfo) {
        this.VsanHostMembershipInfo = VsanHostMembershipInfo;
    }

}
