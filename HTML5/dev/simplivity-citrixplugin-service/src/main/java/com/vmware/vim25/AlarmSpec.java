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
public class AlarmSpec
    extends DynamicData
{

    public String name;
    public String systemName;
    public String description;
    public boolean enabled;
    public AlarmExpression expression;
    public AlarmAction action;
    public Integer actionFrequency;
    public AlarmSetting setting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public AlarmExpression getExpression() {
        return expression;
    }

    public void setExpression(AlarmExpression expression) {
        this.expression = expression;
    }

    public AlarmAction getAction() {
        return action;
    }

    public void setAction(AlarmAction action) {
        this.action = action;
    }

    public Integer getActionFrequency() {
        return actionFrequency;
    }

    public void setActionFrequency(Integer actionFrequency) {
        this.actionFrequency = actionFrequency;
    }

    public AlarmSetting getSetting() {
        return setting;
    }

    public void setSetting(AlarmSetting setting) {
        this.setting = setting;
    }

}
