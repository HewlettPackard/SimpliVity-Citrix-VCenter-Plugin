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
public class HostInternetScsiHbaDiscoveryProperties
    extends DynamicData
{

    public boolean iSnsDiscoveryEnabled;
    public String iSnsDiscoveryMethod;
    public String iSnsHost;
    public boolean slpDiscoveryEnabled;
    public String slpDiscoveryMethod;
    public String slpHost;
    public boolean staticTargetDiscoveryEnabled;
    public boolean sendTargetsDiscoveryEnabled;

    public boolean getISnsDiscoveryEnabled() {
        return iSnsDiscoveryEnabled;
    }

    public void setISnsDiscoveryEnabled(boolean iSnsDiscoveryEnabled) {
        this.iSnsDiscoveryEnabled = iSnsDiscoveryEnabled;
    }

    public boolean isISnsDiscoveryEnabled() {
        return iSnsDiscoveryEnabled;
    }

    public String getISnsDiscoveryMethod() {
        return iSnsDiscoveryMethod;
    }

    public void setISnsDiscoveryMethod(String iSnsDiscoveryMethod) {
        this.iSnsDiscoveryMethod = iSnsDiscoveryMethod;
    }

    public String getISnsHost() {
        return iSnsHost;
    }

    public void setISnsHost(String iSnsHost) {
        this.iSnsHost = iSnsHost;
    }

    public boolean getSlpDiscoveryEnabled() {
        return slpDiscoveryEnabled;
    }

    public void setSlpDiscoveryEnabled(boolean slpDiscoveryEnabled) {
        this.slpDiscoveryEnabled = slpDiscoveryEnabled;
    }

    public boolean isSlpDiscoveryEnabled() {
        return slpDiscoveryEnabled;
    }

    public String getSlpDiscoveryMethod() {
        return slpDiscoveryMethod;
    }

    public void setSlpDiscoveryMethod(String slpDiscoveryMethod) {
        this.slpDiscoveryMethod = slpDiscoveryMethod;
    }

    public String getSlpHost() {
        return slpHost;
    }

    public void setSlpHost(String slpHost) {
        this.slpHost = slpHost;
    }

    public boolean getStaticTargetDiscoveryEnabled() {
        return staticTargetDiscoveryEnabled;
    }

    public void setStaticTargetDiscoveryEnabled(boolean staticTargetDiscoveryEnabled) {
        this.staticTargetDiscoveryEnabled = staticTargetDiscoveryEnabled;
    }

    public boolean isStaticTargetDiscoveryEnabled() {
        return staticTargetDiscoveryEnabled;
    }

    public boolean getSendTargetsDiscoveryEnabled() {
        return sendTargetsDiscoveryEnabled;
    }

    public void setSendTargetsDiscoveryEnabled(boolean sendTargetsDiscoveryEnabled) {
        this.sendTargetsDiscoveryEnabled = sendTargetsDiscoveryEnabled;
    }

    public boolean isSendTargetsDiscoveryEnabled() {
        return sendTargetsDiscoveryEnabled;
    }

}
