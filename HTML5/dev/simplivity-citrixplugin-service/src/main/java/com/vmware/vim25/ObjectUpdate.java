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
public class ObjectUpdate
    extends DynamicData
{

    public ObjectUpdateKind kind;
    public ManagedObjectReference obj;
    private final static PropertyChange[] NULL_CHANGE_SET_ARRAY = new PropertyChange[ 0 ] ;
    public PropertyChange[] changeSet;
    private final static MissingProperty[] NULL_MISSING_SET_ARRAY = new MissingProperty[ 0 ] ;
    public MissingProperty[] missingSet;

    public ObjectUpdateKind getKind() {
        return kind;
    }

    public void setKind(ObjectUpdateKind kind) {
        this.kind = kind;
    }

    public ManagedObjectReference getObj() {
        return obj;
    }

    public void setObj(ManagedObjectReference obj) {
        this.obj = obj;
    }

    public PropertyChange[] getChangeSet() {
        if ((changeSet) == null) {
            return (NULL_CHANGE_SET_ARRAY);
        }
        return changeSet;
    }

    public void setChangeSet(PropertyChange[] changeSet) {
        this.changeSet = changeSet;
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
