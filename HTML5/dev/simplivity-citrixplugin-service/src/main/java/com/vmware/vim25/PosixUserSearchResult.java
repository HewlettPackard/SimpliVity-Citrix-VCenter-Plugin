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
public class PosixUserSearchResult
    extends UserSearchResult
{

    public int id;
    public Boolean shellAccess;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getShellAccess() {
        return shellAccess;
    }

    public void setShellAccess(Boolean shellAccess) {
        this.shellAccess = shellAccess;
    }

    public Boolean isShellAccess() {
        return shellAccess;
    }

}
