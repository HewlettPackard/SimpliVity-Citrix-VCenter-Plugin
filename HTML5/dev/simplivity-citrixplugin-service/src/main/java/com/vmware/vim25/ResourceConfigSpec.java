//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;

import java.util.Calendar;


/**
 * 
 */
public class ResourceConfigSpec
    extends DynamicData
{

    public ManagedObjectReference entity;
    public String changeVersion;
    public Calendar lastModified;
    public ResourceAllocationInfo cpuAllocation;
    public ResourceAllocationInfo memoryAllocation;

    public ManagedObjectReference getEntity() {
        return entity;
    }

    public void setEntity(ManagedObjectReference entity) {
        this.entity = entity;
    }

    public String getChangeVersion() {
        return changeVersion;
    }

    public void setChangeVersion(String changeVersion) {
        this.changeVersion = changeVersion;
    }

    public Calendar getLastModified() {
        return lastModified;
    }

    public void setLastModified(Calendar lastModified) {
        this.lastModified = lastModified;
    }

    public ResourceAllocationInfo getCpuAllocation() {
        return cpuAllocation;
    }

    public void setCpuAllocation(ResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }

    public ResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }

    public void setMemoryAllocation(ResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }

}
