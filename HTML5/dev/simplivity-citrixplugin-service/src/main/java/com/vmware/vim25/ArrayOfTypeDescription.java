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
public class ArrayOfTypeDescription {

    private final static com.vmware.vim25.TypeDescription[] NULL_TYPE_DESCRIPTION_ARRAY = new com.vmware.vim25.TypeDescription[ 0 ] ;
    public com.vmware.vim25.TypeDescription[] TypeDescription;

    public com.vmware.vim25.TypeDescription[] getTypeDescription() {
        if ((TypeDescription) == null) {
            return (NULL_TYPE_DESCRIPTION_ARRAY);
        }
        return TypeDescription;
    }

    public void setTypeDescription(com.vmware.vim25.TypeDescription[] TypeDescription) {
        this.TypeDescription = TypeDescription;
    }

}