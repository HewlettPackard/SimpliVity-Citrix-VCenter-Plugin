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
public class CustomizationSysprepFailed
    extends CustomizationFailed
{

    public String sysprepVersion;
    public String systemVersion;

    public String getSysprepVersion() {
        return sysprepVersion;
    }

    public void setSysprepVersion(String sysprepVersion) {
        this.sysprepVersion = sysprepVersion;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

}