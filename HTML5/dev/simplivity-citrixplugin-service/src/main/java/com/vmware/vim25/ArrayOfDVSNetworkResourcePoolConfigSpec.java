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
public class ArrayOfDVSNetworkResourcePoolConfigSpec {

    private final static com.vmware.vim25.DVSNetworkResourcePoolConfigSpec[] NULL_DVS_NETWORK_RESOURCE_POOL_CONFIG_SPEC_ARRAY = new com.vmware.vim25.DVSNetworkResourcePoolConfigSpec[ 0 ] ;
    public com.vmware.vim25.DVSNetworkResourcePoolConfigSpec[] DVSNetworkResourcePoolConfigSpec;

    public com.vmware.vim25.DVSNetworkResourcePoolConfigSpec[] getDvsNetworkResourcePoolConfigSpec() {
        if ((DVSNetworkResourcePoolConfigSpec) == null) {
            return (NULL_DVS_NETWORK_RESOURCE_POOL_CONFIG_SPEC_ARRAY);
        }
        return DVSNetworkResourcePoolConfigSpec;
    }

    public void setDvsNetworkResourcePoolConfigSpec(com.vmware.vim25.DVSNetworkResourcePoolConfigSpec[] DVSNetworkResourcePoolConfigSpec) {
        this.DVSNetworkResourcePoolConfigSpec = DVSNetworkResourcePoolConfigSpec;
    }

}
