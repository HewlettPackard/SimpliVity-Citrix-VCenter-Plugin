//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;



/**
 * 
 */
@SuppressWarnings("all")
public class ArrayOfQueryReplicationPeerResult {

    private final static com.vmware.vim.sms.QueryReplicationPeerResult[] NULL_QUERY_REPLICATION_PEER_RESULT_ARRAY = new com.vmware.vim.sms.QueryReplicationPeerResult[ 0 ] ;
    public com.vmware.vim.sms.QueryReplicationPeerResult[] QueryReplicationPeerResult;

    public com.vmware.vim.sms.QueryReplicationPeerResult[] getQueryReplicationPeerResult() {
        if ((QueryReplicationPeerResult) == null) {
            return (NULL_QUERY_REPLICATION_PEER_RESULT_ARRAY);
        }
        return QueryReplicationPeerResult;
    }

    public void setQueryReplicationPeerResult(com.vmware.vim.sms.QueryReplicationPeerResult[] QueryReplicationPeerResult) {
        this.QueryReplicationPeerResult = QueryReplicationPeerResult;
    }

}