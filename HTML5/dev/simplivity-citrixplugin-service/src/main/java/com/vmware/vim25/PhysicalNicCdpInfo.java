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
public class PhysicalNicCdpInfo
    extends DynamicData
{

    public Integer cdpVersion;
    public Integer timeout;
    public Integer ttl;
    public Integer samples;
    public String devId;
    public String address;
    public String portId;
    public PhysicalNicCdpDeviceCapability deviceCapability;
    public String softwareVersion;
    public String hardwarePlatform;
    public String ipPrefix;
    public Integer ipPrefixLen;
    public Integer vlan;
    public Boolean fullDuplex;
    public Integer mtu;
    public String systemName;
    public String systemOID;
    public String mgmtAddr;
    public String location;

    public Integer getCdpVersion() {
        return cdpVersion;
    }

    public void setCdpVersion(Integer cdpVersion) {
        this.cdpVersion = cdpVersion;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public Integer getSamples() {
        return samples;
    }

    public void setSamples(Integer samples) {
        this.samples = samples;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public PhysicalNicCdpDeviceCapability getDeviceCapability() {
        return deviceCapability;
    }

    public void setDeviceCapability(PhysicalNicCdpDeviceCapability deviceCapability) {
        this.deviceCapability = deviceCapability;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getHardwarePlatform() {
        return hardwarePlatform;
    }

    public void setHardwarePlatform(String hardwarePlatform) {
        this.hardwarePlatform = hardwarePlatform;
    }

    public String getIpPrefix() {
        return ipPrefix;
    }

    public void setIpPrefix(String ipPrefix) {
        this.ipPrefix = ipPrefix;
    }

    public Integer getIpPrefixLen() {
        return ipPrefixLen;
    }

    public void setIpPrefixLen(Integer ipPrefixLen) {
        this.ipPrefixLen = ipPrefixLen;
    }

    public Integer getVlan() {
        return vlan;
    }

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    public Boolean getFullDuplex() {
        return fullDuplex;
    }

    public void setFullDuplex(Boolean fullDuplex) {
        this.fullDuplex = fullDuplex;
    }

    public Boolean isFullDuplex() {
        return fullDuplex;
    }

    public Integer getMtu() {
        return mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemOID() {
        return systemOID;
    }

    public void setSystemOID(String systemOID) {
        this.systemOID = systemOID;
    }

    public String getMgmtAddr() {
        return mgmtAddr;
    }

    public void setMgmtAddr(String mgmtAddr) {
        this.mgmtAddr = mgmtAddr;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
