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
public class DatastoreSummary
    extends DynamicData
{

    public ManagedObjectReference datastore;
    public String name;
    public String url;
    public long capacity;
    public long freeSpace;
    public Long uncommitted;
    public boolean accessible;
    public Boolean multipleHostAccess;
    public String type;
    public String maintenanceMode;

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(long freeSpace) {
        this.freeSpace = freeSpace;
    }

    public Long getUncommitted() {
        return uncommitted;
    }

    public void setUncommitted(Long uncommitted) {
        this.uncommitted = uncommitted;
    }

    public boolean getAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public Boolean getMultipleHostAccess() {
        return multipleHostAccess;
    }

    public void setMultipleHostAccess(Boolean multipleHostAccess) {
        this.multipleHostAccess = multipleHostAccess;
    }

    public Boolean isMultipleHostAccess() {
        return multipleHostAccess;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaintenanceMode() {
        return maintenanceMode;
    }

    public void setMaintenanceMode(String maintenanceMode) {
        this.maintenanceMode = maintenanceMode;
    }

}