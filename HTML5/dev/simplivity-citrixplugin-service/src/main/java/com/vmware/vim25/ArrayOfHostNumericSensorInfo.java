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
public class ArrayOfHostNumericSensorInfo {

    private final static com.vmware.vim25.HostNumericSensorInfo[] NULL_HOST_NUMERIC_SENSOR_INFO_ARRAY = new com.vmware.vim25.HostNumericSensorInfo[ 0 ] ;
    public com.vmware.vim25.HostNumericSensorInfo[] HostNumericSensorInfo;

    public com.vmware.vim25.HostNumericSensorInfo[] getHostNumericSensorInfo() {
        if ((HostNumericSensorInfo) == null) {
            return (NULL_HOST_NUMERIC_SENSOR_INFO_ARRAY);
        }
        return HostNumericSensorInfo;
    }

    public void setHostNumericSensorInfo(com.vmware.vim25.HostNumericSensorInfo[] HostNumericSensorInfo) {
        this.HostNumericSensorInfo = HostNumericSensorInfo;
    }

}
