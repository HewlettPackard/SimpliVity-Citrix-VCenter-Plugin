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
public class ArrayOfHostUnresolvedVmfsResolutionResult {

    private final static com.vmware.vim25.HostUnresolvedVmfsResolutionResult[] NULL_HOST_UNRESOLVED_VMFS_RESOLUTION_RESULT_ARRAY = new com.vmware.vim25.HostUnresolvedVmfsResolutionResult[ 0 ] ;
    public com.vmware.vim25.HostUnresolvedVmfsResolutionResult[] HostUnresolvedVmfsResolutionResult;

    public com.vmware.vim25.HostUnresolvedVmfsResolutionResult[] getHostUnresolvedVmfsResolutionResult() {
        if ((HostUnresolvedVmfsResolutionResult) == null) {
            return (NULL_HOST_UNRESOLVED_VMFS_RESOLUTION_RESULT_ARRAY);
        }
        return HostUnresolvedVmfsResolutionResult;
    }

    public void setHostUnresolvedVmfsResolutionResult(com.vmware.vim25.HostUnresolvedVmfsResolutionResult[] HostUnresolvedVmfsResolutionResult) {
        this.HostUnresolvedVmfsResolutionResult = HostUnresolvedVmfsResolutionResult;
    }

}
