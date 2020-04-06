//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;

import java.util.Calendar;


/**
 * 
 */
@SuppressWarnings("all")
public class DistributedVirtualPort
    extends DynamicData
{

    public String key;
    public DVPortConfigInfo config;
    public String dvsUuid;
    public String portgroupKey;
    public ManagedObjectReference proxyHost;
    public DistributedVirtualSwitchPortConnectee connectee;
    public boolean conflict;
    public String conflictPortKey;
    public DVPortState state;
    public Integer connectionCookie;
    public Calendar lastStatusChange;
    public Boolean hostLocalPort;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DVPortConfigInfo getConfig() {
        return config;
    }

    public void setConfig(DVPortConfigInfo config) {
        this.config = config;
    }

    public String getDvsUuid() {
        return dvsUuid;
    }

    public void setDvsUuid(String dvsUuid) {
        this.dvsUuid = dvsUuid;
    }

    public String getPortgroupKey() {
        return portgroupKey;
    }

    public void setPortgroupKey(String portgroupKey) {
        this.portgroupKey = portgroupKey;
    }

    public ManagedObjectReference getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(ManagedObjectReference proxyHost) {
        this.proxyHost = proxyHost;
    }

    public DistributedVirtualSwitchPortConnectee getConnectee() {
        return connectee;
    }

    public void setConnectee(DistributedVirtualSwitchPortConnectee connectee) {
        this.connectee = connectee;
    }

    public boolean getConflict() {
        return conflict;
    }

    public void setConflict(boolean conflict) {
        this.conflict = conflict;
    }

    public boolean isConflict() {
        return conflict;
    }

    public String getConflictPortKey() {
        return conflictPortKey;
    }

    public void setConflictPortKey(String conflictPortKey) {
        this.conflictPortKey = conflictPortKey;
    }

    public DVPortState getState() {
        return state;
    }

    public void setState(DVPortState state) {
        this.state = state;
    }

    public Integer getConnectionCookie() {
        return connectionCookie;
    }

    public void setConnectionCookie(Integer connectionCookie) {
        this.connectionCookie = connectionCookie;
    }

    public Calendar getLastStatusChange() {
        return lastStatusChange;
    }

    public void setLastStatusChange(Calendar lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    public Boolean getHostLocalPort() {
        return hostLocalPort;
    }

    public void setHostLocalPort(Boolean hostLocalPort) {
        this.hostLocalPort = hostLocalPort;
    }

    public Boolean isHostLocalPort() {
        return hostLocalPort;
    }

}