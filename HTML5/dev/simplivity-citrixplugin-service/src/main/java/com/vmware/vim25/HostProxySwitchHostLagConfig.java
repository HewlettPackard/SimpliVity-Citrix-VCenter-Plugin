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
public class HostProxySwitchHostLagConfig
    extends DynamicData
{

    public String lagKey;
    public String lagName;
    private final static KeyValue[] NULL_UPLINK_PORT_ARRAY = new KeyValue[ 0 ] ;
    public KeyValue[] uplinkPort;

    public String getLagKey() {
        return lagKey;
    }

    public void setLagKey(String lagKey) {
        this.lagKey = lagKey;
    }

    public String getLagName() {
        return lagName;
    }

    public void setLagName(String lagName) {
        this.lagName = lagName;
    }

    public KeyValue[] getUplinkPort() {
        if ((uplinkPort) == null) {
            return (NULL_UPLINK_PORT_ARRAY);
        }
        return uplinkPort;
    }

    public void setUplinkPort(KeyValue[] uplinkPort) {
        this.uplinkPort = uplinkPort;
    }

}
