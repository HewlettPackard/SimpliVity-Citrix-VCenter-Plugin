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
public class VAppConfigSpec
    extends VmConfigSpec
{

    private final static VAppEntityConfigInfo[] NULL_ENTITY_CONFIG_ARRAY = new VAppEntityConfigInfo[ 0 ] ;
    public VAppEntityConfigInfo[] entityConfig;
    public String annotation;
    public String instanceUuid;
    public ManagedByInfo managedBy;

    public VAppEntityConfigInfo[] getEntityConfig() {
        if ((entityConfig) == null) {
            return (NULL_ENTITY_CONFIG_ARRAY);
        }
        return entityConfig;
    }

    public void setEntityConfig(VAppEntityConfigInfo[] entityConfig) {
        this.entityConfig = entityConfig;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getInstanceUuid() {
        return instanceUuid;
    }

    public void setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public ManagedByInfo getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(ManagedByInfo managedBy) {
        this.managedBy = managedBy;
    }

}
