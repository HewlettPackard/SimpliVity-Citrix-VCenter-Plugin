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
public class HostSystemSwapConfiguration
    extends DynamicData
{

    private final static HostSystemSwapConfigurationSystemSwapOption[] NULL_OPTION_ARRAY = new HostSystemSwapConfigurationSystemSwapOption[ 0 ] ;
    public HostSystemSwapConfigurationSystemSwapOption[] option;

    public HostSystemSwapConfigurationSystemSwapOption[] getOption() {
        if ((option) == null) {
            return (NULL_OPTION_ARRAY);
        }
        return option;
    }

    public void setOption(HostSystemSwapConfigurationSystemSwapOption[] option) {
        this.option = option;
    }

}
