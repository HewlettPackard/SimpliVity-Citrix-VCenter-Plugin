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
public class ArrayOfStorageArray {

    private final static com.vmware.vim.sms.StorageArray[] NULL_STORAGE_ARRAY_ARRAY = new com.vmware.vim.sms.StorageArray[ 0 ] ;
    public com.vmware.vim.sms.StorageArray[] StorageArray;

    public com.vmware.vim.sms.StorageArray[] getStorageArray() {
        if ((StorageArray) == null) {
            return (NULL_STORAGE_ARRAY_ARRAY);
        }
        return StorageArray;
    }

    public void setStorageArray(com.vmware.vim.sms.StorageArray[] StorageArray) {
        this.StorageArray = StorageArray;
    }

}
