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
public class VmPodConfigForPlacement
    extends DynamicData
{

    public ManagedObjectReference storagePod;
    private final static PodDiskLocator[] NULL_DISK_ARRAY = new PodDiskLocator[ 0 ] ;
    public PodDiskLocator[] disk;
    public StorageDrsVmConfigInfo vmConfig;
    private final static ClusterRuleInfo[] NULL_INTER_VM_RULE_ARRAY = new ClusterRuleInfo[ 0 ] ;
    public ClusterRuleInfo[] interVmRule;

    public ManagedObjectReference getStoragePod() {
        return storagePod;
    }

    public void setStoragePod(ManagedObjectReference storagePod) {
        this.storagePod = storagePod;
    }

    public PodDiskLocator[] getDisk() {
        if ((disk) == null) {
            return (NULL_DISK_ARRAY);
        }
        return disk;
    }

    public void setDisk(PodDiskLocator[] disk) {
        this.disk = disk;
    }

    public StorageDrsVmConfigInfo getVmConfig() {
        return vmConfig;
    }

    public void setVmConfig(StorageDrsVmConfigInfo vmConfig) {
        this.vmConfig = vmConfig;
    }

    public ClusterRuleInfo[] getInterVmRule() {
        if ((interVmRule) == null) {
            return (NULL_INTER_VM_RULE_ARRAY);
        }
        return interVmRule;
    }

    public void setInterVmRule(ClusterRuleInfo[] interVmRule) {
        this.interVmRule = interVmRule;
    }

}
