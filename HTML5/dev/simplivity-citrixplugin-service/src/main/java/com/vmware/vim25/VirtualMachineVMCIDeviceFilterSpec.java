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
public class VirtualMachineVMCIDeviceFilterSpec
    extends DynamicData
{

    public long rank;
    public String action;
    public String protocol;
    public String direction;
    public Long lowerDstPortBoundary;
    public Long upperDstPortBoundary;

    public long getRank() {
        return rank;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Long getLowerDstPortBoundary() {
        return lowerDstPortBoundary;
    }

    public void setLowerDstPortBoundary(Long lowerDstPortBoundary) {
        this.lowerDstPortBoundary = lowerDstPortBoundary;
    }

    public Long getUpperDstPortBoundary() {
        return upperDstPortBoundary;
    }

    public void setUpperDstPortBoundary(Long upperDstPortBoundary) {
        this.upperDstPortBoundary = upperDstPortBoundary;
    }

}
