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
public class PerfProviderSummary
    extends DynamicData
{

    public ManagedObjectReference entity;
    public boolean currentSupported;
    public boolean summarySupported;
    public Integer refreshRate;

    public ManagedObjectReference getEntity() {
        return entity;
    }

    public void setEntity(ManagedObjectReference entity) {
        this.entity = entity;
    }

    public boolean getCurrentSupported() {
        return currentSupported;
    }

    public void setCurrentSupported(boolean currentSupported) {
        this.currentSupported = currentSupported;
    }

    public boolean isCurrentSupported() {
        return currentSupported;
    }

    public boolean getSummarySupported() {
        return summarySupported;
    }

    public void setSummarySupported(boolean summarySupported) {
        this.summarySupported = summarySupported;
    }

    public boolean isSummarySupported() {
        return summarySupported;
    }

    public Integer getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(Integer refreshRate) {
        this.refreshRate = refreshRate;
    }

}