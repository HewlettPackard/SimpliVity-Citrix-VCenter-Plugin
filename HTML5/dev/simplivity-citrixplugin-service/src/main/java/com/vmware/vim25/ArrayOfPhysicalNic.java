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
public class ArrayOfPhysicalNic {

    private final static com.vmware.vim25.PhysicalNic[] NULL_PHYSICAL_NIC_ARRAY = new com.vmware.vim25.PhysicalNic[ 0 ] ;
    public com.vmware.vim25.PhysicalNic[] PhysicalNic;

    public com.vmware.vim25.PhysicalNic[] getPhysicalNic() {
        if ((PhysicalNic) == null) {
            return (NULL_PHYSICAL_NIC_ARRAY);
        }
        return PhysicalNic;
    }

    public void setPhysicalNic(com.vmware.vim25.PhysicalNic[] PhysicalNic) {
        this.PhysicalNic = PhysicalNic;
    }

}