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
public class VmfsDatastoreOption
    extends DynamicData
{

    public VmfsDatastoreBaseOption info;
    public VmfsDatastoreSpec spec;

    public VmfsDatastoreBaseOption getInfo() {
        return info;
    }

    public void setInfo(VmfsDatastoreBaseOption info) {
        this.info = info;
    }

    public VmfsDatastoreSpec getSpec() {
        return spec;
    }

    public void setSpec(VmfsDatastoreSpec spec) {
        this.spec = spec;
    }

}
