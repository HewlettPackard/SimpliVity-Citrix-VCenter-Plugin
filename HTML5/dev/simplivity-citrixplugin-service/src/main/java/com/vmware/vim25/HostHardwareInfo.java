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
public class HostHardwareInfo
    extends DynamicData
{

    public HostSystemInfo systemInfo;
    public HostCpuPowerManagementInfo cpuPowerManagementInfo;
    public HostCpuInfo cpuInfo;
    private final static HostCpuPackage[] NULL_CPU_PKG_ARRAY = new HostCpuPackage[ 0 ] ;
    public HostCpuPackage[] cpuPkg;
    public long memorySize;
    public HostNumaInfo numaInfo;
    public Boolean smcPresent;
    private final static HostPciDevice[] NULL_PCI_DEVICE_ARRAY = new HostPciDevice[ 0 ] ;
    public HostPciDevice[] pciDevice;
    private final static HostCpuIdInfo[] NULL_CPU_FEATURE_ARRAY = new HostCpuIdInfo[ 0 ] ;
    public HostCpuIdInfo[] cpuFeature;
    public HostBIOSInfo biosInfo;
    public HostReliableMemoryInfo reliableMemoryInfo;
    public HostPersistentMemoryInfo persistentMemoryInfo;

    public HostSystemInfo getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(HostSystemInfo systemInfo) {
        this.systemInfo = systemInfo;
    }

    public HostCpuPowerManagementInfo getCpuPowerManagementInfo() {
        return cpuPowerManagementInfo;
    }

    public void setCpuPowerManagementInfo(HostCpuPowerManagementInfo cpuPowerManagementInfo) {
        this.cpuPowerManagementInfo = cpuPowerManagementInfo;
    }

    public HostCpuInfo getCpuInfo() {
        return cpuInfo;
    }

    public void setCpuInfo(HostCpuInfo cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public HostCpuPackage[] getCpuPkg() {
        if ((cpuPkg) == null) {
            return (NULL_CPU_PKG_ARRAY);
        }
        return cpuPkg;
    }

    public void setCpuPkg(HostCpuPackage[] cpuPkg) {
        this.cpuPkg = cpuPkg;
    }

    public long getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(long memorySize) {
        this.memorySize = memorySize;
    }

    public HostNumaInfo getNumaInfo() {
        return numaInfo;
    }

    public void setNumaInfo(HostNumaInfo numaInfo) {
        this.numaInfo = numaInfo;
    }

    public Boolean getSmcPresent() {
        return smcPresent;
    }

    public void setSmcPresent(Boolean smcPresent) {
        this.smcPresent = smcPresent;
    }

    public Boolean isSmcPresent() {
        return smcPresent;
    }

    public HostPciDevice[] getPciDevice() {
        if ((pciDevice) == null) {
            return (NULL_PCI_DEVICE_ARRAY);
        }
        return pciDevice;
    }

    public void setPciDevice(HostPciDevice[] pciDevice) {
        this.pciDevice = pciDevice;
    }

    public HostCpuIdInfo[] getCpuFeature() {
        if ((cpuFeature) == null) {
            return (NULL_CPU_FEATURE_ARRAY);
        }
        return cpuFeature;
    }

    public void setCpuFeature(HostCpuIdInfo[] cpuFeature) {
        this.cpuFeature = cpuFeature;
    }

    public HostBIOSInfo getBiosInfo() {
        return biosInfo;
    }

    public void setBiosInfo(HostBIOSInfo biosInfo) {
        this.biosInfo = biosInfo;
    }

    public HostReliableMemoryInfo getReliableMemoryInfo() {
        return reliableMemoryInfo;
    }

    public void setReliableMemoryInfo(HostReliableMemoryInfo reliableMemoryInfo) {
        this.reliableMemoryInfo = reliableMemoryInfo;
    }

    public HostPersistentMemoryInfo getPersistentMemoryInfo() {
        return persistentMemoryInfo;
    }

    public void setPersistentMemoryInfo(HostPersistentMemoryInfo persistentMemoryInfo) {
        this.persistentMemoryInfo = persistentMemoryInfo;
    }

}
