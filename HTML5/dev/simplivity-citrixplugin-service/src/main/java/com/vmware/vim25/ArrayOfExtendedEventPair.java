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
public class ArrayOfExtendedEventPair {

    private final static com.vmware.vim25.ExtendedEventPair[] NULL_EXTENDED_EVENT_PAIR_ARRAY = new com.vmware.vim25.ExtendedEventPair[ 0 ] ;
    public com.vmware.vim25.ExtendedEventPair[] ExtendedEventPair;

    public com.vmware.vim25.ExtendedEventPair[] getExtendedEventPair() {
        if ((ExtendedEventPair) == null) {
            return (NULL_EXTENDED_EVENT_PAIR_ARRAY);
        }
        return ExtendedEventPair;
    }

    public void setExtendedEventPair(com.vmware.vim25.ExtendedEventPair[] ExtendedEventPair) {
        this.ExtendedEventPair = ExtendedEventPair;
    }

}