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
public class DvsVmVnicNetworkResourcePoolRuntimeInfo
    extends DynamicData
{

    public String key;
    public String name;
    public Integer capacity;
    public Integer usage;
    public Integer available;
    public String status;
    private final static DvsVnicAllocatedResource[] NULL_ALLOCATED_RESOURCE_ARRAY = new DvsVnicAllocatedResource[ 0 ] ;
    public DvsVnicAllocatedResource[] allocatedResource;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getUsage() {
        return usage;
    }

    public void setUsage(Integer usage) {
        this.usage = usage;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DvsVnicAllocatedResource[] getAllocatedResource() {
        if ((allocatedResource) == null) {
            return (NULL_ALLOCATED_RESOURCE_ARRAY);
        }
        return allocatedResource;
    }

    public void setAllocatedResource(DvsVnicAllocatedResource[] allocatedResource) {
        this.allocatedResource = allocatedResource;
    }

}