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
public class HostProfileManagerCompositionValidationResult
    extends DynamicData
{

    private final static HostProfileManagerCompositionValidationResultResultElement[] NULL_RESULTS_ARRAY = new HostProfileManagerCompositionValidationResultResultElement[ 0 ] ;
    public HostProfileManagerCompositionValidationResultResultElement[] results;
    private final static LocalizableMessage[] NULL_ERRORS_ARRAY = new LocalizableMessage[ 0 ] ;
    public LocalizableMessage[] errors;

    public HostProfileManagerCompositionValidationResultResultElement[] getResults() {
        if ((results) == null) {
            return (NULL_RESULTS_ARRAY);
        }
        return results;
    }

    public void setResults(HostProfileManagerCompositionValidationResultResultElement[] results) {
        this.results = results;
    }

    public LocalizableMessage[] getErrors() {
        if ((errors) == null) {
            return (NULL_ERRORS_ARRAY);
        }
        return errors;
    }

    public void setErrors(LocalizableMessage[] errors) {
        this.errors = errors;
    }

}
