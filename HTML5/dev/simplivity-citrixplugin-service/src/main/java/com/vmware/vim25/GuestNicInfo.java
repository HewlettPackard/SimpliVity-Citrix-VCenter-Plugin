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
public class GuestNicInfo
    extends DynamicData
{

    public String network;
    private final static String[] NULL_IP_ADDRESS_ARRAY = new String[ 0 ] ;
    public String[] ipAddress;
    public String macAddress;
    public boolean connected;
    public int deviceConfigId;
    public NetDnsConfigInfo dnsConfig;
    public NetIpConfigInfo ipConfig;
    public NetBIOSConfigInfo netBIOSConfig;

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String[] getIpAddress() {
        if ((ipAddress) == null) {
            return (NULL_IP_ADDRESS_ARRAY);
        }
        return ipAddress;
    }

    public void setIpAddress(String[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public boolean getConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public boolean isConnected() {
        return connected;
    }

    public int getDeviceConfigId() {
        return deviceConfigId;
    }

    public void setDeviceConfigId(int deviceConfigId) {
        this.deviceConfigId = deviceConfigId;
    }

    public NetDnsConfigInfo getDnsConfig() {
        return dnsConfig;
    }

    public void setDnsConfig(NetDnsConfigInfo dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public NetIpConfigInfo getIpConfig() {
        return ipConfig;
    }

    public void setIpConfig(NetIpConfigInfo ipConfig) {
        this.ipConfig = ipConfig;
    }

    public NetBIOSConfigInfo getNetBIOSConfig() {
        return netBIOSConfig;
    }

    public void setNetBIOSConfig(NetBIOSConfigInfo netBIOSConfig) {
        this.netBIOSConfig = netBIOSConfig;
    }

}