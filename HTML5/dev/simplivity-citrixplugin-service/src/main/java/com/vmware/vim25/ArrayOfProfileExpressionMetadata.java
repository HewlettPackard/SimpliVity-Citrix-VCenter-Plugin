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
public class ArrayOfProfileExpressionMetadata {

    private final static com.vmware.vim25.ProfileExpressionMetadata[] NULL_PROFILE_EXPRESSION_METADATA_ARRAY = new com.vmware.vim25.ProfileExpressionMetadata[ 0 ] ;
    public com.vmware.vim25.ProfileExpressionMetadata[] ProfileExpressionMetadata;

    public com.vmware.vim25.ProfileExpressionMetadata[] getProfileExpressionMetadata() {
        if ((ProfileExpressionMetadata) == null) {
            return (NULL_PROFILE_EXPRESSION_METADATA_ARRAY);
        }
        return ProfileExpressionMetadata;
    }

    public void setProfileExpressionMetadata(com.vmware.vim25.ProfileExpressionMetadata[] ProfileExpressionMetadata) {
        this.ProfileExpressionMetadata = ProfileExpressionMetadata;
    }

}
