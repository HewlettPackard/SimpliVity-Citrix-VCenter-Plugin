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
public class ArrayOfVAppCloneSpecResourceMap {

    private final static com.vmware.vim25.VAppCloneSpecResourceMap[] NULL_V_APP_CLONE_SPEC_RESOURCE_MAP_ARRAY = new com.vmware.vim25.VAppCloneSpecResourceMap[ 0 ] ;
    public com.vmware.vim25.VAppCloneSpecResourceMap[] VAppCloneSpecResourceMap;

    public com.vmware.vim25.VAppCloneSpecResourceMap[] getVAppCloneSpecResourceMap() {
        if ((VAppCloneSpecResourceMap) == null) {
            return (NULL_V_APP_CLONE_SPEC_RESOURCE_MAP_ARRAY);
        }
        return VAppCloneSpecResourceMap;
    }

    public void setVAppCloneSpecResourceMap(com.vmware.vim25.VAppCloneSpecResourceMap[] VAppCloneSpecResourceMap) {
        this.VAppCloneSpecResourceMap = VAppCloneSpecResourceMap;
    }

}