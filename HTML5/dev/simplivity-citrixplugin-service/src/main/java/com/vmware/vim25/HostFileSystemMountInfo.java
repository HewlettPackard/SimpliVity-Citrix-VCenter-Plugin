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
public class HostFileSystemMountInfo
    extends DynamicData
{

    public HostMountInfo mountInfo;
    public HostFileSystemVolume volume;
    public String vStorageSupport;

    public HostMountInfo getMountInfo() {
        return mountInfo;
    }

    public void setMountInfo(HostMountInfo mountInfo) {
        this.mountInfo = mountInfo;
    }

    public HostFileSystemVolume getVolume() {
        return volume;
    }

    public void setVolume(HostFileSystemVolume volume) {
        this.volume = volume;
    }

    public String getVStorageSupport() {
        return vStorageSupport;
    }

    public void setVStorageSupport(String vStorageSupport) {
        this.vStorageSupport = vStorageSupport;
    }

}