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
public class SnapshotRevertIssue
    extends MigrationFault
{

    public String snapshotName;
    private final static Event[] NULL_EVENT_ARRAY = new Event[ 0 ] ;
    public Event[] event;
    public boolean errors;

    public String getSnapshotName() {
        return snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public Event[] getEvent() {
        if ((event) == null) {
            return (NULL_EVENT_ARRAY);
        }
        return event;
    }

    public void setEvent(Event[] event) {
        this.event = event;
    }

    public boolean getErrors() {
        return errors;
    }

    public void setErrors(boolean errors) {
        this.errors = errors;
    }

    public boolean isErrors() {
        return errors;
    }

}
