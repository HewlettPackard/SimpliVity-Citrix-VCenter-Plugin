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
public class ArrayOfKernelModuleInfo {

    private final static com.vmware.vim25.KernelModuleInfo[] NULL_KERNEL_MODULE_INFO_ARRAY = new com.vmware.vim25.KernelModuleInfo[ 0 ] ;
    public com.vmware.vim25.KernelModuleInfo[] KernelModuleInfo;

    public com.vmware.vim25.KernelModuleInfo[] getKernelModuleInfo() {
        if ((KernelModuleInfo) == null) {
            return (NULL_KERNEL_MODULE_INFO_ARRAY);
        }
        return KernelModuleInfo;
    }

    public void setKernelModuleInfo(com.vmware.vim25.KernelModuleInfo[] KernelModuleInfo) {
        this.KernelModuleInfo = KernelModuleInfo;
    }

}
