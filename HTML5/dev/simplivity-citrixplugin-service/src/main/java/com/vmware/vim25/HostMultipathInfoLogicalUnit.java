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
public class HostMultipathInfoLogicalUnit
    extends DynamicData
{

    public String key;
    public String id;
    public String lun;
    private final static HostMultipathInfoPath[] NULL_PATH_ARRAY = new HostMultipathInfoPath[ 0 ] ;
    public HostMultipathInfoPath[] path;
    public HostMultipathInfoLogicalUnitPolicy policy;
    public HostMultipathInfoLogicalUnitStorageArrayTypePolicy storageArrayTypePolicy;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLun() {
        return lun;
    }

    public void setLun(String lun) {
        this.lun = lun;
    }

    public HostMultipathInfoPath[] getPath() {
        if ((path) == null) {
            return (NULL_PATH_ARRAY);
        }
        return path;
    }

    public void setPath(HostMultipathInfoPath[] path) {
        this.path = path;
    }

    public HostMultipathInfoLogicalUnitPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(HostMultipathInfoLogicalUnitPolicy policy) {
        this.policy = policy;
    }

    public HostMultipathInfoLogicalUnitStorageArrayTypePolicy getStorageArrayTypePolicy() {
        return storageArrayTypePolicy;
    }

    public void setStorageArrayTypePolicy(HostMultipathInfoLogicalUnitStorageArrayTypePolicy storageArrayTypePolicy) {
        this.storageArrayTypePolicy = storageArrayTypePolicy;
    }

}
