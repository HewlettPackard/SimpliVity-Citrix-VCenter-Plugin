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
public class DvsTrafficRule
    extends DynamicData
{

    public String key;
    public String description;
    public Integer sequence;
    private final static DvsNetworkRuleQualifier[] NULL_QUALIFIER_ARRAY = new DvsNetworkRuleQualifier[ 0 ] ;
    public DvsNetworkRuleQualifier[] qualifier;
    public DvsNetworkRuleAction action;
    public String direction;

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

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public DvsNetworkRuleQualifier[] getQualifier() {
        if ((qualifier) == null) {
            return (NULL_QUALIFIER_ARRAY);
        }
        return qualifier;
    }

    public void setQualifier(DvsNetworkRuleQualifier[] qualifier) {
        this.qualifier = qualifier;
    }

    public DvsNetworkRuleAction getAction() {
        return action;
    }

    public void setAction(DvsNetworkRuleAction action) {
        this.action = action;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

}