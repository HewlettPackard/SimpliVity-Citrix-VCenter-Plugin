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
public class vslmInfrastructureObjectPolicy
    extends DynamicData
{

    public String name;
    public String backingObjectId;
    public String profileId;
    public LocalizedMethodFault error;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackingObjectId() {
        return backingObjectId;
    }

    public void setBackingObjectId(String backingObjectId) {
        this.backingObjectId = backingObjectId;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public LocalizedMethodFault getError() {
        return error;
    }

    public void setError(LocalizedMethodFault error) {
        this.error = error;
    }

}