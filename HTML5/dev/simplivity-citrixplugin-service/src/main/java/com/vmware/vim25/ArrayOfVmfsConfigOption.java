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
public class ArrayOfVmfsConfigOption {

    private final static com.vmware.vim25.VmfsConfigOption[] NULL_VMFS_CONFIG_OPTION_ARRAY = new com.vmware.vim25.VmfsConfigOption[ 0 ] ;
    public com.vmware.vim25.VmfsConfigOption[] VmfsConfigOption;

    public com.vmware.vim25.VmfsConfigOption[] getVmfsConfigOption() {
        if ((VmfsConfigOption) == null) {
            return (NULL_VMFS_CONFIG_OPTION_ARRAY);
        }
        return VmfsConfigOption;
    }

    public void setVmfsConfigOption(com.vmware.vim25.VmfsConfigOption[] VmfsConfigOption) {
        this.VmfsConfigOption = VmfsConfigOption;
    }

}