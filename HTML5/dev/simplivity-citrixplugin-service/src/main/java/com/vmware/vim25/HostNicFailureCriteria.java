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
public class HostNicFailureCriteria
    extends DynamicData
{

    public String checkSpeed;
    public Integer speed;
    public Boolean checkDuplex;
    public Boolean fullDuplex;
    public Boolean checkErrorPercent;
    public Integer percentage;
    public Boolean checkBeacon;

    public String getCheckSpeed() {
        return checkSpeed;
    }

    public void setCheckSpeed(String checkSpeed) {
        this.checkSpeed = checkSpeed;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Boolean getCheckDuplex() {
        return checkDuplex;
    }

    public void setCheckDuplex(Boolean checkDuplex) {
        this.checkDuplex = checkDuplex;
    }

    public Boolean isCheckDuplex() {
        return checkDuplex;
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

    public Boolean getCheckErrorPercent() {
        return checkErrorPercent;
    }

    public void setCheckErrorPercent(Boolean checkErrorPercent) {
        this.checkErrorPercent = checkErrorPercent;
    }

    public Boolean isCheckErrorPercent() {
        return checkErrorPercent;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Boolean getCheckBeacon() {
        return checkBeacon;
    }

    public void setCheckBeacon(Boolean checkBeacon) {
        this.checkBeacon = checkBeacon;
    }

    public Boolean isCheckBeacon() {
        return checkBeacon;
    }

}
