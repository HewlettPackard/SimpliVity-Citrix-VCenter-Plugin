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
public class ClusterDasFailoverLevelAdvancedRuntimeInfo
    extends ClusterDasAdvancedRuntimeInfo
{

    public ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo slotInfo;
    public int totalSlots;
    public int usedSlots;
    public int unreservedSlots;
    public int totalVms;
    public int totalHosts;
    public int totalGoodHosts;
    private final static ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] NULL_HOST_SLOTS_ARRAY = new ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[ 0 ] ;
    public ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] hostSlots;
    private final static ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots[] NULL_VMS_REQUIRING_MULTIPLE_SLOTS_ARRAY = new ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots[ 0 ] ;
    public ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots[] vmsRequiringMultipleSlots;

    public ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo getSlotInfo() {
        return slotInfo;
    }

    public void setSlotInfo(ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo slotInfo) {
        this.slotInfo = slotInfo;
    }

    public int getTotalSlots() {
        return totalSlots;
    }

    public void setTotalSlots(int totalSlots) {
        this.totalSlots = totalSlots;
    }

    public int getUsedSlots() {
        return usedSlots;
    }

    public void setUsedSlots(int usedSlots) {
        this.usedSlots = usedSlots;
    }

    public int getUnreservedSlots() {
        return unreservedSlots;
    }

    public void setUnreservedSlots(int unreservedSlots) {
        this.unreservedSlots = unreservedSlots;
    }

    public int getTotalVms() {
        return totalVms;
    }

    public void setTotalVms(int totalVms) {
        this.totalVms = totalVms;
    }

    public int getTotalHosts() {
        return totalHosts;
    }

    public void setTotalHosts(int totalHosts) {
        this.totalHosts = totalHosts;
    }

    public int getTotalGoodHosts() {
        return totalGoodHosts;
    }

    public void setTotalGoodHosts(int totalGoodHosts) {
        this.totalGoodHosts = totalGoodHosts;
    }

    public ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] getHostSlots() {
        if ((hostSlots) == null) {
            return (NULL_HOST_SLOTS_ARRAY);
        }
        return hostSlots;
    }

    public void setHostSlots(ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] hostSlots) {
        this.hostSlots = hostSlots;
    }

    public ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots[] getVmsRequiringMultipleSlots() {
        if ((vmsRequiringMultipleSlots) == null) {
            return (NULL_VMS_REQUIRING_MULTIPLE_SLOTS_ARRAY);
        }
        return vmsRequiringMultipleSlots;
    }

    public void setVmsRequiringMultipleSlots(ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots[] vmsRequiringMultipleSlots) {
        this.vmsRequiringMultipleSlots = vmsRequiringMultipleSlots;
    }

}
