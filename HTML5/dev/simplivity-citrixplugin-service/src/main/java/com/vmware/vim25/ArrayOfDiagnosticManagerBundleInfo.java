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
public class ArrayOfDiagnosticManagerBundleInfo {

    private final static com.vmware.vim25.DiagnosticManagerBundleInfo[] NULL_DIAGNOSTIC_MANAGER_BUNDLE_INFO_ARRAY = new com.vmware.vim25.DiagnosticManagerBundleInfo[ 0 ] ;
    public com.vmware.vim25.DiagnosticManagerBundleInfo[] DiagnosticManagerBundleInfo;

    public com.vmware.vim25.DiagnosticManagerBundleInfo[] getDiagnosticManagerBundleInfo() {
        if ((DiagnosticManagerBundleInfo) == null) {
            return (NULL_DIAGNOSTIC_MANAGER_BUNDLE_INFO_ARRAY);
        }
        return DiagnosticManagerBundleInfo;
    }

    public void setDiagnosticManagerBundleInfo(com.vmware.vim25.DiagnosticManagerBundleInfo[] DiagnosticManagerBundleInfo) {
        this.DiagnosticManagerBundleInfo = DiagnosticManagerBundleInfo;
    }

}
