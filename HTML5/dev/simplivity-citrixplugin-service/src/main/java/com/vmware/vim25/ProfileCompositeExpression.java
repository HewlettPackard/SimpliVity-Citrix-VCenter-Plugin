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
public class ProfileCompositeExpression
    extends ProfileExpression
{

    public String operator;
    private final static String[] NULL_EXPRESSION_NAME_ARRAY = new String[ 0 ] ;
    public String[] expressionName;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String[] getExpressionName() {
        if ((expressionName) == null) {
            return (NULL_EXPRESSION_NAME_ARRAY);
        }
        return expressionName;
    }

    public void setExpressionName(String[] expressionName) {
        this.expressionName = expressionName;
    }

}
