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
public class AuthorizationPrivilege
    extends DynamicData
{

    public String privId;
    public boolean onParent;
    public String name;
    public String privGroupName;

    public String getPrivId() {
        return privId;
    }

    public void setPrivId(String privId) {
        this.privId = privId;
    }

    public boolean getOnParent() {
        return onParent;
    }

    public void setOnParent(boolean onParent) {
        this.onParent = onParent;
    }

    public boolean isOnParent() {
        return onParent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrivGroupName() {
        return privGroupName;
    }

    public void setPrivGroupName(String privGroupName) {
        this.privGroupName = privGroupName;
    }

}