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
public class FileQueryFlags
    extends DynamicData
{

    public boolean fileType;
    public boolean fileSize;
    public boolean modification;
    public Boolean fileOwner;

    public boolean getFileType() {
        return fileType;
    }

    public void setFileType(boolean fileType) {
        this.fileType = fileType;
    }

    public boolean isFileType() {
        return fileType;
    }

    public boolean getFileSize() {
        return fileSize;
    }

    public void setFileSize(boolean fileSize) {
        this.fileSize = fileSize;
    }

    public boolean isFileSize() {
        return fileSize;
    }

    public boolean getModification() {
        return modification;
    }

    public void setModification(boolean modification) {
        this.modification = modification;
    }

    public boolean isModification() {
        return modification;
    }

    public Boolean getFileOwner() {
        return fileOwner;
    }

    public void setFileOwner(Boolean fileOwner) {
        this.fileOwner = fileOwner;
    }

    public Boolean isFileOwner() {
        return fileOwner;
    }

}
