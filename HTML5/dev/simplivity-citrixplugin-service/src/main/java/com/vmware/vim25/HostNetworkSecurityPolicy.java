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
public class HostNetworkSecurityPolicy
    extends DynamicData
{

    public Boolean allowPromiscuous;
    public Boolean macChanges;
    public Boolean forgedTransmits;

    public Boolean getAllowPromiscuous() {
        return allowPromiscuous;
    }

    public void setAllowPromiscuous(Boolean allowPromiscuous) {
        this.allowPromiscuous = allowPromiscuous;
    }

    public Boolean isAllowPromiscuous() {
        return allowPromiscuous;
    }

    public Boolean getMacChanges() {
        return macChanges;
    }

    public void setMacChanges(Boolean macChanges) {
        this.macChanges = macChanges;
    }

    public Boolean isMacChanges() {
        return macChanges;
    }

    public Boolean getForgedTransmits() {
        return forgedTransmits;
    }

    public void setForgedTransmits(Boolean forgedTransmits) {
        this.forgedTransmits = forgedTransmits;
    }

    public Boolean isForgedTransmits() {
        return forgedTransmits;
    }

}