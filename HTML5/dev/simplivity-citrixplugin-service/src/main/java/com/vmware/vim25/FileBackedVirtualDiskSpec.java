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
public class FileBackedVirtualDiskSpec
    extends VirtualDiskSpec
{

    public long capacityKb;
    private final static VirtualMachineProfileSpec[] NULL_PROFILE_ARRAY = new VirtualMachineProfileSpec[ 0 ] ;
    public VirtualMachineProfileSpec[] profile;
    public CryptoSpec crypto;

    public long getCapacityKb() {
        return capacityKb;
    }

    public void setCapacityKb(long capacityKb) {
        this.capacityKb = capacityKb;
    }

    public VirtualMachineProfileSpec[] getProfile() {
        if ((profile) == null) {
            return (NULL_PROFILE_ARRAY);
        }
        return profile;
    }

    public void setProfile(VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

    public CryptoSpec getCrypto() {
        return crypto;
    }

    public void setCrypto(CryptoSpec crypto) {
        this.crypto = crypto;
    }

}
