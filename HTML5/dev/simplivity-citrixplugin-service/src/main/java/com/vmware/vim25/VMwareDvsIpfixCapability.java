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
public class VMwareDvsIpfixCapability
    extends DynamicData
{

    public Boolean ipfixSupported;
    public Boolean ipv6ForIpfixSupported;
    public Boolean observationDomainIdSupported;

    public Boolean getIpfixSupported() {
        return ipfixSupported;
    }

    public void setIpfixSupported(Boolean ipfixSupported) {
        this.ipfixSupported = ipfixSupported;
    }

    public Boolean isIpfixSupported() {
        return ipfixSupported;
    }

    public Boolean getIpv6ForIpfixSupported() {
        return ipv6ForIpfixSupported;
    }

    public void setIpv6ForIpfixSupported(Boolean ipv6ForIpfixSupported) {
        this.ipv6ForIpfixSupported = ipv6ForIpfixSupported;
    }

    public Boolean isIpv6ForIpfixSupported() {
        return ipv6ForIpfixSupported;
    }

    public Boolean getObservationDomainIdSupported() {
        return observationDomainIdSupported;
    }

    public void setObservationDomainIdSupported(Boolean observationDomainIdSupported) {
        this.observationDomainIdSupported = observationDomainIdSupported;
    }

    public Boolean isObservationDomainIdSupported() {
        return observationDomainIdSupported;
    }

}