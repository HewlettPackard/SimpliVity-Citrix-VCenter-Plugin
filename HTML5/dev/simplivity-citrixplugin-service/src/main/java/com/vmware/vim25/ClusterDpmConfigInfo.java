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
public class ClusterDpmConfigInfo
    extends DynamicData
{

    public Boolean enabled;
    public DpmBehavior defaultDpmBehavior;
    public Integer hostPowerActionRate;
    private final static OptionValue[] NULL_OPTION_ARRAY = new OptionValue[ 0 ] ;
    public OptionValue[] option;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public DpmBehavior getDefaultDpmBehavior() {
        return defaultDpmBehavior;
    }

    public void setDefaultDpmBehavior(DpmBehavior defaultDpmBehavior) {
        this.defaultDpmBehavior = defaultDpmBehavior;
    }

    public Integer getHostPowerActionRate() {
        return hostPowerActionRate;
    }

    public void setHostPowerActionRate(Integer hostPowerActionRate) {
        this.hostPowerActionRate = hostPowerActionRate;
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

}