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
public class ArrayOfChangesInfoEventArgument {

    private final static com.vmware.vim25.ChangesInfoEventArgument[] NULL_CHANGES_INFO_EVENT_ARGUMENT_ARRAY = new com.vmware.vim25.ChangesInfoEventArgument[ 0 ] ;
    public com.vmware.vim25.ChangesInfoEventArgument[] ChangesInfoEventArgument;

    public com.vmware.vim25.ChangesInfoEventArgument[] getChangesInfoEventArgument() {
        if ((ChangesInfoEventArgument) == null) {
            return (NULL_CHANGES_INFO_EVENT_ARGUMENT_ARRAY);
        }
        return ChangesInfoEventArgument;
    }

    public void setChangesInfoEventArgument(com.vmware.vim25.ChangesInfoEventArgument[] ChangesInfoEventArgument) {
        this.ChangesInfoEventArgument = ChangesInfoEventArgument;
    }

}
