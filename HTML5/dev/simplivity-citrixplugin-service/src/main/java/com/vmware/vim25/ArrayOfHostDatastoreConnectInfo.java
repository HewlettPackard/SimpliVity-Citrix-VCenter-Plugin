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
public class ArrayOfHostDatastoreConnectInfo {

    private final static com.vmware.vim25.HostDatastoreConnectInfo[] NULL_HOST_DATASTORE_CONNECT_INFO_ARRAY = new com.vmware.vim25.HostDatastoreConnectInfo[ 0 ] ;
    public com.vmware.vim25.HostDatastoreConnectInfo[] HostDatastoreConnectInfo;

    public com.vmware.vim25.HostDatastoreConnectInfo[] getHostDatastoreConnectInfo() {
        if ((HostDatastoreConnectInfo) == null) {
            return (NULL_HOST_DATASTORE_CONNECT_INFO_ARRAY);
        }
        return HostDatastoreConnectInfo;
    }

    public void setHostDatastoreConnectInfo(com.vmware.vim25.HostDatastoreConnectInfo[] HostDatastoreConnectInfo) {
        this.HostDatastoreConnectInfo = HostDatastoreConnectInfo;
    }

}
