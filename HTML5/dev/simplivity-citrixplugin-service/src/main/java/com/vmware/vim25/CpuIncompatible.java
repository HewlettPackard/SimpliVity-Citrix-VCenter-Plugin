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
public class CpuIncompatible
    extends VirtualHardwareCompatibilityIssue
{

    public int level;
    public String registerName;
    public String registerBits;
    public String desiredBits;
    public ManagedObjectReference host;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    public String getRegisterBits() {
        return registerBits;
    }

    public void setRegisterBits(String registerBits) {
        this.registerBits = registerBits;
    }

    public String getDesiredBits() {
        return desiredBits;
    }

    public void setDesiredBits(String desiredBits) {
        this.desiredBits = desiredBits;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

}
