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
public class HostSystemResourceInfo
    extends DynamicData
{

    public String key;
    public ResourceConfigSpec config;
    private final static HostSystemResourceInfo[] NULL_CHILD_ARRAY = new HostSystemResourceInfo[ 0 ] ;
    public HostSystemResourceInfo[] child;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ResourceConfigSpec getConfig() {
        return config;
    }

    public void setConfig(ResourceConfigSpec config) {
        this.config = config;
    }

    public HostSystemResourceInfo[] getChild() {
        if ((child) == null) {
            return (NULL_CHILD_ARRAY);
        }
        return child;
    }

    public void setChild(HostSystemResourceInfo[] child) {
        this.child = child;
    }

}
