//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;



/**
 * 
 */
@SuppressWarnings("all")
public class ArrayOfGroupOperationResult {

    private final static com.vmware.vim.sms.GroupOperationResult[] NULL_GROUP_OPERATION_RESULT_ARRAY = new com.vmware.vim.sms.GroupOperationResult[ 0 ] ;
    public com.vmware.vim.sms.GroupOperationResult[] GroupOperationResult;

    public com.vmware.vim.sms.GroupOperationResult[] getGroupOperationResult() {
        if ((GroupOperationResult) == null) {
            return (NULL_GROUP_OPERATION_RESULT_ARRAY);
        }
        return GroupOperationResult;
    }

    public void setGroupOperationResult(com.vmware.vim.sms.GroupOperationResult[] GroupOperationResult) {
        this.GroupOperationResult = GroupOperationResult;
    }

}
