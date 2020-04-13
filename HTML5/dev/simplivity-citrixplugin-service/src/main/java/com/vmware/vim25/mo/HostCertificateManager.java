/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.vim25.mo;

import java.rmi.RemoteException;

import com.vmware.vim25.HostCertificateManagerCertificateInfo;
import com.vmware.vim25.HostConfigFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;

public class HostCertificateManager extends ManagedObject {
    public HostCertificateManager(ServerConnection serverConnection, ManagedObjectReference mor)
    {
        super(serverConnection, mor);
    }

    public HostCertificateManagerCertificateInfo getCertificateInfo()
    {
        return (HostCertificateManagerCertificateInfo) getCurrentProperty("certificateInfo");
    }

    public String[] listCaCertificates() throws RemoteException, HostConfigFault, RuntimeFault
    {
        return getVimService().listCaCertificates(this.getMOR());
    }
}
