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
public class ResourcePoolSummary
    extends DynamicData
{

    public String name;
    public ResourceConfigSpec config;
    public ResourcePoolRuntimeInfo runtime;
    public ResourcePoolQuickStats quickStats;
    public Integer configuredMemoryMB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceConfigSpec getConfig() {
        return config;
    }

    public void setConfig(ResourceConfigSpec config) {
        this.config = config;
    }

    public ResourcePoolRuntimeInfo getRuntime() {
        return runtime;
    }

    public void setRuntime(ResourcePoolRuntimeInfo runtime) {
        this.runtime = runtime;
    }

    public ResourcePoolQuickStats getQuickStats() {
        return quickStats;
    }

    public void setQuickStats(ResourcePoolQuickStats quickStats) {
        this.quickStats = quickStats;
    }

    public Integer getConfiguredMemoryMB() {
        return configuredMemoryMB;
    }

    public void setConfiguredMemoryMB(Integer configuredMemoryMB) {
        this.configuredMemoryMB = configuredMemoryMB;
    }

}
