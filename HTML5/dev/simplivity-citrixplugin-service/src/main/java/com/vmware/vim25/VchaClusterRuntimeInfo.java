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
public class VchaClusterRuntimeInfo
    extends DynamicData
{

    public String clusterState;
    private final static VchaNodeRuntimeInfo[] NULL_NODE_INFO_ARRAY = new VchaNodeRuntimeInfo[ 0 ] ;
    public VchaNodeRuntimeInfo[] nodeInfo;
    public String clusterMode;

    public String getClusterState() {
        return clusterState;
    }

    public void setClusterState(String clusterState) {
        this.clusterState = clusterState;
    }

    public VchaNodeRuntimeInfo[] getNodeInfo() {
        if ((nodeInfo) == null) {
            return (NULL_NODE_INFO_ARRAY);
        }
        return nodeInfo;
    }

    public void setNodeInfo(VchaNodeRuntimeInfo[] nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public String getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
    }

}
