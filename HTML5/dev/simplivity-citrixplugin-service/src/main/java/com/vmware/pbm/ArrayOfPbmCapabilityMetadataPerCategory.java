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
public class ArrayOfPbmCapabilityMetadataPerCategory {

    private final static com.vmware.pbm.PbmCapabilityMetadataPerCategory[] NULL_PBM_CAPABILITY_METADATA_PER_CATEGORY_ARRAY = new com.vmware.pbm.PbmCapabilityMetadataPerCategory[ 0 ] ;
    public com.vmware.pbm.PbmCapabilityMetadataPerCategory[] PbmCapabilityMetadataPerCategory;

    public com.vmware.pbm.PbmCapabilityMetadataPerCategory[] getPbmCapabilityMetadataPerCategory() {
        if ((PbmCapabilityMetadataPerCategory) == null) {
            return (NULL_PBM_CAPABILITY_METADATA_PER_CATEGORY_ARRAY);
        }
        return PbmCapabilityMetadataPerCategory;
    }

    public void setPbmCapabilityMetadataPerCategory(com.vmware.pbm.PbmCapabilityMetadataPerCategory[] PbmCapabilityMetadataPerCategory) {
        this.PbmCapabilityMetadataPerCategory = PbmCapabilityMetadataPerCategory;
    }

}
