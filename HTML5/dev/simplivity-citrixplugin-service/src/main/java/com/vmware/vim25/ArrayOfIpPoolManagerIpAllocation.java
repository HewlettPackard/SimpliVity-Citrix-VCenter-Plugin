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
public class ArrayOfIpPoolManagerIpAllocation {

    private final static com.vmware.vim25.IpPoolManagerIpAllocation[] NULL_IP_POOL_MANAGER_IP_ALLOCATION_ARRAY = new com.vmware.vim25.IpPoolManagerIpAllocation[ 0 ] ;
    public com.vmware.vim25.IpPoolManagerIpAllocation[] IpPoolManagerIpAllocation;

    public com.vmware.vim25.IpPoolManagerIpAllocation[] getIpPoolManagerIpAllocation() {
        if ((IpPoolManagerIpAllocation) == null) {
            return (NULL_IP_POOL_MANAGER_IP_ALLOCATION_ARRAY);
        }
        return IpPoolManagerIpAllocation;
    }

    public void setIpPoolManagerIpAllocation(com.vmware.vim25.IpPoolManagerIpAllocation[] IpPoolManagerIpAllocation) {
        this.IpPoolManagerIpAllocation = IpPoolManagerIpAllocation;
    }

}
