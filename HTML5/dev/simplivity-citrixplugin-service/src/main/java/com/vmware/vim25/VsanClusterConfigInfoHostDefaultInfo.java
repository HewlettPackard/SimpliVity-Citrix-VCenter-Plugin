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
public class VsanClusterConfigInfoHostDefaultInfo
    extends DynamicData
{

    public String uuid;
    public Boolean autoClaimStorage;
    public Boolean checksumEnabled;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Boolean getAutoClaimStorage() {
        return autoClaimStorage;
    }

    public void setAutoClaimStorage(Boolean autoClaimStorage) {
        this.autoClaimStorage = autoClaimStorage;
    }

    public Boolean isAutoClaimStorage() {
        return autoClaimStorage;
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
