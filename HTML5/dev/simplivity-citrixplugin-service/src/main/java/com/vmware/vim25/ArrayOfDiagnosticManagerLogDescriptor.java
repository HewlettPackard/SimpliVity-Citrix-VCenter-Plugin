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
public class ArrayOfDiagnosticManagerLogDescriptor {

    private final static com.vmware.vim25.DiagnosticManagerLogDescriptor[] NULL_DIAGNOSTIC_MANAGER_LOG_DESCRIPTOR_ARRAY = new com.vmware.vim25.DiagnosticManagerLogDescriptor[ 0 ] ;
    public com.vmware.vim25.DiagnosticManagerLogDescriptor[] DiagnosticManagerLogDescriptor;

    public com.vmware.vim25.DiagnosticManagerLogDescriptor[] getDiagnosticManagerLogDescriptor() {
        if ((DiagnosticManagerLogDescriptor) == null) {
            return (NULL_DIAGNOSTIC_MANAGER_LOG_DESCRIPTOR_ARRAY);
        }
        return DiagnosticManagerLogDescriptor;
    }

    public void setDiagnosticManagerLogDescriptor(com.vmware.vim25.DiagnosticManagerLogDescriptor[] DiagnosticManagerLogDescriptor) {
        this.DiagnosticManagerLogDescriptor = DiagnosticManagerLogDescriptor;
    }

}
