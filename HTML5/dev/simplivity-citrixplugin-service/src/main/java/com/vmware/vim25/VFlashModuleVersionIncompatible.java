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
public class VFlashModuleVersionIncompatible
    extends VimFault
{

    public String moduleName;
    public String vmRequestModuleVersion;
    public String hostMinSupportedVerson;
    public String hostModuleVersion;

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getVmRequestModuleVersion() {
        return vmRequestModuleVersion;
    }

    public void setVmRequestModuleVersion(String vmRequestModuleVersion) {
        this.vmRequestModuleVersion = vmRequestModuleVersion;
    }

    public String getHostMinSupportedVerson() {
        return hostMinSupportedVerson;
    }

    public void setHostMinSupportedVerson(String hostMinSupportedVerson) {
        this.hostMinSupportedVerson = hostMinSupportedVerson;
    }

    public String getHostModuleVersion() {
        return hostModuleVersion;
    }

    public void setHostModuleVersion(String hostModuleVersion) {
        this.hostModuleVersion = hostModuleVersion;
    }

}
