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
public class VmRelocatedEvent
    extends VmRelocateSpecEvent
{

    public HostEventArgument sourceHost;
    public DatacenterEventArgument sourceDatacenter;
    public DatastoreEventArgument sourceDatastore;

    public HostEventArgument getSourceHost() {
        return sourceHost;
    }

    public void setSourceHost(HostEventArgument sourceHost) {
        this.sourceHost = sourceHost;
    }

    public DatacenterEventArgument getSourceDatacenter() {
        return sourceDatacenter;
    }

    public void setSourceDatacenter(DatacenterEventArgument sourceDatacenter) {
        this.sourceDatacenter = sourceDatacenter;
    }

    public DatastoreEventArgument getSourceDatastore() {
        return sourceDatastore;
    }

    public void setSourceDatastore(DatastoreEventArgument sourceDatastore) {
        this.sourceDatastore = sourceDatastore;
    }

}
