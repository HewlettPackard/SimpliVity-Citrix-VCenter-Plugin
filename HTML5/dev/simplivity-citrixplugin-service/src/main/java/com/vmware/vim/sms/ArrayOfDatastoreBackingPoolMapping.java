//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;



/**
 * 
 */
@SuppressWarnings("all")
public class ArrayOfDatastoreBackingPoolMapping {

    private final static com.vmware.vim.sms.DatastoreBackingPoolMapping[] NULL_DATASTORE_BACKING_POOL_MAPPING_ARRAY = new com.vmware.vim.sms.DatastoreBackingPoolMapping[ 0 ] ;
    public com.vmware.vim.sms.DatastoreBackingPoolMapping[] DatastoreBackingPoolMapping;

    public com.vmware.vim.sms.DatastoreBackingPoolMapping[] getDatastoreBackingPoolMapping() {
        if ((DatastoreBackingPoolMapping) == null) {
            return (NULL_DATASTORE_BACKING_POOL_MAPPING_ARRAY);
        }
        return DatastoreBackingPoolMapping;
    }

    public void setDatastoreBackingPoolMapping(com.vmware.vim.sms.DatastoreBackingPoolMapping[] DatastoreBackingPoolMapping) {
        this.DatastoreBackingPoolMapping = DatastoreBackingPoolMapping;
    }

}
