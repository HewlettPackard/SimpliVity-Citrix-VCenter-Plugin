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
public class HostUnresolvedVmfsVolume
    extends DynamicData
{

    private final static HostUnresolvedVmfsExtent[] NULL_EXTENT_ARRAY = new HostUnresolvedVmfsExtent[ 0 ] ;
    public HostUnresolvedVmfsExtent[] extent;
    public String vmfsLabel;
    public String vmfsUuid;
    public int totalBlocks;
    public HostUnresolvedVmfsVolumeResolveStatus resolveStatus;

    public HostUnresolvedVmfsExtent[] getExtent() {
        if ((extent) == null) {
            return (NULL_EXTENT_ARRAY);
        }
        return extent;
    }

    public void setExtent(HostUnresolvedVmfsExtent[] extent) {
        this.extent = extent;
    }

    public String getVmfsLabel() {
        return vmfsLabel;
    }

    public void setVmfsLabel(String vmfsLabel) {
        this.vmfsLabel = vmfsLabel;
    }

    public String getVmfsUuid() {
        return vmfsUuid;
    }

    public void setVmfsUuid(String vmfsUuid) {
        this.vmfsUuid = vmfsUuid;
    }

    public int getTotalBlocks() {
        return totalBlocks;
    }

    public void setTotalBlocks(int totalBlocks) {
        this.totalBlocks = totalBlocks;
    }

    public HostUnresolvedVmfsVolumeResolveStatus getResolveStatus() {
        return resolveStatus;
    }

    public void setResolveStatus(HostUnresolvedVmfsVolumeResolveStatus resolveStatus) {
        this.resolveStatus = resolveStatus;
    }

}
