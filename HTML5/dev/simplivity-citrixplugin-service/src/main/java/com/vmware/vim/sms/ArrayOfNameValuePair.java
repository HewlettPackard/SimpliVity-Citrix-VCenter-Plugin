//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;



/**
 * 
 */
@SuppressWarnings("all")
public class ArrayOfNameValuePair {

    private final static com.vmware.vim.sms.NameValuePair[] NULL_NAME_VALUE_PAIR_ARRAY = new com.vmware.vim.sms.NameValuePair[ 0 ] ;
    public com.vmware.vim.sms.NameValuePair[] NameValuePair;

    public com.vmware.vim.sms.NameValuePair[] getNameValuePair() {
        if ((NameValuePair) == null) {
            return (NULL_NAME_VALUE_PAIR_ARRAY);
        }
        return NameValuePair;
    }

    public void setNameValuePair(com.vmware.vim.sms.NameValuePair[] NameValuePair) {
        this.NameValuePair = NameValuePair;
    }

}
