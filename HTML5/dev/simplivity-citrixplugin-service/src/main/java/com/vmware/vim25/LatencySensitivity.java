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
public class LatencySensitivity
    extends DynamicData
{

    public LatencySensitivitySensitivityLevel level;
    public Integer sensitivity;

    public LatencySensitivitySensitivityLevel getLevel() {
        return level;
    }

    public void setLevel(LatencySensitivitySensitivityLevel level) {
        this.level = level;
    }

    public Integer getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(Integer sensitivity) {
        this.sensitivity = sensitivity;
    }

}
