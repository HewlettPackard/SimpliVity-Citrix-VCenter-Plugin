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
public class ArrayOfVirtualDeviceOption {

    private final static com.vmware.vim25.VirtualDeviceOption[] NULL_VIRTUAL_DEVICE_OPTION_ARRAY = new com.vmware.vim25.VirtualDeviceOption[ 0 ] ;
    public com.vmware.vim25.VirtualDeviceOption[] VirtualDeviceOption;

    public com.vmware.vim25.VirtualDeviceOption[] getVirtualDeviceOption() {
        if ((VirtualDeviceOption) == null) {
            return (NULL_VIRTUAL_DEVICE_OPTION_ARRAY);
        }
        return VirtualDeviceOption;
    }

    public void setVirtualDeviceOption(com.vmware.vim25.VirtualDeviceOption[] VirtualDeviceOption) {
        this.VirtualDeviceOption = VirtualDeviceOption;
    }

}
