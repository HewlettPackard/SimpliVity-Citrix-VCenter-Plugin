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
public class CustomizationWinOptions
    extends CustomizationOptions
{

    public boolean changeSID;
    public boolean deleteAccounts;
    public CustomizationSysprepRebootOption reboot;

    public boolean getChangeSID() {
        return changeSID;
    }

    public void setChangeSID(boolean changeSID) {
        this.changeSID = changeSID;
    }

    public boolean isChangeSID() {
        return changeSID;
    }

    public boolean getDeleteAccounts() {
        return deleteAccounts;
    }

    public void setDeleteAccounts(boolean deleteAccounts) {
        this.deleteAccounts = deleteAccounts;
    }

    public boolean isDeleteAccounts() {
        return deleteAccounts;
    }

    public CustomizationSysprepRebootOption getReboot() {
        return reboot;
    }

    public void setReboot(CustomizationSysprepRebootOption reboot) {
        this.reboot = reboot;
    }

}
