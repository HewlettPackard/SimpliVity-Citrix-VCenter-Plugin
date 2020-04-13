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
public class VirtualHardwareOption
    extends DynamicData
{

    public int hwVersion;
    private final static VirtualDeviceOption[] NULL_VIRTUAL_DEVICE_OPTION_ARRAY = new VirtualDeviceOption[ 0 ] ;
    public VirtualDeviceOption[] virtualDeviceOption;
    public boolean deviceListReadonly;
    private final static int[] NULL_NUM_CP_U_ARRAY = new int[ 0 ] ;
    public int[] numCPU;
    public IntOption numCoresPerSocket;
    public boolean numCpuReadonly;
    public LongOption memoryMB;
    public IntOption numPCIControllers;
    public IntOption numIDEControllers;
    public IntOption numUSBControllers;
    public IntOption numUSBXHCIControllers;
    public IntOption numSIOControllers;
    public IntOption numPS2Controllers;
    private final static String[] NULL_LICENSING_LIMIT_ARRAY = new String[ 0 ] ;
    public String[] licensingLimit;
    public IntOption numSupportedWwnPorts;
    public IntOption numSupportedWwnNodes;
    public ResourceConfigOption resourceConfigOption;
    public IntOption numNVDIMMControllers;
    public IntOption numTPMDevices;

    public int getHwVersion() {
        return hwVersion;
    }

    public void setHwVersion(int hwVersion) {
        this.hwVersion = hwVersion;
    }

    public VirtualDeviceOption[] getVirtualDeviceOption() {
        if ((virtualDeviceOption) == null) {
            return (NULL_VIRTUAL_DEVICE_OPTION_ARRAY);
        }
        return virtualDeviceOption;
    }

    public void setVirtualDeviceOption(VirtualDeviceOption[] virtualDeviceOption) {
        this.virtualDeviceOption = virtualDeviceOption;
    }

    public boolean getDeviceListReadonly() {
        return deviceListReadonly;
    }

    public void setDeviceListReadonly(boolean deviceListReadonly) {
        this.deviceListReadonly = deviceListReadonly;
    }

    public boolean isDeviceListReadonly() {
        return deviceListReadonly;
    }

    public int[] getNumCPU() {
        if ((numCPU) == null) {
            return (NULL_NUM_CP_U_ARRAY);
        }
        return numCPU;
    }

    public void setNumCPU(int[] numCPU) {
        this.numCPU = numCPU;
    }

    public IntOption getNumCoresPerSocket() {
        return numCoresPerSocket;
    }

    public void setNumCoresPerSocket(IntOption numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
    }

    public boolean getNumCpuReadonly() {
        return numCpuReadonly;
    }

    public void setNumCpuReadonly(boolean numCpuReadonly) {
        this.numCpuReadonly = numCpuReadonly;
    }

    public boolean isNumCpuReadonly() {
        return numCpuReadonly;
    }

    public LongOption getMemoryMB() {
        return memoryMB;
    }

    public void setMemoryMB(LongOption memoryMB) {
        this.memoryMB = memoryMB;
    }

    public IntOption getNumPCIControllers() {
        return numPCIControllers;
    }

    public void setNumPCIControllers(IntOption numPCIControllers) {
        this.numPCIControllers = numPCIControllers;
    }

    public IntOption getNumIDEControllers() {
        return numIDEControllers;
    }

    public void setNumIDEControllers(IntOption numIDEControllers) {
        this.numIDEControllers = numIDEControllers;
    }

    public IntOption getNumUSBControllers() {
        return numUSBControllers;
    }

    public void setNumUSBControllers(IntOption numUSBControllers) {
        this.numUSBControllers = numUSBControllers;
    }

    public IntOption getNumUSBXHCIControllers() {
        return numUSBXHCIControllers;
    }

    public void setNumUSBXHCIControllers(IntOption numUSBXHCIControllers) {
        this.numUSBXHCIControllers = numUSBXHCIControllers;
    }

    public IntOption getNumSIOControllers() {
        return numSIOControllers;
    }

    public void setNumSIOControllers(IntOption numSIOControllers) {
        this.numSIOControllers = numSIOControllers;
    }

    public IntOption getNumPS2Controllers() {
        return numPS2Controllers;
    }

    public void setNumPS2Controllers(IntOption numPS2Controllers) {
        this.numPS2Controllers = numPS2Controllers;
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

    public IntOption getNumSupportedWwnPorts() {
        return numSupportedWwnPorts;
    }

    public void setNumSupportedWwnPorts(IntOption numSupportedWwnPorts) {
        this.numSupportedWwnPorts = numSupportedWwnPorts;
    }

    public IntOption getNumSupportedWwnNodes() {
        return numSupportedWwnNodes;
    }

    public void setNumSupportedWwnNodes(IntOption numSupportedWwnNodes) {
        this.numSupportedWwnNodes = numSupportedWwnNodes;
    }

    public ResourceConfigOption getResourceConfigOption() {
        return resourceConfigOption;
    }

    public void setResourceConfigOption(ResourceConfigOption resourceConfigOption) {
        this.resourceConfigOption = resourceConfigOption;
    }

    public IntOption getNumNVDIMMControllers() {
        return numNVDIMMControllers;
    }

    public void setNumNVDIMMControllers(IntOption numNVDIMMControllers) {
        this.numNVDIMMControllers = numNVDIMMControllers;
    }

    public IntOption getNumTPMDevices() {
        return numTPMDevices;
    }

    public void setNumTPMDevices(IntOption numTPMDevices) {
        this.numTPMDevices = numTPMDevices;
    }

}
