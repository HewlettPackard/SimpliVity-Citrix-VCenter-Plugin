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
public class ProfileExecuteError
    extends DynamicData
{

    public ProfilePropertyPath path;
    public LocalizableMessage message;

    public ProfilePropertyPath getPath() {
        return path;
    }

    public void setPath(ProfilePropertyPath path) {
        this.path = path;
    }

    public LocalizableMessage getMessage() {
        return message;
    }

    public void setMessage(LocalizableMessage message) {
        this.message = message;
    }

}
