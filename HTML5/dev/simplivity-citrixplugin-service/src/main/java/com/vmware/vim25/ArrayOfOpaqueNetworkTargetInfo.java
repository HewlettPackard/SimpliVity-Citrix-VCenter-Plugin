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
public class ArrayOfOpaqueNetworkTargetInfo {

    private final static com.vmware.vim25.OpaqueNetworkTargetInfo[] NULL_OPAQUE_NETWORK_TARGET_INFO_ARRAY = new com.vmware.vim25.OpaqueNetworkTargetInfo[ 0 ] ;
    public com.vmware.vim25.OpaqueNetworkTargetInfo[] OpaqueNetworkTargetInfo;

    public com.vmware.vim25.OpaqueNetworkTargetInfo[] getOpaqueNetworkTargetInfo() {
        if ((OpaqueNetworkTargetInfo) == null) {
            return (NULL_OPAQUE_NETWORK_TARGET_INFO_ARRAY);
        }
        return OpaqueNetworkTargetInfo;
    }

    public void setOpaqueNetworkTargetInfo(com.vmware.vim25.OpaqueNetworkTargetInfo[] OpaqueNetworkTargetInfo) {
        this.OpaqueNetworkTargetInfo = OpaqueNetworkTargetInfo;
    }

}