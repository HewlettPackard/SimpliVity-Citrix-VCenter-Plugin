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
public class VsanPolicyCost
    extends DynamicData
{

    public Long changeDataSize;
    public Long currentDataSize;
    public Long tempDataSize;
    public Long copyDataSize;
    public Long changeFlashReadCacheSize;
    public Long currentFlashReadCacheSize;
    public Float currentDiskSpaceToAddressSpaceRatio;
    public Float diskSpaceToAddressSpaceRatio;

    public Long getChangeDataSize() {
        return changeDataSize;
    }

    public void setChangeDataSize(Long changeDataSize) {
        this.changeDataSize = changeDataSize;
    }

    public Long getCurrentDataSize() {
        return currentDataSize;
    }

    public void setCurrentDataSize(Long currentDataSize) {
        this.currentDataSize = currentDataSize;
    }

    public Long getTempDataSize() {
        return tempDataSize;
    }

    public void setTempDataSize(Long tempDataSize) {
        this.tempDataSize = tempDataSize;
    }

    public Long getCopyDataSize() {
        return copyDataSize;
    }

    public void setCopyDataSize(Long copyDataSize) {
        this.copyDataSize = copyDataSize;
    }

    public Long getChangeFlashReadCacheSize() {
        return changeFlashReadCacheSize;
    }

    public void setChangeFlashReadCacheSize(Long changeFlashReadCacheSize) {
        this.changeFlashReadCacheSize = changeFlashReadCacheSize;
    }

    public Long getCurrentFlashReadCacheSize() {
        return currentFlashReadCacheSize;
    }

    public void setCurrentFlashReadCacheSize(Long currentFlashReadCacheSize) {
        this.currentFlashReadCacheSize = currentFlashReadCacheSize;
    }

    public Float getCurrentDiskSpaceToAddressSpaceRatio() {
        return currentDiskSpaceToAddressSpaceRatio;
    }

    public void setCurrentDiskSpaceToAddressSpaceRatio(Float currentDiskSpaceToAddressSpaceRatio) {
        this.currentDiskSpaceToAddressSpaceRatio = currentDiskSpaceToAddressSpaceRatio;
    }

    public Float getDiskSpaceToAddressSpaceRatio() {
        return diskSpaceToAddressSpaceRatio;
    }

    public void setDiskSpaceToAddressSpaceRatio(Float diskSpaceToAddressSpaceRatio) {
        this.diskSpaceToAddressSpaceRatio = diskSpaceToAddressSpaceRatio;
    }

}
