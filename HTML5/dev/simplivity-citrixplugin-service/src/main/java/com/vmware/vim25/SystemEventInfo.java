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
public class SystemEventInfo
    extends DynamicData
{

    public long recordId;
    public String when;
    public long selType;
    public String message;
    public long sensorNumber;

    public long getRecordId() {
        return recordId;
    }

    public void setRecordId(long recordId) {
        this.recordId = recordId;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public long getSelType() {
        return selType;
    }

    public void setSelType(long selType) {
        this.selType = selType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getSensorNumber() {
        return sensorNumber;
    }

    public void setSensorNumber(long sensorNumber) {
        this.sensorNumber = sensorNumber;
    }

}
