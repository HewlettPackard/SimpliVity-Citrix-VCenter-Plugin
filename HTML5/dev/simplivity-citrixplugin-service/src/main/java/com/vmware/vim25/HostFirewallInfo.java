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
public class HostFirewallInfo
    extends DynamicData
{

    public HostFirewallDefaultPolicy defaultPolicy;
    private final static HostFirewallRuleset[] NULL_RULESET_ARRAY = new HostFirewallRuleset[ 0 ] ;
    public HostFirewallRuleset[] ruleset;

    public HostFirewallDefaultPolicy getDefaultPolicy() {
        return defaultPolicy;
    }

    public void setDefaultPolicy(HostFirewallDefaultPolicy defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
    }

    public HostFirewallRuleset[] getRuleset() {
        if ((ruleset) == null) {
            return (NULL_RULESET_ARRAY);
        }
        return ruleset;
    }

    public void setRuleset(HostFirewallRuleset[] ruleset) {
        this.ruleset = ruleset;
    }

}