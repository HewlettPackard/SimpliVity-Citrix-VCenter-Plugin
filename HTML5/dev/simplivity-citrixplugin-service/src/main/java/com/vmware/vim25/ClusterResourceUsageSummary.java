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
public class ClusterResourceUsageSummary
    extends DynamicData
{

    public int cpuUsedMHz;
    public int cpuCapacityMHz;
    public int memUsedMB;
    public int memCapacityMB;
    public Long pMemAvailableMB;
    public Long pMemCapacityMB;
    public long storageUsedMB;
    public long storageCapacityMB;

    public int getCpuUsedMHz() {
        return cpuUsedMHz;
    }

    public void setCpuUsedMHz(int cpuUsedMHz) {
        this.cpuUsedMHz = cpuUsedMHz;
    }

    public int getCpuCapacityMHz() {
        return cpuCapacityMHz;
    }

    public void setCpuCapacityMHz(int cpuCapacityMHz) {
        this.cpuCapacityMHz = cpuCapacityMHz;
    }

    public int getMemUsedMB() {
        return memUsedMB;
    }

    public void setMemUsedMB(int memUsedMB) {
        this.memUsedMB = memUsedMB;
    }

    public int getMemCapacityMB() {
        return memCapacityMB;
    }

    public void setMemCapacityMB(int memCapacityMB) {
        this.memCapacityMB = memCapacityMB;
    }

    public Long getPMemAvailableMB() {
        return pMemAvailableMB;
    }

    public void setPMemAvailableMB(Long pMemAvailableMB) {
        this.pMemAvailableMB = pMemAvailableMB;
    }

    public Long getPMemCapacityMB() {
        return pMemCapacityMB;
    }

    public void setPMemCapacityMB(Long pMemCapacityMB) {
        this.pMemCapacityMB = pMemCapacityMB;
    }

    public long getStorageUsedMB() {
        return storageUsedMB;
    }

    public void setStorageUsedMB(long storageUsedMB) {
        this.storageUsedMB = storageUsedMB;
    }

    public long getStorageCapacityMB() {
        return storageCapacityMB;
    }

    public void setStorageCapacityMB(long storageCapacityMB) {
        this.storageCapacityMB = storageCapacityMB;
    }

}