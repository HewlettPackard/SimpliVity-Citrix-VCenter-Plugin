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
public class ArrayOfObjectUpdate {

    private final static com.vmware.vim25.ObjectUpdate[] NULL_OBJECT_UPDATE_ARRAY = new com.vmware.vim25.ObjectUpdate[ 0 ] ;
    public com.vmware.vim25.ObjectUpdate[] ObjectUpdate;

    public com.vmware.vim25.ObjectUpdate[] getObjectUpdate() {
        if ((ObjectUpdate) == null) {
            return (NULL_OBJECT_UPDATE_ARRAY);
        }
        return ObjectUpdate;
    }

    public void setObjectUpdate(com.vmware.vim25.ObjectUpdate[] ObjectUpdate) {
        this.ObjectUpdate = ObjectUpdate;
    }

}