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
public class HostIpConfig
    extends DynamicData
{

    public boolean dhcp;
    public String ipAddress;
    public String subnetMask;
    public HostIpConfigIpV6AddressConfiguration ipV6Config;

    public boolean getDhcp() {
        return dhcp;
    }

    public void setDhcp(boolean dhcp) {
        this.dhcp = dhcp;
    }

    public boolean isDhcp() {
        return dhcp;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    public HostIpConfigIpV6AddressConfiguration getIpV6Config() {
        return ipV6Config;
    }

    public void setIpV6Config(HostIpConfigIpV6AddressConfiguration ipV6Config) {
        this.ipV6Config = ipV6Config;
    }

}