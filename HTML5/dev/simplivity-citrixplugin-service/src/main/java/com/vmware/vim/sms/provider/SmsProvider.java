/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.vim.sms.provider;

import java.rmi.RemoteException;

import com.vmware.vim.sms.SmsProviderInfo;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.ServerConnection;

public class SmsProvider extends ManagedEntity {
    public SmsProvider(ServerConnection serverConnection, ManagedObjectReference mor)
    {
        super(serverConnection, mor);
    }

    public SmsProviderInfo queryProviderInfo() throws RemoteException, RuntimeFault {
        return getSmsService().queryProviderInfo(getMOR());
    }
}
