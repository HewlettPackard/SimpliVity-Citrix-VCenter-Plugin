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
public class ArrayOfVVolHostPE {

    private final static com.vmware.vim25.VVolHostPE[] NULL_V_VOL_HOST_PE_ARRAY = new com.vmware.vim25.VVolHostPE[ 0 ] ;
    public com.vmware.vim25.VVolHostPE[] VVolHostPE;

    public com.vmware.vim25.VVolHostPE[] getVVolHostPE() {
        if ((VVolHostPE) == null) {
            return (NULL_V_VOL_HOST_PE_ARRAY);
        }
        return VVolHostPE;
    }

    public void setVVolHostPE(com.vmware.vim25.VVolHostPE[] VVolHostPE) {
        this.VVolHostPE = VVolHostPE;
    }

}
