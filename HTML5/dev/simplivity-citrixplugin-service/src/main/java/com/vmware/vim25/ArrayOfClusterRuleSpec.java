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
public class ArrayOfClusterRuleSpec {

    private final static com.vmware.vim25.ClusterRuleSpec[] NULL_CLUSTER_RULE_SPEC_ARRAY = new com.vmware.vim25.ClusterRuleSpec[ 0 ] ;
    public com.vmware.vim25.ClusterRuleSpec[] ClusterRuleSpec;

    public com.vmware.vim25.ClusterRuleSpec[] getClusterRuleSpec() {
        if ((ClusterRuleSpec) == null) {
            return (NULL_CLUSTER_RULE_SPEC_ARRAY);
        }
        return ClusterRuleSpec;
    }

    public void setClusterRuleSpec(com.vmware.vim25.ClusterRuleSpec[] ClusterRuleSpec) {
        this.ClusterRuleSpec = ClusterRuleSpec;
    }

}