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
public class ArrayOfScsiLunDescriptor {

    private final static com.vmware.vim25.ScsiLunDescriptor[] NULL_SCSI_LUN_DESCRIPTOR_ARRAY = new com.vmware.vim25.ScsiLunDescriptor[ 0 ] ;
    public com.vmware.vim25.ScsiLunDescriptor[] ScsiLunDescriptor;

    public com.vmware.vim25.ScsiLunDescriptor[] getScsiLunDescriptor() {
        if ((ScsiLunDescriptor) == null) {
            return (NULL_SCSI_LUN_DESCRIPTOR_ARRAY);
        }
        return ScsiLunDescriptor;
    }

    public void setScsiLunDescriptor(com.vmware.vim25.ScsiLunDescriptor[] ScsiLunDescriptor) {
        this.ScsiLunDescriptor = ScsiLunDescriptor;
    }

}
