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
public class HostDiskPartitionLayout
    extends DynamicData
{

    public HostDiskDimensionsLba total;
    private final static HostDiskPartitionBlockRange[] NULL_PARTITION_ARRAY = new HostDiskPartitionBlockRange[ 0 ] ;
    public HostDiskPartitionBlockRange[] partition;

    public HostDiskDimensionsLba getTotal() {
        return total;
    }

    public void setTotal(HostDiskDimensionsLba total) {
        this.total = total;
    }

    public HostDiskPartitionBlockRange[] getPartition() {
        if ((partition) == null) {
            return (NULL_PARTITION_ARRAY);
        }
        return partition;
    }

    public void setPartition(HostDiskPartitionBlockRange[] partition) {
        this.partition = partition;
    }

}