//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.pbm;



/**
 * 
 */
@SuppressWarnings("all")
public class ArrayOfPbmQueryReplicationGroupResult {

    private final static com.vmware.pbm.PbmQueryReplicationGroupResult[] NULL_PBM_QUERY_REPLICATION_GROUP_RESULT_ARRAY = new com.vmware.pbm.PbmQueryReplicationGroupResult[ 0 ] ;
    public com.vmware.pbm.PbmQueryReplicationGroupResult[] PbmQueryReplicationGroupResult;

    public com.vmware.pbm.PbmQueryReplicationGroupResult[] getPbmQueryReplicationGroupResult() {
        if ((PbmQueryReplicationGroupResult) == null) {
            return (NULL_PBM_QUERY_REPLICATION_GROUP_RESULT_ARRAY);
        }
        return PbmQueryReplicationGroupResult;
    }

    public void setPbmQueryReplicationGroupResult(com.vmware.pbm.PbmQueryReplicationGroupResult[] PbmQueryReplicationGroupResult) {
        this.PbmQueryReplicationGroupResult = PbmQueryReplicationGroupResult;
    }

}
