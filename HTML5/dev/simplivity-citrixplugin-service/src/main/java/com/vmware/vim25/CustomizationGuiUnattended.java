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
public class CustomizationGuiUnattended
    extends DynamicData
{

    public CustomizationPassword password;
    public int timeZone;
    public boolean autoLogon;
    public int autoLogonCount;

    public CustomizationPassword getPassword() {
        return password;
    }

    public void setPassword(CustomizationPassword password) {
        this.password = password;
    }

    public int getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(int timeZone) {
        this.timeZone = timeZone;
    }

    public boolean getAutoLogon() {
        return autoLogon;
    }

    public void setAutoLogon(boolean autoLogon) {
        this.autoLogon = autoLogon;
    }

    public boolean isAutoLogon() {
        return autoLogon;
    }

    public int getAutoLogonCount() {
        return autoLogonCount;
    }

    public void setAutoLogonCount(int autoLogonCount) {
        this.autoLogonCount = autoLogonCount;
    }

}
