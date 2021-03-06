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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.vmware.vim25.FileFault;
import com.vmware.vim25.FileTransferInformation;
import com.vmware.vim25.GuestFileAttributes;
import com.vmware.vim25.GuestFileInfo;
import com.vmware.vim25.GuestListFileInfo;
import com.vmware.vim25.GuestOperationsFault;
import com.vmware.vim25.GuestPosixFileAttributes;
import com.vmware.vim25.GuestWindowsFileAttributes;
import com.vmware.vim25.InvalidState;
import com.vmware.vim25.NamePasswordAuthentication;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.TaskInProgress;
import com.vmware.vim25.mo.GuestFileManager;
import com.vmware.vim25.mo.VirtualMachine;

public class GuestFileDirector {
    protected VirtualMachine vm;
    protected GuestFileManager gfm;
    protected NamePasswordAuthentication auth = new NamePasswordAuthentication();

    public GuestFileDirector(VirtualMachine vm, String username, String password) {
        this.vm = vm;
        this.gfm = vm.getServerConnection().getServiceInstance().getGuestOperationsManager().getFileManager(vm);
        this.auth.username = username;
        this.auth.password = password;
    }

    public void changeFileAttributes(String guestFilePath, Calendar accessTime, Calendar modificationTime,
            String symlinkTarget)
            throws GuestOperationsFault, InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        GuestFileAttributes fileAttr = new GuestFileAttributes();
        fileAttr.accessTime = accessTime;
        fileAttr.modificationTime = modificationTime;
        fileAttr.symlinkTarget = symlinkTarget;
        this.gfm.changeFileAttributesInGuest(this.auth, guestFilePath, fileAttr);
    }

    public String createTemporaryDirectory(String prefix, String suffix, String directoryPath)
            throws GuestOperationsFault, InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        return this.gfm.createTemporaryDirectoryInGuest(this.auth, prefix, suffix, directoryPath);
    }

    public String createTemporaryFile(String prefix, String suffix, String directoryPath)
            throws GuestOperationsFault, InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        return this.gfm.createTemporaryFileInGuest(this.auth, prefix, suffix, directoryPath);
    }

    public void deleteDirectory(String directoryPath)
            throws GuestOperationsFault, InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        this.gfm.deleteDirectoryInGuest(this.auth, directoryPath, true);
    }

    public void deleteFile(String filePath)
            throws GuestOperationsFault, InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        this.gfm.deleteFileInGuest(this.auth, filePath);
    }

    public GuestListFileInfo listFiles(String pathInGuest, String matchPattern)
            throws GuestOperationsFault, InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        return this.gfm.listFilesInGuest(this.auth, pathInGuest, 0, 2147483647, matchPattern);
    }

    public GuestListFileInfo listFiles(String pathInGuest)
            throws GuestOperationsFault, InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        return listFiles(pathInGuest, ".*");
    }

    public void makeDirectory(String dirPathInGuest) throws IOException {
        this.gfm.makeDirectoryInGuest(this.auth, dirPathInGuest, true);
    }

    public void moveDirectory(String srcDirectoryPath, String dstDirectoryPath)
            throws GuestOperationsFault, InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        this.gfm.moveDirectoryInGuest(this.auth, srcDirectoryPath, dstDirectoryPath);
    }

    public void moveFile(String srcFilePath, String dstFilePath, boolean overwrite)
            throws GuestOperationsFault, InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        this.gfm.moveFileInGuest(this.auth, srcFilePath, dstFilePath, overwrite);
    }

    public void downloadDirectory(String dirPathInGuest, String dirPathLocal) throws IOException, GuestOperationsFault,
            InvalidState, TaskInProgress, FileFault, RuntimeFault, RemoteException {
        File localDir = new File(dirPathLocal);
        localDir.mkdirs();

        GuestListFileInfo listInfo = listFiles(dirPathInGuest);
        for (GuestFileInfo fileInfo : listInfo.files) {
            String newPathInGuest = new File(dirPathInGuest, fileInfo.path).getCanonicalPath();
            String newPathLocal = new File(dirPathLocal, fileInfo.path).getCanonicalPath();

            if ("directory".equals(fileInfo.type)) {
                if ((!".".equals(fileInfo.path)) && (!"..".equals(fileInfo.path))) {
                    downloadDirectory(newPathInGuest, newPathLocal);
                }
            } else
                downloadFile(newPathInGuest, newPathLocal);
        }
    }

    public void downloadFile(String filePathInGuest, String filePathLocal) throws IOException {
        FileOutputStream out = new FileOutputStream(filePathLocal);
        GuestFileAttributes fileAttr = downloadToStream(filePathInGuest, out);
        out.close();
        new File(filePathLocal).setLastModified(fileAttr.modificationTime.getTimeInMillis());
    }

    public GuestFileAttributes downloadToStream(String filePathInGuest, OutputStream out) throws IOException {
        FileTransferInformation fileTranInfo = this.gfm.initiateFileTransferFromGuest(this.auth, filePathInGuest);

        URL fileURL = new URL(fileTranInfo.getUrl());
        if (fileURL.getHost().equals("*")) {
            fileURL = new URL(fileURL.getProtocol(), vm.getServerConnection().getUrl().getHost(), fileURL.getPort(), fileURL.getFile());
        }
        InputStream is = fileURL.openStream();
        readStream2Stream(is, out);
        is.close();

        return fileTranInfo.getAttributes();
    }

    public void uploadDirectory(String dirPathLocal, String dirPathInGuest) throws IOException {
        File dir = new File(dirPathLocal);
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("Local directory path points to a file: " + dirPathLocal);
        }

        makeDirectory(dirPathInGuest);

        File[] kids = dir.listFiles();

        for (File kid : kids) {
            String kidName = kid.getName();
            String pathInGuest = new File(dirPathInGuest, kidName).getCanonicalPath();

            if (kid.isDirectory()) {
                uploadDirectory(kid.getCanonicalPath(), pathInGuest);
            } else {
                uploadFile(kid.getCanonicalPath(), pathInGuest);
            }
        }
    }

    public void uploadFile(String filePathLocal, String filePathInGuest) throws IOException {
        File file = new File(filePathLocal);

        if (file.isDirectory()) {
            throw new IllegalArgumentException("Local file path points to a directory: " + filePathLocal);
        }

        long fileSize = file.length();

        FileInputStream in = new FileInputStream(filePathLocal);
        uploadFromStream(in, fileSize, filePathInGuest, file.lastModified(), true);
        in.close();
    }

    public void uploadFromStream(InputStream in, long size, String filePathInGuest, long modifyTime, boolean overwrite)
            throws IOException {
        GuestFileAttributes guestFileAttr = null;

        if (this.vm.getGuest().getGuestId().startsWith("win")) {
            GuestWindowsFileAttributes winFileAttr = new GuestWindowsFileAttributes();
            guestFileAttr = winFileAttr;
        } else {
            GuestPosixFileAttributes posixFileAttributes = new GuestPosixFileAttributes();
            posixFileAttributes.setPermissions(Long.valueOf(420L));
            guestFileAttr = posixFileAttributes;
        }

        guestFileAttr.setAccessTime(GregorianCalendar.getInstance());
        Calendar modCal = Calendar.getInstance();
        modCal.setTimeInMillis(modifyTime);
        guestFileAttr.setModificationTime(modCal);

        String upUrlStr = this.gfm.initiateFileTransferToGuest(this.auth, filePathInGuest, guestFileAttr, size,
                overwrite);

        uploadData(upUrlStr, in, size);
    }

    private void uploadData(String urlString, InputStream in, long size) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) new URL(urlString).openConnection();
        conn.setDoInput(true);
        conn.setDoOutput(true);

        conn.setRequestProperty("Content-Type", "application/octet-stream");
        conn.setRequestMethod("PUT");
        conn.setRequestProperty("Content-Length", Long.toString(size));

        OutputStream out = conn.getOutputStream();
        readStream2Stream(in, out);
        out.close();

        if (200 != conn.getResponseCode()) {
            throw new IOException("File upload is not successful");
        }
        conn.disconnect();
    }

    private static void readStream2Stream(InputStream from, OutputStream to) throws IOException {
        byte[] buf = new byte[4096];
        int len = 0;
        while ((len = from.read(buf)) > 0) {
            to.write(buf, 0, len);
        }
    }
}
