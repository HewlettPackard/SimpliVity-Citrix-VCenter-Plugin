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
public class NamespaceFull
    extends VimFault
{

    public String name;
    public long currentMaxSize;
    public Long requiredSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCurrentMaxSize() {
        return currentMaxSize;
    }

    public void setCurrentMaxSize(long currentMaxSize) {
        this.currentMaxSize = currentMaxSize;
    }

    public Long getRequiredSize() {
        return requiredSize;
    }

    public void setRequiredSize(Long requiredSize) {
        this.requiredSize = requiredSize;
    }

}