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
public class VirtualDeviceConfigSpec
    extends DynamicData
{

    public VirtualDeviceConfigSpecOperation operation;
    public VirtualDeviceConfigSpecFileOperation fileOperation;
    public VirtualDevice device;
    private final static VirtualMachineProfileSpec[] NULL_PROFILE_ARRAY = new VirtualMachineProfileSpec[ 0 ] ;
    public VirtualMachineProfileSpec[] profile;
    public VirtualDeviceConfigSpecBackingSpec backing;

    public VirtualDeviceConfigSpecOperation getOperation() {
        return operation;
    }

    public void setOperation(VirtualDeviceConfigSpecOperation operation) {
        this.operation = operation;
    }

    public VirtualDeviceConfigSpecFileOperation getFileOperation() {
        return fileOperation;
    }

    public void setFileOperation(VirtualDeviceConfigSpecFileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    public VirtualDevice getDevice() {
        return device;
    }

    public void setDevice(VirtualDevice device) {
        this.device = device;
    }

    public VirtualMachineProfileSpec[] getProfile() {
        if ((profile) == null) {
            return (NULL_PROFILE_ARRAY);
        }
        return profile;
    }

    public void setProfile(VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

    public VirtualDeviceConfigSpecBackingSpec getBacking() {
        return backing;
    }

    public void setBacking(VirtualDeviceConfigSpecBackingSpec backing) {
        this.backing = backing;
    }

}
