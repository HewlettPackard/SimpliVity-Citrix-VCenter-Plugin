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
public class VirtualMachineScsiDiskDeviceInfo
    extends VirtualMachineDiskDeviceInfo
{

    public HostScsiDisk disk;
    public String transportHint;
    public Integer lunNumber;

    public HostScsiDisk getDisk() {
        return disk;
    }

    public void setDisk(HostScsiDisk disk) {
        this.disk = disk;
    }

    public String getTransportHint() {
        return transportHint;
    }

    public void setTransportHint(String transportHint) {
        this.transportHint = transportHint;
    }

    public Integer getLunNumber() {
        return lunNumber;
    }

    public void setLunNumber(Integer lunNumber) {
        this.lunNumber = lunNumber;
    }

}
