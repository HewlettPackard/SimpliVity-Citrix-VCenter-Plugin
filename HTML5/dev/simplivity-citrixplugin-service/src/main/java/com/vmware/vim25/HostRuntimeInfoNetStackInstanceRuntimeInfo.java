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
public class HostRuntimeInfoNetStackInstanceRuntimeInfo
    extends DynamicData
{

    public String netStackInstanceKey;
    public String state;
    private final static String[] NULL_VMKNIC_KEYS_ARRAY = new String[ 0 ] ;
    public String[] vmknicKeys;
    public Integer maxNumberOfConnections;
    public Boolean currentIpV6Enabled;

    public String getNetStackInstanceKey() {
        return netStackInstanceKey;
    }

    public void setNetStackInstanceKey(String netStackInstanceKey) {
        this.netStackInstanceKey = netStackInstanceKey;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String[] getVmknicKeys() {
        if ((vmknicKeys) == null) {
            return (NULL_VMKNIC_KEYS_ARRAY);
        }
        return vmknicKeys;
    }

    public void setVmknicKeys(String[] vmknicKeys) {
        this.vmknicKeys = vmknicKeys;
    }

    public Integer getMaxNumberOfConnections() {
        return maxNumberOfConnections;
    }

    public void setMaxNumberOfConnections(Integer maxNumberOfConnections) {
        this.maxNumberOfConnections = maxNumberOfConnections;
    }

    public Boolean getCurrentIpV6Enabled() {
        return currentIpV6Enabled;
    }

    public void setCurrentIpV6Enabled(Boolean currentIpV6Enabled) {
        this.currentIpV6Enabled = currentIpV6Enabled;
    }

    public Boolean isCurrentIpV6Enabled() {
        return currentIpV6Enabled;
    }

}
