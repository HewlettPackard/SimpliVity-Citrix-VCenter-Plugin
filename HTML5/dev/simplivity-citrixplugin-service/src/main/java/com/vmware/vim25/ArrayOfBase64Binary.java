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
public class ArrayOfBase64Binary {

    private final static byte[][] NULL_BASE64_BINARY_ARRAY = new byte[ 0 ][] ;
    public byte[][] base64Binary;

    public byte[][] getBase64Binary() {
        if ((base64Binary) == null) {
            return (NULL_BASE64_BINARY_ARRAY);
        }
        return base64Binary;
    }

    public void setBase64Binary(byte[][] base64Binary) {
        this.base64Binary = base64Binary;
    }

}