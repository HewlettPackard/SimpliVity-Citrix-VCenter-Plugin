/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.vim.sms;

import java.net.MalformedURLException;

public class SmsPortType extends SmsStub {

    public SmsPortType(String url, boolean ignoreCert, String sessionStr, String apiVersion) throws MalformedURLException {
        super(url, ignoreCert, sessionStr, apiVersion);
    }
}
