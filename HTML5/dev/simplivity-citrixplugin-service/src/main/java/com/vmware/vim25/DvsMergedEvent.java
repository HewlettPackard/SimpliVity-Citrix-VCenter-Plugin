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
public class DvsMergedEvent
    extends DvsEvent
{

    public DvsEventArgument sourceDvs;
    public DvsEventArgument destinationDvs;

    public DvsEventArgument getSourceDvs() {
        return sourceDvs;
    }

    public void setSourceDvs(DvsEventArgument sourceDvs) {
        this.sourceDvs = sourceDvs;
    }

    public DvsEventArgument getDestinationDvs() {
        return destinationDvs;
    }

    public void setDestinationDvs(DvsEventArgument destinationDvs) {
        this.destinationDvs = destinationDvs;
    }

}
