//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import com.vmware.vim25.DynamicData;


/**
 * 
 */
@SuppressWarnings("all")
public class QueryPointInTimeReplicaParam
    extends DynamicData
{

    public ReplicaQueryIntervalParam replicaTimeQueryParam;
    public String pitName;
    private final static String[] NULL_TAGS_ARRAY = new String[ 0 ] ;
    public String[] tags;

    public ReplicaQueryIntervalParam getReplicaTimeQueryParam() {
        return replicaTimeQueryParam;
    }

    public void setReplicaTimeQueryParam(ReplicaQueryIntervalParam replicaTimeQueryParam) {
        this.replicaTimeQueryParam = replicaTimeQueryParam;
    }

    public String getPitName() {
        return pitName;
    }

    public void setPitName(String pitName) {
        this.pitName = pitName;
    }

    public String[] getTags() {
        if ((tags) == null) {
            return (NULL_TAGS_ARRAY);
        }
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

}
