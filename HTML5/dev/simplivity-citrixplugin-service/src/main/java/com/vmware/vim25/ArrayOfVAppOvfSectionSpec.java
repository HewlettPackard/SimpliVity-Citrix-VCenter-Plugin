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
public class ArrayOfVAppOvfSectionSpec {

    private final static com.vmware.vim25.VAppOvfSectionSpec[] NULL_V_APP_OVF_SECTION_SPEC_ARRAY = new com.vmware.vim25.VAppOvfSectionSpec[ 0 ] ;
    public com.vmware.vim25.VAppOvfSectionSpec[] VAppOvfSectionSpec;

    public com.vmware.vim25.VAppOvfSectionSpec[] getVAppOvfSectionSpec() {
        if ((VAppOvfSectionSpec) == null) {
            return (NULL_V_APP_OVF_SECTION_SPEC_ARRAY);
        }
        return VAppOvfSectionSpec;
    }

    public void setVAppOvfSectionSpec(com.vmware.vim25.VAppOvfSectionSpec[] VAppOvfSectionSpec) {
        this.VAppOvfSectionSpec = VAppOvfSectionSpec;
    }

}
