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
public class VMwareVspanSession
    extends DynamicData
{

    public String key;
    public String name;
    public String description;
    public boolean enabled;
    public VMwareVspanPort sourcePortTransmitted;
    public VMwareVspanPort sourcePortReceived;
    public VMwareVspanPort destinationPort;
    public Integer encapsulationVlanId;
    public boolean stripOriginalVlan;
    public Integer mirroredPacketLength;
    public boolean normalTrafficAllowed;
    public String sessionType;
    public Integer samplingRate;
    public String encapType;
    public Integer erspanId;
    public Integer erspanCOS;
    public Boolean erspanGraNanosec;
    public String netstack;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public VMwareVspanPort getSourcePortTransmitted() {
        return sourcePortTransmitted;
    }

    public void setSourcePortTransmitted(VMwareVspanPort sourcePortTransmitted) {
        this.sourcePortTransmitted = sourcePortTransmitted;
    }

    public VMwareVspanPort getSourcePortReceived() {
        return sourcePortReceived;
    }

    public void setSourcePortReceived(VMwareVspanPort sourcePortReceived) {
        this.sourcePortReceived = sourcePortReceived;
    }

    public VMwareVspanPort getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(VMwareVspanPort destinationPort) {
        this.destinationPort = destinationPort;
    }

    public Integer getEncapsulationVlanId() {
        return encapsulationVlanId;
    }

    public void setEncapsulationVlanId(Integer encapsulationVlanId) {
        this.encapsulationVlanId = encapsulationVlanId;
    }

    public boolean getStripOriginalVlan() {
        return stripOriginalVlan;
    }

    public void setStripOriginalVlan(boolean stripOriginalVlan) {
        this.stripOriginalVlan = stripOriginalVlan;
    }

    public boolean isStripOriginalVlan() {
        return stripOriginalVlan;
    }

    public Integer getMirroredPacketLength() {
        return mirroredPacketLength;
    }

    public void setMirroredPacketLength(Integer mirroredPacketLength) {
        this.mirroredPacketLength = mirroredPacketLength;
    }

    public boolean getNormalTrafficAllowed() {
        return normalTrafficAllowed;
    }

    public void setNormalTrafficAllowed(boolean normalTrafficAllowed) {
        this.normalTrafficAllowed = normalTrafficAllowed;
    }

    public boolean isNormalTrafficAllowed() {
        return normalTrafficAllowed;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public Integer getSamplingRate() {
        return samplingRate;
    }

    public void setSamplingRate(Integer samplingRate) {
        this.samplingRate = samplingRate;
    }

    public String getEncapType() {
        return encapType;
    }

    public void setEncapType(String encapType) {
        this.encapType = encapType;
    }

    public Integer getErspanId() {
        return erspanId;
    }

    public void setErspanId(Integer erspanId) {
        this.erspanId = erspanId;
    }

    public Integer getErspanCOS() {
        return erspanCOS;
    }

    public void setErspanCOS(Integer erspanCOS) {
        this.erspanCOS = erspanCOS;
    }

    public Boolean getErspanGraNanosec() {
        return erspanGraNanosec;
    }

    public void setErspanGraNanosec(Boolean erspanGraNanosec) {
        this.erspanGraNanosec = erspanGraNanosec;
    }

    public Boolean isErspanGraNanosec() {
        return erspanGraNanosec;
    }

    public String getNetstack() {
        return netstack;
    }

    public void setNetstack(String netstack) {
        this.netstack = netstack;
    }

}
