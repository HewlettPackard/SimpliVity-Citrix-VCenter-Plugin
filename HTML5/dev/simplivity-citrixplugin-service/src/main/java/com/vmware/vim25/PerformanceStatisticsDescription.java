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
public class PerformanceStatisticsDescription
    extends DynamicData
{

    private final static PerfInterval[] NULL_INTERVALS_ARRAY = new PerfInterval[ 0 ] ;
    public PerfInterval[] intervals;

    public PerfInterval[] getIntervals() {
        if ((intervals) == null) {
            return (NULL_INTERVALS_ARRAY);
        }
        return intervals;
    }

    public void setIntervals(PerfInterval[] intervals) {
        this.intervals = intervals;
    }

}