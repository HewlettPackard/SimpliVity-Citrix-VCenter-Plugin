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
public class VirtualDeviceFileBackingInfo
    extends VirtualDeviceBackingInfo
{

    public String fileName;
    public ManagedObjectReference datastore;
    public String backingObjectId;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public String getBackingObjectId() {
        return backingObjectId;
    }

    public void setBackingObjectId(String backingObjectId) {
        this.backingObjectId = backingObjectId;
    }

}
