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
public class StorageResourceManagerStorageProfileStatistics
    extends DynamicData
{

    public String profileId;
    public long totalSpaceMB;
    public long usedSpaceMB;

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public long getTotalSpaceMB() {
        return totalSpaceMB;
    }

    public void setTotalSpaceMB(long totalSpaceMB) {
        this.totalSpaceMB = totalSpaceMB;
    }

    public long getUsedSpaceMB() {
        return usedSpaceMB;
    }

    public void setUsedSpaceMB(long usedSpaceMB) {
        this.usedSpaceMB = usedSpaceMB;
    }

}
