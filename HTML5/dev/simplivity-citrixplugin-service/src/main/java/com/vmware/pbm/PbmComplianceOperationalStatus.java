//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.pbm;

import java.util.Calendar;
import com.vmware.vim25.DynamicData;


/**
 * 
 */
public class PbmComplianceOperationalStatus
    extends DynamicData
{

    public Boolean healthy;
    public Calendar operationETA;
    public Long operationProgress;
    public Boolean transitional;

    public Boolean getHealthy() {
        return healthy;
    }

    public void setHealthy(Boolean healthy) {
        this.healthy = healthy;
    }

    public Boolean isHealthy() {
        return healthy;
    }

    public Calendar getOperationETA() {
        return operationETA;
    }

    public void setOperationETA(Calendar operationETA) {
        this.operationETA = operationETA;
    }

    public Long getOperationProgress() {
        return operationProgress;
    }

    public void setOperationProgress(Long operationProgress) {
        this.operationProgress = operationProgress;
    }

    public Boolean getTransitional() {
        return transitional;
    }

    public void setTransitional(Boolean transitional) {
        this.transitional = transitional;
    }

    public Boolean isTransitional() {
        return transitional;
    }

}