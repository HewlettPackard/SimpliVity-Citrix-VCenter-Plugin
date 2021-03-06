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
@SuppressWarnings("all")
public class DVSConfigInfo
    extends DynamicData
{

    public String uuid;
    public String name;
    public int numStandalonePorts;
    public int numPorts;
    public int maxPorts;
    public DVSUplinkPortPolicy uplinkPortPolicy;
    private final static ManagedObjectReference[] NULL_UPLINK_PORTGROUP_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] uplinkPortgroup;
    public DVPortSetting defaultPortConfig;
    private final static DistributedVirtualSwitchHostMember[] NULL_HOST_ARRAY = new DistributedVirtualSwitchHostMember[ 0 ] ;
    public DistributedVirtualSwitchHostMember[] host;
    public DistributedVirtualSwitchProductSpec productInfo;
    public DistributedVirtualSwitchProductSpec targetInfo;
    public String extensionKey;
    private final static DistributedVirtualSwitchKeyedOpaqueBlob[] NULL_VENDOR_SPECIFIC_CONFIG_ARRAY = new DistributedVirtualSwitchKeyedOpaqueBlob[ 0 ] ;
    public DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;
    public DVSPolicy policy;
    public String description;
    public String configVersion;
    public DVSContactInfo contact;
    public String switchIpAddress;
    public Calendar createTime;
    public Boolean networkResourceManagementEnabled;
    public Integer defaultProxySwitchMaxNumPorts;
    private final static DVSHealthCheckConfig[] NULL_HEALTH_CHECK_CONFIG_ARRAY = new DVSHealthCheckConfig[ 0 ] ;
    public DVSHealthCheckConfig[] healthCheckConfig;
    private final static DvsHostInfrastructureTrafficResource[] NULL_INFRASTRUCTURE_TRAFFIC_RESOURCE_CONFIG_ARRAY = new DvsHostInfrastructureTrafficResource[ 0 ] ;
    public DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig;
    private final static DvsHostInfrastructureTrafficResource[] NULL_NET_RESOURCE_POOL_TRAFFIC_RESOURCE_CONFIG_ARRAY = new DvsHostInfrastructureTrafficResource[ 0 ] ;
    public DvsHostInfrastructureTrafficResource[] netResourcePoolTrafficResourceConfig;
    public String networkResourceControlVersion;
    private final static DVSVmVnicNetworkResourcePool[] NULL_VM_VNIC_NETWORK_RESOURCE_POOL_ARRAY = new DVSVmVnicNetworkResourcePool[ 0 ] ;
    public DVSVmVnicNetworkResourcePool[] vmVnicNetworkResourcePool;
    public Integer pnicCapacityRatioForReservation;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumStandalonePorts() {
        return numStandalonePorts;
    }

    public void setNumStandalonePorts(int numStandalonePorts) {
        this.numStandalonePorts = numStandalonePorts;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public int getMaxPorts() {
        return maxPorts;
    }

    public void setMaxPorts(int maxPorts) {
        this.maxPorts = maxPorts;
    }

    public DVSUplinkPortPolicy getUplinkPortPolicy() {
        return uplinkPortPolicy;
    }

    public void setUplinkPortPolicy(DVSUplinkPortPolicy uplinkPortPolicy) {
        this.uplinkPortPolicy = uplinkPortPolicy;
    }

    public ManagedObjectReference[] getUplinkPortgroup() {
        if ((uplinkPortgroup) == null) {
            return (NULL_UPLINK_PORTGROUP_ARRAY);
        }
        return uplinkPortgroup;
    }

    public void setUplinkPortgroup(ManagedObjectReference[] uplinkPortgroup) {
        this.uplinkPortgroup = uplinkPortgroup;
    }

    public DVPortSetting getDefaultPortConfig() {
        return defaultPortConfig;
    }

    public void setDefaultPortConfig(DVPortSetting defaultPortConfig) {
        this.defaultPortConfig = defaultPortConfig;
    }

    public DistributedVirtualSwitchHostMember[] getHost() {
        if ((host) == null) {
            return (NULL_HOST_ARRAY);
        }
        return host;
    }

    public void setHost(DistributedVirtualSwitchHostMember[] host) {
        this.host = host;
    }

    public DistributedVirtualSwitchProductSpec getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(DistributedVirtualSwitchProductSpec productInfo) {
        this.productInfo = productInfo;
    }

    public DistributedVirtualSwitchProductSpec getTargetInfo() {
        return targetInfo;
    }

    public void setTargetInfo(DistributedVirtualSwitchProductSpec targetInfo) {
        this.targetInfo = targetInfo;
    }

    public String getExtensionKey() {
        return extensionKey;
    }

    public void setExtensionKey(String extensionKey) {
        this.extensionKey = extensionKey;
    }

    public DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        if ((vendorSpecificConfig) == null) {
            return (NULL_VENDOR_SPECIFIC_CONFIG_ARRAY);
        }
        return vendorSpecificConfig;
    }

    public void setVendorSpecificConfig(DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public DVSPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(DVSPolicy policy) {
        this.policy = policy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    public DVSContactInfo getContact() {
        return contact;
    }

    public void setContact(DVSContactInfo contact) {
        this.contact = contact;
    }

    public String getSwitchIpAddress() {
        return switchIpAddress;
    }

    public void setSwitchIpAddress(String switchIpAddress) {
        this.switchIpAddress = switchIpAddress;
    }

    public Calendar getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Calendar createTime) {
        this.createTime = createTime;
    }

    public Boolean getNetworkResourceManagementEnabled() {
        return networkResourceManagementEnabled;
    }

    public void setNetworkResourceManagementEnabled(Boolean networkResourceManagementEnabled) {
        this.networkResourceManagementEnabled = networkResourceManagementEnabled;
    }

    public Boolean isNetworkResourceManagementEnabled() {
        return networkResourceManagementEnabled;
    }

    public Integer getDefaultProxySwitchMaxNumPorts() {
        return defaultProxySwitchMaxNumPorts;
    }

    public void setDefaultProxySwitchMaxNumPorts(Integer defaultProxySwitchMaxNumPorts) {
        this.defaultProxySwitchMaxNumPorts = defaultProxySwitchMaxNumPorts;
    }

    public DVSHealthCheckConfig[] getHealthCheckConfig() {
        if ((healthCheckConfig) == null) {
            return (NULL_HEALTH_CHECK_CONFIG_ARRAY);
        }
        return healthCheckConfig;
    }

    public void setHealthCheckConfig(DVSHealthCheckConfig[] healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    public DvsHostInfrastructureTrafficResource[] getInfrastructureTrafficResourceConfig() {
        if ((infrastructureTrafficResourceConfig) == null) {
            return (NULL_INFRASTRUCTURE_TRAFFIC_RESOURCE_CONFIG_ARRAY);
        }
        return infrastructureTrafficResourceConfig;
    }

    public void setInfrastructureTrafficResourceConfig(DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig) {
        this.infrastructureTrafficResourceConfig = infrastructureTrafficResourceConfig;
    }

    public DvsHostInfrastructureTrafficResource[] getNetResourcePoolTrafficResourceConfig() {
        if ((netResourcePoolTrafficResourceConfig) == null) {
            return (NULL_NET_RESOURCE_POOL_TRAFFIC_RESOURCE_CONFIG_ARRAY);
        }
        return netResourcePoolTrafficResourceConfig;
    }

    public void setNetResourcePoolTrafficResourceConfig(DvsHostInfrastructureTrafficResource[] netResourcePoolTrafficResourceConfig) {
        this.netResourcePoolTrafficResourceConfig = netResourcePoolTrafficResourceConfig;
    }

    public String getNetworkResourceControlVersion() {
        return networkResourceControlVersion;
    }

    public void setNetworkResourceControlVersion(String networkResourceControlVersion) {
        this.networkResourceControlVersion = networkResourceControlVersion;
    }

    public DVSVmVnicNetworkResourcePool[] getVmVnicNetworkResourcePool() {
        if ((vmVnicNetworkResourcePool) == null) {
            return (NULL_VM_VNIC_NETWORK_RESOURCE_POOL_ARRAY);
        }
        return vmVnicNetworkResourcePool;
    }

    public void setVmVnicNetworkResourcePool(DVSVmVnicNetworkResourcePool[] vmVnicNetworkResourcePool) {
        this.vmVnicNetworkResourcePool = vmVnicNetworkResourcePool;
    }

    public Integer getPnicCapacityRatioForReservation() {
        return pnicCapacityRatioForReservation;
    }

    public void setPnicCapacityRatioForReservation(Integer pnicCapacityRatioForReservation) {
        this.pnicCapacityRatioForReservation = pnicCapacityRatioForReservation;
    }

}
