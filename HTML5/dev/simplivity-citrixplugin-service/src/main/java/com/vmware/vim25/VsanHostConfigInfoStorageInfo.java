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
public class VsanHostConfigInfoStorageInfo
    extends DynamicData
{

    public Boolean autoClaimStorage;
    private final static VsanHostDiskMapping[] NULL_DISK_MAPPING_ARRAY = new VsanHostDiskMapping[ 0 ] ;
    public VsanHostDiskMapping[] diskMapping;
    private final static VsanHostDiskMapInfo[] NULL_DISK_MAP_INFO_ARRAY = new VsanHostDiskMapInfo[ 0 ] ;
    public VsanHostDiskMapInfo[] diskMapInfo;
    public Boolean checksumEnabled;

    public Boolean getAutoClaimStorage() {
        return autoClaimStorage;
    }

    public void setAutoClaimStorage(Boolean autoClaimStorage) {
        this.autoClaimStorage = autoClaimStorage;
    }

    public Boolean isAutoClaimStorage() {
        return autoClaimStorage;
    }

    public VsanHostDiskMapping[] getDiskMapping() {
        if ((diskMapping) == null) {
            return (NULL_DISK_MAPPING_ARRAY);
        }
        return diskMapping;
    }

    public void setDiskMapping(VsanHostDiskMapping[] diskMapping) {
        this.diskMapping = diskMapping;
    }

    public VsanHostDiskMapInfo[] getDiskMapInfo() {
        if ((diskMapInfo) == null) {
            return (NULL_DISK_MAP_INFO_ARRAY);
        }
        return diskMapInfo;
    }

    public void setDiskMapInfo(VsanHostDiskMapInfo[] diskMapInfo) {
        this.diskMapInfo = diskMapInfo;
    }

    public Boolean getChecksumEnabled() {
        return checksumEnabled;
    }

    public void setChecksumEnabled(Boolean checksumEnabled) {
        this.checksumEnabled = checksumEnabled;
    }

    public Boolean isChecksumEnabled() {
        return checksumEnabled;
    }

}
