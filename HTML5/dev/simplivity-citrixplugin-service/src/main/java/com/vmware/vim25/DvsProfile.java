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
public class DvsProfile
    extends ApplyProfile
{

    public String key;
    public String name;
    private final static PnicUplinkProfile[] NULL_UPLINK_ARRAY = new PnicUplinkProfile[ 0 ] ;
    public PnicUplinkProfile[] uplink;

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

    public PnicUplinkProfile[] getUplink() {
        if ((uplink) == null) {
            return (NULL_UPLINK_ARRAY);
        }
        return uplink;
    }

    public void setUplink(PnicUplinkProfile[] uplink) {
        this.uplink = uplink;
    }

}
