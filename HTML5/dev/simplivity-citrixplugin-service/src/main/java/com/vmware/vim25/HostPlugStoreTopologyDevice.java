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
public class HostPlugStoreTopologyDevice
    extends DynamicData
{

    public String key;
    public String lun;
    private final static String[] NULL_PATH_ARRAY = new String[ 0 ] ;
    public String[] path;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLun() {
        return lun;
    }

    public void setLun(String lun) {
        this.lun = lun;
    }

    public String[] getPath() {
        if ((path) == null) {
            return (NULL_PATH_ARRAY);
        }
        return path;
    }

    public void setPath(String[] path) {
        this.path = path;
    }

}
