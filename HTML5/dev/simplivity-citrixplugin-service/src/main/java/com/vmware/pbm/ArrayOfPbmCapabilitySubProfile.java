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
public class ArrayOfPbmCapabilitySubProfile {

    private final static com.vmware.pbm.PbmCapabilitySubProfile[] NULL_PBM_CAPABILITY_SUB_PROFILE_ARRAY = new com.vmware.pbm.PbmCapabilitySubProfile[ 0 ] ;
    public com.vmware.pbm.PbmCapabilitySubProfile[] PbmCapabilitySubProfile;

    public com.vmware.pbm.PbmCapabilitySubProfile[] getPbmCapabilitySubProfile() {
        if ((PbmCapabilitySubProfile) == null) {
            return (NULL_PBM_CAPABILITY_SUB_PROFILE_ARRAY);
        }
        return PbmCapabilitySubProfile;
    }

    public void setPbmCapabilitySubProfile(com.vmware.pbm.PbmCapabilitySubProfile[] PbmCapabilitySubProfile) {
        this.PbmCapabilitySubProfile = PbmCapabilitySubProfile;
    }

}
