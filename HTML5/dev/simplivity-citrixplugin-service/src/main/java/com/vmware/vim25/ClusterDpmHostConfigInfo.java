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
public class ClusterDpmHostConfigInfo
    extends DynamicData
{

    public ManagedObjectReference key;
    public Boolean enabled;
    public DpmBehavior behavior;

    public ManagedObjectReference getKey() {
        return key;
    }

    public void setKey(ManagedObjectReference key) {
        this.key = key;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public DpmBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(DpmBehavior behavior) {
        this.behavior = behavior;
    }

}