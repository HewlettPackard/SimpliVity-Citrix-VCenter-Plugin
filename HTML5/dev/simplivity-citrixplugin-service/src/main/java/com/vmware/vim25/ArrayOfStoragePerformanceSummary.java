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
public class ArrayOfStoragePerformanceSummary {

    private final static com.vmware.vim25.StoragePerformanceSummary[] NULL_STORAGE_PERFORMANCE_SUMMARY_ARRAY = new com.vmware.vim25.StoragePerformanceSummary[ 0 ] ;
    public com.vmware.vim25.StoragePerformanceSummary[] StoragePerformanceSummary;

    public com.vmware.vim25.StoragePerformanceSummary[] getStoragePerformanceSummary() {
        if ((StoragePerformanceSummary) == null) {
            return (NULL_STORAGE_PERFORMANCE_SUMMARY_ARRAY);
        }
        return StoragePerformanceSummary;
    }

    public void setStoragePerformanceSummary(com.vmware.vim25.StoragePerformanceSummary[] StoragePerformanceSummary) {
        this.StoragePerformanceSummary = StoragePerformanceSummary;
    }

}
