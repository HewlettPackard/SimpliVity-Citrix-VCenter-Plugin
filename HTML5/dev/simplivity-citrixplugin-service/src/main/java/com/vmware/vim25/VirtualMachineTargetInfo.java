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
public class VirtualMachineTargetInfo
    extends DynamicData
{

    public String name;
    private final static String[] NULL_CONFIGURATION_TAG_ARRAY = new String[ 0 ] ;
    public String[] configurationTag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getConfigurationTag() {
        if ((configurationTag) == null) {
            return (NULL_CONFIGURATION_TAG_ARRAY);
        }
        return configurationTag;
    }

    public void setConfigurationTag(String[] configurationTag) {
        this.configurationTag = configurationTag;
    }

}
