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
public class HostDiskConfigurationResult
    extends DynamicData
{

    public String devicePath;
    public Boolean success;
    public LocalizedMethodFault fault;

    public String getDevicePath() {
        return devicePath;
    }

    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean isSuccess() {
        return success;
    }

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(LocalizedMethodFault fault) {
        this.fault = fault;
    }

}
