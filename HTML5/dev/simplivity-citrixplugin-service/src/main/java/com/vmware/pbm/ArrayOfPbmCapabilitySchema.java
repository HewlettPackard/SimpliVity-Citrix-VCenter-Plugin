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
public class ArrayOfPbmCapabilitySchema {

    private final static com.vmware.pbm.PbmCapabilitySchema[] NULL_PBM_CAPABILITY_SCHEMA_ARRAY = new com.vmware.pbm.PbmCapabilitySchema[ 0 ] ;
    public com.vmware.pbm.PbmCapabilitySchema[] PbmCapabilitySchema;

    public com.vmware.pbm.PbmCapabilitySchema[] getPbmCapabilitySchema() {
        if ((PbmCapabilitySchema) == null) {
            return (NULL_PBM_CAPABILITY_SCHEMA_ARRAY);
        }
        return PbmCapabilitySchema;
    }

    public void setPbmCapabilitySchema(com.vmware.pbm.PbmCapabilitySchema[] PbmCapabilitySchema) {
        this.PbmCapabilitySchema = PbmCapabilitySchema;
    }

}
