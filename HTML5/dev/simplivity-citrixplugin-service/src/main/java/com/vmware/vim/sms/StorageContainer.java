//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import com.vmware.vim25.DynamicData;


/**
 * 
 */
@SuppressWarnings("all")
public class StorageContainer
    extends DynamicData
{

    public String uuid;
    public String name;
    public long maxVvolSizeInMB;
    private final static String[] NULL_PROVIDER_ID_ARRAY = new String[ 0 ] ;
    public String[] providerId;
    private final static String[] NULL_ARRAY_ID_ARRAY = new String[ 0 ] ;
    public String[] arrayId;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMaxVvolSizeInMB() {
        return maxVvolSizeInMB;
    }

    public void setMaxVvolSizeInMB(long maxVvolSizeInMB) {
        this.maxVvolSizeInMB = maxVvolSizeInMB;
    }

    public String[] getProviderId() {
        if ((providerId) == null) {
            return (NULL_PROVIDER_ID_ARRAY);
        }
        return providerId;
    }

    public void setProviderId(String[] providerId) {
        this.providerId = providerId;
    }

    public String[] getArrayId() {
        if ((arrayId) == null) {
            return (NULL_ARRAY_ID_ARRAY);
        }
        return arrayId;
    }

    public void setArrayId(String[] arrayId) {
        this.arrayId = arrayId;
    }

}
