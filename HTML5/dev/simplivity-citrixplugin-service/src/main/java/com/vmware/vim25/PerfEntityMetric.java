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
public class PerfEntityMetric
    extends PerfEntityMetricBase
{

    private final static PerfSampleInfo[] NULL_SAMPLE_INFO_ARRAY = new PerfSampleInfo[ 0 ] ;
    public PerfSampleInfo[] sampleInfo;
    private final static PerfMetricSeries[] NULL_VALUE_ARRAY = new PerfMetricSeries[ 0 ] ;
    public PerfMetricSeries[] value;

    public PerfSampleInfo[] getSampleInfo() {
        if ((sampleInfo) == null) {
            return (NULL_SAMPLE_INFO_ARRAY);
        }
        return sampleInfo;
    }

    public void setSampleInfo(PerfSampleInfo[] sampleInfo) {
        this.sampleInfo = sampleInfo;
    }

    public PerfMetricSeries[] getValue() {
        if ((value) == null) {
            return (NULL_VALUE_ARRAY);
        }
        return value;
    }

    public void setValue(PerfMetricSeries[] value) {
        this.value = value;
    }

}
