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
public class HostSriovConfig
    extends HostPciPassthruConfig
{

    public boolean sriovEnabled;
    public int numVirtualFunction;

    public boolean getSriovEnabled() {
        return sriovEnabled;
    }

    public void setSriovEnabled(boolean sriovEnabled) {
        this.sriovEnabled = sriovEnabled;
    }

    public boolean isSriovEnabled() {
        return sriovEnabled;
    }

    public int getNumVirtualFunction() {
        return numVirtualFunction;
    }

    public void setNumVirtualFunction(int numVirtualFunction) {
        this.numVirtualFunction = numVirtualFunction;
    }

}
