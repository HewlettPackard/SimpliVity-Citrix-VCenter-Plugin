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
public class ComputeResourceSummary
    extends DynamicData
{

    public int totalCpu;
    public long totalMemory;
    public short numCpuCores;
    public short numCpuThreads;
    public int effectiveCpu;
    public long effectiveMemory;
    public int numHosts;
    public int numEffectiveHosts;
    public ManagedEntityStatus overallStatus;

    public int getTotalCpu() {
        return totalCpu;
    }

    public void setTotalCpu(int totalCpu) {
        this.totalCpu = totalCpu;
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(long totalMemory) {
        this.totalMemory = totalMemory;
    }

    public short getNumCpuCores() {
        return numCpuCores;
    }

    public void setNumCpuCores(short numCpuCores) {
        this.numCpuCores = numCpuCores;
    }

    public short getNumCpuThreads() {
        return numCpuThreads;
    }

    public void setNumCpuThreads(short numCpuThreads) {
        this.numCpuThreads = numCpuThreads;
    }

    public int getEffectiveCpu() {
        return effectiveCpu;
    }

    public void setEffectiveCpu(int effectiveCpu) {
        this.effectiveCpu = effectiveCpu;
    }

    public long getEffectiveMemory() {
        return effectiveMemory;
    }

    public void setEffectiveMemory(long effectiveMemory) {
        this.effectiveMemory = effectiveMemory;
    }

    public int getNumHosts() {
        return numHosts;
    }

    public void setNumHosts(int numHosts) {
        this.numHosts = numHosts;
    }

    public int getNumEffectiveHosts() {
        return numEffectiveHosts;
    }

    public void setNumEffectiveHosts(int numEffectiveHosts) {
        this.numEffectiveHosts = numEffectiveHosts;
    }

    public ManagedEntityStatus getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(ManagedEntityStatus overallStatus) {
        this.overallStatus = overallStatus;
    }

}