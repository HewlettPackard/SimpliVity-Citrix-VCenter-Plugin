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
public class ArrayOfPerfSampleInfo {

    private final static com.vmware.vim25.PerfSampleInfo[] NULL_PERF_SAMPLE_INFO_ARRAY = new com.vmware.vim25.PerfSampleInfo[ 0 ] ;
    public com.vmware.vim25.PerfSampleInfo[] PerfSampleInfo;

    public com.vmware.vim25.PerfSampleInfo[] getPerfSampleInfo() {
        if ((PerfSampleInfo) == null) {
            return (NULL_PERF_SAMPLE_INFO_ARRAY);
        }
        return PerfSampleInfo;
    }

    public void setPerfSampleInfo(com.vmware.vim25.PerfSampleInfo[] PerfSampleInfo) {
        this.PerfSampleInfo = PerfSampleInfo;
    }

}
