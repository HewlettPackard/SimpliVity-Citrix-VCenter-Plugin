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
public class ArrayOfServiceConsolePortGroupProfile {

    private final static com.vmware.vim25.ServiceConsolePortGroupProfile[] NULL_SERVICE_CONSOLE_PORT_GROUP_PROFILE_ARRAY = new com.vmware.vim25.ServiceConsolePortGroupProfile[ 0 ] ;
    public com.vmware.vim25.ServiceConsolePortGroupProfile[] ServiceConsolePortGroupProfile;

    public com.vmware.vim25.ServiceConsolePortGroupProfile[] getServiceConsolePortGroupProfile() {
        if ((ServiceConsolePortGroupProfile) == null) {
            return (NULL_SERVICE_CONSOLE_PORT_GROUP_PROFILE_ARRAY);
        }
        return ServiceConsolePortGroupProfile;
    }

    public void setServiceConsolePortGroupProfile(com.vmware.vim25.ServiceConsolePortGroupProfile[] ServiceConsolePortGroupProfile) {
        this.ServiceConsolePortGroupProfile = ServiceConsolePortGroupProfile;
    }

}
