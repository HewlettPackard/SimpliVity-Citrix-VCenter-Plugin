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
public class FcoeConfigVlanRange
    extends DynamicData
{

    public int vlanLow;
    public int vlanHigh;

    public int getVlanLow() {
        return vlanLow;
    }

    public void setVlanLow(int vlanLow) {
        this.vlanLow = vlanLow;
    }

    public int getVlanHigh() {
        return vlanHigh;
    }

    public void setVlanHigh(int vlanHigh) {
        this.vlanHigh = vlanHigh;
    }

}
