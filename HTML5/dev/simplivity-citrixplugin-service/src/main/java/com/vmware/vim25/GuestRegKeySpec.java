//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;

import java.util.Calendar;


/**
 * 
 */
@SuppressWarnings("all")
public class GuestRegKeySpec
    extends DynamicData
{

    public GuestRegKeyNameSpec keyName;
    public String classType;
    public Calendar lastWritten;

    public GuestRegKeyNameSpec getKeyName() {
        return keyName;
    }

    public void setKeyName(GuestRegKeyNameSpec keyName) {
        this.keyName = keyName;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Calendar getLastWritten() {
        return lastWritten;
    }

    public void setLastWritten(Calendar lastWritten) {
        this.lastWritten = lastWritten;
    }

}
