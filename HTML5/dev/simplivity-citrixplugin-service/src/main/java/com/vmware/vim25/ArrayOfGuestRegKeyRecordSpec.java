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
public class ArrayOfGuestRegKeyRecordSpec {

    private final static com.vmware.vim25.GuestRegKeyRecordSpec[] NULL_GUEST_REG_KEY_RECORD_SPEC_ARRAY = new com.vmware.vim25.GuestRegKeyRecordSpec[ 0 ] ;
    public com.vmware.vim25.GuestRegKeyRecordSpec[] GuestRegKeyRecordSpec;

    public com.vmware.vim25.GuestRegKeyRecordSpec[] getGuestRegKeyRecordSpec() {
        if ((GuestRegKeyRecordSpec) == null) {
            return (NULL_GUEST_REG_KEY_RECORD_SPEC_ARRAY);
        }
        return GuestRegKeyRecordSpec;
    }

    public void setGuestRegKeyRecordSpec(com.vmware.vim25.GuestRegKeyRecordSpec[] GuestRegKeyRecordSpec) {
        this.GuestRegKeyRecordSpec = GuestRegKeyRecordSpec;
    }

}
