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
public class ArrayOfHostDiskMappingPartitionOption {

    private final static com.vmware.vim25.HostDiskMappingPartitionOption[] NULL_HOST_DISK_MAPPING_PARTITION_OPTION_ARRAY = new com.vmware.vim25.HostDiskMappingPartitionOption[ 0 ] ;
    public com.vmware.vim25.HostDiskMappingPartitionOption[] HostDiskMappingPartitionOption;

    public com.vmware.vim25.HostDiskMappingPartitionOption[] getHostDiskMappingPartitionOption() {
        if ((HostDiskMappingPartitionOption) == null) {
            return (NULL_HOST_DISK_MAPPING_PARTITION_OPTION_ARRAY);
        }
        return HostDiskMappingPartitionOption;
    }

    public void setHostDiskMappingPartitionOption(com.vmware.vim25.HostDiskMappingPartitionOption[] HostDiskMappingPartitionOption) {
        this.HostDiskMappingPartitionOption = HostDiskMappingPartitionOption;
    }

}