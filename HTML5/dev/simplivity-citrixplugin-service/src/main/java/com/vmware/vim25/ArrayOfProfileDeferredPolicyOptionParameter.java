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
public class ArrayOfProfileDeferredPolicyOptionParameter {

    private final static com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] NULL_PROFILE_DEFERRED_POLICY_OPTION_PARAMETER_ARRAY = new com.vmware.vim25.ProfileDeferredPolicyOptionParameter[ 0 ] ;
    public com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] ProfileDeferredPolicyOptionParameter;

    public com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] getProfileDeferredPolicyOptionParameter() {
        if ((ProfileDeferredPolicyOptionParameter) == null) {
            return (NULL_PROFILE_DEFERRED_POLICY_OPTION_PARAMETER_ARRAY);
        }
        return ProfileDeferredPolicyOptionParameter;
    }

    public void setProfileDeferredPolicyOptionParameter(com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] ProfileDeferredPolicyOptionParameter) {
        this.ProfileDeferredPolicyOptionParameter = ProfileDeferredPolicyOptionParameter;
    }

}