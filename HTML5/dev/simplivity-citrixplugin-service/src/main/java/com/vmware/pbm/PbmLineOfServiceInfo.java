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
public class PbmLineOfServiceInfo
    extends DynamicData
{

    public String lineOfService;
    public PbmExtendedElementDescription name;
    public PbmExtendedElementDescription description;

    public String getLineOfService() {
        return lineOfService;
    }

    public void setLineOfService(String lineOfService) {
        this.lineOfService = lineOfService;
    }

    public PbmExtendedElementDescription getName() {
        return name;
    }

    public void setName(PbmExtendedElementDescription name) {
        this.name = name;
    }

    public PbmExtendedElementDescription getDescription() {
        return description;
    }

    public void setDescription(PbmExtendedElementDescription description) {
        this.description = description;
    }

}