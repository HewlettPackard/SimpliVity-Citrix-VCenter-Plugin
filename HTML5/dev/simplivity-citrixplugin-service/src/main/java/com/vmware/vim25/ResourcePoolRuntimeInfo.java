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
public class ResourcePoolRuntimeInfo
    extends DynamicData
{

    public ResourcePoolResourceUsage memory;
    public ResourcePoolResourceUsage cpu;
    public ManagedEntityStatus overallStatus;

    public ResourcePoolResourceUsage getMemory() {
        return memory;
    }

    public void setMemory(ResourcePoolResourceUsage memory) {
        this.memory = memory;
    }

    public ResourcePoolResourceUsage getCpu() {
        return cpu;
    }

    public void setCpu(ResourcePoolResourceUsage cpu) {
        this.cpu = cpu;
    }

    public ManagedEntityStatus getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(ManagedEntityStatus overallStatus) {
        this.overallStatus = overallStatus;
    }

}
