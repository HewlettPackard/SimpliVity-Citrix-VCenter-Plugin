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
public class HostLowLevelProvisioningManagerSnapshotLayoutSpec
    extends DynamicData
{

    public int id;
    public String srcFilename;
    public String dstFilename;
    private final static HostLowLevelProvisioningManagerDiskLayoutSpec[] NULL_DISK_ARRAY = new HostLowLevelProvisioningManagerDiskLayoutSpec[ 0 ] ;
    public HostLowLevelProvisioningManagerDiskLayoutSpec[] disk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSrcFilename() {
        return srcFilename;
    }

    public void setSrcFilename(String srcFilename) {
        this.srcFilename = srcFilename;
    }

    public String getDstFilename() {
        return dstFilename;
    }

    public void setDstFilename(String dstFilename) {
        this.dstFilename = dstFilename;
    }

    public HostLowLevelProvisioningManagerDiskLayoutSpec[] getDisk() {
        if ((disk) == null) {
            return (NULL_DISK_ARRAY);
        }
        return disk;
    }

    public void setDisk(HostLowLevelProvisioningManagerDiskLayoutSpec[] disk) {
        this.disk = disk;
    }

}
