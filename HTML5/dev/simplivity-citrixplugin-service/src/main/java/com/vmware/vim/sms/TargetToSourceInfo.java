//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ReplicationGroupId;


/**
 * 
 */
@SuppressWarnings("all")
public class TargetToSourceInfo
    extends DynamicData
{

    public ReplicationGroupId sourceGroupId;
    public String replicationAgreementDescription;

    public ReplicationGroupId getSourceGroupId() {
        return sourceGroupId;
    }

    public void setSourceGroupId(ReplicationGroupId sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
    }

    public String getReplicationAgreementDescription() {
        return replicationAgreementDescription;
    }

    public void setReplicationAgreementDescription(String replicationAgreementDescription) {
        this.replicationAgreementDescription = replicationAgreementDescription;
    }

}