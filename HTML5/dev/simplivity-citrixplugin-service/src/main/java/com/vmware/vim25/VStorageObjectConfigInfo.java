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
public class VStorageObjectConfigInfo
    extends BaseConfigInfo
{

    public long capacityInMB;
    private final static String[] NULL_CONSUMPTION_TYPE_ARRAY = new String[ 0 ] ;
    public String[] consumptionType;
    private final static ID[] NULL_CONSUMER_ID_ARRAY = new ID[ 0 ] ;
    public ID[] consumerId;

    public long getCapacityInMB() {
        return capacityInMB;
    }

    public void setCapacityInMB(long capacityInMB) {
        this.capacityInMB = capacityInMB;
    }

    public String[] getConsumptionType() {
        if ((consumptionType) == null) {
            return (NULL_CONSUMPTION_TYPE_ARRAY);
        }
        return consumptionType;
    }

    public void setConsumptionType(String[] consumptionType) {
        this.consumptionType = consumptionType;
    }

    public ID[] getConsumerId() {
        if ((consumerId) == null) {
            return (NULL_CONSUMER_ID_ARRAY);
        }
        return consumerId;
    }

    public void setConsumerId(ID[] consumerId) {
        this.consumerId = consumerId;
    }

}
