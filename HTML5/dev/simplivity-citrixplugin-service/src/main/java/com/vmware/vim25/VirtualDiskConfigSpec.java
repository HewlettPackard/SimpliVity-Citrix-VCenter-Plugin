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
public class VirtualDiskConfigSpec
    extends VirtualDeviceConfigSpec
{

    public String diskMoveType;
    public Boolean migrateCache;

    public String getDiskMoveType() {
        return diskMoveType;
    }

    public void setDiskMoveType(String diskMoveType) {
        this.diskMoveType = diskMoveType;
    }

    public Boolean getMigrateCache() {
        return migrateCache;
    }

    public void setMigrateCache(Boolean migrateCache) {
        this.migrateCache = migrateCache;
    }

    public Boolean isMigrateCache() {
        return migrateCache;
    }

}
