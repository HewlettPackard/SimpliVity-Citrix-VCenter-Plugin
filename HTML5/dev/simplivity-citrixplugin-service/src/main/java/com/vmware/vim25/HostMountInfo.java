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
public class HostMountInfo
    extends DynamicData
{

    public String path;
    public String accessMode;
    public Boolean mounted;
    public Boolean accessible;
    public String inaccessibleReason;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    public Boolean getMounted() {
        return mounted;
    }

    public void setMounted(Boolean mounted) {
        this.mounted = mounted;
    }

    public Boolean isMounted() {
        return mounted;
    }

    public Boolean getAccessible() {
        return accessible;
    }

    public void setAccessible(Boolean accessible) {
        this.accessible = accessible;
    }

    public Boolean isAccessible() {
        return accessible;
    }

    public String getInaccessibleReason() {
        return inaccessibleReason;
    }

    public void setInaccessibleReason(String inaccessibleReason) {
        this.inaccessibleReason = inaccessibleReason;
    }

}
