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
public class ArrayOfVirtualMachineScsiDiskDeviceInfo {

    private final static com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo[] NULL_VIRTUAL_MACHINE_SCSI_DISK_DEVICE_INFO_ARRAY = new com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo[ 0 ] ;
    public com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo[] VirtualMachineScsiDiskDeviceInfo;

    public com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo[] getVirtualMachineScsiDiskDeviceInfo() {
        if ((VirtualMachineScsiDiskDeviceInfo) == null) {
            return (NULL_VIRTUAL_MACHINE_SCSI_DISK_DEVICE_INFO_ARRAY);
        }
        return VirtualMachineScsiDiskDeviceInfo;
    }

    public void setVirtualMachineScsiDiskDeviceInfo(com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo[] VirtualMachineScsiDiskDeviceInfo) {
        this.VirtualMachineScsiDiskDeviceInfo = VirtualMachineScsiDiskDeviceInfo;
    }

}