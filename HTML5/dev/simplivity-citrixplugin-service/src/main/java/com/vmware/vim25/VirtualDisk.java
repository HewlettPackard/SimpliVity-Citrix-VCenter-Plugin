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
public class VirtualDisk
    extends VirtualDevice
{

    public long capacityInKB;
    public Long capacityInBytes;
    public SharesInfo shares;
    public StorageIOAllocationInfo storageIOAllocation;
    public String diskObjectId;
    public VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo;
    private final static String[] NULL_IOFILTER_ARRAY = new String[ 0 ] ;
    public String[] iofilter;
    public ID vDiskId;
    public Boolean nativeUnmanagedLinkedClone;

    public long getCapacityInKB() {
        return capacityInKB;
    }

    public void setCapacityInKB(long capacityInKB) {
        this.capacityInKB = capacityInKB;
    }

    public Long getCapacityInBytes() {
        return capacityInBytes;
    }

    public void setCapacityInBytes(Long capacityInBytes) {
        this.capacityInBytes = capacityInBytes;
    }

    public SharesInfo getShares() {
        return shares;
    }

    public void setShares(SharesInfo shares) {
        this.shares = shares;
    }

    public StorageIOAllocationInfo getStorageIOAllocation() {
        return storageIOAllocation;
    }

    public void setStorageIOAllocation(StorageIOAllocationInfo storageIOAllocation) {
        this.storageIOAllocation = storageIOAllocation;
    }

    public String getDiskObjectId() {
        return diskObjectId;
    }

    public void setDiskObjectId(String diskObjectId) {
        this.diskObjectId = diskObjectId;
    }

    public VirtualDiskVFlashCacheConfigInfo getVFlashCacheConfigInfo() {
        return vFlashCacheConfigInfo;
    }

    public void setVFlashCacheConfigInfo(VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo) {
        this.vFlashCacheConfigInfo = vFlashCacheConfigInfo;
    }

    public String[] getIofilter() {
        if ((iofilter) == null) {
            return (NULL_IOFILTER_ARRAY);
        }
        return iofilter;
    }

    public void setIofilter(String[] iofilter) {
        this.iofilter = iofilter;
    }

    public ID getVDiskId() {
        return vDiskId;
    }

    public void setVDiskId(ID vDiskId) {
        this.vDiskId = vDiskId;
    }

    public Boolean getNativeUnmanagedLinkedClone() {
        return nativeUnmanagedLinkedClone;
    }

    public void setNativeUnmanagedLinkedClone(Boolean nativeUnmanagedLinkedClone) {
        this.nativeUnmanagedLinkedClone = nativeUnmanagedLinkedClone;
    }

    public Boolean isNativeUnmanagedLinkedClone() {
        return nativeUnmanagedLinkedClone;
    }

}