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
public class ArrayOfMissingProperty {

    private final static com.vmware.vim25.MissingProperty[] NULL_MISSING_PROPERTY_ARRAY = new com.vmware.vim25.MissingProperty[ 0 ] ;
    public com.vmware.vim25.MissingProperty[] MissingProperty;

    public com.vmware.vim25.MissingProperty[] getMissingProperty() {
        if ((MissingProperty) == null) {
            return (NULL_MISSING_PROPERTY_ARRAY);
        }
        return MissingProperty;
    }

    public void setMissingProperty(com.vmware.vim25.MissingProperty[] MissingProperty) {
        this.MissingProperty = MissingProperty;
    }

}
