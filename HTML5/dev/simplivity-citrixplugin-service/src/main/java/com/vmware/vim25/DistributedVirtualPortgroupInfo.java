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
public class DistributedVirtualPortgroupInfo
    extends DynamicData
{

    public String switchName;
    public String switchUuid;
    public String portgroupName;
    public String portgroupKey;
    public String portgroupType;
    public boolean uplinkPortgroup;
    public ManagedObjectReference portgroup;
    public Boolean networkReservationSupported;

    public String getSwitchName() {
        return switchName;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public String getSwitchUuid() {
        return switchUuid;
    }

    public void setSwitchUuid(String switchUuid) {
        this.switchUuid = switchUuid;
    }

    public String getPortgroupName() {
        return portgroupName;
    }

    public void setPortgroupName(String portgroupName) {
        this.portgroupName = portgroupName;
    }

    public String getPortgroupKey() {
        return portgroupKey;
    }

    public void setPortgroupKey(String portgroupKey) {
        this.portgroupKey = portgroupKey;
    }

    public String getPortgroupType() {
        return portgroupType;
    }

    public void setPortgroupType(String portgroupType) {
        this.portgroupType = portgroupType;
    }

    public boolean getUplinkPortgroup() {
        return uplinkPortgroup;
    }

    public void setUplinkPortgroup(boolean uplinkPortgroup) {
        this.uplinkPortgroup = uplinkPortgroup;
    }

    public boolean isUplinkPortgroup() {
        return uplinkPortgroup;
    }

    public ManagedObjectReference getPortgroup() {
        return portgroup;
    }

    public void setPortgroup(ManagedObjectReference portgroup) {
        this.portgroup = portgroup;
    }

    public Boolean getNetworkReservationSupported() {
        return networkReservationSupported;
    }

    public void setNetworkReservationSupported(Boolean networkReservationSupported) {
        this.networkReservationSupported = networkReservationSupported;
    }

    public Boolean isNetworkReservationSupported() {
        return networkReservationSupported;
    }

}
