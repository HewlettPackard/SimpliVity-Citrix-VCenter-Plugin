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
public class ArrayOfClusterEVCManagerCheckResult {

    private final static com.vmware.vim25.ClusterEVCManagerCheckResult[] NULL_CLUSTER_EV_CMANAGER_CHECK_RESULT_ARRAY = new com.vmware.vim25.ClusterEVCManagerCheckResult[ 0 ] ;
    public com.vmware.vim25.ClusterEVCManagerCheckResult[] ClusterEVCManagerCheckResult;

    public com.vmware.vim25.ClusterEVCManagerCheckResult[] getClusterEVCManagerCheckResult() {
        if ((ClusterEVCManagerCheckResult) == null) {
            return (NULL_CLUSTER_EV_CMANAGER_CHECK_RESULT_ARRAY);
        }
        return ClusterEVCManagerCheckResult;
    }

    public void setClusterEVCManagerCheckResult(com.vmware.vim25.ClusterEVCManagerCheckResult[] ClusterEVCManagerCheckResult) {
        this.ClusterEVCManagerCheckResult = ClusterEVCManagerCheckResult;
    }

}
