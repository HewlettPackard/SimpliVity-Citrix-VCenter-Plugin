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
public class VMwareDvsLacpCapability
    extends DynamicData
{

    public Boolean lacpSupported;
    public Boolean multiLacpGroupSupported;

    public Boolean getLacpSupported() {
        return lacpSupported;
    }

    public void setLacpSupported(Boolean lacpSupported) {
        this.lacpSupported = lacpSupported;
    }

    public Boolean isLacpSupported() {
        return lacpSupported;
    }

    public Boolean getMultiLacpGroupSupported() {
        return multiLacpGroupSupported;
    }

    public void setMultiLacpGroupSupported(Boolean multiLacpGroupSupported) {
        this.multiLacpGroupSupported = multiLacpGroupSupported;
    }

    public Boolean isMultiLacpGroupSupported() {
        return multiLacpGroupSupported;
    }

}
