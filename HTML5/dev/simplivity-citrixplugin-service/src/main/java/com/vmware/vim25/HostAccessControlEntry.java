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
public class HostAccessControlEntry
    extends DynamicData
{

    public String principal;
    public boolean group;
    public HostAccessMode accessMode;

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public boolean getGroup() {
        return group;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public boolean isGroup() {
        return group;
    }

    public HostAccessMode getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(HostAccessMode accessMode) {
        this.accessMode = accessMode;
    }

}
