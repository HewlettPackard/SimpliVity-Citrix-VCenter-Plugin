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
public class HostDnsConfig
    extends DynamicData
{

    public boolean dhcp;
    public String virtualNicDevice;
    public String ipv6VirtualNicDevice;
    public String hostName;
    public String domainName;
    private final static String[] NULL_ADDRESS_ARRAY = new String[ 0 ] ;
    public String[] address;
    private final static String[] NULL_SEARCH_DOMAIN_ARRAY = new String[ 0 ] ;
    public String[] searchDomain;

    public boolean getDhcp() {
        return dhcp;
    }

    public void setDhcp(boolean dhcp) {
        this.dhcp = dhcp;
    }

    public boolean isDhcp() {
        return dhcp;
    }

    public String getVirtualNicDevice() {
        return virtualNicDevice;
    }

    public void setVirtualNicDevice(String virtualNicDevice) {
        this.virtualNicDevice = virtualNicDevice;
    }

    public String getIpv6VirtualNicDevice() {
        return ipv6VirtualNicDevice;
    }

    public void setIpv6VirtualNicDevice(String ipv6VirtualNicDevice) {
        this.ipv6VirtualNicDevice = ipv6VirtualNicDevice;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String[] getAddress() {
        if ((address) == null) {
            return (NULL_ADDRESS_ARRAY);
        }
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String[] getSearchDomain() {
        if ((searchDomain) == null) {
            return (NULL_SEARCH_DOMAIN_ARRAY);
        }
        return searchDomain;
    }

    public void setSearchDomain(String[] searchDomain) {
        this.searchDomain = searchDomain;
    }

}