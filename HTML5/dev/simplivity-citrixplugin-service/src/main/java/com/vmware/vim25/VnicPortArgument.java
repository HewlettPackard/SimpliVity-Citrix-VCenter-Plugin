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
public class VnicPortArgument
    extends DynamicData
{

    public String vnic;
    public DistributedVirtualSwitchPortConnection port;

    public String getVnic() {
        return vnic;
    }

    public void setVnic(String vnic) {
        this.vnic = vnic;
    }

    public DistributedVirtualSwitchPortConnection getPort() {
        return port;
    }

    public void setPort(DistributedVirtualSwitchPortConnection port) {
        this.port = port;
    }

}
