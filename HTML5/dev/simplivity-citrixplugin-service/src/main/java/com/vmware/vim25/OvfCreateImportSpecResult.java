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
public class OvfCreateImportSpecResult
    extends DynamicData
{

    public ImportSpec importSpec;
    private final static OvfFileItem[] NULL_FILE_ITEM_ARRAY = new OvfFileItem[ 0 ] ;
    public OvfFileItem[] fileItem;
    private final static LocalizedMethodFault[] NULL_WARNING_ARRAY = new LocalizedMethodFault[ 0 ] ;
    public LocalizedMethodFault[] warning;
    private final static LocalizedMethodFault[] NULL_ERROR_ARRAY = new LocalizedMethodFault[ 0 ] ;
    public LocalizedMethodFault[] error;

    public ImportSpec getImportSpec() {
        return importSpec;
    }

    public void setImportSpec(ImportSpec importSpec) {
        this.importSpec = importSpec;
    }

    public OvfFileItem[] getFileItem() {
        if ((fileItem) == null) {
            return (NULL_FILE_ITEM_ARRAY);
        }
        return fileItem;
    }

    public void setFileItem(OvfFileItem[] fileItem) {
        this.fileItem = fileItem;
    }

    public LocalizedMethodFault[] getWarning() {
        if ((warning) == null) {
            return (NULL_WARNING_ARRAY);
        }
        return warning;
    }

    public void setWarning(LocalizedMethodFault[] warning) {
        this.warning = warning;
    }

    public LocalizedMethodFault[] getError() {
        if ((error) == null) {
            return (NULL_ERROR_ARRAY);
        }
        return error;
    }

    public void setError(LocalizedMethodFault[] error) {
        this.error = error;
    }

}
