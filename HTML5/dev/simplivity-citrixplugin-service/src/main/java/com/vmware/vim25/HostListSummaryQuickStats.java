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
public class HostListSummaryQuickStats
    extends DynamicData
{

    public Integer overallCpuUsage;
    public Integer overallMemoryUsage;
    public Integer distributedCpuFairness;
    public Integer distributedMemoryFairness;
    public Integer availablePMemCapacity;
    public Integer uptime;

    public Integer getOverallCpuUsage() {
        return overallCpuUsage;
    }

    public void setOverallCpuUsage(Integer overallCpuUsage) {
        this.overallCpuUsage = overallCpuUsage;
    }

    public Integer getOverallMemoryUsage() {
        return overallMemoryUsage;
    }

    public void setOverallMemoryUsage(Integer overallMemoryUsage) {
        this.overallMemoryUsage = overallMemoryUsage;
    }

    public Integer getDistributedCpuFairness() {
        return distributedCpuFairness;
    }

    public void setDistributedCpuFairness(Integer distributedCpuFairness) {
        this.distributedCpuFairness = distributedCpuFairness;
    }

    public Integer getDistributedMemoryFairness() {
        return distributedMemoryFairness;
    }

    public void setDistributedMemoryFairness(Integer distributedMemoryFairness) {
        this.distributedMemoryFairness = distributedMemoryFairness;
    }

    public Integer getAvailablePMemCapacity() {
        return availablePMemCapacity;
    }

    public void setAvailablePMemCapacity(Integer availablePMemCapacity) {
        this.availablePMemCapacity = availablePMemCapacity;
    }

    public Integer getUptime() {
        return uptime;
    }

    public void setUptime(Integer uptime) {
        this.uptime = uptime;
    }

}
