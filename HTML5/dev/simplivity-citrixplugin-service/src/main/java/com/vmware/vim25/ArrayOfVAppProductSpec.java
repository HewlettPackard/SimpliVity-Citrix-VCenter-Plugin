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
public class ArrayOfVAppProductSpec {

    private final static com.vmware.vim25.VAppProductSpec[] NULL_V_APP_PRODUCT_SPEC_ARRAY = new com.vmware.vim25.VAppProductSpec[ 0 ] ;
    public com.vmware.vim25.VAppProductSpec[] VAppProductSpec;

    public com.vmware.vim25.VAppProductSpec[] getVAppProductSpec() {
        if ((VAppProductSpec) == null) {
            return (NULL_V_APP_PRODUCT_SPEC_ARRAY);
        }
        return VAppProductSpec;
    }

    public void setVAppProductSpec(com.vmware.vim25.VAppProductSpec[] VAppProductSpec) {
        this.VAppProductSpec = VAppProductSpec;
    }

}
