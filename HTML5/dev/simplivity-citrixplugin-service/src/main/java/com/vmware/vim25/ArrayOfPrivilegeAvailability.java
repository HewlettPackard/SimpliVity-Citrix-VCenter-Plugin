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
public class ArrayOfPrivilegeAvailability {

    private final static com.vmware.vim25.PrivilegeAvailability[] NULL_PRIVILEGE_AVAILABILITY_ARRAY = new com.vmware.vim25.PrivilegeAvailability[ 0 ] ;
    public com.vmware.vim25.PrivilegeAvailability[] PrivilegeAvailability;

    public com.vmware.vim25.PrivilegeAvailability[] getPrivilegeAvailability() {
        if ((PrivilegeAvailability) == null) {
            return (NULL_PRIVILEGE_AVAILABILITY_ARRAY);
        }
        return PrivilegeAvailability;
    }

    public void setPrivilegeAvailability(com.vmware.vim25.PrivilegeAvailability[] PrivilegeAvailability) {
        this.PrivilegeAvailability = PrivilegeAvailability;
    }

}
