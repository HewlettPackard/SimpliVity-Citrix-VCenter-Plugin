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
public class VirtualDeviceRemoteDeviceBackingInfo
    extends VirtualDeviceBackingInfo
{

    public String deviceName;
    public Boolean useAutoDetect;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Boolean getUseAutoDetect() {
        return useAutoDetect;
    }

    public void setUseAutoDetect(Boolean useAutoDetect) {
        this.useAutoDetect = useAutoDetect;
    }

    public Boolean isUseAutoDetect() {
        return useAutoDetect;
    }

}