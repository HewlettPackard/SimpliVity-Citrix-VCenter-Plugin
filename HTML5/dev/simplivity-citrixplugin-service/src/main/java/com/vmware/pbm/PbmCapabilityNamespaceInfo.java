//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.pbm;

import com.vmware.vim25.DynamicData;


/**
 * 
 */
public class PbmCapabilityNamespaceInfo
    extends DynamicData
{

    public String version;
    public String namespace;
    public PbmExtendedElementDescription info;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public PbmExtendedElementDescription getInfo() {
        return info;
    }

    public void setInfo(PbmExtendedElementDescription info) {
        this.info = info;
    }

}