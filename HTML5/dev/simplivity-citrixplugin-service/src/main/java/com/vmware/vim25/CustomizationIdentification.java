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
public class CustomizationIdentification
    extends DynamicData
{

    public String joinWorkgroup;
    public String joinDomain;
    public String domainAdmin;
    public CustomizationPassword domainAdminPassword;

    public String getJoinWorkgroup() {
        return joinWorkgroup;
    }

    public void setJoinWorkgroup(String joinWorkgroup) {
        this.joinWorkgroup = joinWorkgroup;
    }

    public String getJoinDomain() {
        return joinDomain;
    }

    public void setJoinDomain(String joinDomain) {
        this.joinDomain = joinDomain;
    }

    public String getDomainAdmin() {
        return domainAdmin;
    }

    public void setDomainAdmin(String domainAdmin) {
        this.domainAdmin = domainAdmin;
    }

    public CustomizationPassword getDomainAdminPassword() {
        return domainAdminPassword;
    }

    public void setDomainAdminPassword(CustomizationPassword domainAdminPassword) {
        this.domainAdminPassword = domainAdminPassword;
    }

}