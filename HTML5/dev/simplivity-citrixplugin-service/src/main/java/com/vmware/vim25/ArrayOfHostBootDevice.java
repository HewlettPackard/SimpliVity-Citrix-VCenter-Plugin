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
public class ArrayOfHostBootDevice {

    private final static com.vmware.vim25.HostBootDevice[] NULL_HOST_BOOT_DEVICE_ARRAY = new com.vmware.vim25.HostBootDevice[ 0 ] ;
    public com.vmware.vim25.HostBootDevice[] HostBootDevice;

    public com.vmware.vim25.HostBootDevice[] getHostBootDevice() {
        if ((HostBootDevice) == null) {
            return (NULL_HOST_BOOT_DEVICE_ARRAY);
        }
        return HostBootDevice;
    }

    public void setHostBootDevice(com.vmware.vim25.HostBootDevice[] HostBootDevice) {
        this.HostBootDevice = HostBootDevice;
    }

}
