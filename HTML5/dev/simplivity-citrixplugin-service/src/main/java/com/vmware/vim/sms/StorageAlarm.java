//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import java.util.Calendar;
import com.vmware.vim25.DynamicData;


/**
 * 
 */
@SuppressWarnings("all")
public class StorageAlarm
    extends DynamicData
{

    public long alarmId;
    public String alarmType;
    public String containerId;
    public String objectId;
    public String objectType;
    public String status;
    public Calendar alarmTimeStamp;
    public String messageId;
    private final static NameValuePair[] NULL_PARAMETER_LIST_ARRAY = new NameValuePair[ 0 ] ;
    public NameValuePair[] parameterList;
    public Object alarmObject;

    public long getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(long alarmId) {
        this.alarmId = alarmId;
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Calendar getAlarmTimeStamp() {
        return alarmTimeStamp;
    }

    public void setAlarmTimeStamp(Calendar alarmTimeStamp) {
        this.alarmTimeStamp = alarmTimeStamp;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public NameValuePair[] getParameterList() {
        if ((parameterList) == null) {
            return (NULL_PARAMETER_LIST_ARRAY);
        }
        return parameterList;
    }

    public void setParameterList(NameValuePair[] parameterList) {
        this.parameterList = parameterList;
    }

    public Object getAlarmObject() {
        return alarmObject;
    }

    public void setAlarmObject(Object alarmObject) {
        this.alarmObject = alarmObject;
    }

}
