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
public class ArrayOfOvfConsumerOvfSection {

    private final static com.vmware.vim25.OvfConsumerOvfSection[] NULL_OVF_CONSUMER_OVF_SECTION_ARRAY = new com.vmware.vim25.OvfConsumerOvfSection[ 0 ] ;
    public com.vmware.vim25.OvfConsumerOvfSection[] OvfConsumerOvfSection;

    public com.vmware.vim25.OvfConsumerOvfSection[] getOvfConsumerOvfSection() {
        if ((OvfConsumerOvfSection) == null) {
            return (NULL_OVF_CONSUMER_OVF_SECTION_ARRAY);
        }
        return OvfConsumerOvfSection;
    }

    public void setOvfConsumerOvfSection(com.vmware.vim25.OvfConsumerOvfSection[] OvfConsumerOvfSection) {
        this.OvfConsumerOvfSection = OvfConsumerOvfSection;
    }

}