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
public class HttpNfcLeaseCapabilities
    extends DynamicData
{

    public boolean pullModeSupported;
    public boolean corsSupported;

    public boolean getPullModeSupported() {
        return pullModeSupported;
    }

    public void setPullModeSupported(boolean pullModeSupported) {
        this.pullModeSupported = pullModeSupported;
    }

    public boolean isPullModeSupported() {
        return pullModeSupported;
    }

    public boolean getCorsSupported() {
        return corsSupported;
    }

    public void setCorsSupported(boolean corsSupported) {
        this.corsSupported = corsSupported;
    }

    public boolean isCorsSupported() {
        return corsSupported;
    }

}
