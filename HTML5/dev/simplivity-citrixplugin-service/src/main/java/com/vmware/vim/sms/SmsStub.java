/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.vim.sms;

import com.vmware.vim25.InvalidArgument;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NotFound;
import com.vmware.vim25.NotImplemented;
import com.vmware.vim25.ReplicationGroupId;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.ws.Argument;
import com.vmware.vim25.ws.WSClient;

public class SmsStub {
    private WSClient wsc;

    public SmsStub(String url, boolean ignoreCert, String sessionStr, String apiVersion) throws java.net.MalformedURLException {
        this.wsc = new WSClient(url, ignoreCert);
        wsc.setCookie(sessionStr);

        switch(apiVersion) {
            case "6.0":
                wsc.setSoapAction(WSClient.SMS_SOAP_ACTION_V50);
                break;
            case "6.5":
            default:
                wsc.setSoapAction(WSClient.SMS_SOAP_ACTION_V65);
                break;
        }
    }

    public WSClient getWsc() {
        return wsc;
    }

    public ManagedObjectReference failoverReplicationGroup_Task(ManagedObjectReference _this, FailoverParam failoverParam) throws java.rmi.RemoteException,
            InactiveProvider, InvalidArgument, NotImplemented, ProviderBusy, ProviderOutOfResource, ProviderUnavailable, RuntimeFault, SmsReplicationFault,
            TooMany {
        Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("failoverParam", "FailoverParam", failoverParam);
        return (ManagedObjectReference) wsc.invoke("FailoverReplicationGroup_Task", paras, "ManagedObjectReference", WSClient.SMS_NAMESPACE);
    }

    public ManagedObjectReference[] queryProvider(ManagedObjectReference _this) throws java.rmi.RemoteException,
            RuntimeFault {
        Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (ManagedObjectReference[]) wsc.invoke("QueryProvider", paras, "ManagedObjectReference[]", WSClient.SMS_NAMESPACE);
    }

    public VasaProviderInfo queryProviderInfo(ManagedObjectReference _this) throws java.rmi.RemoteException,
            RuntimeFault {
        Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (VasaProviderInfo) wsc.invoke("QueryProviderInfo", paras, "VasaProviderInfo", WSClient.SMS_NAMESPACE);
    }

    public GroupOperationResult[] queryReplicationGroup(ManagedObjectReference _this, ReplicationGroupId[] groupId) throws java.rmi.RemoteException,
            InactiveProvider, NotImplemented, ProviderBusy, ProviderUnavailable, QueryExecutionFault, RuntimeFault {
        Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("groupId", "ReplicationGroupId[]", groupId);
        return (GroupOperationResult[]) wsc.invoke("QueryReplicationGroup", paras, "GroupOperationResult[]", WSClient.SMS_NAMESPACE);
    }

    public ManagedObjectReference registerProvider_Task(ManagedObjectReference _this, VasaProviderSpec spec)
            throws java.rmi.RemoteException, RuntimeFault {
        Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("providerSpec", "VasaProviderSpec", spec);
        return (ManagedObjectReference) wsc.invoke("RegisterProvider_Task", paras, "ManagedObjectReference", WSClient.SMS_NAMESPACE);
    }

    public ManagedObjectReference unregisterProvider_Task(ManagedObjectReference _this, String providerId)
            throws java.rmi.RemoteException, RuntimeFault {
        Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("providerId", "String", providerId);
        return (ManagedObjectReference) wsc.invoke("UnregisterProvider_Task", paras, "ManagedObjectReference", WSClient.SMS_NAMESPACE);
    }

    public ManagedObjectReference syncProviderTask(ManagedObjectReference _this) throws java.rmi.RemoteException, InvalidArgument, ProviderSyncFailed, RuntimeFault {
        Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (ManagedObjectReference) wsc.invoke("VasaProviderSync_Task", paras, "ManagedObjectReference", WSClient.SMS_NAMESPACE);
    }

    public SmsTaskInfo querySmsTaskInfo(ManagedObjectReference _this) throws java.rmi.RemoteException, RuntimeFault {
        Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (SmsTaskInfo) wsc.invoke("QuerySmsTaskInfo", paras, "SmsTaskInfo", WSClient.SMS_NAMESPACE);
    }

    public StorageContainerResult queryStorageContainers(ManagedObjectReference _this, StorageContainerSpec containerSpec) throws java.rmi.RemoteException, NotFound, QueryExecutionFault, RuntimeFault {
        Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("containerSpec", "StorageContainerSpec", containerSpec);
        return (StorageContainerResult) wsc.invoke("QueryStorageContainer", paras, "StorageContainerResult", WSClient.SMS_NAMESPACE);
    }
}
