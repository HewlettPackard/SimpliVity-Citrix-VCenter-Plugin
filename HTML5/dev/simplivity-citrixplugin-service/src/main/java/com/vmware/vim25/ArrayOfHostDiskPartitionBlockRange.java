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
public class ArrayOfHostDiskPartitionBlockRange {

    private final static com.vmware.vim25.HostDiskPartitionBlockRange[] NULL_HOST_DISK_PARTITION_BLOCK_RANGE_ARRAY = new com.vmware.vim25.HostDiskPartitionBlockRange[ 0 ] ;
    public com.vmware.vim25.HostDiskPartitionBlockRange[] HostDiskPartitionBlockRange;

    public com.vmware.vim25.HostDiskPartitionBlockRange[] getHostDiskPartitionBlockRange() {
        if ((HostDiskPartitionBlockRange) == null) {
            return (NULL_HOST_DISK_PARTITION_BLOCK_RANGE_ARRAY);
        }
        return HostDiskPartitionBlockRange;
    }

    public void setHostDiskPartitionBlockRange(com.vmware.vim25.HostDiskPartitionBlockRange[] HostDiskPartitionBlockRange) {
        this.HostDiskPartitionBlockRange = HostDiskPartitionBlockRange;
    }

}
