//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim25;

import java.rmi.RemoteException;


/**
 * 
 */
public class MethodFault
    extends RemoteException
{

    public LocalizedMethodFault faultCause;
    private final static LocalizableMessage[] NULL_FAULT_MESSAGE_ARRAY = new LocalizableMessage[ 0 ] ;
    public LocalizableMessage[] faultMessage;
    private final static DynamicProperty[] NULL_DYNAMIC_PROPERTY_ARRAY = new DynamicProperty[ 0 ] ;
    public String dynamicType;
    public DynamicProperty[] dynamicProperty;

    public LocalizedMethodFault getFaultCause() {
        return faultCause;
    }

    public void setFaultCause(LocalizedMethodFault faultCause) {
        this.faultCause = faultCause;
    }

    public LocalizableMessage[] getFaultMessage() {
        if ((faultMessage) == null) {
            return (NULL_FAULT_MESSAGE_ARRAY);
        }
        return faultMessage;
    }

    public void setFaultMessage(LocalizableMessage[] faultMessage) {
        this.faultMessage = faultMessage;
    }

    public String getDynamicType() {
        return dynamicType;
    }

    public void setDynamicType(String dynamicType) {
        this.dynamicType = dynamicType;
    }

    public DynamicProperty[] getDynamicProperty() {
        if ((dynamicProperty) == null) {
            return (NULL_DYNAMIC_PROPERTY_ARRAY);
        }
        return dynamicProperty;
    }

    public void setDynamicProperty(DynamicProperty[] dynamicProperty) {
        this.dynamicProperty = dynamicProperty;
    }

}