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
public class VmRelocateFailedEvent
    extends VmRelocateSpecEvent
{

    public HostEventArgument destHost;
    public LocalizedMethodFault reason;
    public DatacenterEventArgument destDatacenter;
    public DatastoreEventArgument destDatastore;

    public HostEventArgument getDestHost() {
        return destHost;
    }

    public void setDestHost(HostEventArgument destHost) {
        this.destHost = destHost;
    }

    public LocalizedMethodFault getReason() {
        return reason;
    }

    public void setReason(LocalizedMethodFault reason) {
        this.reason = reason;
    }

    public DatacenterEventArgument getDestDatacenter() {
        return destDatacenter;
    }

    public void setDestDatacenter(DatacenterEventArgument destDatacenter) {
        this.destDatacenter = destDatacenter;
    }

    public DatastoreEventArgument getDestDatastore() {
        return destDatastore;
    }

    public void setDestDatastore(DatastoreEventArgument destDatastore) {
        this.destDatastore = destDatastore;
    }

}
