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
public class VimVasaProviderInfo
    extends DynamicData
{

    public VimVasaProvider provider;
    private final static VimVasaProviderStatePerArray[] NULL_ARRAY_STATE_ARRAY = new VimVasaProviderStatePerArray[ 0 ] ;
    public VimVasaProviderStatePerArray[] arrayState;

    public VimVasaProvider getProvider() {
        return provider;
    }

    public void setProvider(VimVasaProvider provider) {
        this.provider = provider;
    }

    public VimVasaProviderStatePerArray[] getArrayState() {
        if ((arrayState) == null) {
            return (NULL_ARRAY_STATE_ARRAY);
        }
        return arrayState;
    }

    public void setArrayState(VimVasaProviderStatePerArray[] arrayState) {
        this.arrayState = arrayState;
    }

}