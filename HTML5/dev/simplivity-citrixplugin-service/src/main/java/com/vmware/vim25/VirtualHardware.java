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
public class VirtualHardware
    extends DynamicData
{

    public int numCPU;
    public Integer numCoresPerSocket;
    public int memoryMB;
    public Boolean virtualICH7MPresent;
    public Boolean virtualSMCPresent;
    private final static VirtualDevice[] NULL_DEVICE_ARRAY = new VirtualDevice[ 0 ] ;
    public VirtualDevice[] device;

    public int getNumCPU() {
        return numCPU;
    }

    public void setNumCPU(int numCPU) {
        this.numCPU = numCPU;
    }

    public Integer getNumCoresPerSocket() {
        return numCoresPerSocket;
    }

    public void setNumCoresPerSocket(Integer numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
    }

    public int getMemoryMB() {
        return memoryMB;
    }

    public void setMemoryMB(int memoryMB) {
        this.memoryMB = memoryMB;
    }

    public Boolean getVirtualICH7MPresent() {
        return virtualICH7MPresent;
    }

    public void setVirtualICH7MPresent(Boolean virtualICH7MPresent) {
        this.virtualICH7MPresent = virtualICH7MPresent;
    }

    public Boolean isVirtualICH7MPresent() {
        return virtualICH7MPresent;
    }

    public Boolean getVirtualSMCPresent() {
        return virtualSMCPresent;
    }

    public void setVirtualSMCPresent(Boolean virtualSMCPresent) {
        this.virtualSMCPresent = virtualSMCPresent;
    }

    public Boolean isVirtualSMCPresent() {
        return virtualSMCPresent;
    }

    public VirtualDevice[] getDevice() {
        if ((device) == null) {
            return (NULL_DEVICE_ARRAY);
        }
        return device;
    }

    public void setDevice(VirtualDevice[] device) {
        this.device = device;
    }

}
