//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import com.vmware.vim25.DynamicData;


/**
 * 
 */
@SuppressWarnings("all")
public class StorageLun
    extends DynamicData
{

    public String uuid;
    public String vSphereLunIdentifier;
    public String vendorDisplayName;
    public long capacityInMB;
    public long usedSpaceInMB;
    public boolean lunThinProvisioned;
    private final static String[] NULL_ALTERNATE_IDENTIFIER_ARRAY = new String[ 0 ] ;
    public String[] alternateIdentifier;
    public boolean drsManagementPermitted;
    public String thinProvisioningStatus;
    public BackingConfig backingConfig;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getVSphereLunIdentifier() {
        return vSphereLunIdentifier;
    }

    public void setVSphereLunIdentifier(String vSphereLunIdentifier) {
        this.vSphereLunIdentifier = vSphereLunIdentifier;
    }

    public String getVendorDisplayName() {
        return vendorDisplayName;
    }

    public void setVendorDisplayName(String vendorDisplayName) {
        this.vendorDisplayName = vendorDisplayName;
    }

    public long getCapacityInMB() {
        return capacityInMB;
    }

    public void setCapacityInMB(long capacityInMB) {
        this.capacityInMB = capacityInMB;
    }

    public long getUsedSpaceInMB() {
        return usedSpaceInMB;
    }

    public void setUsedSpaceInMB(long usedSpaceInMB) {
        this.usedSpaceInMB = usedSpaceInMB;
    }

    public boolean getLunThinProvisioned() {
        return lunThinProvisioned;
    }

    public void setLunThinProvisioned(boolean lunThinProvisioned) {
        this.lunThinProvisioned = lunThinProvisioned;
    }

    public boolean isLunThinProvisioned() {
        return lunThinProvisioned;
    }

    public String[] getAlternateIdentifier() {
        if ((alternateIdentifier) == null) {
            return (NULL_ALTERNATE_IDENTIFIER_ARRAY);
        }
        return alternateIdentifier;
    }

    public void setAlternateIdentifier(String[] alternateIdentifier) {
        this.alternateIdentifier = alternateIdentifier;
    }

    public boolean getDrsManagementPermitted() {
        return drsManagementPermitted;
    }

    public void setDrsManagementPermitted(boolean drsManagementPermitted) {
        this.drsManagementPermitted = drsManagementPermitted;
    }

    public boolean isDrsManagementPermitted() {
        return drsManagementPermitted;
    }

    public String getThinProvisioningStatus() {
        return thinProvisioningStatus;
    }

    public void setThinProvisioningStatus(String thinProvisioningStatus) {
        this.thinProvisioningStatus = thinProvisioningStatus;
    }

    public BackingConfig getBackingConfig() {
        return backingConfig;
    }

    public void setBackingConfig(BackingConfig backingConfig) {
        this.backingConfig = backingConfig;
    }

}