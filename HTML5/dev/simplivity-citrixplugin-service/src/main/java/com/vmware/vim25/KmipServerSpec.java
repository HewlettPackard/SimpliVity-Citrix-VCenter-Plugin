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
public class KmipServerSpec
    extends DynamicData
{

    public KeyProviderId clusterId;
    public KmipServerInfo info;
    public String password;

    public KeyProviderId getClusterId() {
        return clusterId;
    }

    public void setClusterId(KeyProviderId clusterId) {
        this.clusterId = clusterId;
    }

    public KmipServerInfo getInfo() {
        return info;
    }

    public void setInfo(KmipServerInfo info) {
        this.info = info;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
