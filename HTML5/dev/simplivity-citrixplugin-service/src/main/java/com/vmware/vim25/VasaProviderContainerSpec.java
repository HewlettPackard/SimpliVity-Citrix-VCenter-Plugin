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
public class VasaProviderContainerSpec
    extends DynamicData
{

    private final static VimVasaProviderInfo[] NULL_VASA_PROVIDER_INFO_ARRAY = new VimVasaProviderInfo[ 0 ] ;
    public VimVasaProviderInfo[] vasaProviderInfo;
    public String scId;
    public boolean deleted;

    public VimVasaProviderInfo[] getVasaProviderInfo() {
        if ((vasaProviderInfo) == null) {
            return (NULL_VASA_PROVIDER_INFO_ARRAY);
        }
        return vasaProviderInfo;
    }

    public void setVasaProviderInfo(VimVasaProviderInfo[] vasaProviderInfo) {
        this.vasaProviderInfo = vasaProviderInfo;
    }

    public String getScId() {
        return scId;
    }

    public void setScId(String scId) {
        this.scId = scId;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isDeleted() {
        return deleted;
    }

}
