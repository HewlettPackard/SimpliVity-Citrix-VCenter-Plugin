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
public class ClusterProfileConfigServiceCreateSpec
    extends ClusterProfileConfigSpec
{

    private final static String[] NULL_SERVICE_TYPE_ARRAY = new String[ 0 ] ;
    public String[] serviceType;

    public String[] getServiceType() {
        if ((serviceType) == null) {
            return (NULL_SERVICE_TYPE_ARRAY);
        }
        return serviceType;
    }

    public void setServiceType(String[] serviceType) {
        this.serviceType = serviceType;
    }

}
