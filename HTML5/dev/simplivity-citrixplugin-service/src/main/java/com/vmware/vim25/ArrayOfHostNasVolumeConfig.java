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
public class ArrayOfHostNasVolumeConfig {

    private final static com.vmware.vim25.HostNasVolumeConfig[] NULL_HOST_NAS_VOLUME_CONFIG_ARRAY = new com.vmware.vim25.HostNasVolumeConfig[ 0 ] ;
    public com.vmware.vim25.HostNasVolumeConfig[] HostNasVolumeConfig;

    public com.vmware.vim25.HostNasVolumeConfig[] getHostNasVolumeConfig() {
        if ((HostNasVolumeConfig) == null) {
            return (NULL_HOST_NAS_VOLUME_CONFIG_ARRAY);
        }
        return HostNasVolumeConfig;
    }

    public void setHostNasVolumeConfig(com.vmware.vim25.HostNasVolumeConfig[] HostNasVolumeConfig) {
        this.HostNasVolumeConfig = HostNasVolumeConfig;
    }

}
