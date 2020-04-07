/*
================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice,
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice,
this list of conditions and the following disclaimer in the documentation
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
================================================================================
*/

package org.doublecloud.vi.vmware.guest;

import java.rmi.RemoteException;

import com.vmware.vim25.FileFault;
import com.vmware.vim25.GuestOperationsFault;
import com.vmware.vim25.GuestProcessInfo;
import com.vmware.vim25.GuestProgramSpec;
import com.vmware.vim25.InvalidState;
import com.vmware.vim25.NamePasswordAuthentication;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.TaskInProgress;
import com.vmware.vim25.mo.GuestProcessManager;
import com.vmware.vim25.mo.VirtualMachine;

public class GuestProcessDirector {
    VirtualMachine vm;
    GuestProcessManager gpm;
    NamePasswordAuthentication auth = new NamePasswordAuthentication();

    public GuestProcessDirector(VirtualMachine vm, String user, String password) {
        this.vm = vm;
        this.gpm = vm.getServerConnection().getServiceInstance().getGuestOperationsManager().getProcessManager(vm);
        this.auth.username = user;
        this.auth.password = password;
    }

    public long run(String programPath, String arguments)
            throws GuestOperationsFault, InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        GuestProgramSpec spec = new GuestProgramSpec();
        spec.programPath = programPath;
        spec.arguments = arguments;
        return this.gpm.startProgramInGuest(this.auth, spec);
    }

    public long run(String scriptPath)
            throws GuestOperationsFault, InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        String args;
        String prog;
        if (scriptPath.startsWith("\"")) {
            int next = scriptPath.indexOf("\"", 1);
            prog = scriptPath.substring(1, next);
            args = scriptPath.substring(next + 1);
        } else {
            int next = scriptPath.indexOf(" ");
            if (next == -1) {
                prog = scriptPath;
                args = "";
            } else {
                prog = scriptPath.substring(0, next);
                args = scriptPath.substring(next + 1);
            }
        }

        return run(prog, args);
    }

    public GuestProcessInfo[] listProcesses()
            throws GuestOperationsFault, InvalidState, TaskInProgress, RuntimeFault, RemoteException {
        return listProcesses(null);
    }

    public GuestProcessInfo[] listProcesses(long[] pids)
            throws GuestOperationsFault, InvalidState, TaskInProgress, RuntimeFault, RemoteException {
        return this.gpm.listProcessesInGuest(this.auth, pids);
    }

    public void killProcess(long pid)
            throws GuestOperationsFault, InvalidState, TaskInProgress, RuntimeFault, RemoteException {
        this.gpm.terminateProcessInGuest(this.auth, pid);
    }

    public String[] readEnvironmentVariables(String[] names)
            throws GuestOperationsFault, InvalidState, TaskInProgress, RuntimeFault, RemoteException {
        return this.gpm.readEnvironmentVariableInGuest(this.auth, names);
    }

    public String[] readEnvironmentVariables()
            throws GuestOperationsFault, InvalidState, TaskInProgress, RuntimeFault, RemoteException {
        return readEnvironmentVariables(null);
    }
}
