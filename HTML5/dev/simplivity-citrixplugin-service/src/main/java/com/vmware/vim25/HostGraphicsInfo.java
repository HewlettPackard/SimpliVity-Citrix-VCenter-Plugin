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
public class HostGraphicsInfo
    extends DynamicData
{

    public String deviceName;
    public String vendorName;
    public String pciId;
    public String graphicsType;
    public long memorySizeInKB;
    private final static ManagedObjectReference[] NULL_VM_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] vm;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getPciId() {
        return pciId;
    }

    public void setPciId(String pciId) {
        this.pciId = pciId;
    }

    public String getGraphicsType() {
        return graphicsType;
    }

    public void setGraphicsType(String graphicsType) {
        this.graphicsType = graphicsType;
    }

    public long getMemorySizeInKB() {
        return memorySizeInKB;
    }

    public void setMemorySizeInKB(long memorySizeInKB) {
        this.memorySizeInKB = memorySizeInKB;
    }

    public ManagedObjectReference[] getVm() {
        if ((vm) == null) {
            return (NULL_VM_ARRAY);
        }
        return vm;
    }

    public void setVm(ManagedObjectReference[] vm) {
        this.vm = vm;
    }

}
