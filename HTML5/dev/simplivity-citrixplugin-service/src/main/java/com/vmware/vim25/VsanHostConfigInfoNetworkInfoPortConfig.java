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
public class VsanHostConfigInfoNetworkInfoPortConfig
    extends DynamicData
{

    public VsanHostIpConfig ipConfig;
    public String device;

    public VsanHostIpConfig getIpConfig() {
        return ipConfig;
    }

    public void setIpConfig(VsanHostIpConfig ipConfig) {
        this.ipConfig = ipConfig;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

}
