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
public class ScsiLunDurableName
    extends DynamicData
{

    public String namespace;
    public byte namespaceId;
    private final static byte[] NULL_DATA_ARRAY = new byte[ 0 ] ;
    public byte[] data;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public byte getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(byte namespaceId) {
        this.namespaceId = namespaceId;
    }

    public byte[] getData() {
        if ((data) == null) {
            return (NULL_DATA_ARRAY);
        }
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}
