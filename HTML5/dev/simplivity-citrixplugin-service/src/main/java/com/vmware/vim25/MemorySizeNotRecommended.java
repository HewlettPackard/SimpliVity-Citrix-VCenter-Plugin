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
public class MemorySizeNotRecommended
    extends VirtualHardwareCompatibilityIssue
{

    public int memorySizeMB;
    public int minMemorySizeMB;
    public int maxMemorySizeMB;

    public int getMemorySizeMB() {
        return memorySizeMB;
    }

    public void setMemorySizeMB(int memorySizeMB) {
        this.memorySizeMB = memorySizeMB;
    }

    public int getMinMemorySizeMB() {
        return minMemorySizeMB;
    }

    public void setMinMemorySizeMB(int minMemorySizeMB) {
        this.minMemorySizeMB = minMemorySizeMB;
    }

    public int getMaxMemorySizeMB() {
        return maxMemorySizeMB;
    }

    public void setMaxMemorySizeMB(int maxMemorySizeMB) {
        this.maxMemorySizeMB = maxMemorySizeMB;
    }

}