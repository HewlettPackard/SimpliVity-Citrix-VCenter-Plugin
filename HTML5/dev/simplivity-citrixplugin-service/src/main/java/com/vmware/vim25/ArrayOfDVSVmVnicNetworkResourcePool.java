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
public class ArrayOfDVSVmVnicNetworkResourcePool {

    private final static com.vmware.vim25.DVSVmVnicNetworkResourcePool[] NULL_DVS_VM_VNIC_NETWORK_RESOURCE_POOL_ARRAY = new com.vmware.vim25.DVSVmVnicNetworkResourcePool[ 0 ] ;
    public com.vmware.vim25.DVSVmVnicNetworkResourcePool[] DVSVmVnicNetworkResourcePool;

    public com.vmware.vim25.DVSVmVnicNetworkResourcePool[] getDvsVmVnicNetworkResourcePool() {
        if ((DVSVmVnicNetworkResourcePool) == null) {
            return (NULL_DVS_VM_VNIC_NETWORK_RESOURCE_POOL_ARRAY);
        }
        return DVSVmVnicNetworkResourcePool;
    }

    public void setDvsVmVnicNetworkResourcePool(com.vmware.vim25.DVSVmVnicNetworkResourcePool[] DVSVmVnicNetworkResourcePool) {
        this.DVSVmVnicNetworkResourcePool = DVSVmVnicNetworkResourcePool;
    }

}