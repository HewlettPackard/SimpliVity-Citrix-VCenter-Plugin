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
public class ArrayOfPbmPlacementRequirement {

    private final static com.vmware.pbm.PbmPlacementRequirement[] NULL_PBM_PLACEMENT_REQUIREMENT_ARRAY = new com.vmware.pbm.PbmPlacementRequirement[ 0 ] ;
    public com.vmware.pbm.PbmPlacementRequirement[] PbmPlacementRequirement;

    public com.vmware.pbm.PbmPlacementRequirement[] getPbmPlacementRequirement() {
        if ((PbmPlacementRequirement) == null) {
            return (NULL_PBM_PLACEMENT_REQUIREMENT_ARRAY);
        }
        return PbmPlacementRequirement;
    }

    public void setPbmPlacementRequirement(com.vmware.pbm.PbmPlacementRequirement[] PbmPlacementRequirement) {
        this.PbmPlacementRequirement = PbmPlacementRequirement;
    }

}
