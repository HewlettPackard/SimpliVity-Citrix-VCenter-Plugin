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
public class ArrayOfPropertyChange {

    private final static com.vmware.vim25.PropertyChange[] NULL_PROPERTY_CHANGE_ARRAY = new com.vmware.vim25.PropertyChange[ 0 ] ;
    public com.vmware.vim25.PropertyChange[] PropertyChange;

    public com.vmware.vim25.PropertyChange[] getPropertyChange() {
        if ((PropertyChange) == null) {
            return (NULL_PROPERTY_CHANGE_ARRAY);
        }
        return PropertyChange;
    }

    public void setPropertyChange(com.vmware.vim25.PropertyChange[] PropertyChange) {
        this.PropertyChange = PropertyChange;
    }

}