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
public class ApplyHostProfileConfigurationSpec
    extends ProfileExecuteResult
{

    public ManagedObjectReference host;
    private final static String[] NULL_TASK_LIST_REQUIREMENT_ARRAY = new String[ 0 ] ;
    public String[] taskListRequirement;
    private final static LocalizableMessage[] NULL_TASK_DESCRIPTION_ARRAY = new LocalizableMessage[ 0 ] ;
    public LocalizableMessage[] taskDescription;
    public Boolean rebootStateless;
    public Boolean rebootHost;
    public LocalizedMethodFault faultData;

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public String[] getTaskListRequirement() {
        if ((taskListRequirement) == null) {
            return (NULL_TASK_LIST_REQUIREMENT_ARRAY);
        }
        return taskListRequirement;
    }

    public void setTaskListRequirement(String[] taskListRequirement) {
        this.taskListRequirement = taskListRequirement;
    }

    public LocalizableMessage[] getTaskDescription() {
        if ((taskDescription) == null) {
            return (NULL_TASK_DESCRIPTION_ARRAY);
        }
        return taskDescription;
    }

    public void setTaskDescription(LocalizableMessage[] taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Boolean getRebootStateless() {
        return rebootStateless;
    }

    public void setRebootStateless(Boolean rebootStateless) {
        this.rebootStateless = rebootStateless;
    }

    public Boolean isRebootStateless() {
        return rebootStateless;
    }

    public Boolean getRebootHost() {
        return rebootHost;
    }

    public void setRebootHost(Boolean rebootHost) {
        this.rebootHost = rebootHost;
    }

    public Boolean isRebootHost() {
        return rebootHost;
    }

    public LocalizedMethodFault getFaultData() {
        return faultData;
    }

    public void setFaultData(LocalizedMethodFault faultData) {
        this.faultData = faultData;
    }

}
