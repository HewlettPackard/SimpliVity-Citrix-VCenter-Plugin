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
public class VspanPortConflict
    extends DvsFault
{

    public String vspanSessionKey1;
    public String vspanSessionKey2;
    public String portKey;

    public String getVspanSessionKey1() {
        return vspanSessionKey1;
    }

    public void setVspanSessionKey1(String vspanSessionKey1) {
        this.vspanSessionKey1 = vspanSessionKey1;
    }

    public String getVspanSessionKey2() {
        return vspanSessionKey2;
    }

    public void setVspanSessionKey2(String vspanSessionKey2) {
        this.vspanSessionKey2 = vspanSessionKey2;
    }

    public String getPortKey() {
        return portKey;
    }

    public void setPortKey(String portKey) {
        this.portKey = portKey;
    }

}
