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
public class HostPciPassthruConfig
    extends DynamicData
{

    public String id;
    public boolean passthruEnabled;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getPassthruEnabled() {
        return passthruEnabled;
    }

    public void setPassthruEnabled(boolean passthruEnabled) {
        this.passthruEnabled = passthruEnabled;
    }

    public boolean isPassthruEnabled() {
        return passthruEnabled;
    }

}
