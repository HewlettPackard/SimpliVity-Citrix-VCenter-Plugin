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
public class ArrayOfClusterDrsVmConfigSpec {

    private final static com.vmware.vim25.ClusterDrsVmConfigSpec[] NULL_CLUSTER_DRS_VM_CONFIG_SPEC_ARRAY = new com.vmware.vim25.ClusterDrsVmConfigSpec[ 0 ] ;
    public com.vmware.vim25.ClusterDrsVmConfigSpec[] ClusterDrsVmConfigSpec;

    public com.vmware.vim25.ClusterDrsVmConfigSpec[] getClusterDrsVmConfigSpec() {
        if ((ClusterDrsVmConfigSpec) == null) {
            return (NULL_CLUSTER_DRS_VM_CONFIG_SPEC_ARRAY);
        }
        return ClusterDrsVmConfigSpec;
    }

    public void setClusterDrsVmConfigSpec(com.vmware.vim25.ClusterDrsVmConfigSpec[] ClusterDrsVmConfigSpec) {
        this.ClusterDrsVmConfigSpec = ClusterDrsVmConfigSpec;
    }

}