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
public class ArrayOfHostDiskPartitionInfo {

    private final static com.vmware.vim25.HostDiskPartitionInfo[] NULL_HOST_DISK_PARTITION_INFO_ARRAY = new com.vmware.vim25.HostDiskPartitionInfo[ 0 ] ;
    public com.vmware.vim25.HostDiskPartitionInfo[] HostDiskPartitionInfo;

    public com.vmware.vim25.HostDiskPartitionInfo[] getHostDiskPartitionInfo() {
        if ((HostDiskPartitionInfo) == null) {
            return (NULL_HOST_DISK_PARTITION_INFO_ARRAY);
        }
        return HostDiskPartitionInfo;
    }

    public void setHostDiskPartitionInfo(com.vmware.vim25.HostDiskPartitionInfo[] HostDiskPartitionInfo) {
        this.HostDiskPartitionInfo = HostDiskPartitionInfo;
    }

}
