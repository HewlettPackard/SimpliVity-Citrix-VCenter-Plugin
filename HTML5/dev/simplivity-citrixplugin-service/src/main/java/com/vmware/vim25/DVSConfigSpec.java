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
public class DVSConfigSpec
    extends DynamicData
{

    public String configVersion;
    public String name;
    public Integer numStandalonePorts;
    public Integer maxPorts;
    public DVSUplinkPortPolicy uplinkPortPolicy;
    private final static ManagedObjectReference[] NULL_UPLINK_PORTGROUP_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] uplinkPortgroup;
    public DVPortSetting defaultPortConfig;
    private final static DistributedVirtualSwitchHostMemberConfigSpec[] NULL_HOST_ARRAY = new DistributedVirtualSwitchHostMemberConfigSpec[ 0 ] ;
    public DistributedVirtualSwitchHostMemberConfigSpec[] host;
    public String extensionKey;
    public String description;
    public DVSPolicy policy;
    private final static DistributedVirtualSwitchKeyedOpaqueBlob[] NULL_VENDOR_SPECIFIC_CONFIG_ARRAY = new DistributedVirtualSwitchKeyedOpaqueBlob[ 0 ] ;
    public DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;
    public DVSContactInfo contact;
    public String switchIpAddress;
    public Integer defaultProxySwitchMaxNumPorts;
    private final static DvsHostInfrastructureTrafficResource[] NULL_INFRASTRUCTURE_TRAFFIC_RESOURCE_CONFIG_ARRAY = new DvsHostInfrastructureTrafficResource[ 0 ] ;
    public DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig;
    private final static DvsHostInfrastructureTrafficResource[] NULL_NET_RESOURCE_POOL_TRAFFIC_RESOURCE_CONFIG_ARRAY = new DvsHostInfrastructureTrafficResource[ 0 ] ;
    public DvsHostInfrastructureTrafficResource[] netResourcePoolTrafficResourceConfig;
    public String networkResourceControlVersion;

    public String getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumStandalonePorts() {
        return numStandalonePorts;
    }

    public void setNumStandalonePorts(Integer numStandalonePorts) {
        this.numStandalonePorts = numStandalonePorts;
    }

    public Integer getMaxPorts() {
        return maxPorts;
    }

    public void setMaxPorts(Integer maxPorts) {
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

    public DistributedVirtualSwitchHostMemberConfigSpec[] getHost() {
        if ((host) == null) {
            return (NULL_HOST_ARRAY);
        }
        return host;
    }

    public void setHost(DistributedVirtualSwitchHostMemberConfigSpec[] host) {
        this.host = host;
    }

    public String getExtensionKey() {
        return extensionKey;
    }

    public void setExtensionKey(String extensionKey) {
        this.extensionKey = extensionKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DVSPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(DVSPolicy policy) {
        this.policy = policy;
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

    public Integer getDefaultProxySwitchMaxNumPorts() {
        return defaultProxySwitchMaxNumPorts;
    }

    public void setDefaultProxySwitchMaxNumPorts(Integer defaultProxySwitchMaxNumPorts) {
        this.defaultProxySwitchMaxNumPorts = defaultProxySwitchMaxNumPorts;
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

}