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
public class VMwareUplinkPortOrderPolicy
    extends InheritablePolicy
{

    private final static String[] NULL_ACTIVE_UPLINK_PORT_ARRAY = new String[ 0 ] ;
    public String[] activeUplinkPort;
    private final static String[] NULL_STANDBY_UPLINK_PORT_ARRAY = new String[ 0 ] ;
    public String[] standbyUplinkPort;

    public String[] getActiveUplinkPort() {
        if ((activeUplinkPort) == null) {
            return (NULL_ACTIVE_UPLINK_PORT_ARRAY);
        }
        return activeUplinkPort;
    }

    public void setActiveUplinkPort(String[] activeUplinkPort) {
        this.activeUplinkPort = activeUplinkPort;
    }

    public String[] getStandbyUplinkPort() {
        if ((standbyUplinkPort) == null) {
            return (NULL_STANDBY_UPLINK_PORT_ARRAY);
        }
        return standbyUplinkPort;
    }

    public void setStandbyUplinkPort(String[] standbyUplinkPort) {
        this.standbyUplinkPort = standbyUplinkPort;
    }

}
