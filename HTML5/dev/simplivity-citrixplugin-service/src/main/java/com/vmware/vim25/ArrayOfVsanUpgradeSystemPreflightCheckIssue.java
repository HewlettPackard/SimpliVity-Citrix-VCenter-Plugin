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
public class ArrayOfVsanUpgradeSystemPreflightCheckIssue {

    private final static com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue[] NULL_VSAN_UPGRADE_SYSTEM_PREFLIGHT_CHECK_ISSUE_ARRAY = new com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue[ 0 ] ;
    public com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue[] VsanUpgradeSystemPreflightCheckIssue;

    public com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue[] getVsanUpgradeSystemPreflightCheckIssue() {
        if ((VsanUpgradeSystemPreflightCheckIssue) == null) {
            return (NULL_VSAN_UPGRADE_SYSTEM_PREFLIGHT_CHECK_ISSUE_ARRAY);
        }
        return VsanUpgradeSystemPreflightCheckIssue;
    }

    public void setVsanUpgradeSystemPreflightCheckIssue(com.vmware.vim25.VsanUpgradeSystemPreflightCheckIssue[] VsanUpgradeSystemPreflightCheckIssue) {
        this.VsanUpgradeSystemPreflightCheckIssue = VsanUpgradeSystemPreflightCheckIssue;
    }

}