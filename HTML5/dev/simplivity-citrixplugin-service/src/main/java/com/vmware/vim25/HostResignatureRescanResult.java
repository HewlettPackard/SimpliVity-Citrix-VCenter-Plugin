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
public class HostResignatureRescanResult
    extends DynamicData
{

    private final static HostVmfsRescanResult[] NULL_RESCAN_ARRAY = new HostVmfsRescanResult[ 0 ] ;
    public HostVmfsRescanResult[] rescan;
    public ManagedObjectReference result;

    public HostVmfsRescanResult[] getRescan() {
        if ((rescan) == null) {
            return (NULL_RESCAN_ARRAY);
        }
        return rescan;
    }

    public void setRescan(HostVmfsRescanResult[] rescan) {
        this.rescan = rescan;
    }

    public ManagedObjectReference getResult() {
        return result;
    }

    public void setResult(ManagedObjectReference result) {
        this.result = result;
    }

}