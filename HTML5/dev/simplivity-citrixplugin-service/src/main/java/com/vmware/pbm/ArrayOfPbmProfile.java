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
public class ArrayOfPbmProfile {

    private final static com.vmware.pbm.PbmProfile[] NULL_PBM_PROFILE_ARRAY = new com.vmware.pbm.PbmProfile[ 0 ] ;
    public com.vmware.pbm.PbmProfile[] PbmProfile;

    public com.vmware.pbm.PbmProfile[] getPbmProfile() {
        if ((PbmProfile) == null) {
            return (NULL_PBM_PROFILE_ARRAY);
        }
        return PbmProfile;
    }

    public void setPbmProfile(com.vmware.pbm.PbmProfile[] PbmProfile) {
        this.PbmProfile = PbmProfile;
    }

}