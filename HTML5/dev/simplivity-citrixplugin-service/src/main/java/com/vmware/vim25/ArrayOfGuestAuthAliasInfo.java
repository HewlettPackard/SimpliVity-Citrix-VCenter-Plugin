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
public class ArrayOfGuestAuthAliasInfo {

    private final static com.vmware.vim25.GuestAuthAliasInfo[] NULL_GUEST_AUTH_ALIAS_INFO_ARRAY = new com.vmware.vim25.GuestAuthAliasInfo[ 0 ] ;
    public com.vmware.vim25.GuestAuthAliasInfo[] GuestAuthAliasInfo;

    public com.vmware.vim25.GuestAuthAliasInfo[] getGuestAuthAliasInfo() {
        if ((GuestAuthAliasInfo) == null) {
            return (NULL_GUEST_AUTH_ALIAS_INFO_ARRAY);
        }
        return GuestAuthAliasInfo;
    }

    public void setGuestAuthAliasInfo(com.vmware.vim25.GuestAuthAliasInfo[] GuestAuthAliasInfo) {
        this.GuestAuthAliasInfo = GuestAuthAliasInfo;
    }

}
