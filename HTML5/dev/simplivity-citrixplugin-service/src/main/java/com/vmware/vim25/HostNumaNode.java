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
public class HostNumaNode
    extends DynamicData
{

    public byte typeId;
    private final static short[] NULL_CPU_ID_ARRAY = new short[ 0 ] ;
    public short[] cpuID;
    public long memoryRangeBegin;
    public long memoryRangeLength;
    private final static String[] NULL_PCI_ID_ARRAY = new String[ 0 ] ;
    public String[] pciId;

    public byte getTypeId() {
        return typeId;
    }

    public void setTypeId(byte typeId) {
        this.typeId = typeId;
    }

    public short[] getCpuID() {
        if ((cpuID) == null) {
            return (NULL_CPU_ID_ARRAY);
        }
        return cpuID;
    }

    public void setCpuID(short[] cpuID) {
        this.cpuID = cpuID;
    }

    public long getMemoryRangeBegin() {
        return memoryRangeBegin;
    }

    public void setMemoryRangeBegin(long memoryRangeBegin) {
        this.memoryRangeBegin = memoryRangeBegin;
    }

    public long getMemoryRangeLength() {
        return memoryRangeLength;
    }

    public void setMemoryRangeLength(long memoryRangeLength) {
        this.memoryRangeLength = memoryRangeLength;
    }

    public String[] getPciId() {
        if ((pciId) == null) {
            return (NULL_PCI_ID_ARRAY);
        }
        return pciId;
    }

    public void setPciId(String[] pciId) {
        this.pciId = pciId;
    }

}