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
public class HostVmfsSpec
    extends DynamicData
{

    public HostScsiDiskPartition extent;
    public Integer blockSizeMb;
    public int majorVersion;
    public String volumeName;
    public Integer blockSize;
    public Integer unmapGranularity;
    public String unmapPriority;
    public VmfsUnmapBandwidthSpec unmapBandwidthSpec;

    public HostScsiDiskPartition getExtent() {
        return extent;
    }

    public void setExtent(HostScsiDiskPartition extent) {
        this.extent = extent;
    }

    public Integer getBlockSizeMb() {
        return blockSizeMb;
    }

    public void setBlockSizeMb(Integer blockSizeMb) {
        this.blockSizeMb = blockSizeMb;
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public Integer getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    public Integer getUnmapGranularity() {
        return unmapGranularity;
    }

    public void setUnmapGranularity(Integer unmapGranularity) {
        this.unmapGranularity = unmapGranularity;
    }

    public String getUnmapPriority() {
        return unmapPriority;
    }

    public void setUnmapPriority(String unmapPriority) {
        this.unmapPriority = unmapPriority;
    }

    public VmfsUnmapBandwidthSpec getUnmapBandwidthSpec() {
        return unmapBandwidthSpec;
    }

    public void setUnmapBandwidthSpec(VmfsUnmapBandwidthSpec unmapBandwidthSpec) {
        this.unmapBandwidthSpec = unmapBandwidthSpec;
    }

}
