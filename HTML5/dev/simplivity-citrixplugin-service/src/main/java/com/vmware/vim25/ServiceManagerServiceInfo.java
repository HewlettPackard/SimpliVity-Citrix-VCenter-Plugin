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
public class ServiceManagerServiceInfo
    extends DynamicData
{

    public String serviceName;
    private final static String[] NULL_LOCATION_ARRAY = new String[ 0 ] ;
    public String[] location;
    public ManagedObjectReference service;
    public String description;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String[] getLocation() {
        if ((location) == null) {
            return (NULL_LOCATION_ARRAY);
        }
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public ManagedObjectReference getService() {
        return service;
    }

    public void setService(ManagedObjectReference service) {
        this.service = service;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}