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
public class FtIssuesOnHost
    extends VmFaultToleranceIssue
{

    public ManagedObjectReference host;
    public String hostName;
    private final static LocalizedMethodFault[] NULL_ERRORS_ARRAY = new LocalizedMethodFault[ 0 ] ;
    public LocalizedMethodFault[] errors;

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public LocalizedMethodFault[] getErrors() {
        if ((errors) == null) {
            return (NULL_ERRORS_ARRAY);
        }
        return errors;
    }

    public void setErrors(LocalizedMethodFault[] errors) {
        this.errors = errors;
    }

}
