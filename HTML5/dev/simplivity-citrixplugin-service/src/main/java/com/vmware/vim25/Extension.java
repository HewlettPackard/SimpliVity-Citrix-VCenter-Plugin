//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;

import java.util.Calendar;


/**
 * 
 */
@SuppressWarnings("all")
public class Extension
    extends DynamicData
{

    public Description description;
    public String key;
    public String company;
    public String type;
    public String version;
    public String subjectName;
    private final static ExtensionServerInfo[] NULL_SERVER_ARRAY = new ExtensionServerInfo[ 0 ] ;
    public ExtensionServerInfo[] server;
    private final static ExtensionClientInfo[] NULL_CLIENT_ARRAY = new ExtensionClientInfo[ 0 ] ;
    public ExtensionClientInfo[] client;
    private final static ExtensionTaskTypeInfo[] NULL_TASK_LIST_ARRAY = new ExtensionTaskTypeInfo[ 0 ] ;
    public ExtensionTaskTypeInfo[] taskList;
    private final static ExtensionEventTypeInfo[] NULL_EVENT_LIST_ARRAY = new ExtensionEventTypeInfo[ 0 ] ;
    public ExtensionEventTypeInfo[] eventList;
    private final static ExtensionFaultTypeInfo[] NULL_FAULT_LIST_ARRAY = new ExtensionFaultTypeInfo[ 0 ] ;
    public ExtensionFaultTypeInfo[] faultList;
    private final static ExtensionPrivilegeInfo[] NULL_PRIVILEGE_LIST_ARRAY = new ExtensionPrivilegeInfo[ 0 ] ;
    public ExtensionPrivilegeInfo[] privilegeList;
    private final static ExtensionResourceInfo[] NULL_RESOURCE_LIST_ARRAY = new ExtensionResourceInfo[ 0 ] ;
    public ExtensionResourceInfo[] resourceList;
    public Calendar lastHeartbeatTime;
    public ExtensionHealthInfo healthInfo;
    public ExtensionOvfConsumerInfo ovfConsumerInfo;
    public ExtExtendedProductInfo extendedProductInfo;
    private final static ExtManagedEntityInfo[] NULL_MANAGED_ENTITY_INFO_ARRAY = new ExtManagedEntityInfo[ 0 ] ;
    public ExtManagedEntityInfo[] managedEntityInfo;
    public Boolean shownInSolutionManager;
    public ExtSolutionManagerInfo solutionManagerInfo;

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ExtensionServerInfo[] getServer() {
        if ((server) == null) {
            return (NULL_SERVER_ARRAY);
        }
        return server;
    }

    public void setServer(ExtensionServerInfo[] server) {
        this.server = server;
    }

    public ExtensionClientInfo[] getClient() {
        if ((client) == null) {
            return (NULL_CLIENT_ARRAY);
        }
        return client;
    }

    public void setClient(ExtensionClientInfo[] client) {
        this.client = client;
    }

    public ExtensionTaskTypeInfo[] getTaskList() {
        if ((taskList) == null) {
            return (NULL_TASK_LIST_ARRAY);
        }
        return taskList;
    }

    public void setTaskList(ExtensionTaskTypeInfo[] taskList) {
        this.taskList = taskList;
    }

    public ExtensionEventTypeInfo[] getEventList() {
        if ((eventList) == null) {
            return (NULL_EVENT_LIST_ARRAY);
        }
        return eventList;
    }

    public void setEventList(ExtensionEventTypeInfo[] eventList) {
        this.eventList = eventList;
    }

    public ExtensionFaultTypeInfo[] getFaultList() {
        if ((faultList) == null) {
            return (NULL_FAULT_LIST_ARRAY);
        }
        return faultList;
    }

    public void setFaultList(ExtensionFaultTypeInfo[] faultList) {
        this.faultList = faultList;
    }

    public ExtensionPrivilegeInfo[] getPrivilegeList() {
        if ((privilegeList) == null) {
            return (NULL_PRIVILEGE_LIST_ARRAY);
        }
        return privilegeList;
    }

    public void setPrivilegeList(ExtensionPrivilegeInfo[] privilegeList) {
        this.privilegeList = privilegeList;
    }

    public ExtensionResourceInfo[] getResourceList() {
        if ((resourceList) == null) {
            return (NULL_RESOURCE_LIST_ARRAY);
        }
        return resourceList;
    }

    public void setResourceList(ExtensionResourceInfo[] resourceList) {
        this.resourceList = resourceList;
    }

    public Calendar getLastHeartbeatTime() {
        return lastHeartbeatTime;
    }

    public void setLastHeartbeatTime(Calendar lastHeartbeatTime) {
        this.lastHeartbeatTime = lastHeartbeatTime;
    }

    public ExtensionHealthInfo getHealthInfo() {
        return healthInfo;
    }

    public void setHealthInfo(ExtensionHealthInfo healthInfo) {
        this.healthInfo = healthInfo;
    }

    public ExtensionOvfConsumerInfo getOvfConsumerInfo() {
        return ovfConsumerInfo;
    }

    public void setOvfConsumerInfo(ExtensionOvfConsumerInfo ovfConsumerInfo) {
        this.ovfConsumerInfo = ovfConsumerInfo;
    }

    public ExtExtendedProductInfo getExtendedProductInfo() {
        return extendedProductInfo;
    }

    public void setExtendedProductInfo(ExtExtendedProductInfo extendedProductInfo) {
        this.extendedProductInfo = extendedProductInfo;
    }

    public ExtManagedEntityInfo[] getManagedEntityInfo() {
        if ((managedEntityInfo) == null) {
            return (NULL_MANAGED_ENTITY_INFO_ARRAY);
        }
        return managedEntityInfo;
    }

    public void setManagedEntityInfo(ExtManagedEntityInfo[] managedEntityInfo) {
        this.managedEntityInfo = managedEntityInfo;
    }

    public Boolean getShownInSolutionManager() {
        return shownInSolutionManager;
    }

    public void setShownInSolutionManager(Boolean shownInSolutionManager) {
        this.shownInSolutionManager = shownInSolutionManager;
    }

    public Boolean isShownInSolutionManager() {
        return shownInSolutionManager;
    }

    public ExtSolutionManagerInfo getSolutionManagerInfo() {
        return solutionManagerInfo;
    }

    public void setSolutionManagerInfo(ExtSolutionManagerInfo solutionManagerInfo) {
        this.solutionManagerInfo = solutionManagerInfo;
    }

}
