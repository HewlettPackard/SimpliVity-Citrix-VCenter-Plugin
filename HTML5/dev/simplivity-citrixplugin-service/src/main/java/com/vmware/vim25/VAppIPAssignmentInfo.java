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
public class VAppIPAssignmentInfo
    extends DynamicData
{

    private final static String[] NULL_SUPPORTED_ALLOCATION_SCHEME_ARRAY = new String[ 0 ] ;
    public String[] supportedAllocationScheme;
    public String ipAllocationPolicy;
    private final static String[] NULL_SUPPORTED_IP_PROTOCOL_ARRAY = new String[ 0 ] ;
    public String[] supportedIpProtocol;
    public String ipProtocol;

    public String[] getSupportedAllocationScheme() {
        if ((supportedAllocationScheme) == null) {
            return (NULL_SUPPORTED_ALLOCATION_SCHEME_ARRAY);
        }
        return supportedAllocationScheme;
    }

    public void setSupportedAllocationScheme(String[] supportedAllocationScheme) {
        this.supportedAllocationScheme = supportedAllocationScheme;
    }

    public String getIpAllocationPolicy() {
        return ipAllocationPolicy;
    }

    public void setIpAllocationPolicy(String ipAllocationPolicy) {
        this.ipAllocationPolicy = ipAllocationPolicy;
    }

    public String[] getSupportedIpProtocol() {
        if ((supportedIpProtocol) == null) {
            return (NULL_SUPPORTED_IP_PROTOCOL_ARRAY);
        }
        return supportedIpProtocol;
    }

    public void setSupportedIpProtocol(String[] supportedIpProtocol) {
        this.supportedIpProtocol = supportedIpProtocol;
    }

    public String getIpProtocol() {
        return ipProtocol;
    }

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

}
