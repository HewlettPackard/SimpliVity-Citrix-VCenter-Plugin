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
public class OrAlarmExpression
    extends AlarmExpression
{

    private final static AlarmExpression[] NULL_EXPRESSION_ARRAY = new AlarmExpression[ 0 ] ;
    public AlarmExpression[] expression;

    public AlarmExpression[] getExpression() {
        if ((expression) == null) {
            return (NULL_EXPRESSION_ARRAY);
        }
        return expression;
    }

    public void setExpression(AlarmExpression[] expression) {
        this.expression = expression;
    }

}
