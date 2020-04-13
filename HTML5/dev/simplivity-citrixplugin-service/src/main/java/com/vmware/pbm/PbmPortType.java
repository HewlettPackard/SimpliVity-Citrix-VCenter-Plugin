/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.pbm;

import java.net.MalformedURLException;

public class PbmPortType extends PbmStub {
    public PbmPortType(String url, boolean ignoreCert, String sessionStr) throws MalformedURLException {
        super(url, ignoreCert, sessionStr);
    }
}
