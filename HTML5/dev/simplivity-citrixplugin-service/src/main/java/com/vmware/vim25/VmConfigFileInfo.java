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
public class VmConfigFileInfo
    extends FileInfo
{

    public Integer configVersion;
    public VmConfigFileEncryptionInfo encryption;

    public Integer getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(Integer configVersion) {
        this.configVersion = configVersion;
    }

    public VmConfigFileEncryptionInfo getEncryption() {
        return encryption;
    }

    public void setEncryption(VmConfigFileEncryptionInfo encryption) {
        this.encryption = encryption;
    }

}