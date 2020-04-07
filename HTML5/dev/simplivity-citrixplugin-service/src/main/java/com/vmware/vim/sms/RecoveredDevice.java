//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;


/**
 * 
 */
@SuppressWarnings("all")
public class RecoveredDevice
    extends DynamicData
{

    public ReplicaId targetDeviceId;
    public DeviceId recoveredDeviceId;
    public DeviceId sourceDeviceId;
    private final static String[] NULL_INFO_ARRAY = new String[ 0 ] ;
    public String[] info;
    public ManagedObjectReference datastore;
    private final static RecoveredDiskInfo[] NULL_RECOVERED_DISK_INFO_ARRAY = new RecoveredDiskInfo[ 0 ] ;
    public RecoveredDiskInfo[] recoveredDiskInfo;
    public LocalizedMethodFault error;
    private final static LocalizedMethodFault[] NULL_WARNINGS_ARRAY = new LocalizedMethodFault[ 0 ] ;
    public LocalizedMethodFault[] warnings;

    public ReplicaId getTargetDeviceId() {
        return targetDeviceId;
    }

    public void setTargetDeviceId(ReplicaId targetDeviceId) {
        this.targetDeviceId = targetDeviceId;
    }

    public DeviceId getRecoveredDeviceId() {
        return recoveredDeviceId;
    }

    public void setRecoveredDeviceId(DeviceId recoveredDeviceId) {
        this.recoveredDeviceId = recoveredDeviceId;
    }

    public DeviceId getSourceDeviceId() {
        return sourceDeviceId;
    }

    public void setSourceDeviceId(DeviceId sourceDeviceId) {
        this.sourceDeviceId = sourceDeviceId;
    }

    public String[] getInfo() {
        if ((info) == null) {
            return (NULL_INFO_ARRAY);
        }
        return info;
    }

    public void setInfo(String[] info) {
        this.info = info;
    }

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public RecoveredDiskInfo[] getRecoveredDiskInfo() {
        if ((recoveredDiskInfo) == null) {
            return (NULL_RECOVERED_DISK_INFO_ARRAY);
        }
        return recoveredDiskInfo;
    }

    public void setRecoveredDiskInfo(RecoveredDiskInfo[] recoveredDiskInfo) {
        this.recoveredDiskInfo = recoveredDiskInfo;
    }

    public LocalizedMethodFault getError() {
        return error;
    }

    public void setError(LocalizedMethodFault error) {
        this.error = error;
    }

    public LocalizedMethodFault[] getWarnings() {
        if ((warnings) == null) {
            return (NULL_WARNINGS_ARRAY);
        }
        return warnings;
    }

    public void setWarnings(LocalizedMethodFault[] warnings) {
        this.warnings = warnings;
    }

}
