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
public class HostGraphicsConfig
    extends DynamicData
{

    public String hostDefaultGraphicsType;
    public String sharedPassthruAssignmentPolicy;
    private final static HostGraphicsConfigDeviceType[] NULL_DEVICE_TYPE_ARRAY = new HostGraphicsConfigDeviceType[ 0 ] ;
    public HostGraphicsConfigDeviceType[] deviceType;

    public String getHostDefaultGraphicsType() {
        return hostDefaultGraphicsType;
    }

    public void setHostDefaultGraphicsType(String hostDefaultGraphicsType) {
        this.hostDefaultGraphicsType = hostDefaultGraphicsType;
    }

    public String getSharedPassthruAssignmentPolicy() {
        return sharedPassthruAssignmentPolicy;
    }

    public void setSharedPassthruAssignmentPolicy(String sharedPassthruAssignmentPolicy) {
        this.sharedPassthruAssignmentPolicy = sharedPassthruAssignmentPolicy;
    }

    public HostGraphicsConfigDeviceType[] getDeviceType() {
        if ((deviceType) == null) {
            return (NULL_DEVICE_TYPE_ARRAY);
        }
        return deviceType;
    }

    public void setDeviceType(HostGraphicsConfigDeviceType[] deviceType) {
        this.deviceType = deviceType;
    }

}
