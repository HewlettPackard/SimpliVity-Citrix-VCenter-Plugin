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
public class VirtualSerialPortPipeBackingInfo
    extends VirtualDevicePipeBackingInfo
{

    public String endpoint;
    public Boolean noRxLoss;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Boolean getNoRxLoss() {
        return noRxLoss;
    }

    public void setNoRxLoss(Boolean noRxLoss) {
        this.noRxLoss = noRxLoss;
    }

    public Boolean isNoRxLoss() {
        return noRxLoss;
    }

}
