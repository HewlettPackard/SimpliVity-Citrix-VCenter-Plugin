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
public class ArrayOfHostFeatureMask {

    private final static com.vmware.vim25.HostFeatureMask[] NULL_HOST_FEATURE_MASK_ARRAY = new com.vmware.vim25.HostFeatureMask[ 0 ] ;
    public com.vmware.vim25.HostFeatureMask[] HostFeatureMask;

    public com.vmware.vim25.HostFeatureMask[] getHostFeatureMask() {
        if ((HostFeatureMask) == null) {
            return (NULL_HOST_FEATURE_MASK_ARRAY);
        }
        return HostFeatureMask;
    }

    public void setHostFeatureMask(com.vmware.vim25.HostFeatureMask[] HostFeatureMask) {
        this.HostFeatureMask = HostFeatureMask;
    }

}