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
public class DvsOutOfSyncHostArgument
    extends DynamicData
{

    public HostEventArgument outOfSyncHost;
    private final static String[] NULL_CONFIG_PARAMTERS_ARRAY = new String[ 0 ] ;
    public String[] configParamters;

    public HostEventArgument getOutOfSyncHost() {
        return outOfSyncHost;
    }

    public void setOutOfSyncHost(HostEventArgument outOfSyncHost) {
        this.outOfSyncHost = outOfSyncHost;
    }

    public String[] getConfigParamters() {
        if ((configParamters) == null) {
            return (NULL_CONFIG_PARAMTERS_ARRAY);
        }
        return configParamters;
    }

    public void setConfigParamters(String[] configParamters) {
        this.configParamters = configParamters;
    }

}
