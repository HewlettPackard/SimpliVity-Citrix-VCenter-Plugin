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
public class NetDhcpConfigInfoDhcpOptions
    extends DynamicData
{

    public boolean enable;
    private final static KeyValue[] NULL_CONFIG_ARRAY = new KeyValue[ 0 ] ;
    public KeyValue[] config;

    public boolean getEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isEnable() {
        return enable;
    }

    public KeyValue[] getConfig() {
        if ((config) == null) {
            return (NULL_CONFIG_ARRAY);
        }
        return config;
    }

    public void setConfig(KeyValue[] config) {
        this.config = config;
    }

}