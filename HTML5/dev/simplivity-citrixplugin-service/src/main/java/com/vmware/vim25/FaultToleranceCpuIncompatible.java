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
public class FaultToleranceCpuIncompatible
    extends CpuIncompatible
{

    public boolean model;
    public boolean family;
    public boolean stepping;

    public boolean getModel() {
        return model;
    }

    public void setModel(boolean model) {
        this.model = model;
    }

    public boolean isModel() {
        return model;
    }

    public boolean getFamily() {
        return family;
    }

    public void setFamily(boolean family) {
        this.family = family;
    }

    public boolean isFamily() {
        return family;
    }

    public boolean getStepping() {
        return stepping;
    }

    public void setStepping(boolean stepping) {
        this.stepping = stepping;
    }

    public boolean isStepping() {
        return stepping;
    }

}
