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
public class ArrayOfHostPatchManagerStatusPrerequisitePatch {

    private final static com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch[] NULL_HOST_PATCH_MANAGER_STATUS_PREREQUISITE_PATCH_ARRAY = new com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch[ 0 ] ;
    public com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch[] HostPatchManagerStatusPrerequisitePatch;

    public com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch[] getHostPatchManagerStatusPrerequisitePatch() {
        if ((HostPatchManagerStatusPrerequisitePatch) == null) {
            return (NULL_HOST_PATCH_MANAGER_STATUS_PREREQUISITE_PATCH_ARRAY);
        }
        return HostPatchManagerStatusPrerequisitePatch;
    }

    public void setHostPatchManagerStatusPrerequisitePatch(com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch[] HostPatchManagerStatusPrerequisitePatch) {
        this.HostPatchManagerStatusPrerequisitePatch = HostPatchManagerStatusPrerequisitePatch;
    }

}
