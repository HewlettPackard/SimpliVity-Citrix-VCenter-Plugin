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
public class HostProtocolEndpoint
    extends DynamicData
{

    public String peType;
    public String type;
    public String uuid;
    private final static ManagedObjectReference[] NULL_HOST_KEY_ARRAY = new ManagedObjectReference[ 0 ] ;
    public ManagedObjectReference[] hostKey;
    public String storageArray;
    public String nfsServer;
    public String nfsDir;
    public String nfsServerScope;
    public String nfsServerMajor;
    public String nfsServerAuthType;
    public String nfsServerUser;
    public String deviceId;

    public String getPeType() {
        return peType;
    }

    public void setPeType(String peType) {
        this.peType = peType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ManagedObjectReference[] getHostKey() {
        if ((hostKey) == null) {
            return (NULL_HOST_KEY_ARRAY);
        }
        return hostKey;
    }

    public void setHostKey(ManagedObjectReference[] hostKey) {
        this.hostKey = hostKey;
    }

    public String getStorageArray() {
        return storageArray;
    }

    public void setStorageArray(String storageArray) {
        this.storageArray = storageArray;
    }

    public String getNfsServer() {
        return nfsServer;
    }

    public void setNfsServer(String nfsServer) {
        this.nfsServer = nfsServer;
    }

    public String getNfsDir() {
        return nfsDir;
    }

    public void setNfsDir(String nfsDir) {
        this.nfsDir = nfsDir;
    }

    public String getNfsServerScope() {
        return nfsServerScope;
    }

    public void setNfsServerScope(String nfsServerScope) {
        this.nfsServerScope = nfsServerScope;
    }

    public String getNfsServerMajor() {
        return nfsServerMajor;
    }

    public void setNfsServerMajor(String nfsServerMajor) {
        this.nfsServerMajor = nfsServerMajor;
    }

    public String getNfsServerAuthType() {
        return nfsServerAuthType;
    }

    public void setNfsServerAuthType(String nfsServerAuthType) {
        this.nfsServerAuthType = nfsServerAuthType;
    }

    public String getNfsServerUser() {
        return nfsServerUser;
    }

    public void setNfsServerUser(String nfsServerUser) {
        this.nfsServerUser = nfsServerUser;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

}
