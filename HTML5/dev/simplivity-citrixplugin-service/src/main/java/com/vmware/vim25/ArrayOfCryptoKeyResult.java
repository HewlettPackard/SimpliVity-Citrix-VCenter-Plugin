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
public class ArrayOfCryptoKeyResult {

    private final static com.vmware.vim25.CryptoKeyResult[] NULL_CRYPTO_KEY_RESULT_ARRAY = new com.vmware.vim25.CryptoKeyResult[ 0 ] ;
    public com.vmware.vim25.CryptoKeyResult[] CryptoKeyResult;

    public com.vmware.vim25.CryptoKeyResult[] getCryptoKeyResult() {
        if ((CryptoKeyResult) == null) {
            return (NULL_CRYPTO_KEY_RESULT_ARRAY);
        }
        return CryptoKeyResult;
    }

    public void setCryptoKeyResult(com.vmware.vim25.CryptoKeyResult[] CryptoKeyResult) {
        this.CryptoKeyResult = CryptoKeyResult;
    }

}
