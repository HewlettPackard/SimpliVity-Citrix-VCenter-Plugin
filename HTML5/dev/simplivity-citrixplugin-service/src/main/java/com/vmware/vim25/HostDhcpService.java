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
public class HostDhcpService
    extends DynamicData
{

    public String key;
    public HostDhcpServiceSpec spec;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public HostDhcpServiceSpec getSpec() {
        return spec;
    }

    public void setSpec(HostDhcpServiceSpec spec) {
        this.spec = spec;
    }

}
