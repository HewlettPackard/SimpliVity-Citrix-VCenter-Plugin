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
public class ArrayOfGuestProcessInfo {

    private final static com.vmware.vim25.GuestProcessInfo[] NULL_GUEST_PROCESS_INFO_ARRAY = new com.vmware.vim25.GuestProcessInfo[ 0 ] ;
    public com.vmware.vim25.GuestProcessInfo[] GuestProcessInfo;

    public com.vmware.vim25.GuestProcessInfo[] getGuestProcessInfo() {
        if ((GuestProcessInfo) == null) {
            return (NULL_GUEST_PROCESS_INFO_ARRAY);
        }
        return GuestProcessInfo;
    }

    public void setGuestProcessInfo(com.vmware.vim25.GuestProcessInfo[] GuestProcessInfo) {
        this.GuestProcessInfo = GuestProcessInfo;
    }

}