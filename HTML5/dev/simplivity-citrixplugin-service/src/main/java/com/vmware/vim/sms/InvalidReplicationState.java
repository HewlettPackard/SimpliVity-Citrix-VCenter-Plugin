//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;



/**
 * 
 */
@SuppressWarnings("all")
public class InvalidReplicationState
    extends SmsReplicationFault
{

    private final static String[] NULL_DESIRED_STATE_ARRAY = new String[ 0 ] ;
    public String[] desiredState;
    public String currentState;

    public String[] getDesiredState() {
        if ((desiredState) == null) {
            return (NULL_DESIRED_STATE_ARRAY);
        }
        return desiredState;
    }

    public void setDesiredState(String[] desiredState) {
        this.desiredState = desiredState;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

}