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
public class ArrayOfMethodActionArgument {

    private final static com.vmware.vim25.MethodActionArgument[] NULL_METHOD_ACTION_ARGUMENT_ARRAY = new com.vmware.vim25.MethodActionArgument[ 0 ] ;
    public com.vmware.vim25.MethodActionArgument[] MethodActionArgument;

    public com.vmware.vim25.MethodActionArgument[] getMethodActionArgument() {
        if ((MethodActionArgument) == null) {
            return (NULL_METHOD_ACTION_ARGUMENT_ARRAY);
        }
        return MethodActionArgument;
    }

    public void setMethodActionArgument(com.vmware.vim25.MethodActionArgument[] MethodActionArgument) {
        this.MethodActionArgument = MethodActionArgument;
    }

}
