//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.pbm;

import com.vmware.vim25.DynamicData;


/**
 * 
 */
@SuppressWarnings("all")
public class PbmCapabilityDiscreteSet
    extends DynamicData
{

    private final static Object[] NULL_VALUES_ARRAY = new Object[ 0 ] ;
    public Object[] values;

    public Object[] getValues() {
        if ((values) == null) {
            return (NULL_VALUES_ARRAY);
        }
        return values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

}
