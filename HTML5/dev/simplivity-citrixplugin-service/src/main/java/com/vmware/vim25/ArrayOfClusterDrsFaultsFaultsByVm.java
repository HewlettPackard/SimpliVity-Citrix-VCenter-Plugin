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
public class ArrayOfClusterDrsFaultsFaultsByVm {

    private final static com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] NULL_CLUSTER_DRS_FAULTS_FAULTS_BY_VM_ARRAY = new com.vmware.vim25.ClusterDrsFaultsFaultsByVm[ 0 ] ;
    public com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] ClusterDrsFaultsFaultsByVm;

    public com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] getClusterDrsFaultsFaultsByVm() {
        if ((ClusterDrsFaultsFaultsByVm) == null) {
            return (NULL_CLUSTER_DRS_FAULTS_FAULTS_BY_VM_ARRAY);
        }
        return ClusterDrsFaultsFaultsByVm;
    }

    public void setClusterDrsFaultsFaultsByVm(com.vmware.vim25.ClusterDrsFaultsFaultsByVm[] ClusterDrsFaultsFaultsByVm) {
        this.ClusterDrsFaultsFaultsByVm = ClusterDrsFaultsFaultsByVm;
    }

}