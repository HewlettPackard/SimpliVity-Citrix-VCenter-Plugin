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
public class ArrayOfNvdimmGuid {

    private final static com.vmware.vim25.NvdimmGuid[] NULL_NVDIMM_GUID_ARRAY = new com.vmware.vim25.NvdimmGuid[ 0 ] ;
    public com.vmware.vim25.NvdimmGuid[] NvdimmGuid;

    public com.vmware.vim25.NvdimmGuid[] getNvdimmGuid() {
        if ((NvdimmGuid) == null) {
            return (NULL_NVDIMM_GUID_ARRAY);
        }
        return NvdimmGuid;
    }

    public void setNvdimmGuid(com.vmware.vim25.NvdimmGuid[] NvdimmGuid) {
        this.NvdimmGuid = NvdimmGuid;
    }

}