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
public class VsanHostClusterStatus
    extends DynamicData
{

    public String uuid;
    public String nodeUuid;
    public String health;
    public VsanHostClusterStatusState nodeState;
    private final static String[] NULL_MEMBER_UUID_ARRAY = new String[ 0 ] ;
    public String[] memberUuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNodeUuid() {
        return nodeUuid;
    }

    public void setNodeUuid(String nodeUuid) {
        this.nodeUuid = nodeUuid;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public VsanHostClusterStatusState getNodeState() {
        return nodeState;
    }

    public void setNodeState(VsanHostClusterStatusState nodeState) {
        this.nodeState = nodeState;
    }

    public String[] getMemberUuid() {
        if ((memberUuid) == null) {
            return (NULL_MEMBER_UUID_ARRAY);
        }
        return memberUuid;
    }

    public void setMemberUuid(String[] memberUuid) {
        this.memberUuid = memberUuid;
    }

}
