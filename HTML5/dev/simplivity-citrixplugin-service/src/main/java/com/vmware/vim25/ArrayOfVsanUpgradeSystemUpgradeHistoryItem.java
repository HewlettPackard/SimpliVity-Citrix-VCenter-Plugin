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
public class ArrayOfVsanUpgradeSystemUpgradeHistoryItem {

    private final static com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryItem[] NULL_VSAN_UPGRADE_SYSTEM_UPGRADE_HISTORY_ITEM_ARRAY = new com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryItem[ 0 ] ;
    public com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryItem[] VsanUpgradeSystemUpgradeHistoryItem;

    public com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryItem[] getVsanUpgradeSystemUpgradeHistoryItem() {
        if ((VsanUpgradeSystemUpgradeHistoryItem) == null) {
            return (NULL_VSAN_UPGRADE_SYSTEM_UPGRADE_HISTORY_ITEM_ARRAY);
        }
        return VsanUpgradeSystemUpgradeHistoryItem;
    }

    public void setVsanUpgradeSystemUpgradeHistoryItem(com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryItem[] VsanUpgradeSystemUpgradeHistoryItem) {
        this.VsanUpgradeSystemUpgradeHistoryItem = VsanUpgradeSystemUpgradeHistoryItem;
    }

}
