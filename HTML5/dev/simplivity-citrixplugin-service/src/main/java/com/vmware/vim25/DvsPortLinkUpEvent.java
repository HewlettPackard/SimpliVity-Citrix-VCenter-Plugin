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
public class DvsPortLinkUpEvent
    extends DvsEvent
{

    public String portKey;
    public DVPortStatus runtimeInfo;

    public String getPortKey() {
        return portKey;
    }

    public void setPortKey(String portKey) {
        this.portKey = portKey;
    }

    public DVPortStatus getRuntimeInfo() {
        return runtimeInfo;
    }

    public void setRuntimeInfo(DVPortStatus runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
    }

}
