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
public class DVSRuntimeInfo
    extends DynamicData
{

    private final static HostMemberRuntimeInfo[] NULL_HOST_MEMBER_RUNTIME_ARRAY = new HostMemberRuntimeInfo[ 0 ] ;
    public HostMemberRuntimeInfo[] hostMemberRuntime;
    public DvsResourceRuntimeInfo resourceRuntimeInfo;

    public HostMemberRuntimeInfo[] getHostMemberRuntime() {
        if ((hostMemberRuntime) == null) {
            return (NULL_HOST_MEMBER_RUNTIME_ARRAY);
        }
        return hostMemberRuntime;
    }

    public void setHostMemberRuntime(HostMemberRuntimeInfo[] hostMemberRuntime) {
        this.hostMemberRuntime = hostMemberRuntime;
    }

    public DvsResourceRuntimeInfo getResourceRuntimeInfo() {
        return resourceRuntimeInfo;
    }

    public void setResourceRuntimeInfo(DvsResourceRuntimeInfo resourceRuntimeInfo) {
        this.resourceRuntimeInfo = resourceRuntimeInfo;
    }

}
