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
public class ArrayOfProfileProfileStructureProperty {

    private final static com.vmware.vim25.ProfileProfileStructureProperty[] NULL_PROFILE_PROFILE_STRUCTURE_PROPERTY_ARRAY = new com.vmware.vim25.ProfileProfileStructureProperty[ 0 ] ;
    public com.vmware.vim25.ProfileProfileStructureProperty[] ProfileProfileStructureProperty;

    public com.vmware.vim25.ProfileProfileStructureProperty[] getProfileProfileStructureProperty() {
        if ((ProfileProfileStructureProperty) == null) {
            return (NULL_PROFILE_PROFILE_STRUCTURE_PROPERTY_ARRAY);
        }
        return ProfileProfileStructureProperty;
    }

    public void setProfileProfileStructureProperty(com.vmware.vim25.ProfileProfileStructureProperty[] ProfileProfileStructureProperty) {
        this.ProfileProfileStructureProperty = ProfileProfileStructureProperty;
    }

}