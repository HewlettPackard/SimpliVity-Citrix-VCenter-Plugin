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
public class HostNatServiceConfig
    extends DynamicData
{

    public String changeOperation;
    public String key;
    public HostNatServiceSpec spec;

    public String getChangeOperation() {
        return changeOperation;
    }

    public void setChangeOperation(String changeOperation) {
        this.changeOperation = changeOperation;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public HostNatServiceSpec getSpec() {
        return spec;
    }

    public void setSpec(HostNatServiceSpec spec) {
        this.spec = spec;
    }

}
