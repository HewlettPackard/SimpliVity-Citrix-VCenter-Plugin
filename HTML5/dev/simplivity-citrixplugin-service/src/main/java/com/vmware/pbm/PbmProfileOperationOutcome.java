//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.pbm;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;


/**
 * 
 */
@SuppressWarnings("all")
public class PbmProfileOperationOutcome
    extends DynamicData
{

    public PbmProfileId profileId;
    public LocalizedMethodFault fault;

    public PbmProfileId getProfileId() {
        return profileId;
    }

    public void setProfileId(PbmProfileId profileId) {
        this.profileId = profileId;
    }

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(LocalizedMethodFault fault) {
        this.fault = fault;
    }

}