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
public class VirtualMachineGuestSummary
    extends DynamicData
{

    public String guestId;
    public String guestFullName;
    public VirtualMachineToolsStatus toolsStatus;
    public String toolsVersionStatus;
    public String toolsVersionStatus2;
    public String toolsRunningStatus;
    public String hostName;
    public String ipAddress;

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getGuestFullName() {
        return guestFullName;
    }

    public void setGuestFullName(String guestFullName) {
        this.guestFullName = guestFullName;
    }

    public VirtualMachineToolsStatus getToolsStatus() {
        return toolsStatus;
    }

    public void setToolsStatus(VirtualMachineToolsStatus toolsStatus) {
        this.toolsStatus = toolsStatus;
    }

    public String getToolsVersionStatus() {
        return toolsVersionStatus;
    }

    public void setToolsVersionStatus(String toolsVersionStatus) {
        this.toolsVersionStatus = toolsVersionStatus;
    }

    public String getToolsVersionStatus2() {
        return toolsVersionStatus2;
    }

    public void setToolsVersionStatus2(String toolsVersionStatus2) {
        this.toolsVersionStatus2 = toolsVersionStatus2;
    }

    public String getToolsRunningStatus() {
        return toolsRunningStatus;
    }

    public void setToolsRunningStatus(String toolsRunningStatus) {
        this.toolsRunningStatus = toolsRunningStatus;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}