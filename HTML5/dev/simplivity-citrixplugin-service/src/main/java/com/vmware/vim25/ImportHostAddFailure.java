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
public class ImportHostAddFailure
    extends DvsFault
{

    private final static String[] NULL_HOST_IP_ARRAY = new String[ 0 ] ;
    public String[] hostIp;

    public String[] getHostIp() {
        if ((hostIp) == null) {
            return (NULL_HOST_IP_ARRAY);
        }
        return hostIp;
    }

    public void setHostIp(String[] hostIp) {
        this.hostIp = hostIp;
    }

}
