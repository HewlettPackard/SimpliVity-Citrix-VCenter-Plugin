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
public class HostVmciAccessManagerAccessSpec
    extends DynamicData
{

    public ManagedObjectReference vm;
    private final static String[] NULL_SERVICES_ARRAY = new String[ 0 ] ;
    public String[] services;
    public String mode;

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(ManagedObjectReference vm) {
        this.vm = vm;
    }

    public String[] getServices() {
        if ((services) == null) {
            return (NULL_SERVICES_ARRAY);
        }
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

}
