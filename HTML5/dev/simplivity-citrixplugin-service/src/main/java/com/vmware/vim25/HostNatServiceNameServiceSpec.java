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
public class HostNatServiceNameServiceSpec
    extends DynamicData
{

    public boolean dnsAutoDetect;
    public String dnsPolicy;
    public int dnsRetries;
    public int dnsTimeout;
    private final static String[] NULL_DNS_NAME_SERVER_ARRAY = new String[ 0 ] ;
    public String[] dnsNameServer;
    public int nbdsTimeout;
    public int nbnsRetries;
    public int nbnsTimeout;

    public boolean getDnsAutoDetect() {
        return dnsAutoDetect;
    }

    public void setDnsAutoDetect(boolean dnsAutoDetect) {
        this.dnsAutoDetect = dnsAutoDetect;
    }

    public boolean isDnsAutoDetect() {
        return dnsAutoDetect;
    }

    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    public int getDnsRetries() {
        return dnsRetries;
    }

    public void setDnsRetries(int dnsRetries) {
        this.dnsRetries = dnsRetries;
    }

    public int getDnsTimeout() {
        return dnsTimeout;
    }

    public void setDnsTimeout(int dnsTimeout) {
        this.dnsTimeout = dnsTimeout;
    }

    public String[] getDnsNameServer() {
        if ((dnsNameServer) == null) {
            return (NULL_DNS_NAME_SERVER_ARRAY);
        }
        return dnsNameServer;
    }

    public void setDnsNameServer(String[] dnsNameServer) {
        this.dnsNameServer = dnsNameServer;
    }

    public int getNbdsTimeout() {
        return nbdsTimeout;
    }

    public void setNbdsTimeout(int nbdsTimeout) {
        this.nbdsTimeout = nbdsTimeout;
    }

    public int getNbnsRetries() {
        return nbnsRetries;
    }

    public void setNbnsRetries(int nbnsRetries) {
        this.nbnsRetries = nbnsRetries;
    }

    public int getNbnsTimeout() {
        return nbnsTimeout;
    }

    public void setNbnsTimeout(int nbnsTimeout) {
        this.nbnsTimeout = nbnsTimeout;
    }

}
