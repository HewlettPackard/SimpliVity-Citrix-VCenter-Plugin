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
public class VsanHostVsanDiskInfo
    extends DynamicData
{

    public String vsanUuid;
    public int formatVersion;

    public String getVsanUuid() {
        return vsanUuid;
    }

    public void setVsanUuid(String vsanUuid) {
        this.vsanUuid = vsanUuid;
    }

    public int getFormatVersion() {
        return formatVersion;
    }

    public void setFormatVersion(int formatVersion) {
        this.formatVersion = formatVersion;
    }

}
