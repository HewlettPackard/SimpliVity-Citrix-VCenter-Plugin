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
public class VirtualDiskRawDiskMappingVer1BackingOption
    extends VirtualDeviceDeviceBackingOption
{

    public ChoiceOption descriptorFileNameExtensions;
    public ChoiceOption compatibilityMode;
    public ChoiceOption diskMode;
    public boolean uuid;

    public ChoiceOption getDescriptorFileNameExtensions() {
        return descriptorFileNameExtensions;
    }

    public void setDescriptorFileNameExtensions(ChoiceOption descriptorFileNameExtensions) {
        this.descriptorFileNameExtensions = descriptorFileNameExtensions;
    }

    public ChoiceOption getCompatibilityMode() {
        return compatibilityMode;
    }

    public void setCompatibilityMode(ChoiceOption compatibilityMode) {
        this.compatibilityMode = compatibilityMode;
    }

    public ChoiceOption getDiskMode() {
        return diskMode;
    }

    public void setDiskMode(ChoiceOption diskMode) {
        this.diskMode = diskMode;
    }

    public boolean getUuid() {
        return uuid;
    }

    public void setUuid(boolean uuid) {
        this.uuid = uuid;
    }

    public boolean isUuid() {
        return uuid;
    }

}
