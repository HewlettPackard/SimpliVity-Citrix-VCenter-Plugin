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
public class ArrayOfDistributedVirtualPortgroupInfo {

    private final static com.vmware.vim25.DistributedVirtualPortgroupInfo[] NULL_DISTRIBUTED_VIRTUAL_PORTGROUP_INFO_ARRAY = new com.vmware.vim25.DistributedVirtualPortgroupInfo[ 0 ] ;
    public com.vmware.vim25.DistributedVirtualPortgroupInfo[] DistributedVirtualPortgroupInfo;

    public com.vmware.vim25.DistributedVirtualPortgroupInfo[] getDistributedVirtualPortgroupInfo() {
        if ((DistributedVirtualPortgroupInfo) == null) {
            return (NULL_DISTRIBUTED_VIRTUAL_PORTGROUP_INFO_ARRAY);
        }
        return DistributedVirtualPortgroupInfo;
    }

    public void setDistributedVirtualPortgroupInfo(com.vmware.vim25.DistributedVirtualPortgroupInfo[] DistributedVirtualPortgroupInfo) {
        this.DistributedVirtualPortgroupInfo = DistributedVirtualPortgroupInfo;
    }

}
