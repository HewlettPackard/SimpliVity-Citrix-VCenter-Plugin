//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;



/**
 * 
 */
@SuppressWarnings("all")
public class ArrayOfDeviceId {

    private final static com.vmware.vim.sms.DeviceId[] NULL_DEVICE_ID_ARRAY = new com.vmware.vim.sms.DeviceId[ 0 ] ;
    public com.vmware.vim.sms.DeviceId[] DeviceId;

    public com.vmware.vim.sms.DeviceId[] getDeviceId() {
        if ((DeviceId) == null) {
            return (NULL_DEVICE_ID_ARRAY);
        }
        return DeviceId;
    }

    public void setDeviceId(com.vmware.vim.sms.DeviceId[] DeviceId) {
        this.DeviceId = DeviceId;
    }

}