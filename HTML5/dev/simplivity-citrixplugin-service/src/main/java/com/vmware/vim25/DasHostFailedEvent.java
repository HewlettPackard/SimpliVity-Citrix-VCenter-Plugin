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
public class DasHostFailedEvent
    extends ClusterEvent
{

    public HostEventArgument failedHost;

    public HostEventArgument getFailedHost() {
        return failedHost;
    }

    public void setFailedHost(HostEventArgument failedHost) {
        this.failedHost = failedHost;
    }

}
