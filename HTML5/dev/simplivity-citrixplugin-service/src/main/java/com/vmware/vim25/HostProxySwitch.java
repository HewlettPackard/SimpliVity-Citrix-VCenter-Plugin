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
public class HostProxySwitch
    extends DynamicData
{

    public String dvsUuid;
    public String dvsName;
    public String key;
    public int numPorts;
    public Integer configNumPorts;
    public int numPortsAvailable;
    private final static KeyValue[] NULL_UPLINK_PORT_ARRAY = new KeyValue[ 0 ] ;
    public KeyValue[] uplinkPort;
    public Integer mtu;
    private final static String[] NULL_PNIC_ARRAY = new String[ 0 ] ;
    public String[] pnic;
    public HostProxySwitchSpec spec;
    private final static HostProxySwitchHostLagConfig[] NULL_HOST_LAG_ARRAY = new HostProxySwitchHostLagConfig[ 0 ] ;
    public HostProxySwitchHostLagConfig[] hostLag;
    public Boolean networkReservationSupported;

    public String getDvsUuid() {
        return dvsUuid;
    }

    public void setDvsUuid(String dvsUuid) {
        this.dvsUuid = dvsUuid;
    }

    public String getDvsName() {
        return dvsName;
    }

    public void setDvsName(String dvsName) {
        this.dvsName = dvsName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public Integer getConfigNumPorts() {
        return configNumPorts;
    }

    public void setConfigNumPorts(Integer configNumPorts) {
        this.configNumPorts = configNumPorts;
    }

    public int getNumPortsAvailable() {
        return numPortsAvailable;
    }

    public void setNumPortsAvailable(int numPortsAvailable) {
        this.numPortsAvailable = numPortsAvailable;
    }

    public KeyValue[] getUplinkPort() {
        if ((uplinkPort) == null) {
            return (NULL_UPLINK_PORT_ARRAY);
        }
        return uplinkPort;
    }

    public void setUplinkPort(KeyValue[] uplinkPort) {
        this.uplinkPort = uplinkPort;
    }

    public Integer getMtu() {
        return mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public String[] getPnic() {
        if ((pnic) == null) {
            return (NULL_PNIC_ARRAY);
        }
        return pnic;
    }

    public void setPnic(String[] pnic) {
        this.pnic = pnic;
    }

    public HostProxySwitchSpec getSpec() {
        return spec;
    }

    public void setSpec(HostProxySwitchSpec spec) {
        this.spec = spec;
    }

    public HostProxySwitchHostLagConfig[] getHostLag() {
        if ((hostLag) == null) {
            return (NULL_HOST_LAG_ARRAY);
        }
        return hostLag;
    }

    public void setHostLag(HostProxySwitchHostLagConfig[] hostLag) {
        this.hostLag = hostLag;
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
