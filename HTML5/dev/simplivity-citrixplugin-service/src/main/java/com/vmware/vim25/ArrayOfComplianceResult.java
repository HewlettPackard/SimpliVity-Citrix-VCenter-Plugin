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
public class ArrayOfComplianceResult {

    private final static com.vmware.vim25.ComplianceResult[] NULL_COMPLIANCE_RESULT_ARRAY = new com.vmware.vim25.ComplianceResult[ 0 ] ;
    public com.vmware.vim25.ComplianceResult[] ComplianceResult;

    public com.vmware.vim25.ComplianceResult[] getComplianceResult() {
        if ((ComplianceResult) == null) {
            return (NULL_COMPLIANCE_RESULT_ARRAY);
        }
        return ComplianceResult;
    }

    public void setComplianceResult(com.vmware.vim25.ComplianceResult[] ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

}
