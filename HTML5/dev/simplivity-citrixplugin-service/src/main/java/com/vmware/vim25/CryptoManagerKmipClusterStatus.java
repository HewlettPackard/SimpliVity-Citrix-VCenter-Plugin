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
public class CryptoManagerKmipClusterStatus
    extends DynamicData
{

    public KeyProviderId clusterId;
    private final static CryptoManagerKmipServerStatus[] NULL_SERVERS_ARRAY = new CryptoManagerKmipServerStatus[ 0 ] ;
    public CryptoManagerKmipServerStatus[] servers;
    public CryptoManagerKmipCertificateInfo clientCertInfo;

    public KeyProviderId getClusterId() {
        return clusterId;
    }

    public void setClusterId(KeyProviderId clusterId) {
        this.clusterId = clusterId;
    }

    public CryptoManagerKmipServerStatus[] getServers() {
        if ((servers) == null) {
            return (NULL_SERVERS_ARRAY);
        }
        return servers;
    }

    public void setServers(CryptoManagerKmipServerStatus[] servers) {
        this.servers = servers;
    }

    public CryptoManagerKmipCertificateInfo getClientCertInfo() {
        return clientCertInfo;
    }

    public void setClientCertInfo(CryptoManagerKmipCertificateInfo clientCertInfo) {
        this.clientCertInfo = clientCertInfo;
    }

}
