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
public class DvsPortBlockedEvent
    extends DvsEvent
{

    public String portKey;
    public String statusDetail;
    public DVPortStatus runtimeInfo;
    public String prevBlockState;

    public String getPortKey() {
        return portKey;
    }

    public void setPortKey(String portKey) {
        this.portKey = portKey;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public DVPortStatus getRuntimeInfo() {
        return runtimeInfo;
    }

    public void setRuntimeInfo(DVPortStatus runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
    }

    public String getPrevBlockState() {
        return prevBlockState;
    }

    public void setPrevBlockState(String prevBlockState) {
        this.prevBlockState = prevBlockState;
    }

}
