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
public class ClusterEnterMaintenanceResult
    extends DynamicData
{

    private final static ClusterRecommendation[] NULL_RECOMMENDATIONS_ARRAY = new ClusterRecommendation[ 0 ] ;
    public ClusterRecommendation[] recommendations;
    public ClusterDrsFaults fault;

    public ClusterRecommendation[] getRecommendations() {
        if ((recommendations) == null) {
            return (NULL_RECOMMENDATIONS_ARRAY);
        }
        return recommendations;
    }

    public void setRecommendations(ClusterRecommendation[] recommendations) {
        this.recommendations = recommendations;
    }

    public ClusterDrsFaults getFault() {
        return fault;
    }

    public void setFault(ClusterDrsFaults fault) {
        this.fault = fault;
    }

}
