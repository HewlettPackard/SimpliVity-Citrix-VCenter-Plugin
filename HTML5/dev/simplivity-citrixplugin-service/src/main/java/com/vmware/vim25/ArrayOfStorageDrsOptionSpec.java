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
public class ArrayOfStorageDrsOptionSpec {

    private final static com.vmware.vim25.StorageDrsOptionSpec[] NULL_STORAGE_DRS_OPTION_SPEC_ARRAY = new com.vmware.vim25.StorageDrsOptionSpec[ 0 ] ;
    public com.vmware.vim25.StorageDrsOptionSpec[] StorageDrsOptionSpec;

    public com.vmware.vim25.StorageDrsOptionSpec[] getStorageDrsOptionSpec() {
        if ((StorageDrsOptionSpec) == null) {
            return (NULL_STORAGE_DRS_OPTION_SPEC_ARRAY);
        }
        return StorageDrsOptionSpec;
    }

    public void setStorageDrsOptionSpec(com.vmware.vim25.StorageDrsOptionSpec[] StorageDrsOptionSpec) {
        this.StorageDrsOptionSpec = StorageDrsOptionSpec;
    }

}