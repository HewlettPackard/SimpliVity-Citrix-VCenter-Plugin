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
public class HostSharedGpuCapabilities
    extends DynamicData
{

    public String vgpu;
    public boolean diskSnapshotSupported;
    public boolean memorySnapshotSupported;
    public boolean suspendSupported;
    public boolean migrateSupported;

    public String getVgpu() {
        return vgpu;
    }

    public void setVgpu(String vgpu) {
        this.vgpu = vgpu;
    }

    public boolean getDiskSnapshotSupported() {
        return diskSnapshotSupported;
    }

    public void setDiskSnapshotSupported(boolean diskSnapshotSupported) {
        this.diskSnapshotSupported = diskSnapshotSupported;
    }

    public boolean isDiskSnapshotSupported() {
        return diskSnapshotSupported;
    }

    public boolean getMemorySnapshotSupported() {
        return memorySnapshotSupported;
    }

    public void setMemorySnapshotSupported(boolean memorySnapshotSupported) {
        this.memorySnapshotSupported = memorySnapshotSupported;
    }

    public boolean isMemorySnapshotSupported() {
        return memorySnapshotSupported;
    }

    public boolean getSuspendSupported() {
        return suspendSupported;
    }

    public void setSuspendSupported(boolean suspendSupported) {
        this.suspendSupported = suspendSupported;
    }

    public boolean isSuspendSupported() {
        return suspendSupported;
    }

    public boolean getMigrateSupported() {
        return migrateSupported;
    }

    public void setMigrateSupported(boolean migrateSupported) {
        this.migrateSupported = migrateSupported;
    }

    public boolean isMigrateSupported() {
        return migrateSupported;
    }

}