//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import java.util.Calendar;


/**
 * 
 */
@SuppressWarnings("all")
public class SyncReplicationGroupSuccessResult
    extends GroupOperationResult
{

    public Calendar timeStamp;
    public PointInTimeReplicaId pitId;
    public String pitName;

    public Calendar getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }

    public PointInTimeReplicaId getPitId() {
        return pitId;
    }

    public void setPitId(PointInTimeReplicaId pitId) {
        this.pitId = pitId;
    }

    public String getPitName() {
        return pitName;
    }

    public void setPitName(String pitName) {
        this.pitName = pitName;
    }

}
