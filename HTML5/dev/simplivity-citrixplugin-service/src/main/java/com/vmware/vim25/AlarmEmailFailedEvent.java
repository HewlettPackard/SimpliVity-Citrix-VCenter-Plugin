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
public class AlarmEmailFailedEvent
    extends AlarmEvent
{

    public ManagedEntityEventArgument entity;
    public String to;
    public LocalizedMethodFault reason;

    public ManagedEntityEventArgument getEntity() {
        return entity;
    }

    public void setEntity(ManagedEntityEventArgument entity) {
        this.entity = entity;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalizedMethodFault getReason() {
        return reason;
    }

    public void setReason(LocalizedMethodFault reason) {
        this.reason = reason;
    }

}
