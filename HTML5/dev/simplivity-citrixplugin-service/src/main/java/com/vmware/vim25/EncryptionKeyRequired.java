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
public class EncryptionKeyRequired
    extends InvalidState
{

    private final static CryptoKeyId[] NULL_REQUIRED_KEY_ARRAY = new CryptoKeyId[ 0 ] ;
    public CryptoKeyId[] requiredKey;

    public CryptoKeyId[] getRequiredKey() {
        if ((requiredKey) == null) {
            return (NULL_REQUIRED_KEY_ARRAY);
        }
        return requiredKey;
    }

    public void setRequiredKey(CryptoKeyId[] requiredKey) {
        this.requiredKey = requiredKey;
    }

}