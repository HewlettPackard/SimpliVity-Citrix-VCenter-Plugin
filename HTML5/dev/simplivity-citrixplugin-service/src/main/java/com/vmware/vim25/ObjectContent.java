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
public class ObjectContent
    extends DynamicData
{

    public ManagedObjectReference obj;
    private final static DynamicProperty[] NULL_PROP_SET_ARRAY = new DynamicProperty[ 0 ] ;
    public DynamicProperty[] propSet;
    private final static MissingProperty[] NULL_MISSING_SET_ARRAY = new MissingProperty[ 0 ] ;
    public MissingProperty[] missingSet;

    public ManagedObjectReference getObj() {
        return obj;
    }

    public void setObj(ManagedObjectReference obj) {
        this.obj = obj;
    }

    public DynamicProperty[] getPropSet() {
        if ((propSet) == null) {
            return (NULL_PROP_SET_ARRAY);
        }
        return propSet;
    }

    public void setPropSet(DynamicProperty[] propSet) {
        this.propSet = propSet;
    }

    public MissingProperty[] getMissingSet() {
        if ((missingSet) == null) {
            return (NULL_MISSING_SET_ARRAY);
        }
        return missingSet;
    }

    public void setMissingSet(MissingProperty[] missingSet) {
        this.missingSet = missingSet;
    }

}