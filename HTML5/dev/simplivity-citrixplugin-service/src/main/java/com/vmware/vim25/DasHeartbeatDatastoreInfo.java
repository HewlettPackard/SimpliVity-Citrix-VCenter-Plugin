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
public class DasHeartbeatDatastoreInfo
    extends DynamicData
{

    public ManagedObjectReference datastore;
    private final static ManagedObjectReference[] NULL_HOSTS_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] hosts;

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public ManagedObjectReference[] getHosts() {
        if ((hosts) == null) {
            return (NULL_HOSTS_ARRAY);
        }
        return hosts;
    }

    public void setHosts(ManagedObjectReference[] hosts) {
        this.hosts = hosts;
    }

}
