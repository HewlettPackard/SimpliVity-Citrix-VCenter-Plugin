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
public class ArrayOfPbmPlacementHub {

    private final static com.vmware.pbm.PbmPlacementHub[] NULL_PBM_PLACEMENT_HUB_ARRAY = new com.vmware.pbm.PbmPlacementHub[ 0 ] ;
    public com.vmware.pbm.PbmPlacementHub[] PbmPlacementHub;

    public com.vmware.pbm.PbmPlacementHub[] getPbmPlacementHub() {
        if ((PbmPlacementHub) == null) {
            return (NULL_PBM_PLACEMENT_HUB_ARRAY);
        }
        return PbmPlacementHub;
    }

    public void setPbmPlacementHub(com.vmware.pbm.PbmPlacementHub[] PbmPlacementHub) {
        this.PbmPlacementHub = PbmPlacementHub;
    }

}