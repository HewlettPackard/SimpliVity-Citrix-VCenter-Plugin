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
public class PlacementRankSpec
    extends DynamicData
{

    private final static PlacementSpec[] NULL_SPECS_ARRAY = new PlacementSpec[ 0 ] ;
    public PlacementSpec[] specs;
    private final static ManagedObjectReference[] NULL_CLUSTERS_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] clusters;
    private final static PlacementAffinityRule[] NULL_RULES_ARRAY = new PlacementAffinityRule[ 0 ] ;
    public PlacementAffinityRule[] rules;
    private final static StorageDrsPlacementRankVmSpec[] NULL_PLACEMENT_RANK_BY_VM_ARRAY = new StorageDrsPlacementRankVmSpec[ 0 ] ;
    public StorageDrsPlacementRankVmSpec[] placementRankByVm;

    public PlacementSpec[] getSpecs() {
        if ((specs) == null) {
            return (NULL_SPECS_ARRAY);
        }
        return specs;
    }

    public void setSpecs(PlacementSpec[] specs) {
        this.specs = specs;
    }

    public ManagedObjectReference[] getClusters() {
        if ((clusters) == null) {
            return (NULL_CLUSTERS_ARRAY);
        }
        return clusters;
    }

    public void setClusters(ManagedObjectReference[] clusters) {
        this.clusters = clusters;
    }

    public PlacementAffinityRule[] getRules() {
        if ((rules) == null) {
            return (NULL_RULES_ARRAY);
        }
        return rules;
    }

    public void setRules(PlacementAffinityRule[] rules) {
        this.rules = rules;
    }

    public StorageDrsPlacementRankVmSpec[] getPlacementRankByVm() {
        if ((placementRankByVm) == null) {
            return (NULL_PLACEMENT_RANK_BY_VM_ARRAY);
        }
        return placementRankByVm;
    }

    public void setPlacementRankByVm(StorageDrsPlacementRankVmSpec[] placementRankByVm) {
        this.placementRankByVm = placementRankByVm;
    }

}
