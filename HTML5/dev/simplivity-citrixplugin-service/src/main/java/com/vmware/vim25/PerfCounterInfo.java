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
public class PerfCounterInfo
    extends DynamicData
{

    public int key;
    public ElementDescription nameInfo;
    public ElementDescription groupInfo;
    public ElementDescription unitInfo;
    public PerfSummaryType rollupType;
    public PerfStatsType statsType;
    public Integer level;
    public Integer perDeviceLevel;
    private final static int[] NULL_ASSOCIATED_COUNTER_ID_ARRAY = new int[ 0 ] ;
    public int[] associatedCounterId;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public ElementDescription getNameInfo() {
        return nameInfo;
    }

    public void setNameInfo(ElementDescription nameInfo) {
        this.nameInfo = nameInfo;
    }

    public ElementDescription getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(ElementDescription groupInfo) {
        this.groupInfo = groupInfo;
    }

    public ElementDescription getUnitInfo() {
        return unitInfo;
    }

    public void setUnitInfo(ElementDescription unitInfo) {
        this.unitInfo = unitInfo;
    }

    public PerfSummaryType getRollupType() {
        return rollupType;
    }

    public void setRollupType(PerfSummaryType rollupType) {
        this.rollupType = rollupType;
    }

    public PerfStatsType getStatsType() {
        return statsType;
    }

    public void setStatsType(PerfStatsType statsType) {
        this.statsType = statsType;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPerDeviceLevel() {
        return perDeviceLevel;
    }

    public void setPerDeviceLevel(Integer perDeviceLevel) {
        this.perDeviceLevel = perDeviceLevel;
    }

    public int[] getAssociatedCounterId() {
        if ((associatedCounterId) == null) {
            return (NULL_ASSOCIATED_COUNTER_ID_ARRAY);
        }
        return associatedCounterId;
    }

    public void setAssociatedCounterId(int[] associatedCounterId) {
        this.associatedCounterId = associatedCounterId;
    }

}
