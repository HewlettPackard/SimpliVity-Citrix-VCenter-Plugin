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
public class HostVffsVolume
    extends HostFileSystemVolume
{

    public int majorVersion;
    public String version;
    public String uuid;
    private final static HostScsiDiskPartition[] NULL_EXTENT_ARRAY = new HostScsiDiskPartition[ 0 ] ;
    public HostScsiDiskPartition[] extent;

    public int getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public HostScsiDiskPartition[] getExtent() {
        if ((extent) == null) {
            return (NULL_EXTENT_ARRAY);
        }
        return extent;
    }

    public void setExtent(HostScsiDiskPartition[] extent) {
        this.extent = extent;
    }

}
