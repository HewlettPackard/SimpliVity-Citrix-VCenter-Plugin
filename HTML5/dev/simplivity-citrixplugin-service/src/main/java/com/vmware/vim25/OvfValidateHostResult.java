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
public class OvfValidateHostResult
    extends DynamicData
{

    public Long downloadSize;
    public Long flatDeploymentSize;
    public Long sparseDeploymentSize;
    private final static LocalizedMethodFault[] NULL_ERROR_ARRAY = new LocalizedMethodFault[ 0 ] ;
    public LocalizedMethodFault[] error;
    private final static LocalizedMethodFault[] NULL_WARNING_ARRAY = new LocalizedMethodFault[ 0 ] ;
    public LocalizedMethodFault[] warning;
    private final static String[] NULL_SUPPORTED_DISK_PROVISIONING_ARRAY = new String[ 0 ] ;
    public String[] supportedDiskProvisioning;

    public Long getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Long downloadSize) {
        this.downloadSize = downloadSize;
    }

    public Long getFlatDeploymentSize() {
        return flatDeploymentSize;
    }

    public void setFlatDeploymentSize(Long flatDeploymentSize) {
        this.flatDeploymentSize = flatDeploymentSize;
    }

    public Long getSparseDeploymentSize() {
        return sparseDeploymentSize;
    }

    public void setSparseDeploymentSize(Long sparseDeploymentSize) {
        this.sparseDeploymentSize = sparseDeploymentSize;
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

    public LocalizedMethodFault[] getWarning() {
        if ((warning) == null) {
            return (NULL_WARNING_ARRAY);
        }
        return warning;
    }

    public void setWarning(LocalizedMethodFault[] warning) {
        this.warning = warning;
    }

    public String[] getSupportedDiskProvisioning() {
        if ((supportedDiskProvisioning) == null) {
            return (NULL_SUPPORTED_DISK_PROVISIONING_ARRAY);
        }
        return supportedDiskProvisioning;
    }

    public void setSupportedDiskProvisioning(String[] supportedDiskProvisioning) {
        this.supportedDiskProvisioning = supportedDiskProvisioning;
    }

}
