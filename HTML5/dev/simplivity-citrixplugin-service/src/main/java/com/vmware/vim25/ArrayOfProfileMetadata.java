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
public class ArrayOfProfileMetadata {

    private final static com.vmware.vim25.ProfileMetadata[] NULL_PROFILE_METADATA_ARRAY = new com.vmware.vim25.ProfileMetadata[ 0 ] ;
    public com.vmware.vim25.ProfileMetadata[] ProfileMetadata;

    public com.vmware.vim25.ProfileMetadata[] getProfileMetadata() {
        if ((ProfileMetadata) == null) {
            return (NULL_PROFILE_METADATA_ARRAY);
        }
        return ProfileMetadata;
    }

    public void setProfileMetadata(com.vmware.vim25.ProfileMetadata[] ProfileMetadata) {
        this.ProfileMetadata = ProfileMetadata;
    }

}
