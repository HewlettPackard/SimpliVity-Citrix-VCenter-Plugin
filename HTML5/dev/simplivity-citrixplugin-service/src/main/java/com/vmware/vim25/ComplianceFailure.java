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
public class ComplianceFailure
    extends DynamicData
{

    public String failureType;
    public LocalizableMessage message;
    public String expressionName;
    private final static ComplianceFailureComplianceFailureValues[] NULL_FAILURE_VALUES_ARRAY = new ComplianceFailureComplianceFailureValues[ 0 ] ;
    public ComplianceFailureComplianceFailureValues[] failureValues;

    public String getFailureType() {
        return failureType;
    }

    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    public LocalizableMessage getMessage() {
        return message;
    }

    public void setMessage(LocalizableMessage message) {
        this.message = message;
    }

    public String getExpressionName() {
        return expressionName;
    }

    public void setExpressionName(String expressionName) {
        this.expressionName = expressionName;
    }

    public ComplianceFailureComplianceFailureValues[] getFailureValues() {
        if ((failureValues) == null) {
            return (NULL_FAILURE_VALUES_ARRAY);
        }
        return failureValues;
    }

    public void setFailureValues(ComplianceFailureComplianceFailureValues[] failureValues) {
        this.failureValues = failureValues;
    }

}
