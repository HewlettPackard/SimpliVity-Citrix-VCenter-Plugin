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
public class HostDiskPartitionSpec
    extends DynamicData
{

    public String partitionFormat;
    public HostDiskDimensionsChs chs;
    public Long totalSectors;
    private final static HostDiskPartitionAttributes[] NULL_PARTITION_ARRAY = new HostDiskPartitionAttributes[ 0 ] ;
    public HostDiskPartitionAttributes[] partition;

    public String getPartitionFormat() {
        return partitionFormat;
    }

    public void setPartitionFormat(String partitionFormat) {
        this.partitionFormat = partitionFormat;
    }

    public HostDiskDimensionsChs getChs() {
        return chs;
    }

    public void setChs(HostDiskDimensionsChs chs) {
        this.chs = chs;
    }

    public Long getTotalSectors() {
        return totalSectors;
    }

    public void setTotalSectors(Long totalSectors) {
        this.totalSectors = totalSectors;
    }

    public HostDiskPartitionAttributes[] getPartition() {
        if ((partition) == null) {
            return (NULL_PARTITION_ARRAY);
        }
        return partition;
    }

    public void setPartition(HostDiskPartitionAttributes[] partition) {
        this.partition = partition;
    }

}
