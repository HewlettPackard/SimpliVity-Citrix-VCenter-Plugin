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
public class HostInternetScsiHbaTargetSet
    extends DynamicData
{

    private final static HostInternetScsiHbaStaticTarget[] NULL_STATIC_TARGETS_ARRAY = new HostInternetScsiHbaStaticTarget[ 0 ] ;
    public HostInternetScsiHbaStaticTarget[] staticTargets;
    private final static HostInternetScsiHbaSendTarget[] NULL_SEND_TARGETS_ARRAY = new HostInternetScsiHbaSendTarget[ 0 ] ;
    public HostInternetScsiHbaSendTarget[] sendTargets;

    public HostInternetScsiHbaStaticTarget[] getStaticTargets() {
        if ((staticTargets) == null) {
            return (NULL_STATIC_TARGETS_ARRAY);
        }
        return staticTargets;
    }

    public void setStaticTargets(HostInternetScsiHbaStaticTarget[] staticTargets) {
        this.staticTargets = staticTargets;
    }

    public HostInternetScsiHbaSendTarget[] getSendTargets() {
        if ((sendTargets) == null) {
            return (NULL_SEND_TARGETS_ARRAY);
        }
        return sendTargets;
    }

    public void setSendTargets(HostInternetScsiHbaSendTarget[] sendTargets) {
        this.sendTargets = sendTargets;
    }

}
