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
public class HostScsiTopology
    extends DynamicData
{

    private final static HostScsiTopologyInterface[] NULL_ADAPTER_ARRAY = new HostScsiTopologyInterface[ 0 ] ;
    public HostScsiTopologyInterface[] adapter;

    public HostScsiTopologyInterface[] getAdapter() {
        if ((adapter) == null) {
            return (NULL_ADAPTER_ARRAY);
        }
        return adapter;
    }

    public void setAdapter(HostScsiTopologyInterface[] adapter) {
        this.adapter = adapter;
    }

}