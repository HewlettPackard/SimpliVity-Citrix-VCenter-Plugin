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
public class DVSSecurityPolicy
    extends InheritablePolicy
{

    public BoolPolicy allowPromiscuous;
    public BoolPolicy macChanges;
    public BoolPolicy forgedTransmits;

    public BoolPolicy getAllowPromiscuous() {
        return allowPromiscuous;
    }

    public void setAllowPromiscuous(BoolPolicy allowPromiscuous) {
        this.allowPromiscuous = allowPromiscuous;
    }

    public BoolPolicy getMacChanges() {
        return macChanges;
    }

    public void setMacChanges(BoolPolicy macChanges) {
        this.macChanges = macChanges;
    }

    public BoolPolicy getForgedTransmits() {
        return forgedTransmits;
    }

    public void setForgedTransmits(BoolPolicy forgedTransmits) {
        this.forgedTransmits = forgedTransmits;
    }

}
