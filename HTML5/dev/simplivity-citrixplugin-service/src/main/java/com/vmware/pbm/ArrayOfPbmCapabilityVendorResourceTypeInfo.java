//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.pbm;



/**
 * 
 */
@SuppressWarnings("all")
public class ArrayOfPbmCapabilityVendorResourceTypeInfo {

    private final static com.vmware.pbm.PbmCapabilityVendorResourceTypeInfo[] NULL_PBM_CAPABILITY_VENDOR_RESOURCE_TYPE_INFO_ARRAY = new com.vmware.pbm.PbmCapabilityVendorResourceTypeInfo[ 0 ] ;
    public com.vmware.pbm.PbmCapabilityVendorResourceTypeInfo[] PbmCapabilityVendorResourceTypeInfo;

    public com.vmware.pbm.PbmCapabilityVendorResourceTypeInfo[] getPbmCapabilityVendorResourceTypeInfo() {
        if ((PbmCapabilityVendorResourceTypeInfo) == null) {
            return (NULL_PBM_CAPABILITY_VENDOR_RESOURCE_TYPE_INFO_ARRAY);
        }
        return PbmCapabilityVendorResourceTypeInfo;
    }

    public void setPbmCapabilityVendorResourceTypeInfo(com.vmware.pbm.PbmCapabilityVendorResourceTypeInfo[] PbmCapabilityVendorResourceTypeInfo) {
        this.PbmCapabilityVendorResourceTypeInfo = PbmCapabilityVendorResourceTypeInfo;
    }

}
