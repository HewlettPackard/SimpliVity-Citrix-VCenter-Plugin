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
public class ArrayOfExtensionResourceInfo {

    private final static com.vmware.vim25.ExtensionResourceInfo[] NULL_EXTENSION_RESOURCE_INFO_ARRAY = new com.vmware.vim25.ExtensionResourceInfo[ 0 ] ;
    public com.vmware.vim25.ExtensionResourceInfo[] ExtensionResourceInfo;

    public com.vmware.vim25.ExtensionResourceInfo[] getExtensionResourceInfo() {
        if ((ExtensionResourceInfo) == null) {
            return (NULL_EXTENSION_RESOURCE_INFO_ARRAY);
        }
        return ExtensionResourceInfo;
    }

    public void setExtensionResourceInfo(com.vmware.vim25.ExtensionResourceInfo[] ExtensionResourceInfo) {
        this.ExtensionResourceInfo = ExtensionResourceInfo;
    }

}
