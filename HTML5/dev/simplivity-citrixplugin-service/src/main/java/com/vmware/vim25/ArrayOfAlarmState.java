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
public class ArrayOfAlarmState {

    private final static com.vmware.vim25.AlarmState[] NULL_ALARM_STATE_ARRAY = new com.vmware.vim25.AlarmState[ 0 ] ;
    public com.vmware.vim25.AlarmState[] AlarmState;

    public com.vmware.vim25.AlarmState[] getAlarmState() {
        if ((AlarmState) == null) {
            return (NULL_ALARM_STATE_ARRAY);
        }
        return AlarmState;
    }

    public void setAlarmState(com.vmware.vim25.AlarmState[] AlarmState) {
        this.AlarmState = AlarmState;
    }

}
