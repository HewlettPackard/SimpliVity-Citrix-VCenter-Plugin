//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;

import java.util.Calendar;


/**
 * 
 */
@SuppressWarnings("all")
public class HostCertificateManagerCertificateInfo
    extends DynamicData
{

    public String issuer;
    public Calendar notBefore;
    public Calendar notAfter;
    public String subject;
    public String status;

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Calendar getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(Calendar notBefore) {
        this.notBefore = notBefore;
    }

    public Calendar getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(Calendar notAfter) {
        this.notAfter = notAfter;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}