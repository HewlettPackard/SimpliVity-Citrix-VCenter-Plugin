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
public class ArrayOfHostFeatureVersionInfo {

    private final static com.vmware.vim25.HostFeatureVersionInfo[] NULL_HOST_FEATURE_VERSION_INFO_ARRAY = new com.vmware.vim25.HostFeatureVersionInfo[ 0 ] ;
    public com.vmware.vim25.HostFeatureVersionInfo[] HostFeatureVersionInfo;

    public com.vmware.vim25.HostFeatureVersionInfo[] getHostFeatureVersionInfo() {
        if ((HostFeatureVersionInfo) == null) {
            return (NULL_HOST_FEATURE_VERSION_INFO_ARRAY);
        }
        return HostFeatureVersionInfo;
    }

    public void setHostFeatureVersionInfo(com.vmware.vim25.HostFeatureVersionInfo[] HostFeatureVersionInfo) {
        this.HostFeatureVersionInfo = HostFeatureVersionInfo;
    }

}