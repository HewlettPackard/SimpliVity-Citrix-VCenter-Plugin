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
public class EVCModeUnsupportedByHosts
    extends EVCConfigFault
{

    public String evcMode;
    private final static ManagedObjectReference[] NULL_HOST_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] host;
    private final static String[] NULL_HOST_NAME_ARRAY = new String[ 0 ] ;
    public String[] hostName;

    public String getEvcMode() {
        return evcMode;
    }

    public void setEvcMode(String evcMode) {
        this.evcMode = evcMode;
    }

    public ManagedObjectReference[] getHost() {
        if ((host) == null) {
            return (NULL_HOST_ARRAY);
        }
        return host;
    }

    public void setHost(ManagedObjectReference[] host) {
        this.host = host;
    }

    public String[] getHostName() {
        if ((hostName) == null) {
            return (NULL_HOST_NAME_ARRAY);
        }
        return hostName;
    }

    public void setHostName(String[] hostName) {
        this.hostName = hostName;
    }

}