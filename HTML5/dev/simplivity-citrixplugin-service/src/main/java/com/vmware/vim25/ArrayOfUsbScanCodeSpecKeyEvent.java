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
public class ArrayOfUsbScanCodeSpecKeyEvent {

    private final static com.vmware.vim25.UsbScanCodeSpecKeyEvent[] NULL_USB_SCAN_CODE_SPEC_KEY_EVENT_ARRAY = new com.vmware.vim25.UsbScanCodeSpecKeyEvent[ 0 ] ;
    public com.vmware.vim25.UsbScanCodeSpecKeyEvent[] UsbScanCodeSpecKeyEvent;

    public com.vmware.vim25.UsbScanCodeSpecKeyEvent[] getUsbScanCodeSpecKeyEvent() {
        if ((UsbScanCodeSpecKeyEvent) == null) {
            return (NULL_USB_SCAN_CODE_SPEC_KEY_EVENT_ARRAY);
        }
        return UsbScanCodeSpecKeyEvent;
    }

    public void setUsbScanCodeSpecKeyEvent(com.vmware.vim25.UsbScanCodeSpecKeyEvent[] UsbScanCodeSpecKeyEvent) {
        this.UsbScanCodeSpecKeyEvent = UsbScanCodeSpecKeyEvent;
    }

}