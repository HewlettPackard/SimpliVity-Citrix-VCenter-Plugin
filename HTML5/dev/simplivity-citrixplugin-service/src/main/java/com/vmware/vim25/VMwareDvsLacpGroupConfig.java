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
public class VMwareDvsLacpGroupConfig
    extends DynamicData
{

    public String key;
    public String name;
    public String mode;
    public Integer uplinkNum;
    public String loadbalanceAlgorithm;
    public VMwareDvsLagVlanConfig vlan;
    public VMwareDvsLagIpfixConfig ipfix;
    private final static String[] NULL_UPLINK_NAME_ARRAY = new String[ 0 ] ;
    public String[] uplinkName;
    private final static String[] NULL_UPLINK_PORT_KEY_ARRAY = new String[ 0 ] ;
    public String[] uplinkPortKey;

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

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getUplinkNum() {
        return uplinkNum;
    }

    public void setUplinkNum(Integer uplinkNum) {
        this.uplinkNum = uplinkNum;
    }

    public String getLoadbalanceAlgorithm() {
        return loadbalanceAlgorithm;
    }

    public void setLoadbalanceAlgorithm(String loadbalanceAlgorithm) {
        this.loadbalanceAlgorithm = loadbalanceAlgorithm;
    }

    public VMwareDvsLagVlanConfig getVlan() {
        return vlan;
    }

    public void setVlan(VMwareDvsLagVlanConfig vlan) {
        this.vlan = vlan;
    }

    public VMwareDvsLagIpfixConfig getIpfix() {
        return ipfix;
    }

    public void setIpfix(VMwareDvsLagIpfixConfig ipfix) {
        this.ipfix = ipfix;
    }

    public String[] getUplinkName() {
        if ((uplinkName) == null) {
            return (NULL_UPLINK_NAME_ARRAY);
        }
        return uplinkName;
    }

    public void setUplinkName(String[] uplinkName) {
        this.uplinkName = uplinkName;
    }

    public String[] getUplinkPortKey() {
        if ((uplinkPortKey) == null) {
            return (NULL_UPLINK_PORT_KEY_ARRAY);
        }
        return uplinkPortKey;
    }

    public void setUplinkPortKey(String[] uplinkPortKey) {
        this.uplinkPortKey = uplinkPortKey;
    }

}
