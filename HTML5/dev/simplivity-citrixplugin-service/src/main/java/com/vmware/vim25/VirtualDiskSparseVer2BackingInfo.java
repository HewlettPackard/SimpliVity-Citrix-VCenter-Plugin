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
public class VirtualDiskSparseVer2BackingInfo
    extends VirtualDeviceFileBackingInfo
{

    public String diskMode;
    public Boolean split;
    public Boolean writeThrough;
    public Long spaceUsedInKB;
    public String uuid;
    public String contentId;
    public String changeId;
    public VirtualDiskSparseVer2BackingInfo parent;
    public CryptoKeyId keyId;

    public String getDiskMode() {
        return diskMode;
    }

    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public Boolean getSplit() {
        return split;
    }

    public void setSplit(Boolean split) {
        this.split = split;
    }

    public Boolean isSplit() {
        return split;
    }

    public Boolean getWriteThrough() {
        return writeThrough;
    }

    public void setWriteThrough(Boolean writeThrough) {
        this.writeThrough = writeThrough;
    }

    public Boolean isWriteThrough() {
        return writeThrough;
    }

    public Long getSpaceUsedInKB() {
        return spaceUsedInKB;
    }

    public void setSpaceUsedInKB(Long spaceUsedInKB) {
        this.spaceUsedInKB = spaceUsedInKB;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getChangeId() {
        return changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    public VirtualDiskSparseVer2BackingInfo getParent() {
        return parent;
    }

    public void setParent(VirtualDiskSparseVer2BackingInfo parent) {
        this.parent = parent;
    }

    public CryptoKeyId getKeyId() {
        return keyId;
    }

    public void setKeyId(CryptoKeyId keyId) {
        this.keyId = keyId;
    }

}
