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
public class ReplicationGroupFilter
    extends DynamicData
{

    private final static ReplicationGroupId[] NULL_GROUP_ID_ARRAY = new ReplicationGroupId[ 0 ] ;
    public ReplicationGroupId[] groupId;

    public ReplicationGroupId[] getGroupId() {
        if ((groupId) == null) {
            return (NULL_GROUP_ID_ARRAY);
        }
        return groupId;
    }

    public void setGroupId(ReplicationGroupId[] groupId) {
        this.groupId = groupId;
    }

}
