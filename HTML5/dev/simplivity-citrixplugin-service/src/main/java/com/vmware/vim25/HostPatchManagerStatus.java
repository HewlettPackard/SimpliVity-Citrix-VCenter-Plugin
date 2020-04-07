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
public class HostPatchManagerStatus
    extends DynamicData
{

    public String id;
    public boolean applicable;
    private final static String[] NULL_REASON_ARRAY = new String[ 0 ] ;
    public String[] reason;
    public String integrity;
    public boolean installed;
    private final static String[] NULL_INSTALL_STATE_ARRAY = new String[ 0 ] ;
    public String[] installState;
    private final static HostPatchManagerStatusPrerequisitePatch[] NULL_PREREQUISITE_PATCH_ARRAY = new HostPatchManagerStatusPrerequisitePatch[ 0 ] ;
    public HostPatchManagerStatusPrerequisitePatch[] prerequisitePatch;
    public boolean restartRequired;
    public boolean reconnectRequired;
    public boolean vmOffRequired;
    private final static String[] NULL_SUPERSEDED_PATCH_IDS_ARRAY = new String[ 0 ] ;
    public String[] supersededPatchIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getApplicable() {
        return applicable;
    }

    public void setApplicable(boolean applicable) {
        this.applicable = applicable;
    }

    public boolean isApplicable() {
        return applicable;
    }

    public String[] getReason() {
        if ((reason) == null) {
            return (NULL_REASON_ARRAY);
        }
        return reason;
    }

    public void setReason(String[] reason) {
        this.reason = reason;
    }

    public String getIntegrity() {
        return integrity;
    }

    public void setIntegrity(String integrity) {
        this.integrity = integrity;
    }

    public boolean getInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

    public boolean isInstalled() {
        return installed;
    }

    public String[] getInstallState() {
        if ((installState) == null) {
            return (NULL_INSTALL_STATE_ARRAY);
        }
        return installState;
    }

    public void setInstallState(String[] installState) {
        this.installState = installState;
    }

    public HostPatchManagerStatusPrerequisitePatch[] getPrerequisitePatch() {
        if ((prerequisitePatch) == null) {
            return (NULL_PREREQUISITE_PATCH_ARRAY);
        }
        return prerequisitePatch;
    }

    public void setPrerequisitePatch(HostPatchManagerStatusPrerequisitePatch[] prerequisitePatch) {
        this.prerequisitePatch = prerequisitePatch;
    }

    public boolean getRestartRequired() {
        return restartRequired;
    }

    public void setRestartRequired(boolean restartRequired) {
        this.restartRequired = restartRequired;
    }

    public boolean isRestartRequired() {
        return restartRequired;
    }

    public boolean getReconnectRequired() {
        return reconnectRequired;
    }

    public void setReconnectRequired(boolean reconnectRequired) {
        this.reconnectRequired = reconnectRequired;
    }

    public boolean isReconnectRequired() {
        return reconnectRequired;
    }

    public boolean getVmOffRequired() {
        return vmOffRequired;
    }

    public void setVmOffRequired(boolean vmOffRequired) {
        this.vmOffRequired = vmOffRequired;
    }

    public boolean isVmOffRequired() {
        return vmOffRequired;
    }

    public String[] getSupersededPatchIds() {
        if ((supersededPatchIds) == null) {
            return (NULL_SUPERSEDED_PATCH_IDS_ARRAY);
        }
        return supersededPatchIds;
    }

    public void setSupersededPatchIds(String[] supersededPatchIds) {
        this.supersededPatchIds = supersededPatchIds;
    }

}
