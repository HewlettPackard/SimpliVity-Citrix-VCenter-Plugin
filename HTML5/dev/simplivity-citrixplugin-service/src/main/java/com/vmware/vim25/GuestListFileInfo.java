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
public class GuestListFileInfo
    extends DynamicData
{

    private final static GuestFileInfo[] NULL_FILES_ARRAY = new GuestFileInfo[ 0 ] ;
    public GuestFileInfo[] files;
    public int remaining;

    public GuestFileInfo[] getFiles() {
        if ((files) == null) {
            return (NULL_FILES_ARRAY);
        }
        return files;
    }

    public void setFiles(GuestFileInfo[] files) {
        this.files = files;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

}
