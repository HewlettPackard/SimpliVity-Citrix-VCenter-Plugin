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
public class ArrayOfSoftwarePackage {

    private final static com.vmware.vim25.SoftwarePackage[] NULL_SOFTWARE_PACKAGE_ARRAY = new com.vmware.vim25.SoftwarePackage[ 0 ] ;
    public com.vmware.vim25.SoftwarePackage[] SoftwarePackage;

    public com.vmware.vim25.SoftwarePackage[] getSoftwarePackage() {
        if ((SoftwarePackage) == null) {
            return (NULL_SOFTWARE_PACKAGE_ARRAY);
        }
        return SoftwarePackage;
    }

    public void setSoftwarePackage(com.vmware.vim25.SoftwarePackage[] SoftwarePackage) {
        this.SoftwarePackage = SoftwarePackage;
    }

}
