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
public class ArrayOfEntityBackupConfig {

    private final static com.vmware.vim25.EntityBackupConfig[] NULL_ENTITY_BACKUP_CONFIG_ARRAY = new com.vmware.vim25.EntityBackupConfig[ 0 ] ;
    public com.vmware.vim25.EntityBackupConfig[] EntityBackupConfig;

    public com.vmware.vim25.EntityBackupConfig[] getEntityBackupConfig() {
        if ((EntityBackupConfig) == null) {
            return (NULL_ENTITY_BACKUP_CONFIG_ARRAY);
        }
        return EntityBackupConfig;
    }

    public void setEntityBackupConfig(com.vmware.vim25.EntityBackupConfig[] EntityBackupConfig) {
        this.EntityBackupConfig = EntityBackupConfig;
    }

}
