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
public class ArrayOfProfileExpression {

    private final static com.vmware.vim25.ProfileExpression[] NULL_PROFILE_EXPRESSION_ARRAY = new com.vmware.vim25.ProfileExpression[ 0 ] ;
    public com.vmware.vim25.ProfileExpression[] ProfileExpression;

    public com.vmware.vim25.ProfileExpression[] getProfileExpression() {
        if ((ProfileExpression) == null) {
            return (NULL_PROFILE_EXPRESSION_ARRAY);
        }
        return ProfileExpression;
    }

    public void setProfileExpression(com.vmware.vim25.ProfileExpression[] ProfileExpression) {
        this.ProfileExpression = ProfileExpression;
    }

}