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
public class HostVMotionNetConfig
    extends DynamicData
{

    private final static HostVirtualNic[] NULL_CANDIDATE_VNIC_ARRAY = new HostVirtualNic[ 0 ] ;
    public HostVirtualNic[] candidateVnic;
    public String selectedVnic;

    public HostVirtualNic[] getCandidateVnic() {
        if ((candidateVnic) == null) {
            return (NULL_CANDIDATE_VNIC_ARRAY);
        }
        return candidateVnic;
    }

    public void setCandidateVnic(HostVirtualNic[] candidateVnic) {
        this.candidateVnic = candidateVnic;
    }

    public String getSelectedVnic() {
        return selectedVnic;
    }

    public void setSelectedVnic(String selectedVnic) {
        this.selectedVnic = selectedVnic;
    }

}
