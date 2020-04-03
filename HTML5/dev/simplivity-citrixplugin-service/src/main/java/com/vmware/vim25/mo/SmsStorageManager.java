/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.vim25.mo;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vmware.vim.sms.QueryExecutionFault;
import com.vmware.vim.sms.StorageContainer;
import com.vmware.vim.sms.StorageContainerResult;
import com.vmware.vim.sms.StorageContainerSpec;
import com.vmware.vim.sms.VasaProviderInfo;
import com.vmware.vim.sms.VasaProviderSpec;
import com.vmware.vim.sms.provider.VasaProvider;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NotFound;
import com.vmware.vim25.RuntimeFault;

public class SmsStorageManager extends ManagedObject {
    public SmsStorageManager(ServerConnection sc, ManagedObjectReference mor)
    {
        super(sc, mor);
    }

    public List<VasaProvider> getVasaProviders() throws RemoteException, RuntimeFault {
        List<VasaProvider> providers = new ArrayList<VasaProvider>();

        for(ManagedObjectReference moref : queryProvider()) {
            providers.add(new VasaProvider(getServerConnection(), moref));
        }

        return providers;
    }

    public List<VasaProviderInfo> getVasaProviderInfo() throws RemoteException, RuntimeFault {
        List<VasaProviderInfo> providerInfos = new ArrayList<VasaProviderInfo>();

        for(VasaProvider provider : getVasaProviders()) {
            providerInfos.add(provider.queryProviderInfo());
        }

        return providerInfos;
    }

    public List<ManagedObjectReference> queryProvider() throws RemoteException, QueryExecutionFault, RuntimeFault {
        List<ManagedObjectReference> providerMorefs = new ArrayList();

        ManagedObjectReference[] morefs = getSmsService().queryProvider(getMOR());
        if (morefs != null) {
            providerMorefs.addAll(Arrays.asList(morefs));
        }

        return providerMorefs;
    }

    public List<StorageContainer> queryStorageContainers(StorageContainerSpec spec) throws RemoteException, NotFound, QueryExecutionFault, RuntimeFault {
        StorageContainerResult result = getSmsService().queryStorageContainers(getMOR(), spec);

        List<StorageContainer> storageContainers = new ArrayList();
        if (result != null && result.getStorageContainer() != null) {
            for (StorageContainer container : result.getStorageContainer()) {
                storageContainers.add(container);
            }
        }

        return storageContainers;
    }

    public SmsTask registerProvider_Task(VasaProviderSpec spec)
            throws RemoteException, RuntimeFault {
        return new SmsTask(getServerConnection(), getSmsService().registerProvider_Task(getMOR(), spec));
    }

    public SmsTask unregisterProvider_Task(String providerId)
            throws RemoteException, RuntimeFault {
        return new SmsTask(getServerConnection(), getSmsService().unregisterProvider_Task(getMOR(), providerId));
    }
}
