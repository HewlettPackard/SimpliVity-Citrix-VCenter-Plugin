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
public class ClusterHostGroup
    extends ClusterGroupInfo
{

    private final static ManagedObjectReference[] NULL_HOST_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] host;

    public ManagedObjectReference[] getHost() {
        if ((host) == null) {
            return (NULL_HOST_ARRAY);
        }
        return host;
    }

    public void setHost(ManagedObjectReference[] host) {
        this.host = host;
    }

}
