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
public class ArrayOfTag {

    private final static com.vmware.vim25.Tag[] NULL_TAG_ARRAY = new com.vmware.vim25.Tag[ 0 ] ;
    public com.vmware.vim25.Tag[] Tag;

    public com.vmware.vim25.Tag[] getTag() {
        if ((Tag) == null) {
            return (NULL_TAG_ARRAY);
        }
        return Tag;
    }

    public void setTag(com.vmware.vim25.Tag[] Tag) {
        this.Tag = Tag;
    }

}
