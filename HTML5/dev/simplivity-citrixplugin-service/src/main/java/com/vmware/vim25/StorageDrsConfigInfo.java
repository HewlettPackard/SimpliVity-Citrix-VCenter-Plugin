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
public class StorageDrsConfigInfo
    extends DynamicData
{

    public StorageDrsPodConfigInfo podConfig;
    private final static StorageDrsVmConfigInfo[] NULL_VM_CONFIG_ARRAY = new StorageDrsVmConfigInfo[ 0 ] ;
    public StorageDrsVmConfigInfo[] vmConfig;

    public StorageDrsPodConfigInfo getPodConfig() {
        return podConfig;
    }

    public void setPodConfig(StorageDrsPodConfigInfo podConfig) {
        this.podConfig = podConfig;
    }

    public StorageDrsVmConfigInfo[] getVmConfig() {
        if ((vmConfig) == null) {
            return (NULL_VM_CONFIG_ARRAY);
        }
        return vmConfig;
    }

    public void setVmConfig(StorageDrsVmConfigInfo[] vmConfig) {
        this.vmConfig = vmConfig;
    }

}
