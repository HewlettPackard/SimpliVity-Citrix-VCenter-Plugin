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
public class TaskFilterSpecByUsername
    extends DynamicData
{

    public boolean systemUser;
    private final static String[] NULL_USER_LIST_ARRAY = new String[ 0 ] ;
    public String[] userList;

    public boolean getSystemUser() {
        return systemUser;
    }

    public void setSystemUser(boolean systemUser) {
        this.systemUser = systemUser;
    }

    public boolean isSystemUser() {
        return systemUser;
    }

    public String[] getUserList() {
        if ((userList) == null) {
            return (NULL_USER_LIST_ARRAY);
        }
        return userList;
    }

    public void setUserList(String[] userList) {
        this.userList = userList;
    }

}
