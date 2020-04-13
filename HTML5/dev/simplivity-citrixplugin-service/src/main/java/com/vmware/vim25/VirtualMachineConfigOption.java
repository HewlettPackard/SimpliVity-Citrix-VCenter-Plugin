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
public class VirtualMachineConfigOption
    extends DynamicData
{

    public String version;
    public String description;
    private final static GuestOsDescriptor[] NULL_GUEST_OS_DESCRIPTOR_ARRAY = new GuestOsDescriptor[ 0 ] ;
    public GuestOsDescriptor[] guestOSDescriptor;
    public int guestOSDefaultIndex;
    public VirtualHardwareOption hardwareOptions;
    public VirtualMachineCapability capabilities;
    public DatastoreOption datastore;
    private final static VirtualDevice[] NULL_DEFAULT_DEVICE_ARRAY = new VirtualDevice[ 0 ] ;
    public VirtualDevice[] defaultDevice;
    private final static String[] NULL_SUPPORTED_MONITOR_TYPE_ARRAY = new String[ 0 ] ;
    public String[] supportedMonitorType;
    private final static String[] NULL_SUPPORTED_OVF_ENVIRONMENT_TRANSPORT_ARRAY = new String[ 0 ] ;
    public String[] supportedOvfEnvironmentTransport;
    private final static String[] NULL_SUPPORTED_OVF_INSTALL_TRANSPORT_ARRAY = new String[ 0 ] ;
    public String[] supportedOvfInstallTransport;
    private final static VirtualMachinePropertyRelation[] NULL_PROPERTY_RELATIONS_ARRAY = new VirtualMachinePropertyRelation[ 0 ] ;
    public VirtualMachinePropertyRelation[] propertyRelations;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GuestOsDescriptor[] getGuestOSDescriptor() {
        if ((guestOSDescriptor) == null) {
            return (NULL_GUEST_OS_DESCRIPTOR_ARRAY);
        }
        return guestOSDescriptor;
    }

    public void setGuestOSDescriptor(GuestOsDescriptor[] guestOSDescriptor) {
        this.guestOSDescriptor = guestOSDescriptor;
    }

    public int getGuestOSDefaultIndex() {
        return guestOSDefaultIndex;
    }

    public void setGuestOSDefaultIndex(int guestOSDefaultIndex) {
        this.guestOSDefaultIndex = guestOSDefaultIndex;
    }

    public VirtualHardwareOption getHardwareOptions() {
        return hardwareOptions;
    }

    public void setHardwareOptions(VirtualHardwareOption hardwareOptions) {
        this.hardwareOptions = hardwareOptions;
    }

    public VirtualMachineCapability getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(VirtualMachineCapability capabilities) {
        this.capabilities = capabilities;
    }

    public DatastoreOption getDatastore() {
        return datastore;
    }

    public void setDatastore(DatastoreOption datastore) {
        this.datastore = datastore;
    }

    public VirtualDevice[] getDefaultDevice() {
        if ((defaultDevice) == null) {
            return (NULL_DEFAULT_DEVICE_ARRAY);
        }
        return defaultDevice;
    }

    public void setDefaultDevice(VirtualDevice[] defaultDevice) {
        this.defaultDevice = defaultDevice;
    }

    public String[] getSupportedMonitorType() {
        if ((supportedMonitorType) == null) {
            return (NULL_SUPPORTED_MONITOR_TYPE_ARRAY);
        }
        return supportedMonitorType;
    }

    public void setSupportedMonitorType(String[] supportedMonitorType) {
        this.supportedMonitorType = supportedMonitorType;
    }

    public String[] getSupportedOvfEnvironmentTransport() {
        if ((supportedOvfEnvironmentTransport) == null) {
            return (NULL_SUPPORTED_OVF_ENVIRONMENT_TRANSPORT_ARRAY);
        }
        return supportedOvfEnvironmentTransport;
    }

    public void setSupportedOvfEnvironmentTransport(String[] supportedOvfEnvironmentTransport) {
        this.supportedOvfEnvironmentTransport = supportedOvfEnvironmentTransport;
    }

    public String[] getSupportedOvfInstallTransport() {
        if ((supportedOvfInstallTransport) == null) {
            return (NULL_SUPPORTED_OVF_INSTALL_TRANSPORT_ARRAY);
        }
        return supportedOvfInstallTransport;
    }

    public void setSupportedOvfInstallTransport(String[] supportedOvfInstallTransport) {
        this.supportedOvfInstallTransport = supportedOvfInstallTransport;
    }

    public VirtualMachinePropertyRelation[] getPropertyRelations() {
        if ((propertyRelations) == null) {
            return (NULL_PROPERTY_RELATIONS_ARRAY);
        }
        return propertyRelations;
    }

    public void setPropertyRelations(VirtualMachinePropertyRelation[] propertyRelations) {
        this.propertyRelations = propertyRelations;
    }

}
