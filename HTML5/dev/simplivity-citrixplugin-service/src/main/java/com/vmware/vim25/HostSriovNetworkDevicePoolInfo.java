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
public class HostSriovNetworkDevicePoolInfo
    extends HostSriovDevicePoolInfo
{

    public String switchKey;
    public String switchUuid;
    private final static PhysicalNic[] NULL_PNIC_ARRAY = new PhysicalNic[ 0 ] ;
    public PhysicalNic[] pnic;

    public String getSwitchKey() {
        return switchKey;
    }

    public void setSwitchKey(String switchKey) {
        this.switchKey = switchKey;
    }

    public String getSwitchUuid() {
        return switchUuid;
    }

    public void setSwitchUuid(String switchUuid) {
        this.switchUuid = switchUuid;
    }

    public PhysicalNic[] getPnic() {
        if ((pnic) == null) {
            return (NULL_PNIC_ARRAY);
        }
        return pnic;
    }

    public void setPnic(PhysicalNic[] pnic) {
        this.pnic = pnic;
    }

}