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
public class ArrayOfClusterDrsMigration {

    private final static com.vmware.vim25.ClusterDrsMigration[] NULL_CLUSTER_DRS_MIGRATION_ARRAY = new com.vmware.vim25.ClusterDrsMigration[ 0 ] ;
    public com.vmware.vim25.ClusterDrsMigration[] ClusterDrsMigration;

    public com.vmware.vim25.ClusterDrsMigration[] getClusterDrsMigration() {
        if ((ClusterDrsMigration) == null) {
            return (NULL_CLUSTER_DRS_MIGRATION_ARRAY);
        }
        return ClusterDrsMigration;
    }

    public void setClusterDrsMigration(com.vmware.vim25.ClusterDrsMigration[] ClusterDrsMigration) {
        this.ClusterDrsMigration = ClusterDrsMigration;
    }

}
