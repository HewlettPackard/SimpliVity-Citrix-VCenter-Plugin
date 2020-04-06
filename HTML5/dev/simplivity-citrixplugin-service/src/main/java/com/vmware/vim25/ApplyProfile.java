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
public class ApplyProfile
    extends DynamicData
{

    public boolean enabled;
    private final static ProfilePolicy[] NULL_POLICY_ARRAY = new ProfilePolicy[ 0 ] ;
    public ProfilePolicy[] policy;
    public String profileTypeName;
    public String profileVersion;
    private final static ProfileApplyProfileProperty[] NULL_PROPERTY_ARRAY = new ProfileApplyProfileProperty[ 0 ] ;
    public ProfileApplyProfileProperty[] property;
    public Boolean favorite;
    public Boolean toBeMerged;
    public Boolean toReplaceWith;
    public Boolean toBeDeleted;
    public Boolean copyEnableStatus;
    public Boolean hidden;

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public ProfilePolicy[] getPolicy() {
        if ((policy) == null) {
            return (NULL_POLICY_ARRAY);
        }
        return policy;
    }

    public void setPolicy(ProfilePolicy[] policy) {
        this.policy = policy;
    }

    public String getProfileTypeName() {
        return profileTypeName;
    }

    public void setProfileTypeName(String profileTypeName) {
        this.profileTypeName = profileTypeName;
    }

    public String getProfileVersion() {
        return profileVersion;
    }

    public void setProfileVersion(String profileVersion) {
        this.profileVersion = profileVersion;
    }

    public ProfileApplyProfileProperty[] getProperty() {
        if ((property) == null) {
            return (NULL_PROPERTY_ARRAY);
        }
        return property;
    }

    public void setProperty(ProfileApplyProfileProperty[] property) {
        this.property = property;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Boolean isFavorite() {
        return favorite;
    }

    public Boolean getToBeMerged() {
        return toBeMerged;
    }

    public void setToBeMerged(Boolean toBeMerged) {
        this.toBeMerged = toBeMerged;
    }

    public Boolean isToBeMerged() {
        return toBeMerged;
    }

    public Boolean getToReplaceWith() {
        return toReplaceWith;
    }

    public void setToReplaceWith(Boolean toReplaceWith) {
        this.toReplaceWith = toReplaceWith;
    }

    public Boolean isToReplaceWith() {
        return toReplaceWith;
    }

    public Boolean getToBeDeleted() {
        return toBeDeleted;
    }

    public void setToBeDeleted(Boolean toBeDeleted) {
        this.toBeDeleted = toBeDeleted;
    }

    public Boolean isToBeDeleted() {
        return toBeDeleted;
    }

    public Boolean getCopyEnableStatus() {
        return copyEnableStatus;
    }

    public void setCopyEnableStatus(Boolean copyEnableStatus) {
        this.copyEnableStatus = copyEnableStatus;
    }

    public Boolean isCopyEnableStatus() {
        return copyEnableStatus;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean isHidden() {
        return hidden;
    }

}