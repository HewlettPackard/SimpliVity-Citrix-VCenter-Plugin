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
public class CustomizationIPSettingsIpV6AddressSpec
    extends DynamicData
{

    private final static CustomizationIpV6Generator[] NULL_IP_ARRAY = new CustomizationIpV6Generator[ 0 ] ;
    public CustomizationIpV6Generator[] ip;
    private final static String[] NULL_GATEWAY_ARRAY = new String[ 0 ] ;
    public String[] gateway;

    public CustomizationIpV6Generator[] getIp() {
        if ((ip) == null) {
            return (NULL_IP_ARRAY);
        }
        return ip;
    }

    public void setIp(CustomizationIpV6Generator[] ip) {
        this.ip = ip;
    }

    public String[] getGateway() {
        if ((gateway) == null) {
            return (NULL_GATEWAY_ARRAY);
        }
        return gateway;
    }

    public void setGateway(String[] gateway) {
        this.gateway = gateway;
    }

}
