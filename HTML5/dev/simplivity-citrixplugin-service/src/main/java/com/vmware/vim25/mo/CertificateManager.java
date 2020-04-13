/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.vim25.mo;

import java.rmi.RemoteException;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.SystemError;
import com.vmware.vim25.mo.util.MorUtil;

/**
 * The managed object class corresponding to the one defined in VI SDK API reference.
 * @author carter
 */
public class CertificateManager extends ManagedObject
{
    public CertificateManager(ServerConnection sc, ManagedObjectReference mor)
    {
        super(sc, mor);
    }

    public Task refreshCaCertificatesAndCrls_Task(HostSystem[] host) throws RemoteException, RuntimeFault, SystemError
    {
        if(host==null)
        {
            throw new IllegalArgumentException("host must not be null.");
        }
        ManagedObjectReference taskMOR = getVimService().certMgrRefreshCaCertificatesAndCrls_Task(getMOR(), MorUtil.createMORs(host));
        return new Task(getServerConnection(), taskMOR);
    }
}
