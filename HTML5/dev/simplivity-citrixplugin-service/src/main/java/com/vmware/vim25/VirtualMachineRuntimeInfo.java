//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;

import java.util.Calendar;


/**
 * 
 */
public class VirtualMachineRuntimeInfo
    extends DynamicData
{

    private final static VirtualMachineDeviceRuntimeInfo[] NULL_DEVICE_ARRAY = new VirtualMachineDeviceRuntimeInfo[ 0 ] ;
    public VirtualMachineDeviceRuntimeInfo[] device;
    public ManagedObjectReference host;
    public VirtualMachineConnectionState connectionState;
    public VirtualMachinePowerState powerState;
    public VirtualMachineFaultToleranceState faultToleranceState;
    public VirtualMachineRuntimeInfoDasProtectionState dasVmProtection;
    public boolean toolsInstallerMounted;
    public Calendar suspendTime;
    public Calendar bootTime;
    public Long suspendInterval;
    public VirtualMachineQuestionInfo question;
    public Long memoryOverhead;
    public Integer maxCpuUsage;
    public Integer maxMemoryUsage;
    public int numMksConnections;
    public VirtualMachineRecordReplayState recordReplayState;
    public Boolean cleanPowerOff;
    public String needSecondaryReason;
    public Boolean onlineStandby;
    public String minRequiredEVCModeKey;
    public Boolean consolidationNeeded;
    private final static VirtualMachineFeatureRequirement[] NULL_OFFLINE_FEATURE_REQUIREMENT_ARRAY = new VirtualMachineFeatureRequirement[ 0 ] ;
    public VirtualMachineFeatureRequirement[] offlineFeatureRequirement;
    private final static VirtualMachineFeatureRequirement[] NULL_FEATURE_REQUIREMENT_ARRAY = new VirtualMachineFeatureRequirement[ 0 ] ;
    public VirtualMachineFeatureRequirement[] featureRequirement;
    private final static HostFeatureMask[] NULL_FEATURE_MASK_ARRAY = new HostFeatureMask[ 0 ] ;
    public HostFeatureMask[] featureMask;
    public Long vFlashCacheAllocation;
    public Boolean paused;
    public Boolean snapshotInBackground;
    public Boolean quiescedForkParent;
    public Boolean instantCloneFrozen;
    public String cryptoState;

    public VirtualMachineDeviceRuntimeInfo[] getDevice() {
        if ((device) == null) {
            return (NULL_DEVICE_ARRAY);
        }
        return device;
    }

    public void setDevice(VirtualMachineDeviceRuntimeInfo[] device) {
        this.device = device;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public VirtualMachineConnectionState getConnectionState() {
        return connectionState;
    }

    public void setConnectionState(VirtualMachineConnectionState connectionState) {
        this.connectionState = connectionState;
    }

    public VirtualMachinePowerState getPowerState() {
        return powerState;
    }

    public void setPowerState(VirtualMachinePowerState powerState) {
        this.powerState = powerState;
    }

    public VirtualMachineFaultToleranceState getFaultToleranceState() {
        return faultToleranceState;
    }

    public void setFaultToleranceState(VirtualMachineFaultToleranceState faultToleranceState) {
        this.faultToleranceState = faultToleranceState;
    }

    public VirtualMachineRuntimeInfoDasProtectionState getDasVmProtection() {
        return dasVmProtection;
    }

    public void setDasVmProtection(VirtualMachineRuntimeInfoDasProtectionState dasVmProtection) {
        this.dasVmProtection = dasVmProtection;
    }

    public boolean getToolsInstallerMounted() {
        return toolsInstallerMounted;
    }

    public void setToolsInstallerMounted(boolean toolsInstallerMounted) {
        this.toolsInstallerMounted = toolsInstallerMounted;
    }

    public boolean isToolsInstallerMounted() {
        return toolsInstallerMounted;
    }

    public Calendar getSuspendTime() {
        return suspendTime;
    }

    public void setSuspendTime(Calendar suspendTime) {
        this.suspendTime = suspendTime;
    }

    public Calendar getBootTime() {
        return bootTime;
    }

    public void setBootTime(Calendar bootTime) {
        this.bootTime = bootTime;
    }

    public Long getSuspendInterval() {
        return suspendInterval;
    }

    public void setSuspendInterval(Long suspendInterval) {
        this.suspendInterval = suspendInterval;
    }

    public VirtualMachineQuestionInfo getQuestion() {
        return question;
    }

    public void setQuestion(VirtualMachineQuestionInfo question) {
        this.question = question;
    }

    public Long getMemoryOverhead() {
        return memoryOverhead;
    }

    public void setMemoryOverhead(Long memoryOverhead) {
        this.memoryOverhead = memoryOverhead;
    }

    public Integer getMaxCpuUsage() {
        return maxCpuUsage;
    }

    public void setMaxCpuUsage(Integer maxCpuUsage) {
        this.maxCpuUsage = maxCpuUsage;
    }

    public Integer getMaxMemoryUsage() {
        return maxMemoryUsage;
    }

    public void setMaxMemoryUsage(Integer maxMemoryUsage) {
        this.maxMemoryUsage = maxMemoryUsage;
    }

    public int getNumMksConnections() {
        return numMksConnections;
    }

    public void setNumMksConnections(int numMksConnections) {
        this.numMksConnections = numMksConnections;
    }

    public VirtualMachineRecordReplayState getRecordReplayState() {
        return recordReplayState;
    }

    public void setRecordReplayState(VirtualMachineRecordReplayState recordReplayState) {
        this.recordReplayState = recordReplayState;
    }

    public Boolean getCleanPowerOff() {
        return cleanPowerOff;
    }

    public void setCleanPowerOff(Boolean cleanPowerOff) {
        this.cleanPowerOff = cleanPowerOff;
    }

    public Boolean isCleanPowerOff() {
        return cleanPowerOff;
    }

    public String getNeedSecondaryReason() {
        return needSecondaryReason;
    }

    public void setNeedSecondaryReason(String needSecondaryReason) {
        this.needSecondaryReason = needSecondaryReason;
    }

    public Boolean getOnlineStandby() {
        return onlineStandby;
    }

    public void setOnlineStandby(Boolean onlineStandby) {
        this.onlineStandby = onlineStandby;
    }

    public Boolean isOnlineStandby() {
        return onlineStandby;
    }

    public String getMinRequiredEVCModeKey() {
        return minRequiredEVCModeKey;
    }

    public void setMinRequiredEVCModeKey(String minRequiredEVCModeKey) {
        this.minRequiredEVCModeKey = minRequiredEVCModeKey;
    }

    public Boolean getConsolidationNeeded() {
        return consolidationNeeded;
    }

    public void setConsolidationNeeded(Boolean consolidationNeeded) {
        this.consolidationNeeded = consolidationNeeded;
    }

    public Boolean isConsolidationNeeded() {
        return consolidationNeeded;
    }

    public VirtualMachineFeatureRequirement[] getOfflineFeatureRequirement() {
        if ((offlineFeatureRequirement) == null) {
            return (NULL_OFFLINE_FEATURE_REQUIREMENT_ARRAY);
        }
        return offlineFeatureRequirement;
    }

    public void setOfflineFeatureRequirement(VirtualMachineFeatureRequirement[] offlineFeatureRequirement) {
        this.offlineFeatureRequirement = offlineFeatureRequirement;
    }

    public VirtualMachineFeatureRequirement[] getFeatureRequirement() {
        if ((featureRequirement) == null) {
            return (NULL_FEATURE_REQUIREMENT_ARRAY);
        }
        return featureRequirement;
    }

    public void setFeatureRequirement(VirtualMachineFeatureRequirement[] featureRequirement) {
        this.featureRequirement = featureRequirement;
    }

    public HostFeatureMask[] getFeatureMask() {
        if ((featureMask) == null) {
            return (NULL_FEATURE_MASK_ARRAY);
        }
        return featureMask;
    }

    public void setFeatureMask(HostFeatureMask[] featureMask) {
        this.featureMask = featureMask;
    }

    public Long getVFlashCacheAllocation() {
        return vFlashCacheAllocation;
    }

    public void setVFlashCacheAllocation(Long vFlashCacheAllocation) {
        this.vFlashCacheAllocation = vFlashCacheAllocation;
    }

    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    public Boolean isPaused() {
        return paused;
    }

    public Boolean getSnapshotInBackground() {
        return snapshotInBackground;
    }

    public void setSnapshotInBackground(Boolean snapshotInBackground) {
        this.snapshotInBackground = snapshotInBackground;
    }

    public Boolean isSnapshotInBackground() {
        return snapshotInBackground;
    }

    public Boolean getQuiescedForkParent() {
        return quiescedForkParent;
    }

    public void setQuiescedForkParent(Boolean quiescedForkParent) {
        this.quiescedForkParent = quiescedForkParent;
    }

    public Boolean isQuiescedForkParent() {
        return quiescedForkParent;
    }

    public Boolean getInstantCloneFrozen() {
        return instantCloneFrozen;
    }

    public void setInstantCloneFrozen(Boolean instantCloneFrozen) {
        this.instantCloneFrozen = instantCloneFrozen;
    }

    public Boolean isInstantCloneFrozen() {
        return instantCloneFrozen;
    }

    public String getCryptoState() {
        return cryptoState;
    }

    public void setCryptoState(String cryptoState) {
        this.cryptoState = cryptoState;
    }

}
