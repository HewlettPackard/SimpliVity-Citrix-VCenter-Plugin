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
public class HostGatewaySpec
    extends DynamicData
{

    public String gatewayType;
    public String gatewayId;
    public String trustVerificationToken;
    private final static KeyValue[] NULL_HOST_AUTH_PARAMS_ARRAY = new KeyValue[ 0 ] ;
    public KeyValue[] hostAuthParams;

    public String getGatewayType() {
        return gatewayType;
    }

    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getTrustVerificationToken() {
        return trustVerificationToken;
    }

    public void setTrustVerificationToken(String trustVerificationToken) {
        this.trustVerificationToken = trustVerificationToken;
    }

    public KeyValue[] getHostAuthParams() {
        if ((hostAuthParams) == null) {
            return (NULL_HOST_AUTH_PARAMS_ARRAY);
        }
        return hostAuthParams;
    }

    public void setHostAuthParams(KeyValue[] hostAuthParams) {
        this.hostAuthParams = hostAuthParams;
    }

}
