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
@SuppressWarnings("all")
public class PbmCapabilityVendorNamespaceInfo
    extends DynamicData
{

    public PbmCapabilitySchemaVendorInfo vendorInfo;
    public PbmCapabilityNamespaceInfo namespaceInfo;

    public PbmCapabilitySchemaVendorInfo getVendorInfo() {
        return vendorInfo;
    }

    public void setVendorInfo(PbmCapabilitySchemaVendorInfo vendorInfo) {
        this.vendorInfo = vendorInfo;
    }

    public PbmCapabilityNamespaceInfo getNamespaceInfo() {
        return namespaceInfo;
    }

    public void setNamespaceInfo(PbmCapabilityNamespaceInfo namespaceInfo) {
        this.namespaceInfo = namespaceInfo;
    }

}