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
public class ArrayOfHostSriovDevicePoolInfo {

    private final static com.vmware.vim25.HostSriovDevicePoolInfo[] NULL_HOST_SRIOV_DEVICE_POOL_INFO_ARRAY = new com.vmware.vim25.HostSriovDevicePoolInfo[ 0 ] ;
    public com.vmware.vim25.HostSriovDevicePoolInfo[] HostSriovDevicePoolInfo;

    public com.vmware.vim25.HostSriovDevicePoolInfo[] getHostSriovDevicePoolInfo() {
        if ((HostSriovDevicePoolInfo) == null) {
            return (NULL_HOST_SRIOV_DEVICE_POOL_INFO_ARRAY);
        }
        return HostSriovDevicePoolInfo;
    }

    public void setHostSriovDevicePoolInfo(com.vmware.vim25.HostSriovDevicePoolInfo[] HostSriovDevicePoolInfo) {
        this.HostSriovDevicePoolInfo = HostSriovDevicePoolInfo;
    }

}
