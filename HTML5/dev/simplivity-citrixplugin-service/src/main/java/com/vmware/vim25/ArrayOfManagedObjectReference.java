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
public class ArrayOfManagedObjectReference {

    private final static com.vmware.vim25.ManagedObjectReference[] NULL_MANAGED_OBJECT_REFERENCE_ARRAY = new com.vmware.vim25.ManagedObjectReference[ 0 ] ;
    public com.vmware.vim25.ManagedObjectReference[] ManagedObjectReference;

    public com.vmware.vim25.ManagedObjectReference[] getManagedObjectReference() {
        if ((ManagedObjectReference) == null) {
            return (NULL_MANAGED_OBJECT_REFERENCE_ARRAY);
        }
        return ManagedObjectReference;
    }

    public void setManagedObjectReference(com.vmware.vim25.ManagedObjectReference[] ManagedObjectReference) {
        this.ManagedObjectReference = ManagedObjectReference;
    }

}
