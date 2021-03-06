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
public class DVPortgroupConfigInfo
    extends DynamicData
{

    public String key;
    public String name;
    public int numPorts;
    public ManagedObjectReference distributedVirtualSwitch;
    public DVPortSetting defaultPortConfig;
    public String description;
    public String type;
    public DVPortgroupPolicy policy;
    public String portNameFormat;
    private final static ManagedObjectReference[] NULL_SCOPE_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] scope;
    private final static DistributedVirtualSwitchKeyedOpaqueBlob[] NULL_VENDOR_SPECIFIC_CONFIG_ARRAY = new DistributedVirtualSwitchKeyedOpaqueBlob[ 0 ] ;
    public DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;
    public String configVersion;
    public Boolean autoExpand;
    public String vmVnicNetworkResourcePoolKey;
    public Boolean uplink;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public ManagedObjectReference getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }

    public void setDistributedVirtualSwitch(ManagedObjectReference distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    public DVPortSetting getDefaultPortConfig() {
        return defaultPortConfig;
    }

    public void setDefaultPortConfig(DVPortSetting defaultPortConfig) {
        this.defaultPortConfig = defaultPortConfig;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DVPortgroupPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(DVPortgroupPolicy policy) {
        this.policy = policy;
    }

    public String getPortNameFormat() {
        return portNameFormat;
    }

    public void setPortNameFormat(String portNameFormat) {
        this.portNameFormat = portNameFormat;
    }

    public ManagedObjectReference[] getScope() {
        if ((scope) == null) {
            return (NULL_SCOPE_ARRAY);
        }
        return scope;
    }

    public void setScope(ManagedObjectReference[] scope) {
        this.scope = scope;
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

    public String getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    public Boolean getAutoExpand() {
        return autoExpand;
    }

    public void setAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
    }

    public Boolean isAutoExpand() {
        return autoExpand;
    }

    public String getVmVnicNetworkResourcePoolKey() {
        return vmVnicNetworkResourcePoolKey;
    }

    public void setVmVnicNetworkResourcePoolKey(String vmVnicNetworkResourcePoolKey) {
        this.vmVnicNetworkResourcePoolKey = vmVnicNetworkResourcePoolKey;
    }

    public Boolean getUplink() {
        return uplink;
    }

    public void setUplink(Boolean uplink) {
        this.uplink = uplink;
    }

    public Boolean isUplink() {
        return uplink;
    }

}
