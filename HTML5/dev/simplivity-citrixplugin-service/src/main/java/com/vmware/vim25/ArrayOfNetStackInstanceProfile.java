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
public class ArrayOfNetStackInstanceProfile {

    private final static com.vmware.vim25.NetStackInstanceProfile[] NULL_NET_STACK_INSTANCE_PROFILE_ARRAY = new com.vmware.vim25.NetStackInstanceProfile[ 0 ] ;
    public com.vmware.vim25.NetStackInstanceProfile[] NetStackInstanceProfile;

    public com.vmware.vim25.NetStackInstanceProfile[] getNetStackInstanceProfile() {
        if ((NetStackInstanceProfile) == null) {
            return (NULL_NET_STACK_INSTANCE_PROFILE_ARRAY);
        }
        return NetStackInstanceProfile;
    }

    public void setNetStackInstanceProfile(com.vmware.vim25.NetStackInstanceProfile[] NetStackInstanceProfile) {
        this.NetStackInstanceProfile = NetStackInstanceProfile;
    }

}
