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
public class EntityBackupConfig
    extends DynamicData
{

    public String entityType;
    private final static byte[] NULL_CONFIG_BLOB_ARRAY = new byte[ 0 ] ;
    public byte[] configBlob;
    public String key;
    public String name;
    public ManagedObjectReference container;
    public String configVersion;

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public byte[] getConfigBlob() {
        if ((configBlob) == null) {
            return (NULL_CONFIG_BLOB_ARRAY);
        }
        return configBlob;
    }

    public void setConfigBlob(byte[] configBlob) {
        this.configBlob = configBlob;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ManagedObjectReference getContainer() {
        return container;
    }

    public void setContainer(ManagedObjectReference container) {
        this.container = container;
    }

    public String getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

}