//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultDomainId;


/**
 * 
 */
@SuppressWarnings("all")
public class TargetDeviceId
    extends DynamicData
{

    public FaultDomainId domainId;
    public ReplicaId deviceId;

    public FaultDomainId getDomainId() {
        return domainId;
    }

    public void setDomainId(FaultDomainId domainId) {
        this.domainId = domainId;
    }

    public ReplicaId getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(ReplicaId deviceId) {
        this.deviceId = deviceId;
    }

}