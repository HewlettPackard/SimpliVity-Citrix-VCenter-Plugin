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
public class HostMultipathInfoPath
    extends DynamicData
{

    public String key;
    public String name;
    public String pathState;
    public String state;
    public Boolean isWorkingPath;
    public String adapter;
    public String lun;
    public HostTargetTransport transport;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPathState() {
        return pathState;
    }

    public void setPathState(String pathState) {
        this.pathState = pathState;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getIsWorkingPath() {
        return isWorkingPath;
    }

    public void setIsWorkingPath(Boolean isWorkingPath) {
        this.isWorkingPath = isWorkingPath;
    }

    public Boolean isIsWorkingPath() {
        return isWorkingPath;
    }

    public String getAdapter() {
        return adapter;
    }

    public void setAdapter(String adapter) {
        this.adapter = adapter;
    }

    public String getLun() {
        return lun;
    }

    public void setLun(String lun) {
        this.lun = lun;
    }

    public HostTargetTransport getTransport() {
        return transport;
    }

    public void setTransport(HostTargetTransport transport) {
        this.transport = transport;
    }

}
