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
public class VMwareDVSVspanCapability
    extends DynamicData
{

    public boolean mixedDestSupported;
    public boolean dvportSupported;
    public boolean remoteSourceSupported;
    public boolean remoteDestSupported;
    public boolean encapRemoteSourceSupported;
    public Boolean erspanProtocolSupported;
    public Boolean mirrorNetstackSupported;

    public boolean getMixedDestSupported() {
        return mixedDestSupported;
    }

    public void setMixedDestSupported(boolean mixedDestSupported) {
        this.mixedDestSupported = mixedDestSupported;
    }

    public boolean isMixedDestSupported() {
        return mixedDestSupported;
    }

    public boolean getDvportSupported() {
        return dvportSupported;
    }

    public void setDvportSupported(boolean dvportSupported) {
        this.dvportSupported = dvportSupported;
    }

    public boolean isDvportSupported() {
        return dvportSupported;
    }

    public boolean getRemoteSourceSupported() {
        return remoteSourceSupported;
    }

    public void setRemoteSourceSupported(boolean remoteSourceSupported) {
        this.remoteSourceSupported = remoteSourceSupported;
    }

    public boolean isRemoteSourceSupported() {
        return remoteSourceSupported;
    }

    public boolean getRemoteDestSupported() {
        return remoteDestSupported;
    }

    public void setRemoteDestSupported(boolean remoteDestSupported) {
        this.remoteDestSupported = remoteDestSupported;
    }

    public boolean isRemoteDestSupported() {
        return remoteDestSupported;
    }

    public boolean getEncapRemoteSourceSupported() {
        return encapRemoteSourceSupported;
    }

    public void setEncapRemoteSourceSupported(boolean encapRemoteSourceSupported) {
        this.encapRemoteSourceSupported = encapRemoteSourceSupported;
    }

    public boolean isEncapRemoteSourceSupported() {
        return encapRemoteSourceSupported;
    }

    public Boolean getErspanProtocolSupported() {
        return erspanProtocolSupported;
    }

    public void setErspanProtocolSupported(Boolean erspanProtocolSupported) {
        this.erspanProtocolSupported = erspanProtocolSupported;
    }

    public Boolean isErspanProtocolSupported() {
        return erspanProtocolSupported;
    }

    public Boolean getMirrorNetstackSupported() {
        return mirrorNetstackSupported;
    }

    public void setMirrorNetstackSupported(Boolean mirrorNetstackSupported) {
        this.mirrorNetstackSupported = mirrorNetstackSupported;
    }

    public Boolean isMirrorNetstackSupported() {
        return mirrorNetstackSupported;
    }

}
