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
public class ArrayOfPropertyFilterSpec {

    private final static com.vmware.vim25.PropertyFilterSpec[] NULL_PROPERTY_FILTER_SPEC_ARRAY = new com.vmware.vim25.PropertyFilterSpec[ 0 ] ;
    public com.vmware.vim25.PropertyFilterSpec[] PropertyFilterSpec;

    public com.vmware.vim25.PropertyFilterSpec[] getPropertyFilterSpec() {
        if ((PropertyFilterSpec) == null) {
            return (NULL_PROPERTY_FILTER_SPEC_ARRAY);
        }
        return PropertyFilterSpec;
    }

    public void setPropertyFilterSpec(com.vmware.vim25.PropertyFilterSpec[] PropertyFilterSpec) {
        this.PropertyFilterSpec = PropertyFilterSpec;
    }

}
