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
public class DvsMacNetworkRuleQualifier
    extends DvsNetworkRuleQualifier
{

    public MacAddress sourceAddress;
    public MacAddress destinationAddress;
    public IntExpression protocol;
    public IntExpression vlanId;

    public MacAddress getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(MacAddress sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public MacAddress getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(MacAddress destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public IntExpression getProtocol() {
        return protocol;
    }

    public void setProtocol(IntExpression protocol) {
        this.protocol = protocol;
    }

    public IntExpression getVlanId() {
        return vlanId;
    }

    public void setVlanId(IntExpression vlanId) {
        this.vlanId = vlanId;
    }

}