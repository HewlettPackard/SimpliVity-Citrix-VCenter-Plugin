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
public class HostNasVolume
    extends HostFileSystemVolume
{

    public String remoteHost;
    public String remotePath;
    public String userName;
    private final static String[] NULL_REMOTE_HOST_NAMES_ARRAY = new String[ 0 ] ;
    public String[] remoteHostNames;
    public String securityType;
    public Boolean protocolEndpoint;

    public String getRemoteHost() {
        return remoteHost;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }

    public String getRemotePath() {
        return remotePath;
    }

    public void setRemotePath(String remotePath) {
        this.remotePath = remotePath;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String[] getRemoteHostNames() {
        if ((remoteHostNames) == null) {
            return (NULL_REMOTE_HOST_NAMES_ARRAY);
        }
        return remoteHostNames;
    }

    public void setRemoteHostNames(String[] remoteHostNames) {
        this.remoteHostNames = remoteHostNames;
    }

    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    public Boolean getProtocolEndpoint() {
        return protocolEndpoint;
    }

    public void setProtocolEndpoint(Boolean protocolEndpoint) {
        this.protocolEndpoint = protocolEndpoint;
    }

    public Boolean isProtocolEndpoint() {
        return protocolEndpoint;
    }

}
