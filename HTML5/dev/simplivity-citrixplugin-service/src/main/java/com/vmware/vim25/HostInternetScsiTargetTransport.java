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
public class HostInternetScsiTargetTransport
    extends HostTargetTransport
{

    public String iScsiName;
    public String iScsiAlias;
    private final static String[] NULL_ADDRESS_ARRAY = new String[ 0 ] ;
    public String[] address;

    public String getIScsiName() {
        return iScsiName;
    }

    public void setIScsiName(String iScsiName) {
        this.iScsiName = iScsiName;
    }

    public String getIScsiAlias() {
        return iScsiAlias;
    }

    public void setIScsiAlias(String iScsiAlias) {
        this.iScsiAlias = iScsiAlias;
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

}
