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
public class PerfEntityMetricCSV
    extends PerfEntityMetricBase
{

    public String sampleInfoCSV;
    private final static PerfMetricSeriesCSV[] NULL_VALUE_ARRAY = new PerfMetricSeriesCSV[ 0 ] ;
    public PerfMetricSeriesCSV[] value;

    public String getSampleInfoCSV() {
        return sampleInfoCSV;
    }

    public void setSampleInfoCSV(String sampleInfoCSV) {
        this.sampleInfoCSV = sampleInfoCSV;
    }

    public PerfMetricSeriesCSV[] getValue() {
        if ((value) == null) {
            return (NULL_VALUE_ARRAY);
        }
        return value;
    }

    public void setValue(PerfMetricSeriesCSV[] value) {
        this.value = value;
    }

}
