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
public class HostWwnConflictEvent
    extends HostEvent
{

    private final static VmEventArgument[] NULL_CONFLICTED_VMS_ARRAY = new VmEventArgument[ 0 ] ;
    public VmEventArgument[] conflictedVms;
    private final static HostEventArgument[] NULL_CONFLICTED_HOSTS_ARRAY = new HostEventArgument[ 0 ] ;
    public HostEventArgument[] conflictedHosts;
    public long wwn;

    public VmEventArgument[] getConflictedVms() {
        if ((conflictedVms) == null) {
            return (NULL_CONFLICTED_VMS_ARRAY);
        }
        return conflictedVms;
    }

    public void setConflictedVms(VmEventArgument[] conflictedVms) {
        this.conflictedVms = conflictedVms;
    }

    public HostEventArgument[] getConflictedHosts() {
        if ((conflictedHosts) == null) {
            return (NULL_CONFLICTED_HOSTS_ARRAY);
        }
        return conflictedHosts;
    }

    public void setConflictedHosts(HostEventArgument[] conflictedHosts) {
        this.conflictedHosts = conflictedHosts;
    }

    public long getWwn() {
        return wwn;
    }

    public void setWwn(long wwn) {
        this.wwn = wwn;
    }

}
