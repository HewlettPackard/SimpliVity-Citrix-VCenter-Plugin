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
public class StorageDrsIoLoadBalanceConfig
    extends DynamicData
{

    public Integer reservablePercentThreshold;
    public Integer reservableIopsThreshold;
    public String reservableThresholdMode;
    public Integer ioLatencyThreshold;
    public Integer ioLoadImbalanceThreshold;

    public Integer getReservablePercentThreshold() {
        return reservablePercentThreshold;
    }

    public void setReservablePercentThreshold(Integer reservablePercentThreshold) {
        this.reservablePercentThreshold = reservablePercentThreshold;
    }

    public Integer getReservableIopsThreshold() {
        return reservableIopsThreshold;
    }

    public void setReservableIopsThreshold(Integer reservableIopsThreshold) {
        this.reservableIopsThreshold = reservableIopsThreshold;
    }

    public String getReservableThresholdMode() {
        return reservableThresholdMode;
    }

    public void setReservableThresholdMode(String reservableThresholdMode) {
        this.reservableThresholdMode = reservableThresholdMode;
    }

    public Integer getIoLatencyThreshold() {
        return ioLatencyThreshold;
    }

    public void setIoLatencyThreshold(Integer ioLatencyThreshold) {
        this.ioLatencyThreshold = ioLatencyThreshold;
    }

    public Integer getIoLoadImbalanceThreshold() {
        return ioLoadImbalanceThreshold;
    }

    public void setIoLoadImbalanceThreshold(Integer ioLoadImbalanceThreshold) {
        this.ioLoadImbalanceThreshold = ioLoadImbalanceThreshold;
    }

}
