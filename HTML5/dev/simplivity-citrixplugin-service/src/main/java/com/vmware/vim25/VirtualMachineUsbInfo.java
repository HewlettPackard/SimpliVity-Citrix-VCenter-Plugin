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
public class VirtualMachineUsbInfo
    extends VirtualMachineTargetInfo
{

    public String description;
    public int vendor;
    public int product;
    public String physicalPath;
    private final static String[] NULL_FAMILY_ARRAY = new String[ 0 ] ;
    public String[] family;
    private final static String[] NULL_SPEED_ARRAY = new String[ 0 ] ;
    public String[] speed;
    public VirtualMachineSummary summary;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVendor() {
        return vendor;
    }

    public void setVendor(int vendor) {
        this.vendor = vendor;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public String getPhysicalPath() {
        return physicalPath;
    }

    public void setPhysicalPath(String physicalPath) {
        this.physicalPath = physicalPath;
    }

    public String[] getFamily() {
        if ((family) == null) {
            return (NULL_FAMILY_ARRAY);
        }
        return family;
    }

    public void setFamily(String[] family) {
        this.family = family;
    }

    public String[] getSpeed() {
        if ((speed) == null) {
            return (NULL_SPEED_ARRAY);
        }
        return speed;
    }

    public void setSpeed(String[] speed) {
        this.speed = speed;
    }

    public VirtualMachineSummary getSummary() {
        return summary;
    }

    public void setSummary(VirtualMachineSummary summary) {
        this.summary = summary;
    }

}