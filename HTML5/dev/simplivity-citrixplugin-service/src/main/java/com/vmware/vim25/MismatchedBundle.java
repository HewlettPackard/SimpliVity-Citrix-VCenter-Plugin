//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;



/**
 * 
 */
@SuppressWarnings("all")
public class MismatchedBundle
    extends VimFault
{

    public String bundleUuid;
    public String hostUuid;
    public int bundleBuildNumber;
    public int hostBuildNumber;

    public String getBundleUuid() {
        return bundleUuid;
    }

    public void setBundleUuid(String bundleUuid) {
        this.bundleUuid = bundleUuid;
    }

    public String getHostUuid() {
        return hostUuid;
    }

    public void setHostUuid(String hostUuid) {
        this.hostUuid = hostUuid;
    }

    public int getBundleBuildNumber() {
        return bundleBuildNumber;
    }

    public void setBundleBuildNumber(int bundleBuildNumber) {
        this.bundleBuildNumber = bundleBuildNumber;
    }

    public int getHostBuildNumber() {
        return hostBuildNumber;
    }

    public void setHostBuildNumber(int hostBuildNumber) {
        this.hostBuildNumber = hostBuildNumber;
    }

}
