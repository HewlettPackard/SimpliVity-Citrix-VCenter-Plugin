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
public class ArrayOfExtensionServerInfo {

    private final static com.vmware.vim25.ExtensionServerInfo[] NULL_EXTENSION_SERVER_INFO_ARRAY = new com.vmware.vim25.ExtensionServerInfo[ 0 ] ;
    public com.vmware.vim25.ExtensionServerInfo[] ExtensionServerInfo;

    public com.vmware.vim25.ExtensionServerInfo[] getExtensionServerInfo() {
        if ((ExtensionServerInfo) == null) {
            return (NULL_EXTENSION_SERVER_INFO_ARRAY);
        }
        return ExtensionServerInfo;
    }

    public void setExtensionServerInfo(com.vmware.vim25.ExtensionServerInfo[] ExtensionServerInfo) {
        this.ExtensionServerInfo = ExtensionServerInfo;
    }

}
