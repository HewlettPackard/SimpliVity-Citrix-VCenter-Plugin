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
public class ArrayOfSmsProviderInfo {

    private final static com.vmware.vim.sms.SmsProviderInfo[] NULL_SMS_PROVIDER_INFO_ARRAY = new com.vmware.vim.sms.SmsProviderInfo[ 0 ] ;
    public com.vmware.vim.sms.SmsProviderInfo[] SmsProviderInfo;

    public com.vmware.vim.sms.SmsProviderInfo[] getSmsProviderInfo() {
        if ((SmsProviderInfo) == null) {
            return (NULL_SMS_PROVIDER_INFO_ARRAY);
        }
        return SmsProviderInfo;
    }

    public void setSmsProviderInfo(com.vmware.vim.sms.SmsProviderInfo[] SmsProviderInfo) {
        this.SmsProviderInfo = SmsProviderInfo;
    }

}
