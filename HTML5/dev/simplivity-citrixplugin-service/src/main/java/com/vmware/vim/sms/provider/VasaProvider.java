/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.vim.sms.provider;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.vmware.vim.sms.FailoverParam;
import com.vmware.vim.sms.GroupOperationResult;
import com.vmware.vim.sms.InactiveProvider;
import com.vmware.vim.sms.ProviderBusy;
import com.vmware.vim.sms.ProviderOutOfResource;
import com.vmware.vim.sms.ProviderSyncFailed;
import com.vmware.vim.sms.ProviderUnavailable;
import com.vmware.vim.sms.QueryExecutionFault;
import com.vmware.vim.sms.SmsReplicationFault;
import com.vmware.vim.sms.TooMany;
import com.vmware.vim.sms.VasaProviderInfo;
import com.vmware.vim25.InvalidArgument;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NotImplemented;
import com.vmware.vim25.ReplicationGroupId;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.mo.ServerConnection;
import com.vmware.vim25.mo.SmsTask;

public class VasaProvider extends SmsProvider {
    public VasaProvider(ServerConnection serverConnection, ManagedObjectReference mor)
    {
        super(serverConnection, mor);
    }

    @Override
    public VasaProviderInfo queryProviderInfo() throws RemoteException, RuntimeFault {
        return (VasaProviderInfo) getSmsService().queryProviderInfo(getMOR());
    }

    public SmsTask syncProvider_Task() throws RemoteException, InvalidArgument, ProviderSyncFailed, RuntimeFault {
        return new SmsTask(getServerConnection(), getSmsService().syncProviderTask(getMOR()));
    }

    public SmsTask failoverReplicationGroup_Task(FailoverParam failoverParam) throws RemoteException, InactiveProvider, InvalidArgument, NotImplemented,
            ProviderBusy, ProviderOutOfResource, ProviderUnavailable, RuntimeFault, SmsReplicationFault, TooMany {
        ManagedObjectReference mor = getSmsService().failoverReplicationGroup_Task(getMOR(), failoverParam);
        return new SmsTask(getServerConnection(), mor);
    }

    public List<GroupOperationResult> queryReplicationGroup(List<ReplicationGroupId> groupIds) throws RemoteException, InactiveProvider, NotImplemented, ProviderBusy,
            ProviderUnavailable, QueryExecutionFault, RuntimeFault {
        List<GroupOperationResult> results = new ArrayList();
        for (GroupOperationResult result : getSmsService().queryReplicationGroup(getMOR(), groupIds != null ? groupIds.toArray(new ReplicationGroupId[] {}) : null)) {
            results.add(result);
        }
        return results;
    }
}
