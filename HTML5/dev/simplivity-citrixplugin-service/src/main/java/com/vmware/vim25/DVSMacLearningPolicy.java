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
public class DVSMacLearningPolicy
    extends InheritablePolicy
{

    public boolean enabled;
    public Boolean allowUnicastFlooding;
    public Integer limit;
    public String limitPolicy;

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Boolean getAllowUnicastFlooding() {
        return allowUnicastFlooding;
    }

    public void setAllowUnicastFlooding(Boolean allowUnicastFlooding) {
        this.allowUnicastFlooding = allowUnicastFlooding;
    }

    public Boolean isAllowUnicastFlooding() {
        return allowUnicastFlooding;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getLimitPolicy() {
        return limitPolicy;
    }

    public void setLimitPolicy(String limitPolicy) {
        this.limitPolicy = limitPolicy;
    }

}