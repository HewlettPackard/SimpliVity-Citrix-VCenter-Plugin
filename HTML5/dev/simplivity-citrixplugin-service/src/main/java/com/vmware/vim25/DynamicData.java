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
public class DynamicData {

    private final static DynamicProperty[] NULL_DYNAMIC_PROPERTY_ARRAY = new DynamicProperty[ 0 ] ;
    public String dynamicType;
    public DynamicProperty[] dynamicProperty;

    public String getDynamicType() {
        return dynamicType;
    }

    public void setDynamicType(String dynamicType) {
        this.dynamicType = dynamicType;
    }

    public DynamicProperty[] getDynamicProperty() {
        if ((dynamicProperty) == null) {
            return (NULL_DYNAMIC_PROPERTY_ARRAY);
        }
        return dynamicProperty;
    }

    public void setDynamicProperty(DynamicProperty[] dynamicProperty) {
        this.dynamicProperty = dynamicProperty;
    }

}