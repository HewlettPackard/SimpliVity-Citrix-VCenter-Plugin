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
public class HostFirewallRule
    extends DynamicData
{

    public int port;
    public Integer endPort;
    public HostFirewallRuleDirection direction;
    public HostFirewallRulePortType portType;
    public String protocol;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Integer getEndPort() {
        return endPort;
    }

    public void setEndPort(Integer endPort) {
        this.endPort = endPort;
    }

    public HostFirewallRuleDirection getDirection() {
        return direction;
    }

    public void setDirection(HostFirewallRuleDirection direction) {
        this.direction = direction;
    }

    public HostFirewallRulePortType getPortType() {
        return portType;
    }

    public void setPortType(HostFirewallRulePortType portType) {
        this.portType = portType;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

}
