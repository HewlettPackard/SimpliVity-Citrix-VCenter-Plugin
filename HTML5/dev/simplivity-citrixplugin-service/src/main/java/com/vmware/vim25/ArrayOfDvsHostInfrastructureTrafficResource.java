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
public class ArrayOfDvsHostInfrastructureTrafficResource {

    private final static com.vmware.vim25.DvsHostInfrastructureTrafficResource[] NULL_DVS_HOST_INFRASTRUCTURE_TRAFFIC_RESOURCE_ARRAY = new com.vmware.vim25.DvsHostInfrastructureTrafficResource[ 0 ] ;
    public com.vmware.vim25.DvsHostInfrastructureTrafficResource[] DvsHostInfrastructureTrafficResource;

    public com.vmware.vim25.DvsHostInfrastructureTrafficResource[] getDvsHostInfrastructureTrafficResource() {
        if ((DvsHostInfrastructureTrafficResource) == null) {
            return (NULL_DVS_HOST_INFRASTRUCTURE_TRAFFIC_RESOURCE_ARRAY);
        }
        return DvsHostInfrastructureTrafficResource;
    }

    public void setDvsHostInfrastructureTrafficResource(com.vmware.vim25.DvsHostInfrastructureTrafficResource[] DvsHostInfrastructureTrafficResource) {
        this.DvsHostInfrastructureTrafficResource = DvsHostInfrastructureTrafficResource;
    }

}
