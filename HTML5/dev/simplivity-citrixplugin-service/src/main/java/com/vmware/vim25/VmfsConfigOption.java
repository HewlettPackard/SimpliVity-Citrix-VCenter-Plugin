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
public class VmfsConfigOption
    extends DynamicData
{

    public int blockSizeOption;
    private final static int[] NULL_UNMAP_GRANULARITY_OPTION_ARRAY = new int[ 0 ] ;
    public int[] unmapGranularityOption;
    public LongOption unmapBandwidthFixedValue;
    public LongOption unmapBandwidthDynamicMin;
    public LongOption unmapBandwidthDynamicMax;
    public Long unmapBandwidthIncrement;

    public int getBlockSizeOption() {
        return blockSizeOption;
    }

    public void setBlockSizeOption(int blockSizeOption) {
        this.blockSizeOption = blockSizeOption;
    }

    public int[] getUnmapGranularityOption() {
        if ((unmapGranularityOption) == null) {
            return (NULL_UNMAP_GRANULARITY_OPTION_ARRAY);
        }
        return unmapGranularityOption;
    }

    public void setUnmapGranularityOption(int[] unmapGranularityOption) {
        this.unmapGranularityOption = unmapGranularityOption;
    }

    public LongOption getUnmapBandwidthFixedValue() {
        return unmapBandwidthFixedValue;
    }

    public void setUnmapBandwidthFixedValue(LongOption unmapBandwidthFixedValue) {
        this.unmapBandwidthFixedValue = unmapBandwidthFixedValue;
    }

    public LongOption getUnmapBandwidthDynamicMin() {
        return unmapBandwidthDynamicMin;
    }

    public void setUnmapBandwidthDynamicMin(LongOption unmapBandwidthDynamicMin) {
        this.unmapBandwidthDynamicMin = unmapBandwidthDynamicMin;
    }

    public LongOption getUnmapBandwidthDynamicMax() {
        return unmapBandwidthDynamicMax;
    }

    public void setUnmapBandwidthDynamicMax(LongOption unmapBandwidthDynamicMax) {
        this.unmapBandwidthDynamicMax = unmapBandwidthDynamicMax;
    }

    public Long getUnmapBandwidthIncrement() {
        return unmapBandwidthIncrement;
    }

    public void setUnmapBandwidthIncrement(Long unmapBandwidthIncrement) {
        this.unmapBandwidthIncrement = unmapBandwidthIncrement;
    }

}
