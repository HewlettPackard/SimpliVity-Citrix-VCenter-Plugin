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
public class ArrayOfScsiLunDurableName {

    private final static com.vmware.vim25.ScsiLunDurableName[] NULL_SCSI_LUN_DURABLE_NAME_ARRAY = new com.vmware.vim25.ScsiLunDurableName[ 0 ] ;
    public com.vmware.vim25.ScsiLunDurableName[] ScsiLunDurableName;

    public com.vmware.vim25.ScsiLunDurableName[] getScsiLunDurableName() {
        if ((ScsiLunDurableName) == null) {
            return (NULL_SCSI_LUN_DURABLE_NAME_ARRAY);
        }
        return ScsiLunDurableName;
    }

    public void setScsiLunDurableName(com.vmware.vim25.ScsiLunDurableName[] ScsiLunDurableName) {
        this.ScsiLunDurableName = ScsiLunDurableName;
    }

}
