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
public class ArrayOfHostOpaqueSwitchPhysicalNicZone {

    private final static com.vmware.vim25.HostOpaqueSwitchPhysicalNicZone[] NULL_HOST_OPAQUE_SWITCH_PHYSICAL_NIC_ZONE_ARRAY = new com.vmware.vim25.HostOpaqueSwitchPhysicalNicZone[ 0 ] ;
    public com.vmware.vim25.HostOpaqueSwitchPhysicalNicZone[] HostOpaqueSwitchPhysicalNicZone;

    public com.vmware.vim25.HostOpaqueSwitchPhysicalNicZone[] getHostOpaqueSwitchPhysicalNicZone() {
        if ((HostOpaqueSwitchPhysicalNicZone) == null) {
            return (NULL_HOST_OPAQUE_SWITCH_PHYSICAL_NIC_ZONE_ARRAY);
        }
        return HostOpaqueSwitchPhysicalNicZone;
    }

    public void setHostOpaqueSwitchPhysicalNicZone(com.vmware.vim25.HostOpaqueSwitchPhysicalNicZone[] HostOpaqueSwitchPhysicalNicZone) {
        this.HostOpaqueSwitchPhysicalNicZone = HostOpaqueSwitchPhysicalNicZone;
    }

}