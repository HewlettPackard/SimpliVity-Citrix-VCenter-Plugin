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
public class HostPortGroupSpec
    extends DynamicData
{

    public String name;
    public int vlanId;
    public String vswitchName;
    public HostNetworkPolicy policy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVlanId() {
        return vlanId;
    }

    public void setVlanId(int vlanId) {
        this.vlanId = vlanId;
    }

    public String getVswitchName() {
        return vswitchName;
    }

    public void setVswitchName(String vswitchName) {
        this.vswitchName = vswitchName;
    }

    public HostNetworkPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(HostNetworkPolicy policy) {
        this.policy = policy;
    }

}