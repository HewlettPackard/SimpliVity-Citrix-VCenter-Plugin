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
public class HostFirewallConfig
    extends DynamicData
{

    private final static HostFirewallConfigRuleSetConfig[] NULL_RULE_ARRAY = new HostFirewallConfigRuleSetConfig[ 0 ] ;
    public HostFirewallConfigRuleSetConfig[] rule;
    public HostFirewallDefaultPolicy defaultBlockingPolicy;

    public HostFirewallConfigRuleSetConfig[] getRule() {
        if ((rule) == null) {
            return (NULL_RULE_ARRAY);
        }
        return rule;
    }

    public void setRule(HostFirewallConfigRuleSetConfig[] rule) {
        this.rule = rule;
    }

    public HostFirewallDefaultPolicy getDefaultBlockingPolicy() {
        return defaultBlockingPolicy;
    }

    public void setDefaultBlockingPolicy(HostFirewallDefaultPolicy defaultBlockingPolicy) {
        this.defaultBlockingPolicy = defaultBlockingPolicy;
    }

}