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
public class ArrayOfDvsVnicAllocatedResource {

    private final static com.vmware.vim25.DvsVnicAllocatedResource[] NULL_DVS_VNIC_ALLOCATED_RESOURCE_ARRAY = new com.vmware.vim25.DvsVnicAllocatedResource[ 0 ] ;
    public com.vmware.vim25.DvsVnicAllocatedResource[] DvsVnicAllocatedResource;

    public com.vmware.vim25.DvsVnicAllocatedResource[] getDvsVnicAllocatedResource() {
        if ((DvsVnicAllocatedResource) == null) {
            return (NULL_DVS_VNIC_ALLOCATED_RESOURCE_ARRAY);
        }
        return DvsVnicAllocatedResource;
    }

    public void setDvsVnicAllocatedResource(com.vmware.vim25.DvsVnicAllocatedResource[] DvsVnicAllocatedResource) {
        this.DvsVnicAllocatedResource = DvsVnicAllocatedResource;
    }

}
