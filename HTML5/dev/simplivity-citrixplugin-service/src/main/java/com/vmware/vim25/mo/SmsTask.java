/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.vim25.mo;

import java.rmi.RemoteException;

import com.vmware.vim.sms.SmsTaskInfo;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;

public class SmsTask extends ManagedObject {

    private final int MAX_ATTEMPTS   = 300;
    private final int SLEEP_INTERVAL = 1000;

    public SmsTask(ServerConnection sc, ManagedObjectReference mor) {
        super(sc, mor);
    }

    public SmsTaskInfo waitForTask() throws RuntimeFault, RemoteException, InterruptedException {
        return waitForTask(MAX_ATTEMPTS, SLEEP_INTERVAL);
    }

    public SmsTaskInfo waitForTask(int maxAttempts, int sleepInterval) throws RuntimeFault, RemoteException, InterruptedException {
        SmsTaskInfo info = null;

        int i = 0;
        while (i < MAX_ATTEMPTS) {
            Thread.sleep(SLEEP_INTERVAL);

            info = getServerConnection().getSmsService().querySmsTaskInfo(getMOR());

            if (info.getState().equals("running")) {
                ++i;
            } else {
                break;
            }
        }

        return info;
    }
}
