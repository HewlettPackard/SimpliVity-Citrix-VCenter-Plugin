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
public class ArrayOfFileQuery {

    private final static com.vmware.vim25.FileQuery[] NULL_FILE_QUERY_ARRAY = new com.vmware.vim25.FileQuery[ 0 ] ;
    public com.vmware.vim25.FileQuery[] FileQuery;

    public com.vmware.vim25.FileQuery[] getFileQuery() {
        if ((FileQuery) == null) {
            return (NULL_FILE_QUERY_ARRAY);
        }
        return FileQuery;
    }

    public void setFileQuery(com.vmware.vim25.FileQuery[] FileQuery) {
        this.FileQuery = FileQuery;
    }

}
