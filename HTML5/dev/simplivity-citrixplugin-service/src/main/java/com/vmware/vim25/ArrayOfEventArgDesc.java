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
public class ArrayOfEventArgDesc {

    private final static com.vmware.vim25.EventArgDesc[] NULL_EVENT_ARG_DESC_ARRAY = new com.vmware.vim25.EventArgDesc[ 0 ] ;
    public com.vmware.vim25.EventArgDesc[] EventArgDesc;

    public com.vmware.vim25.EventArgDesc[] getEventArgDesc() {
        if ((EventArgDesc) == null) {
            return (NULL_EVENT_ARG_DESC_ARRAY);
        }
        return EventArgDesc;
    }

    public void setEventArgDesc(com.vmware.vim25.EventArgDesc[] EventArgDesc) {
        this.EventArgDesc = EventArgDesc;
    }

}
