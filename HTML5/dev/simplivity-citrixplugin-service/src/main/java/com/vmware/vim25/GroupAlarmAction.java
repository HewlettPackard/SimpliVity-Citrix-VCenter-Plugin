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
public class GroupAlarmAction
    extends AlarmAction
{

    private final static AlarmAction[] NULL_ACTION_ARRAY = new AlarmAction[ 0 ] ;
    public AlarmAction[] action;

    public AlarmAction[] getAction() {
        if ((action) == null) {
            return (NULL_ACTION_ARRAY);
        }
        return action;
    }

    public void setAction(AlarmAction[] action) {
        this.action = action;
    }

}
