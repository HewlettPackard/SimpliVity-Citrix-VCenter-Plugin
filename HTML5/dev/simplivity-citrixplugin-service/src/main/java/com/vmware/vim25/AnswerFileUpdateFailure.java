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
public class AnswerFileUpdateFailure
    extends DynamicData
{

    public ProfilePropertyPath userInputPath;
    public LocalizableMessage errMsg;

    public ProfilePropertyPath getUserInputPath() {
        return userInputPath;
    }

    public void setUserInputPath(ProfilePropertyPath userInputPath) {
        this.userInputPath = userInputPath;
    }

    public LocalizableMessage getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(LocalizableMessage errMsg) {
        this.errMsg = errMsg;
    }

}
