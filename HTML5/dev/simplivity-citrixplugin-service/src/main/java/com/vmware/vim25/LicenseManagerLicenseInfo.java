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
public class LicenseManagerLicenseInfo
    extends DynamicData
{

    public String licenseKey;
    public String editionKey;
    public String name;
    public int total;
    public Integer used;
    public String costUnit;
    private final static KeyAnyValue[] NULL_PROPERTIES_ARRAY = new KeyAnyValue[ 0 ] ;
    public KeyAnyValue[] properties;
    private final static KeyValue[] NULL_LABELS_ARRAY = new KeyValue[ 0 ] ;
    public KeyValue[] labels;

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public String getEditionKey() {
        return editionKey;
    }

    public void setEditionKey(String editionKey) {
        this.editionKey = editionKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public String getCostUnit() {
        return costUnit;
    }

    public void setCostUnit(String costUnit) {
        this.costUnit = costUnit;
    }

    public KeyAnyValue[] getProperties() {
        if ((properties) == null) {
            return (NULL_PROPERTIES_ARRAY);
        }
        return properties;
    }

    public void setProperties(KeyAnyValue[] properties) {
        this.properties = properties;
    }

    public KeyValue[] getLabels() {
        if ((labels) == null) {
            return (NULL_LABELS_ARRAY);
        }
        return labels;
    }

    public void setLabels(KeyValue[] labels) {
        this.labels = labels;
    }

}
