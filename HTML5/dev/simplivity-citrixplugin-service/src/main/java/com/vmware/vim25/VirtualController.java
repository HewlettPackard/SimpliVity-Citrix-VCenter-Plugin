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
public class VirtualController
    extends VirtualDevice
{

    public int busNumber;
    private final static int[] NULL_DEVICE_ARRAY = new int[ 0 ] ;
    public int[] device;

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public int[] getDevice() {
        if ((device) == null) {
            return (NULL_DEVICE_ARRAY);
        }
        return device;
    }

    public void setDevice(int[] device) {
        this.device = device;
    }

}
