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
public class ArrayOfOvfNetworkInfo {

    private final static com.vmware.vim25.OvfNetworkInfo[] NULL_OVF_NETWORK_INFO_ARRAY = new com.vmware.vim25.OvfNetworkInfo[ 0 ] ;
    public com.vmware.vim25.OvfNetworkInfo[] OvfNetworkInfo;

    public com.vmware.vim25.OvfNetworkInfo[] getOvfNetworkInfo() {
        if ((OvfNetworkInfo) == null) {
            return (NULL_OVF_NETWORK_INFO_ARRAY);
        }
        return OvfNetworkInfo;
    }

    public void setOvfNetworkInfo(com.vmware.vim25.OvfNetworkInfo[] OvfNetworkInfo) {
        this.OvfNetworkInfo = OvfNetworkInfo;
    }

}
