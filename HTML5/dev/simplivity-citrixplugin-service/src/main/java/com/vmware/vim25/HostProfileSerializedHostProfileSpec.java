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
public class HostProfileSerializedHostProfileSpec
    extends ProfileSerializedCreateSpec
{

    public ManagedObjectReference validatorHost;
    public Boolean validating;

    public ManagedObjectReference getValidatorHost() {
        return validatorHost;
    }

    public void setValidatorHost(ManagedObjectReference validatorHost) {
        this.validatorHost = validatorHost;
    }

    public Boolean getValidating() {
        return validating;
    }

    public void setValidating(Boolean validating) {
        this.validating = validating;
    }

    public Boolean isValidating() {
        return validating;
    }

}
