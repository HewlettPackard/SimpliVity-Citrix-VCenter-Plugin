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
public class ArrayOfElementDescription {

    private final static com.vmware.vim25.ElementDescription[] NULL_ELEMENT_DESCRIPTION_ARRAY = new com.vmware.vim25.ElementDescription[ 0 ] ;
    public com.vmware.vim25.ElementDescription[] ElementDescription;

    public com.vmware.vim25.ElementDescription[] getElementDescription() {
        if ((ElementDescription) == null) {
            return (NULL_ELEMENT_DESCRIPTION_ARRAY);
        }
        return ElementDescription;
    }

    public void setElementDescription(com.vmware.vim25.ElementDescription[] ElementDescription) {
        this.ElementDescription = ElementDescription;
    }

}
