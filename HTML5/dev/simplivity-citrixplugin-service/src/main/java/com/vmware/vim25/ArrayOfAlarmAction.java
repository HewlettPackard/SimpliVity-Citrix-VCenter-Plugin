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
public class ArrayOfAlarmAction {

    private final static com.vmware.vim25.AlarmAction[] NULL_ALARM_ACTION_ARRAY = new com.vmware.vim25.AlarmAction[ 0 ] ;
    public com.vmware.vim25.AlarmAction[] AlarmAction;

    public com.vmware.vim25.AlarmAction[] getAlarmAction() {
        if ((AlarmAction) == null) {
            return (NULL_ALARM_ACTION_ARRAY);
        }
        return AlarmAction;
    }

    public void setAlarmAction(com.vmware.vim25.AlarmAction[] AlarmAction) {
        this.AlarmAction = AlarmAction;
    }

}
