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
public class VmMessageWarningEvent
    extends VmEvent
{

    public String message;
    private final static VirtualMachineMessage[] NULL_MESSAGE_INFO_ARRAY = new VirtualMachineMessage[ 0 ] ;
    public VirtualMachineMessage[] messageInfo;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public VirtualMachineMessage[] getMessageInfo() {
        if ((messageInfo) == null) {
            return (NULL_MESSAGE_INFO_ARRAY);
        }
        return messageInfo;
    }

    public void setMessageInfo(VirtualMachineMessage[] messageInfo) {
        this.messageInfo = messageInfo;
    }

}
