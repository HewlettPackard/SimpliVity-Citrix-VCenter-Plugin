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
public class ArrayOfClusterGroupSpec {

    private final static com.vmware.vim25.ClusterGroupSpec[] NULL_CLUSTER_GROUP_SPEC_ARRAY = new com.vmware.vim25.ClusterGroupSpec[ 0 ] ;
    public com.vmware.vim25.ClusterGroupSpec[] ClusterGroupSpec;

    public com.vmware.vim25.ClusterGroupSpec[] getClusterGroupSpec() {
        if ((ClusterGroupSpec) == null) {
            return (NULL_CLUSTER_GROUP_SPEC_ARRAY);
        }
        return ClusterGroupSpec;
    }

    public void setClusterGroupSpec(com.vmware.vim25.ClusterGroupSpec[] ClusterGroupSpec) {
        this.ClusterGroupSpec = ClusterGroupSpec;
    }

}
