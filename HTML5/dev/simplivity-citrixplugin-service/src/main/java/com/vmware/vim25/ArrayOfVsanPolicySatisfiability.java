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
public class ArrayOfVsanPolicySatisfiability {

    private final static com.vmware.vim25.VsanPolicySatisfiability[] NULL_VSAN_POLICY_SATISFIABILITY_ARRAY = new com.vmware.vim25.VsanPolicySatisfiability[ 0 ] ;
    public com.vmware.vim25.VsanPolicySatisfiability[] VsanPolicySatisfiability;

    public com.vmware.vim25.VsanPolicySatisfiability[] getVsanPolicySatisfiability() {
        if ((VsanPolicySatisfiability) == null) {
            return (NULL_VSAN_POLICY_SATISFIABILITY_ARRAY);
        }
        return VsanPolicySatisfiability;
    }

    public void setVsanPolicySatisfiability(com.vmware.vim25.VsanPolicySatisfiability[] VsanPolicySatisfiability) {
        this.VsanPolicySatisfiability = VsanPolicySatisfiability;
    }

}