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
public class AlarmSetting
    extends DynamicData
{

    public int toleranceRange;
    public int reportingFrequency;

    public int getToleranceRange() {
        return toleranceRange;
    }

    public void setToleranceRange(int toleranceRange) {
        this.toleranceRange = toleranceRange;
    }

    public int getReportingFrequency() {
        return reportingFrequency;
    }

    public void setReportingFrequency(int reportingFrequency) {
        this.reportingFrequency = reportingFrequency;
    }

}
