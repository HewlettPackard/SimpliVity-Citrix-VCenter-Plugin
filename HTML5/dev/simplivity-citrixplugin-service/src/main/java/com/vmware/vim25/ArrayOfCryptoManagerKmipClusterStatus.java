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
public class ArrayOfCryptoManagerKmipClusterStatus {

    private final static com.vmware.vim25.CryptoManagerKmipClusterStatus[] NULL_CRYPTO_MANAGER_KMIP_CLUSTER_STATUS_ARRAY = new com.vmware.vim25.CryptoManagerKmipClusterStatus[ 0 ] ;
    public com.vmware.vim25.CryptoManagerKmipClusterStatus[] CryptoManagerKmipClusterStatus;

    public com.vmware.vim25.CryptoManagerKmipClusterStatus[] getCryptoManagerKmipClusterStatus() {
        if ((CryptoManagerKmipClusterStatus) == null) {
            return (NULL_CRYPTO_MANAGER_KMIP_CLUSTER_STATUS_ARRAY);
        }
        return CryptoManagerKmipClusterStatus;
    }

    public void setCryptoManagerKmipClusterStatus(com.vmware.vim25.CryptoManagerKmipClusterStatus[] CryptoManagerKmipClusterStatus) {
        this.CryptoManagerKmipClusterStatus = CryptoManagerKmipClusterStatus;
    }

}