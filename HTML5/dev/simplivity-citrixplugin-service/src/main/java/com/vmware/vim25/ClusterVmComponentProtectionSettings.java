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
public class ClusterVmComponentProtectionSettings
    extends DynamicData
{

    public String vmStorageProtectionForAPD;
    public Boolean enableAPDTimeoutForHosts;
    public Integer vmTerminateDelayForAPDSec;
    public String vmReactionOnAPDCleared;
    public String vmStorageProtectionForPDL;

    public String getVmStorageProtectionForAPD() {
        return vmStorageProtectionForAPD;
    }

    public void setVmStorageProtectionForAPD(String vmStorageProtectionForAPD) {
        this.vmStorageProtectionForAPD = vmStorageProtectionForAPD;
    }

    public Boolean getEnableAPDTimeoutForHosts() {
        return enableAPDTimeoutForHosts;
    }

    public void setEnableAPDTimeoutForHosts(Boolean enableAPDTimeoutForHosts) {
        this.enableAPDTimeoutForHosts = enableAPDTimeoutForHosts;
    }

    public Boolean isEnableAPDTimeoutForHosts() {
        return enableAPDTimeoutForHosts;
    }

    public Integer getVmTerminateDelayForAPDSec() {
        return vmTerminateDelayForAPDSec;
    }

    public void setVmTerminateDelayForAPDSec(Integer vmTerminateDelayForAPDSec) {
        this.vmTerminateDelayForAPDSec = vmTerminateDelayForAPDSec;
    }

    public String getVmReactionOnAPDCleared() {
        return vmReactionOnAPDCleared;
    }

    public void setVmReactionOnAPDCleared(String vmReactionOnAPDCleared) {
        this.vmReactionOnAPDCleared = vmReactionOnAPDCleared;
    }

    public String getVmStorageProtectionForPDL() {
        return vmStorageProtectionForPDL;
    }

    public void setVmStorageProtectionForPDL(String vmStorageProtectionForPDL) {
        this.vmStorageProtectionForPDL = vmStorageProtectionForPDL;
    }

}