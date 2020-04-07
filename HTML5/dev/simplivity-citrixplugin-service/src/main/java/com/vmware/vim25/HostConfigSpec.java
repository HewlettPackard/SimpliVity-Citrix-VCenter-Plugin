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
public class HostConfigSpec
    extends DynamicData
{

    private final static HostNasVolumeConfig[] NULL_NAS_DATASTORE_ARRAY = new HostNasVolumeConfig[ 0 ] ;
    public HostNasVolumeConfig[] nasDatastore;
    public HostNetworkConfig network;
    private final static HostVirtualNicManagerNicTypeSelection[] NULL_NIC_TYPE_SELECTION_ARRAY = new HostVirtualNicManagerNicTypeSelection[ 0 ] ;
    public HostVirtualNicManagerNicTypeSelection[] nicTypeSelection;
    private final static HostServiceConfig[] NULL_SERVICE_ARRAY = new HostServiceConfig[ 0 ] ;
    public HostServiceConfig[] service;
    public HostFirewallConfig firewall;
    private final static OptionValue[] NULL_OPTION_ARRAY = new OptionValue[ 0 ] ;
    public OptionValue[] option;
    public String datastorePrincipal;
    public String datastorePrincipalPasswd;
    public HostDateTimeConfig datetime;
    public HostStorageDeviceInfo storageDevice;
    public HostLicenseSpec license;
    public HostSecuritySpec security;
    private final static HostAccountSpec[] NULL_USER_ACCOUNT_ARRAY = new HostAccountSpec[ 0 ] ;
    public HostAccountSpec[] userAccount;
    private final static HostAccountSpec[] NULL_USERGROUP_ACCOUNT_ARRAY = new HostAccountSpec[ 0 ] ;
    public HostAccountSpec[] usergroupAccount;
    public HostMemorySpec memory;
    private final static HostActiveDirectory[] NULL_ACTIVE_DIRECTORY_ARRAY = new HostActiveDirectory[ 0 ] ;
    public HostActiveDirectory[] activeDirectory;
    private final static KeyAnyValue[] NULL_GENERIC_CONFIG_ARRAY = new KeyAnyValue[ 0 ] ;
    public KeyAnyValue[] genericConfig;
    public HostGraphicsConfig graphicsConfig;

    public HostNasVolumeConfig[] getNasDatastore() {
        if ((nasDatastore) == null) {
            return (NULL_NAS_DATASTORE_ARRAY);
        }
        return nasDatastore;
    }

    public void setNasDatastore(HostNasVolumeConfig[] nasDatastore) {
        this.nasDatastore = nasDatastore;
    }

    public HostNetworkConfig getNetwork() {
        return network;
    }

    public void setNetwork(HostNetworkConfig network) {
        this.network = network;
    }

    public HostVirtualNicManagerNicTypeSelection[] getNicTypeSelection() {
        if ((nicTypeSelection) == null) {
            return (NULL_NIC_TYPE_SELECTION_ARRAY);
        }
        return nicTypeSelection;
    }

    public void setNicTypeSelection(HostVirtualNicManagerNicTypeSelection[] nicTypeSelection) {
        this.nicTypeSelection = nicTypeSelection;
    }

    public HostServiceConfig[] getService() {
        if ((service) == null) {
            return (NULL_SERVICE_ARRAY);
        }
        return service;
    }

    public void setService(HostServiceConfig[] service) {
        this.service = service;
    }

    public HostFirewallConfig getFirewall() {
        return firewall;
    }

    public void setFirewall(HostFirewallConfig firewall) {
        this.firewall = firewall;
    }

    public OptionValue[] getOption() {
        if ((option) == null) {
            return (NULL_OPTION_ARRAY);
        }
        return option;
    }

    public void setOption(OptionValue[] option) {
        this.option = option;
    }

    public String getDatastorePrincipal() {
        return datastorePrincipal;
    }

    public void setDatastorePrincipal(String datastorePrincipal) {
        this.datastorePrincipal = datastorePrincipal;
    }

    public String getDatastorePrincipalPasswd() {
        return datastorePrincipalPasswd;
    }

    public void setDatastorePrincipalPasswd(String datastorePrincipalPasswd) {
        this.datastorePrincipalPasswd = datastorePrincipalPasswd;
    }

    public HostDateTimeConfig getDatetime() {
        return datetime;
    }

    public void setDatetime(HostDateTimeConfig datetime) {
        this.datetime = datetime;
    }

    public HostStorageDeviceInfo getStorageDevice() {
        return storageDevice;
    }

    public void setStorageDevice(HostStorageDeviceInfo storageDevice) {
        this.storageDevice = storageDevice;
    }

    public HostLicenseSpec getLicense() {
        return license;
    }

    public void setLicense(HostLicenseSpec license) {
        this.license = license;
    }

    public HostSecuritySpec getSecurity() {
        return security;
    }

    public void setSecurity(HostSecuritySpec security) {
        this.security = security;
    }

    public HostAccountSpec[] getUserAccount() {
        if ((userAccount) == null) {
            return (NULL_USER_ACCOUNT_ARRAY);
        }
        return userAccount;
    }

    public void setUserAccount(HostAccountSpec[] userAccount) {
        this.userAccount = userAccount;
    }

    public HostAccountSpec[] getUsergroupAccount() {
        if ((usergroupAccount) == null) {
            return (NULL_USERGROUP_ACCOUNT_ARRAY);
        }
        return usergroupAccount;
    }

    public void setUsergroupAccount(HostAccountSpec[] usergroupAccount) {
        this.usergroupAccount = usergroupAccount;
    }

    public HostMemorySpec getMemory() {
        return memory;
    }

    public void setMemory(HostMemorySpec memory) {
        this.memory = memory;
    }

    public HostActiveDirectory[] getActiveDirectory() {
        if ((activeDirectory) == null) {
            return (NULL_ACTIVE_DIRECTORY_ARRAY);
        }
        return activeDirectory;
    }

    public void setActiveDirectory(HostActiveDirectory[] activeDirectory) {
        this.activeDirectory = activeDirectory;
    }

    public KeyAnyValue[] getGenericConfig() {
        if ((genericConfig) == null) {
            return (NULL_GENERIC_CONFIG_ARRAY);
        }
        return genericConfig;
    }

    public void setGenericConfig(KeyAnyValue[] genericConfig) {
        this.genericConfig = genericConfig;
    }

    public HostGraphicsConfig getGraphicsConfig() {
        return graphicsConfig;
    }

    public void setGraphicsConfig(HostGraphicsConfig graphicsConfig) {
        this.graphicsConfig = graphicsConfig;
    }

}
