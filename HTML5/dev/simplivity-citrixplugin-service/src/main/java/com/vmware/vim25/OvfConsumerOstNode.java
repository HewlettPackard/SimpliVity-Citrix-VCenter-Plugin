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
public class OvfConsumerOstNode
    extends DynamicData
{

    public String id;
    public String type;
    private final static OvfConsumerOvfSection[] NULL_SECTION_ARRAY = new OvfConsumerOvfSection[ 0 ] ;
    public OvfConsumerOvfSection[] section;
    private final static OvfConsumerOstNode[] NULL_CHILD_ARRAY = new OvfConsumerOstNode[ 0 ] ;
    public OvfConsumerOstNode[] child;
    public ManagedObjectReference entity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OvfConsumerOvfSection[] getSection() {
        if ((section) == null) {
            return (NULL_SECTION_ARRAY);
        }
        return section;
    }

    public void setSection(OvfConsumerOvfSection[] section) {
        this.section = section;
    }

    public OvfConsumerOstNode[] getChild() {
        if ((child) == null) {
            return (NULL_CHILD_ARRAY);
        }
        return child;
    }

    public void setChild(OvfConsumerOstNode[] child) {
        this.child = child;
    }

    public ManagedObjectReference getEntity() {
        return entity;
    }

    public void setEntity(ManagedObjectReference entity) {
        this.entity = entity;
    }

}
