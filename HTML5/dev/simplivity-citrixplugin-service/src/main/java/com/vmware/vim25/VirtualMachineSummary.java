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
public class VirtualMachineSummary
    extends DynamicData
{

    public ManagedObjectReference vm;
    public VirtualMachineRuntimeInfo runtime;
    public VirtualMachineGuestSummary guest;
    public VirtualMachineConfigSummary config;
    public VirtualMachineStorageSummary storage;
    public VirtualMachineQuickStats quickStats;
    public ManagedEntityStatus overallStatus;
    private final static CustomFieldValue[] NULL_CUSTOM_VALUE_ARRAY = new CustomFieldValue[ 0 ] ;
    public CustomFieldValue[] customValue;

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(ManagedObjectReference vm) {
        this.vm = vm;
    }

    public VirtualMachineRuntimeInfo getRuntime() {
        return runtime;
    }

    public void setRuntime(VirtualMachineRuntimeInfo runtime) {
        this.runtime = runtime;
    }

    public VirtualMachineGuestSummary getGuest() {
        return guest;
    }

    public void setGuest(VirtualMachineGuestSummary guest) {
        this.guest = guest;
    }

    public VirtualMachineConfigSummary getConfig() {
        return config;
    }

    public void setConfig(VirtualMachineConfigSummary config) {
        this.config = config;
    }

    public VirtualMachineStorageSummary getStorage() {
        return storage;
    }

    public void setStorage(VirtualMachineStorageSummary storage) {
        this.storage = storage;
    }

    public VirtualMachineQuickStats getQuickStats() {
        return quickStats;
    }

    public void setQuickStats(VirtualMachineQuickStats quickStats) {
        this.quickStats = quickStats;
    }

    public ManagedEntityStatus getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(ManagedEntityStatus overallStatus) {
        this.overallStatus = overallStatus;
    }

    public CustomFieldValue[] getCustomValue() {
        if ((customValue) == null) {
            return (NULL_CUSTOM_VALUE_ARRAY);
        }
        return customValue;
    }

    public void setCustomValue(CustomFieldValue[] customValue) {
        this.customValue = customValue;
    }

}