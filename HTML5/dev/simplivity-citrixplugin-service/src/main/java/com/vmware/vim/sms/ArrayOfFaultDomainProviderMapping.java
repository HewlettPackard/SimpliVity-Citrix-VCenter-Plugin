//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;



/**
 * 
 */
@SuppressWarnings("all")
public class ArrayOfFaultDomainProviderMapping {

    private final static com.vmware.vim.sms.FaultDomainProviderMapping[] NULL_FAULT_DOMAIN_PROVIDER_MAPPING_ARRAY = new com.vmware.vim.sms.FaultDomainProviderMapping[ 0 ] ;
    public com.vmware.vim.sms.FaultDomainProviderMapping[] FaultDomainProviderMapping;

    public com.vmware.vim.sms.FaultDomainProviderMapping[] getFaultDomainProviderMapping() {
        if ((FaultDomainProviderMapping) == null) {
            return (NULL_FAULT_DOMAIN_PROVIDER_MAPPING_ARRAY);
        }
        return FaultDomainProviderMapping;
    }

    public void setFaultDomainProviderMapping(com.vmware.vim.sms.FaultDomainProviderMapping[] FaultDomainProviderMapping) {
        this.FaultDomainProviderMapping = FaultDomainProviderMapping;
    }

}