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
public class VirtualSATAControllerOption
    extends VirtualControllerOption
{

    public IntOption numSATADisks;
    public IntOption numSATACdroms;

    public IntOption getNumSATADisks() {
        return numSATADisks;
    }

    public void setNumSATADisks(IntOption numSATADisks) {
        this.numSATADisks = numSATADisks;
    }

    public IntOption getNumSATACdroms() {
        return numSATACdroms;
    }

    public void setNumSATACdroms(IntOption numSATACdroms) {
        this.numSATACdroms = numSATACdroms;
    }

}
