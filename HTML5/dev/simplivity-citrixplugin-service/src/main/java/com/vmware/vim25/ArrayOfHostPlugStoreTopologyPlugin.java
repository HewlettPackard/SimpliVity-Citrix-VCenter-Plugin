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
public class ArrayOfHostPlugStoreTopologyPlugin {

    private final static com.vmware.vim25.HostPlugStoreTopologyPlugin[] NULL_HOST_PLUG_STORE_TOPOLOGY_PLUGIN_ARRAY = new com.vmware.vim25.HostPlugStoreTopologyPlugin[ 0 ] ;
    public com.vmware.vim25.HostPlugStoreTopologyPlugin[] HostPlugStoreTopologyPlugin;

    public com.vmware.vim25.HostPlugStoreTopologyPlugin[] getHostPlugStoreTopologyPlugin() {
        if ((HostPlugStoreTopologyPlugin) == null) {
            return (NULL_HOST_PLUG_STORE_TOPOLOGY_PLUGIN_ARRAY);
        }
        return HostPlugStoreTopologyPlugin;
    }

    public void setHostPlugStoreTopologyPlugin(com.vmware.vim25.HostPlugStoreTopologyPlugin[] HostPlugStoreTopologyPlugin) {
        this.HostPlugStoreTopologyPlugin = HostPlugStoreTopologyPlugin;
    }

}
