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
public class ArrayOfGuestOsDescriptor {

    private final static com.vmware.vim25.GuestOsDescriptor[] NULL_GUEST_OS_DESCRIPTOR_ARRAY = new com.vmware.vim25.GuestOsDescriptor[ 0 ] ;
    public com.vmware.vim25.GuestOsDescriptor[] GuestOsDescriptor;

    public com.vmware.vim25.GuestOsDescriptor[] getGuestOsDescriptor() {
        if ((GuestOsDescriptor) == null) {
            return (NULL_GUEST_OS_DESCRIPTOR_ARRAY);
        }
        return GuestOsDescriptor;
    }

    public void setGuestOsDescriptor(com.vmware.vim25.GuestOsDescriptor[] GuestOsDescriptor) {
        this.GuestOsDescriptor = GuestOsDescriptor;
    }

}
