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
public class IscsiDependencyEntity
    extends DynamicData
{

    public String pnicDevice;
    public String vnicDevice;
    public String vmhbaName;

    public String getPnicDevice() {
        return pnicDevice;
    }

    public void setPnicDevice(String pnicDevice) {
        this.pnicDevice = pnicDevice;
    }

    public String getVnicDevice() {
        return vnicDevice;
    }

    public void setVnicDevice(String vnicDevice) {
        this.vnicDevice = vnicDevice;
    }

    public String getVmhbaName() {
        return vmhbaName;
    }

    public void setVmhbaName(String vmhbaName) {
        this.vmhbaName = vmhbaName;
    }

}
