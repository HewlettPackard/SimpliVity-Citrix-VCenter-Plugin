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
public class EventDescriptionEventDetail
    extends DynamicData
{

    public String key;
    public String description;
    public String category;
    public String formatOnDatacenter;
    public String formatOnComputeResource;
    public String formatOnHost;
    public String formatOnVm;
    public String fullFormat;
    public String longDescription;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFormatOnDatacenter() {
        return formatOnDatacenter;
    }

    public void setFormatOnDatacenter(String formatOnDatacenter) {
        this.formatOnDatacenter = formatOnDatacenter;
    }

    public String getFormatOnComputeResource() {
        return formatOnComputeResource;
    }

    public void setFormatOnComputeResource(String formatOnComputeResource) {
        this.formatOnComputeResource = formatOnComputeResource;
    }

    public String getFormatOnHost() {
        return formatOnHost;
    }

    public void setFormatOnHost(String formatOnHost) {
        this.formatOnHost = formatOnHost;
    }

    public String getFormatOnVm() {
        return formatOnVm;
    }

    public void setFormatOnVm(String formatOnVm) {
        this.formatOnVm = formatOnVm;
    }

    public String getFullFormat() {
        return fullFormat;
    }

    public void setFullFormat(String fullFormat) {
        this.fullFormat = fullFormat;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

}