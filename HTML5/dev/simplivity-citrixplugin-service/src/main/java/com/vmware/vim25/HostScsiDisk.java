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
public class HostScsiDisk
    extends ScsiLun
{

    public HostDiskDimensionsLba capacity;
    public String devicePath;
    public Boolean ssd;
    public Boolean localDisk;
    private final static String[] NULL_PHYSICAL_LOCATION_ARRAY = new String[ 0 ] ;
    public String[] physicalLocation;
    public Boolean emulatedDIXDIFEnabled;
    public VsanHostVsanDiskInfo vsanDiskInfo;
    public String scsiDiskType;

    public HostDiskDimensionsLba getCapacity() {
        return capacity;
    }

    public void setCapacity(HostDiskDimensionsLba capacity) {
        this.capacity = capacity;
    }

    public String getDevicePath() {
        return devicePath;
    }

    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    public Boolean getSsd() {
        return ssd;
    }

    public void setSsd(Boolean ssd) {
        this.ssd = ssd;
    }

    public Boolean isSsd() {
        return ssd;
    }

    public Boolean getLocalDisk() {
        return localDisk;
    }

    public void setLocalDisk(Boolean localDisk) {
        this.localDisk = localDisk;
    }

    public Boolean isLocalDisk() {
        return localDisk;
    }

    public String[] getPhysicalLocation() {
        if ((physicalLocation) == null) {
            return (NULL_PHYSICAL_LOCATION_ARRAY);
        }
        return physicalLocation;
    }

    public void setPhysicalLocation(String[] physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    public Boolean getEmulatedDIXDIFEnabled() {
        return emulatedDIXDIFEnabled;
    }

    public void setEmulatedDIXDIFEnabled(Boolean emulatedDIXDIFEnabled) {
        this.emulatedDIXDIFEnabled = emulatedDIXDIFEnabled;
    }

    public Boolean isEmulatedDIXDIFEnabled() {
        return emulatedDIXDIFEnabled;
    }

    public VsanHostVsanDiskInfo getVsanDiskInfo() {
        return vsanDiskInfo;
    }

    public void setVsanDiskInfo(VsanHostVsanDiskInfo vsanDiskInfo) {
        this.vsanDiskInfo = vsanDiskInfo;
    }

    public String getScsiDiskType() {
        return scsiDiskType;
    }

    public void setScsiDiskType(String scsiDiskType) {
        this.scsiDiskType = scsiDiskType;
    }

}
