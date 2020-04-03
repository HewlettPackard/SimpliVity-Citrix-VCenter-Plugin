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
public class VirtualDeviceOption
    extends DynamicData
{

    public String type;
    public VirtualDeviceConnectOption connectOption;
    public VirtualDeviceBusSlotOption busSlotOption;
    public String controllerType;
    public BoolOption autoAssignController;
    private final static VirtualDeviceBackingOption[] NULL_BACKING_OPTION_ARRAY = new VirtualDeviceBackingOption[ 0 ] ;
    public VirtualDeviceBackingOption[] backingOption;
    public Integer defaultBackingOptionIndex;
    private final static String[] NULL_LICENSING_LIMIT_ARRAY = new String[ 0 ] ;
    public String[] licensingLimit;
    public boolean deprecated;
    public boolean plugAndPlay;
    public Boolean hotRemoveSupported;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VirtualDeviceConnectOption getConnectOption() {
        return connectOption;
    }

    public void setConnectOption(VirtualDeviceConnectOption connectOption) {
        this.connectOption = connectOption;
    }

    public VirtualDeviceBusSlotOption getBusSlotOption() {
        return busSlotOption;
    }

    public void setBusSlotOption(VirtualDeviceBusSlotOption busSlotOption) {
        this.busSlotOption = busSlotOption;
    }

    public String getControllerType() {
        return controllerType;
    }

    public void setControllerType(String controllerType) {
        this.controllerType = controllerType;
    }

    public BoolOption getAutoAssignController() {
        return autoAssignController;
    }

    public void setAutoAssignController(BoolOption autoAssignController) {
        this.autoAssignController = autoAssignController;
    }

    public VirtualDeviceBackingOption[] getBackingOption() {
        if ((backingOption) == null) {
            return (NULL_BACKING_OPTION_ARRAY);
        }
        return backingOption;
    }

    public void setBackingOption(VirtualDeviceBackingOption[] backingOption) {
        this.backingOption = backingOption;
    }

    public Integer getDefaultBackingOptionIndex() {
        return defaultBackingOptionIndex;
    }

    public void setDefaultBackingOptionIndex(Integer defaultBackingOptionIndex) {
        this.defaultBackingOptionIndex = defaultBackingOptionIndex;
    }

    public String[] getLicensingLimit() {
        if ((licensingLimit) == null) {
            return (NULL_LICENSING_LIMIT_ARRAY);
        }
        return licensingLimit;
    }

    public void setLicensingLimit(String[] licensingLimit) {
        this.licensingLimit = licensingLimit;
    }

    public boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public boolean getPlugAndPlay() {
        return plugAndPlay;
    }

    public void setPlugAndPlay(boolean plugAndPlay) {
        this.plugAndPlay = plugAndPlay;
    }

    public boolean isPlugAndPlay() {
        return plugAndPlay;
    }

    public Boolean getHotRemoveSupported() {
        return hotRemoveSupported;
    }

    public void setHotRemoveSupported(Boolean hotRemoveSupported) {
        this.hotRemoveSupported = hotRemoveSupported;
    }

    public Boolean isHotRemoveSupported() {
        return hotRemoveSupported;
    }

}
