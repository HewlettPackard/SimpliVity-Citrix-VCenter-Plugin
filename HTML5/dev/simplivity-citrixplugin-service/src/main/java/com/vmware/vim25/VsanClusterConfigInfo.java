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
public class VsanClusterConfigInfo
    extends DynamicData
{

    public Boolean enabled;
    public VsanClusterConfigInfoHostDefaultInfo defaultConfig;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public VsanClusterConfigInfoHostDefaultInfo getDefaultConfig() {
        return defaultConfig;
    }

    public void setDefaultConfig(VsanClusterConfigInfoHostDefaultInfo defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

}
