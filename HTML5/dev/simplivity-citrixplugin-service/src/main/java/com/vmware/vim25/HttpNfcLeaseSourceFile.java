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
public class HttpNfcLeaseSourceFile
    extends DynamicData
{

    public String targetDeviceId;
    public String url;
    public String memberName;
    public boolean create;
    public String sslThumbprint;
    private final static KeyValue[] NULL_HTTP_HEADERS_ARRAY = new KeyValue[ 0 ] ;
    public KeyValue[] httpHeaders;
    public Long size;

    public String getTargetDeviceId() {
        return targetDeviceId;
    }

    public void setTargetDeviceId(String targetDeviceId) {
        this.targetDeviceId = targetDeviceId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public boolean getCreate() {
        return create;
    }

    public void setCreate(boolean create) {
        this.create = create;
    }

    public boolean isCreate() {
        return create;
    }

    public String getSslThumbprint() {
        return sslThumbprint;
    }

    public void setSslThumbprint(String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }

    public KeyValue[] getHttpHeaders() {
        if ((httpHeaders) == null) {
            return (NULL_HTTP_HEADERS_ARRAY);
        }
        return httpHeaders;
    }

    public void setHttpHeaders(KeyValue[] httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

}
