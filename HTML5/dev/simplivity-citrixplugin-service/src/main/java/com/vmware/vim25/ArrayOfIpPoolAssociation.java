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
public class ArrayOfIpPoolAssociation {

    private final static com.vmware.vim25.IpPoolAssociation[] NULL_IP_POOL_ASSOCIATION_ARRAY = new com.vmware.vim25.IpPoolAssociation[ 0 ] ;
    public com.vmware.vim25.IpPoolAssociation[] IpPoolAssociation;

    public com.vmware.vim25.IpPoolAssociation[] getIpPoolAssociation() {
        if ((IpPoolAssociation) == null) {
            return (NULL_IP_POOL_ASSOCIATION_ARRAY);
        }
        return IpPoolAssociation;
    }

    public void setIpPoolAssociation(com.vmware.vim25.IpPoolAssociation[] IpPoolAssociation) {
        this.IpPoolAssociation = IpPoolAssociation;
    }

}
