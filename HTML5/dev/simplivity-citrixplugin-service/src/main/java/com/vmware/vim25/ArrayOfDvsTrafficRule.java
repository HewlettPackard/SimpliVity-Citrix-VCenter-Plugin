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
public class ArrayOfDvsTrafficRule {

    private final static com.vmware.vim25.DvsTrafficRule[] NULL_DVS_TRAFFIC_RULE_ARRAY = new com.vmware.vim25.DvsTrafficRule[ 0 ] ;
    public com.vmware.vim25.DvsTrafficRule[] DvsTrafficRule;

    public com.vmware.vim25.DvsTrafficRule[] getDvsTrafficRule() {
        if ((DvsTrafficRule) == null) {
            return (NULL_DVS_TRAFFIC_RULE_ARRAY);
        }
        return DvsTrafficRule;
    }

    public void setDvsTrafficRule(com.vmware.vim25.DvsTrafficRule[] DvsTrafficRule) {
        this.DvsTrafficRule = DvsTrafficRule;
    }

}
