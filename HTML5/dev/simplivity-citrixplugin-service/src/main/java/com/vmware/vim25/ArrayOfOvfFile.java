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
public class ArrayOfOvfFile {

    private final static com.vmware.vim25.OvfFile[] NULL_OVF_FILE_ARRAY = new com.vmware.vim25.OvfFile[ 0 ] ;
    public com.vmware.vim25.OvfFile[] OvfFile;

    public com.vmware.vim25.OvfFile[] getOvfFile() {
        if ((OvfFile) == null) {
            return (NULL_OVF_FILE_ARRAY);
        }
        return OvfFile;
    }

    public void setOvfFile(com.vmware.vim25.OvfFile[] OvfFile) {
        this.OvfFile = OvfFile;
    }

}