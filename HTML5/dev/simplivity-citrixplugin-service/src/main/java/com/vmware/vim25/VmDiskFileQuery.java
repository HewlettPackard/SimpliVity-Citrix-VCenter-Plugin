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
public class VmDiskFileQuery
    extends FileQuery
{

    public VmDiskFileQueryFilter filter;
    public VmDiskFileQueryFlags details;

    public VmDiskFileQueryFilter getFilter() {
        return filter;
    }

    public void setFilter(VmDiskFileQueryFilter filter) {
        this.filter = filter;
    }

    public VmDiskFileQueryFlags getDetails() {
        return details;
    }

    public void setDetails(VmDiskFileQueryFlags details) {
        this.details = details;
    }

}
