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
public class VmFaultToleranceOpIssuesList
    extends VmFaultToleranceIssue
{

    private final static LocalizedMethodFault[] NULL_ERRORS_ARRAY = new LocalizedMethodFault[ 0 ] ;
    public LocalizedMethodFault[] errors;
    private final static LocalizedMethodFault[] NULL_WARNINGS_ARRAY = new LocalizedMethodFault[ 0 ] ;
    public LocalizedMethodFault[] warnings;

    public LocalizedMethodFault[] getErrors() {
        if ((errors) == null) {
            return (NULL_ERRORS_ARRAY);
        }
        return errors;
    }

    public void setErrors(LocalizedMethodFault[] errors) {
        this.errors = errors;
    }

    public LocalizedMethodFault[] getWarnings() {
        if ((warnings) == null) {
            return (NULL_WARNINGS_ARRAY);
        }
        return warnings;
    }

    public void setWarnings(LocalizedMethodFault[] warnings) {
        this.warnings = warnings;
    }

}