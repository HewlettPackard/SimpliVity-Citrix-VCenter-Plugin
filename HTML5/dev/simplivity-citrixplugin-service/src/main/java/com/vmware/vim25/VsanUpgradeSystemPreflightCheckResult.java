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
public class VsanUpgradeSystemPreflightCheckResult
    extends DynamicData
{

    private final static VsanUpgradeSystemPreflightCheckIssue[] NULL_ISSUES_ARRAY = new VsanUpgradeSystemPreflightCheckIssue[ 0 ] ;
    public VsanUpgradeSystemPreflightCheckIssue[] issues;
    public VsanHostDiskMapping diskMappingToRestore;

    public VsanUpgradeSystemPreflightCheckIssue[] getIssues() {
        if ((issues) == null) {
            return (NULL_ISSUES_ARRAY);
        }
        return issues;
    }

    public void setIssues(VsanUpgradeSystemPreflightCheckIssue[] issues) {
        this.issues = issues;
    }

    public VsanHostDiskMapping getDiskMappingToRestore() {
        return diskMappingToRestore;
    }

    public void setDiskMappingToRestore(VsanHostDiskMapping diskMappingToRestore) {
        this.diskMappingToRestore = diskMappingToRestore;
    }

}