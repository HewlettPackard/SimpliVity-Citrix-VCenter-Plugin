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
public class PbmCapabilityConstraintInstance
    extends DynamicData
{

    private final static PbmCapabilityPropertyInstance[] NULL_PROPERTY_INSTANCE_ARRAY = new PbmCapabilityPropertyInstance[ 0 ] ;
    public PbmCapabilityPropertyInstance[] propertyInstance;

    public PbmCapabilityPropertyInstance[] getPropertyInstance() {
        if ((propertyInstance) == null) {
            return (NULL_PROPERTY_INSTANCE_ARRAY);
        }
        return propertyInstance;
    }

    public void setPropertyInstance(PbmCapabilityPropertyInstance[] propertyInstance) {
        this.propertyInstance = propertyInstance;
    }

}
