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
public class DatastoreFileCopiedEvent
    extends DatastoreFileEvent
{

    public DatastoreEventArgument sourceDatastore;
    public String sourceFile;

    public DatastoreEventArgument getSourceDatastore() {
        return sourceDatastore;
    }

    public void setSourceDatastore(DatastoreEventArgument sourceDatastore) {
        this.sourceDatastore = sourceDatastore;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

}