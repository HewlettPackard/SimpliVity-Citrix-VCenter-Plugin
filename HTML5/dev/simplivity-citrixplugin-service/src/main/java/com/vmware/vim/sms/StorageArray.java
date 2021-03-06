//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import com.vmware.vim25.DynamicData;


/**
 * 
 */
@SuppressWarnings("all")
public class StorageArray
    extends DynamicData
{

    public String name;
    public String uuid;
    public String vendorId;
    public String modelId;
    public String firmware;
    private final static String[] NULL_ALTERNATE_NAME_ARRAY = new String[ 0 ] ;
    public String[] alternateName;
    private final static String[] NULL_SUPPORTED_BLOCK_INTERFACE_ARRAY = new String[ 0 ] ;
    public String[] supportedBlockInterface;
    private final static String[] NULL_SUPPORTED_FILE_SYSTEM_INTERFACE_ARRAY = new String[ 0 ] ;
    public String[] supportedFileSystemInterface;
    private final static String[] NULL_SUPPORTED_PROFILE_ARRAY = new String[ 0 ] ;
    public String[] supportedProfile;
    public Integer priority;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public String[] getAlternateName() {
        if ((alternateName) == null) {
            return (NULL_ALTERNATE_NAME_ARRAY);
        }
        return alternateName;
    }

    public void setAlternateName(String[] alternateName) {
        this.alternateName = alternateName;
    }

    public String[] getSupportedBlockInterface() {
        if ((supportedBlockInterface) == null) {
            return (NULL_SUPPORTED_BLOCK_INTERFACE_ARRAY);
        }
        return supportedBlockInterface;
    }

    public void setSupportedBlockInterface(String[] supportedBlockInterface) {
        this.supportedBlockInterface = supportedBlockInterface;
    }

    public String[] getSupportedFileSystemInterface() {
        if ((supportedFileSystemInterface) == null) {
            return (NULL_SUPPORTED_FILE_SYSTEM_INTERFACE_ARRAY);
        }
        return supportedFileSystemInterface;
    }

    public void setSupportedFileSystemInterface(String[] supportedFileSystemInterface) {
        this.supportedFileSystemInterface = supportedFileSystemInterface;
    }

    public String[] getSupportedProfile() {
        if ((supportedProfile) == null) {
            return (NULL_SUPPORTED_PROFILE_ARRAY);
        }
        return supportedProfile;
    }

    public void setSupportedProfile(String[] supportedProfile) {
        this.supportedProfile = supportedProfile;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

}
