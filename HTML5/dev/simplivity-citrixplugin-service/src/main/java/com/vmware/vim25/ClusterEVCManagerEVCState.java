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
public class ClusterEVCManagerEVCState
    extends DynamicData
{

    private final static EVCMode[] NULL_SUPPORTED_EV_CMODE_ARRAY = new EVCMode[ 0 ] ;
    public EVCMode[] supportedEVCMode;
    public String currentEVCModeKey;
    private final static HostCpuIdInfo[] NULL_GUARANTEED_CP_UFEATURES_ARRAY = new HostCpuIdInfo[ 0 ] ;
    public HostCpuIdInfo[] guaranteedCPUFeatures;
    private final static HostFeatureCapability[] NULL_FEATURE_CAPABILITY_ARRAY = new HostFeatureCapability[ 0 ] ;
    public HostFeatureCapability[] featureCapability;
    private final static HostFeatureMask[] NULL_FEATURE_MASK_ARRAY = new HostFeatureMask[ 0 ] ;
    public HostFeatureMask[] featureMask;
    private final static VirtualMachineFeatureRequirement[] NULL_FEATURE_REQUIREMENT_ARRAY = new VirtualMachineFeatureRequirement[ 0 ] ;
    public VirtualMachineFeatureRequirement[] featureRequirement;

    public EVCMode[] getSupportedEVCMode() {
        if ((supportedEVCMode) == null) {
            return (NULL_SUPPORTED_EV_CMODE_ARRAY);
        }
        return supportedEVCMode;
    }

    public void setSupportedEVCMode(EVCMode[] supportedEVCMode) {
        this.supportedEVCMode = supportedEVCMode;
    }

    public String getCurrentEVCModeKey() {
        return currentEVCModeKey;
    }

    public void setCurrentEVCModeKey(String currentEVCModeKey) {
        this.currentEVCModeKey = currentEVCModeKey;
    }

    public HostCpuIdInfo[] getGuaranteedCPUFeatures() {
        if ((guaranteedCPUFeatures) == null) {
            return (NULL_GUARANTEED_CP_UFEATURES_ARRAY);
        }
        return guaranteedCPUFeatures;
    }

    public void setGuaranteedCPUFeatures(HostCpuIdInfo[] guaranteedCPUFeatures) {
        this.guaranteedCPUFeatures = guaranteedCPUFeatures;
    }

    public HostFeatureCapability[] getFeatureCapability() {
        if ((featureCapability) == null) {
            return (NULL_FEATURE_CAPABILITY_ARRAY);
        }
        return featureCapability;
    }

    public void setFeatureCapability(HostFeatureCapability[] featureCapability) {
        this.featureCapability = featureCapability;
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

    public VirtualMachineFeatureRequirement[] getFeatureRequirement() {
        if ((featureRequirement) == null) {
            return (NULL_FEATURE_REQUIREMENT_ARRAY);
        }
        return featureRequirement;
    }

    public void setFeatureRequirement(VirtualMachineFeatureRequirement[] featureRequirement) {
        this.featureRequirement = featureRequirement;
    }

}