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
public class VirtualSIOControllerOption
    extends VirtualControllerOption
{

    public IntOption numFloppyDrives;
    public IntOption numSerialPorts;
    public IntOption numParallelPorts;

    public IntOption getNumFloppyDrives() {
        return numFloppyDrives;
    }

    public void setNumFloppyDrives(IntOption numFloppyDrives) {
        this.numFloppyDrives = numFloppyDrives;
    }

    public IntOption getNumSerialPorts() {
        return numSerialPorts;
    }

    public void setNumSerialPorts(IntOption numSerialPorts) {
        this.numSerialPorts = numSerialPorts;
    }

    public IntOption getNumParallelPorts() {
        return numParallelPorts;
    }

    public void setNumParallelPorts(IntOption numParallelPorts) {
        this.numParallelPorts = numParallelPorts;
    }

}