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
public class ArrayOfHttpNfcLeaseHostInfo {

    private final static com.vmware.vim25.HttpNfcLeaseHostInfo[] NULL_HTTP_NFC_LEASE_HOST_INFO_ARRAY = new com.vmware.vim25.HttpNfcLeaseHostInfo[ 0 ] ;
    public com.vmware.vim25.HttpNfcLeaseHostInfo[] HttpNfcLeaseHostInfo;

    public com.vmware.vim25.HttpNfcLeaseHostInfo[] getHttpNfcLeaseHostInfo() {
        if ((HttpNfcLeaseHostInfo) == null) {
            return (NULL_HTTP_NFC_LEASE_HOST_INFO_ARRAY);
        }
        return HttpNfcLeaseHostInfo;
    }

    public void setHttpNfcLeaseHostInfo(com.vmware.vim25.HttpNfcLeaseHostInfo[] HttpNfcLeaseHostInfo) {
        this.HttpNfcLeaseHostInfo = HttpNfcLeaseHostInfo;
    }

}
