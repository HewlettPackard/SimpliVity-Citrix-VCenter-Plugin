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
public class ArrayOfVAppProductInfo {

    private final static com.vmware.vim25.VAppProductInfo[] NULL_V_APP_PRODUCT_INFO_ARRAY = new com.vmware.vim25.VAppProductInfo[ 0 ] ;
    public com.vmware.vim25.VAppProductInfo[] VAppProductInfo;

    public com.vmware.vim25.VAppProductInfo[] getVAppProductInfo() {
        if ((VAppProductInfo) == null) {
            return (NULL_V_APP_PRODUCT_INFO_ARRAY);
        }
        return VAppProductInfo;
    }

    public void setVAppProductInfo(com.vmware.vim25.VAppProductInfo[] VAppProductInfo) {
        this.VAppProductInfo = VAppProductInfo;
    }

}
