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
public class VmMacChangedEvent
    extends VmEvent
{

    public String adapter;
    public String oldMac;
    public String newMac;

    public String getAdapter() {
        return adapter;
    }

    public void setAdapter(String adapter) {
        this.adapter = adapter;
    }

    public String getOldMac() {
        return oldMac;
    }

    public void setOldMac(String oldMac) {
        this.oldMac = oldMac;
    }

    public String getNewMac() {
        return newMac;
    }

    public void setNewMac(String newMac) {
        this.newMac = newMac;
    }

}
