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
public class ArrayOfHostTpmDigestInfo {

    private final static com.vmware.vim25.HostTpmDigestInfo[] NULL_HOST_TPM_DIGEST_INFO_ARRAY = new com.vmware.vim25.HostTpmDigestInfo[ 0 ] ;
    public com.vmware.vim25.HostTpmDigestInfo[] HostTpmDigestInfo;

    public com.vmware.vim25.HostTpmDigestInfo[] getHostTpmDigestInfo() {
        if ((HostTpmDigestInfo) == null) {
            return (NULL_HOST_TPM_DIGEST_INFO_ARRAY);
        }
        return HostTpmDigestInfo;
    }

    public void setHostTpmDigestInfo(com.vmware.vim25.HostTpmDigestInfo[] HostTpmDigestInfo) {
        this.HostTpmDigestInfo = HostTpmDigestInfo;
    }

}