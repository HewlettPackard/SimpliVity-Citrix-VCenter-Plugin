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
public class HostVvolVolumeSpecification
    extends DynamicData
{

    public long maxSizeInMB;
    public String volumeName;
    private final static VimVasaProviderInfo[] NULL_VASA_PROVIDER_INFO_ARRAY = new VimVasaProviderInfo[ 0 ] ;
    public VimVasaProviderInfo[] vasaProviderInfo;
    private final static VASAStorageArray[] NULL_STORAGE_ARRAY_ARRAY = new VASAStorageArray[ 0 ] ;
    public VASAStorageArray[] storageArray;
    public String uuid;

    public long getMaxSizeInMB() {
        return maxSizeInMB;
    }

    public void setMaxSizeInMB(long maxSizeInMB) {
        this.maxSizeInMB = maxSizeInMB;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public VimVasaProviderInfo[] getVasaProviderInfo() {
        if ((vasaProviderInfo) == null) {
            return (NULL_VASA_PROVIDER_INFO_ARRAY);
        }
        return vasaProviderInfo;
    }

    public void setVasaProviderInfo(VimVasaProviderInfo[] vasaProviderInfo) {
        this.vasaProviderInfo = vasaProviderInfo;
    }

    public VASAStorageArray[] getStorageArray() {
        if ((storageArray) == null) {
            return (NULL_STORAGE_ARRAY_ARRAY);
        }
        return storageArray;
    }

    public void setStorageArray(VASAStorageArray[] storageArray) {
        this.storageArray = storageArray;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
