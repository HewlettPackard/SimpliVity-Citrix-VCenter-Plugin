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
public class CannotUseNetwork
    extends VmConfigFault
{

    public String device;
    public String backing;
    public boolean connected;
    public String reason;
    public ManagedObjectReference network;

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getBacking() {
        return backing;
    }

    public void setBacking(String backing) {
        this.backing = backing;
    }

    public boolean getConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public boolean isConnected() {
        return connected;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ManagedObjectReference getNetwork() {
        return network;
    }

    public void setNetwork(ManagedObjectReference network) {
        this.network = network;
    }

}
