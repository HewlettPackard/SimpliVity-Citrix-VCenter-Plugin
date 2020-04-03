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
public class ClusterConfigInfoEx
    extends ComputeResourceConfigInfo
{

    public ClusterDasConfigInfo dasConfig;
    private final static ClusterDasVmConfigInfo[] NULL_DAS_VM_CONFIG_ARRAY = new ClusterDasVmConfigInfo[ 0 ] ;
    public ClusterDasVmConfigInfo[] dasVmConfig;
    public ClusterDrsConfigInfo drsConfig;
    private final static ClusterDrsVmConfigInfo[] NULL_DRS_VM_CONFIG_ARRAY = new ClusterDrsVmConfigInfo[ 0 ] ;
    public ClusterDrsVmConfigInfo[] drsVmConfig;
    private final static ClusterRuleInfo[] NULL_RULE_ARRAY = new ClusterRuleInfo[ 0 ] ;
    public ClusterRuleInfo[] rule;
    public ClusterOrchestrationInfo orchestration;
    private final static ClusterVmOrchestrationInfo[] NULL_VM_ORCHESTRATION_ARRAY = new ClusterVmOrchestrationInfo[ 0 ] ;
    public ClusterVmOrchestrationInfo[] vmOrchestration;
    public ClusterDpmConfigInfo dpmConfigInfo;
    private final static ClusterDpmHostConfigInfo[] NULL_DPM_HOST_CONFIG_ARRAY = new ClusterDpmHostConfigInfo[ 0 ] ;
    public ClusterDpmHostConfigInfo[] dpmHostConfig;
    public VsanClusterConfigInfo vsanConfigInfo;
    private final static VsanHostConfigInfo[] NULL_VSAN_HOST_CONFIG_ARRAY = new VsanHostConfigInfo[ 0 ] ;
    public VsanHostConfigInfo[] vsanHostConfig;
    private final static ClusterGroupInfo[] NULL_GROUP_ARRAY = new ClusterGroupInfo[ 0 ] ;
    public ClusterGroupInfo[] group;
    public ClusterInfraUpdateHaConfigInfo infraUpdateHaConfig;
    public ClusterProactiveDrsConfigInfo proactiveDrsConfig;

    public ClusterDasConfigInfo getDasConfig() {
        return dasConfig;
    }

    public void setDasConfig(ClusterDasConfigInfo dasConfig) {
        this.dasConfig = dasConfig;
    }

    public ClusterDasVmConfigInfo[] getDasVmConfig() {
        if ((dasVmConfig) == null) {
            return (NULL_DAS_VM_CONFIG_ARRAY);
        }
        return dasVmConfig;
    }

    public void setDasVmConfig(ClusterDasVmConfigInfo[] dasVmConfig) {
        this.dasVmConfig = dasVmConfig;
    }

    public ClusterDrsConfigInfo getDrsConfig() {
        return drsConfig;
    }

    public void setDrsConfig(ClusterDrsConfigInfo drsConfig) {
        this.drsConfig = drsConfig;
    }

    public ClusterDrsVmConfigInfo[] getDrsVmConfig() {
        if ((drsVmConfig) == null) {
            return (NULL_DRS_VM_CONFIG_ARRAY);
        }
        return drsVmConfig;
    }

    public void setDrsVmConfig(ClusterDrsVmConfigInfo[] drsVmConfig) {
        this.drsVmConfig = drsVmConfig;
    }

    public ClusterRuleInfo[] getRule() {
        if ((rule) == null) {
            return (NULL_RULE_ARRAY);
        }
        return rule;
    }

    public void setRule(ClusterRuleInfo[] rule) {
        this.rule = rule;
    }

    public ClusterOrchestrationInfo getOrchestration() {
        return orchestration;
    }

    public void setOrchestration(ClusterOrchestrationInfo orchestration) {
        this.orchestration = orchestration;
    }

    public ClusterVmOrchestrationInfo[] getVmOrchestration() {
        if ((vmOrchestration) == null) {
            return (NULL_VM_ORCHESTRATION_ARRAY);
        }
        return vmOrchestration;
    }

    public void setVmOrchestration(ClusterVmOrchestrationInfo[] vmOrchestration) {
        this.vmOrchestration = vmOrchestration;
    }

    public ClusterDpmConfigInfo getDpmConfigInfo() {
        return dpmConfigInfo;
    }

    public void setDpmConfigInfo(ClusterDpmConfigInfo dpmConfigInfo) {
        this.dpmConfigInfo = dpmConfigInfo;
    }

    public ClusterDpmHostConfigInfo[] getDpmHostConfig() {
        if ((dpmHostConfig) == null) {
            return (NULL_DPM_HOST_CONFIG_ARRAY);
        }
        return dpmHostConfig;
    }

    public void setDpmHostConfig(ClusterDpmHostConfigInfo[] dpmHostConfig) {
        this.dpmHostConfig = dpmHostConfig;
    }

    public VsanClusterConfigInfo getVsanConfigInfo() {
        return vsanConfigInfo;
    }

    public void setVsanConfigInfo(VsanClusterConfigInfo vsanConfigInfo) {
        this.vsanConfigInfo = vsanConfigInfo;
    }

    public VsanHostConfigInfo[] getVsanHostConfig() {
        if ((vsanHostConfig) == null) {
            return (NULL_VSAN_HOST_CONFIG_ARRAY);
        }
        return vsanHostConfig;
    }

    public void setVsanHostConfig(VsanHostConfigInfo[] vsanHostConfig) {
        this.vsanHostConfig = vsanHostConfig;
    }

    public ClusterGroupInfo[] getGroup() {
        if ((group) == null) {
            return (NULL_GROUP_ARRAY);
        }
        return group;
    }

    public void setGroup(ClusterGroupInfo[] group) {
        this.group = group;
    }

    public ClusterInfraUpdateHaConfigInfo getInfraUpdateHaConfig() {
        return infraUpdateHaConfig;
    }

    public void setInfraUpdateHaConfig(ClusterInfraUpdateHaConfigInfo infraUpdateHaConfig) {
        this.infraUpdateHaConfig = infraUpdateHaConfig;
    }

    public ClusterProactiveDrsConfigInfo getProactiveDrsConfig() {
        return proactiveDrsConfig;
    }

    public void setProactiveDrsConfig(ClusterProactiveDrsConfigInfo proactiveDrsConfig) {
        this.proactiveDrsConfig = proactiveDrsConfig;
    }

}
