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
public class OvfCreateDescriptorParams
    extends DynamicData
{

    private final static OvfFile[] NULL_OVF_FILES_ARRAY = new OvfFile[ 0 ] ;
    public OvfFile[] ovfFiles;
    public String name;
    public String description;
    public Boolean includeImageFiles;
    private final static String[] NULL_EXPORT_OPTION_ARRAY = new String[ 0 ] ;
    public String[] exportOption;
    public ManagedObjectReference snapshot;

    public OvfFile[] getOvfFiles() {
        if ((ovfFiles) == null) {
            return (NULL_OVF_FILES_ARRAY);
        }
        return ovfFiles;
    }

    public void setOvfFiles(OvfFile[] ovfFiles) {
        this.ovfFiles = ovfFiles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIncludeImageFiles() {
        return includeImageFiles;
    }

    public void setIncludeImageFiles(Boolean includeImageFiles) {
        this.includeImageFiles = includeImageFiles;
    }

    public Boolean isIncludeImageFiles() {
        return includeImageFiles;
    }

    public String[] getExportOption() {
        if ((exportOption) == null) {
            return (NULL_EXPORT_OPTION_ARRAY);
        }
        return exportOption;
    }

    public void setExportOption(String[] exportOption) {
        this.exportOption = exportOption;
    }

    public ManagedObjectReference getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(ManagedObjectReference snapshot) {
        this.snapshot = snapshot;
    }

}