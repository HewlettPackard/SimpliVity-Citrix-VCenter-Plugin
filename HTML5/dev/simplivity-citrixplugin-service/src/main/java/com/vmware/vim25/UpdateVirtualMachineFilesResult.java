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
public class UpdateVirtualMachineFilesResult
    extends DynamicData
{

    private final static UpdateVirtualMachineFilesResultFailedVmFileInfo[] NULL_FAILED_VM_FILE_ARRAY = new UpdateVirtualMachineFilesResultFailedVmFileInfo[ 0 ] ;
    public UpdateVirtualMachineFilesResultFailedVmFileInfo[] failedVmFile;

    public UpdateVirtualMachineFilesResultFailedVmFileInfo[] getFailedVmFile() {
        if ((failedVmFile) == null) {
            return (NULL_FAILED_VM_FILE_ARRAY);
        }
        return failedVmFile;
    }

    public void setFailedVmFile(UpdateVirtualMachineFilesResultFailedVmFileInfo[] failedVmFile) {
        this.failedVmFile = failedVmFile;
    }

}
