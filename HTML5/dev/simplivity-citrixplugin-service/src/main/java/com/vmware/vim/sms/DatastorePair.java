//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;


/**
 * 
 */
@SuppressWarnings("all")
public class DatastorePair
    extends DynamicData
{

    public ManagedObjectReference datastore1;
    public ManagedObjectReference datastore2;

    public ManagedObjectReference getDatastore1() {
        return datastore1;
    }

    public void setDatastore1(ManagedObjectReference datastore1) {
        this.datastore1 = datastore1;
    }

    public ManagedObjectReference getDatastore2() {
        return datastore2;
    }

    public void setDatastore2(ManagedObjectReference datastore2) {
        this.datastore2 = datastore2;
    }

}
