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
public class ArrayOfGuestInfoNamespaceGenerationInfo {

    private final static com.vmware.vim25.GuestInfoNamespaceGenerationInfo[] NULL_GUEST_INFO_NAMESPACE_GENERATION_INFO_ARRAY = new com.vmware.vim25.GuestInfoNamespaceGenerationInfo[ 0 ] ;
    public com.vmware.vim25.GuestInfoNamespaceGenerationInfo[] GuestInfoNamespaceGenerationInfo;

    public com.vmware.vim25.GuestInfoNamespaceGenerationInfo[] getGuestInfoNamespaceGenerationInfo() {
        if ((GuestInfoNamespaceGenerationInfo) == null) {
            return (NULL_GUEST_INFO_NAMESPACE_GENERATION_INFO_ARRAY);
        }
        return GuestInfoNamespaceGenerationInfo;
    }

    public void setGuestInfoNamespaceGenerationInfo(com.vmware.vim25.GuestInfoNamespaceGenerationInfo[] GuestInfoNamespaceGenerationInfo) {
        this.GuestInfoNamespaceGenerationInfo = GuestInfoNamespaceGenerationInfo;
    }

}
