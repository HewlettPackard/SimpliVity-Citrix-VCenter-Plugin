//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;

import java.util.Calendar;


/**
 * 
 */
public class HostBIOSInfo
    extends DynamicData
{

    public String biosVersion;
    public Calendar releaseDate;
    public String vendor;
    public Integer majorRelease;
    public Integer minorRelease;
    public Integer firmwareMajorRelease;
    public Integer firmwareMinorRelease;

    public String getBiosVersion() {
        return biosVersion;
    }

    public void setBiosVersion(String biosVersion) {
        this.biosVersion = biosVersion;
    }

    public Calendar getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Calendar releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Integer getMajorRelease() {
        return majorRelease;
    }

    public void setMajorRelease(Integer majorRelease) {
        this.majorRelease = majorRelease;
    }

    public Integer getMinorRelease() {
        return minorRelease;
    }

    public void setMinorRelease(Integer minorRelease) {
        this.minorRelease = minorRelease;
    }

    public Integer getFirmwareMajorRelease() {
        return firmwareMajorRelease;
    }

    public void setFirmwareMajorRelease(Integer firmwareMajorRelease) {
        this.firmwareMajorRelease = firmwareMajorRelease;
    }

    public Integer getFirmwareMinorRelease() {
        return firmwareMinorRelease;
    }

    public void setFirmwareMinorRelease(Integer firmwareMinorRelease) {
        this.firmwareMinorRelease = firmwareMinorRelease;
    }

}
