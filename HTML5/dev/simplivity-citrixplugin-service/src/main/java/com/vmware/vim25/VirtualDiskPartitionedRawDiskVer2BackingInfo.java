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
public class VirtualDiskPartitionedRawDiskVer2BackingInfo
    extends VirtualDiskRawDiskVer2BackingInfo
{

    private final static int[] NULL_PARTITION_ARRAY = new int[ 0 ] ;
    public int[] partition;

    public int[] getPartition() {
        if ((partition) == null) {
            return (NULL_PARTITION_ARRAY);
        }
        return partition;
    }

    public void setPartition(int[] partition) {
        this.partition = partition;
    }

}
