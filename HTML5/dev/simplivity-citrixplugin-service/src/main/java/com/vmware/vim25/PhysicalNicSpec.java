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
public class PhysicalNicSpec
    extends DynamicData
{

    public HostIpConfig ip;
    public PhysicalNicLinkInfo linkSpeed;
    public Boolean enableEnhancedNetworkingStack;

    public HostIpConfig getIp() {
        return ip;
    }

    public void setIp(HostIpConfig ip) {
        this.ip = ip;
    }

    public PhysicalNicLinkInfo getLinkSpeed() {
        return linkSpeed;
    }

    public void setLinkSpeed(PhysicalNicLinkInfo linkSpeed) {
        this.linkSpeed = linkSpeed;
    }

    public Boolean getEnableEnhancedNetworkingStack() {
        return enableEnhancedNetworkingStack;
    }

    public void setEnableEnhancedNetworkingStack(Boolean enableEnhancedNetworkingStack) {
        this.enableEnhancedNetworkingStack = enableEnhancedNetworkingStack;
    }

    public Boolean isEnableEnhancedNetworkingStack() {
        return enableEnhancedNetworkingStack;
    }

}