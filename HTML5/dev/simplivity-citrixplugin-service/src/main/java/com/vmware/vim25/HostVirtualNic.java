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
public class HostVirtualNic
    extends DynamicData
{

    public String device;
    public String key;
    public String portgroup;
    public HostVirtualNicSpec spec;
    public String port;

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPortgroup() {
        return portgroup;
    }

    public void setPortgroup(String portgroup) {
        this.portgroup = portgroup;
    }

    public HostVirtualNicSpec getSpec() {
        return spec;
    }

    public void setSpec(HostVirtualNicSpec spec) {
        this.spec = spec;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

}