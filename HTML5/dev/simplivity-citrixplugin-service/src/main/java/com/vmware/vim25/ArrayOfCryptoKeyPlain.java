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
public class ArrayOfCryptoKeyPlain {

    private final static com.vmware.vim25.CryptoKeyPlain[] NULL_CRYPTO_KEY_PLAIN_ARRAY = new com.vmware.vim25.CryptoKeyPlain[ 0 ] ;
    public com.vmware.vim25.CryptoKeyPlain[] CryptoKeyPlain;

    public com.vmware.vim25.CryptoKeyPlain[] getCryptoKeyPlain() {
        if ((CryptoKeyPlain) == null) {
            return (NULL_CRYPTO_KEY_PLAIN_ARRAY);
        }
        return CryptoKeyPlain;
    }

    public void setCryptoKeyPlain(com.vmware.vim25.CryptoKeyPlain[] CryptoKeyPlain) {
        this.CryptoKeyPlain = CryptoKeyPlain;
    }

}