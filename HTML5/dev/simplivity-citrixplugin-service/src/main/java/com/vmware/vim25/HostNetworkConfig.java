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
public class HostNetworkConfig
    extends DynamicData
{

    private final static HostVirtualSwitchConfig[] NULL_VSWITCH_ARRAY = new HostVirtualSwitchConfig[ 0 ] ;
    public HostVirtualSwitchConfig[] vswitch;
    private final static HostProxySwitchConfig[] NULL_PROXY_SWITCH_ARRAY = new HostProxySwitchConfig[ 0 ] ;
    public HostProxySwitchConfig[] proxySwitch;
    private final static HostPortGroupConfig[] NULL_PORTGROUP_ARRAY = new HostPortGroupConfig[ 0 ] ;
    public HostPortGroupConfig[] portgroup;
    private final static PhysicalNicConfig[] NULL_PNIC_ARRAY = new PhysicalNicConfig[ 0 ] ;
    public PhysicalNicConfig[] pnic;
    private final static HostVirtualNicConfig[] NULL_VNIC_ARRAY = new HostVirtualNicConfig[ 0 ] ;
    public HostVirtualNicConfig[] vnic;
    private final static HostVirtualNicConfig[] NULL_CONSOLE_VNIC_ARRAY = new HostVirtualNicConfig[ 0 ] ;
    public HostVirtualNicConfig[] consoleVnic;
    public HostDnsConfig dnsConfig;
    public HostIpRouteConfig ipRouteConfig;
    public HostIpRouteConfig consoleIpRouteConfig;
    public HostIpRouteTableConfig routeTableConfig;
    private final static HostDhcpServiceConfig[] NULL_DHCP_ARRAY = new HostDhcpServiceConfig[ 0 ] ;
    public HostDhcpServiceConfig[] dhcp;
    private final static HostNatServiceConfig[] NULL_NAT_ARRAY = new HostNatServiceConfig[ 0 ] ;
    public HostNatServiceConfig[] nat;
    public Boolean ipV6Enabled;
    private final static HostNetworkConfigNetStackSpec[] NULL_NET_STACK_SPEC_ARRAY = new HostNetworkConfigNetStackSpec[ 0 ] ;
    public HostNetworkConfigNetStackSpec[] netStackSpec;

    public HostVirtualSwitchConfig[] getVswitch() {
        if ((vswitch) == null) {
            return (NULL_VSWITCH_ARRAY);
        }
        return vswitch;
    }

    public void setVswitch(HostVirtualSwitchConfig[] vswitch) {
        this.vswitch = vswitch;
    }

    public HostProxySwitchConfig[] getProxySwitch() {
        if ((proxySwitch) == null) {
            return (NULL_PROXY_SWITCH_ARRAY);
        }
        return proxySwitch;
    }

    public void setProxySwitch(HostProxySwitchConfig[] proxySwitch) {
        this.proxySwitch = proxySwitch;
    }

    public HostPortGroupConfig[] getPortgroup() {
        if ((portgroup) == null) {
            return (NULL_PORTGROUP_ARRAY);
        }
        return portgroup;
    }

    public void setPortgroup(HostPortGroupConfig[] portgroup) {
        this.portgroup = portgroup;
    }

    public PhysicalNicConfig[] getPnic() {
        if ((pnic) == null) {
            return (NULL_PNIC_ARRAY);
        }
        return pnic;
    }

    public void setPnic(PhysicalNicConfig[] pnic) {
        this.pnic = pnic;
    }

    public HostVirtualNicConfig[] getVnic() {
        if ((vnic) == null) {
            return (NULL_VNIC_ARRAY);
        }
        return vnic;
    }

    public void setVnic(HostVirtualNicConfig[] vnic) {
        this.vnic = vnic;
    }

    public HostVirtualNicConfig[] getConsoleVnic() {
        if ((consoleVnic) == null) {
            return (NULL_CONSOLE_VNIC_ARRAY);
        }
        return consoleVnic;
    }

    public void setConsoleVnic(HostVirtualNicConfig[] consoleVnic) {
        this.consoleVnic = consoleVnic;
    }

    public HostDnsConfig getDnsConfig() {
        return dnsConfig;
    }

    public void setDnsConfig(HostDnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public HostIpRouteConfig getIpRouteConfig() {
        return ipRouteConfig;
    }

    public void setIpRouteConfig(HostIpRouteConfig ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }

    public HostIpRouteConfig getConsoleIpRouteConfig() {
        return consoleIpRouteConfig;
    }

    public void setConsoleIpRouteConfig(HostIpRouteConfig consoleIpRouteConfig) {
        this.consoleIpRouteConfig = consoleIpRouteConfig;
    }

    public HostIpRouteTableConfig getRouteTableConfig() {
        return routeTableConfig;
    }

    public void setRouteTableConfig(HostIpRouteTableConfig routeTableConfig) {
        this.routeTableConfig = routeTableConfig;
    }

    public HostDhcpServiceConfig[] getDhcp() {
        if ((dhcp) == null) {
            return (NULL_DHCP_ARRAY);
        }
        return dhcp;
    }

    public void setDhcp(HostDhcpServiceConfig[] dhcp) {
        this.dhcp = dhcp;
    }

    public HostNatServiceConfig[] getNat() {
        if ((nat) == null) {
            return (NULL_NAT_ARRAY);
        }
        return nat;
    }

    public void setNat(HostNatServiceConfig[] nat) {
        this.nat = nat;
    }

    public Boolean getIpV6Enabled() {
        return ipV6Enabled;
    }

    public void setIpV6Enabled(Boolean ipV6Enabled) {
        this.ipV6Enabled = ipV6Enabled;
    }

    public Boolean isIpV6Enabled() {
        return ipV6Enabled;
    }

    public HostNetworkConfigNetStackSpec[] getNetStackSpec() {
        if ((netStackSpec) == null) {
            return (NULL_NET_STACK_SPEC_ARRAY);
        }
        return netStackSpec;
    }

    public void setNetStackSpec(HostNetworkConfigNetStackSpec[] netStackSpec) {
        this.netStackSpec = netStackSpec;
    }

}