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
public class ArrayOfAutoStartPowerInfo {

    private final static com.vmware.vim25.AutoStartPowerInfo[] NULL_AUTO_START_POWER_INFO_ARRAY = new com.vmware.vim25.AutoStartPowerInfo[ 0 ] ;
    public com.vmware.vim25.AutoStartPowerInfo[] AutoStartPowerInfo;

    public com.vmware.vim25.AutoStartPowerInfo[] getAutoStartPowerInfo() {
        if ((AutoStartPowerInfo) == null) {
            return (NULL_AUTO_START_POWER_INFO_ARRAY);
        }
        return AutoStartPowerInfo;
    }

    public void setAutoStartPowerInfo(com.vmware.vim25.AutoStartPowerInfo[] AutoStartPowerInfo) {
        this.AutoStartPowerInfo = AutoStartPowerInfo;
    }

}
