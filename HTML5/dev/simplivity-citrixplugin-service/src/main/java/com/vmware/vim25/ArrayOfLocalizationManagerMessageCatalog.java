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
public class ArrayOfLocalizationManagerMessageCatalog {

    private final static com.vmware.vim25.LocalizationManagerMessageCatalog[] NULL_LOCALIZATION_MANAGER_MESSAGE_CATALOG_ARRAY = new com.vmware.vim25.LocalizationManagerMessageCatalog[ 0 ] ;
    public com.vmware.vim25.LocalizationManagerMessageCatalog[] LocalizationManagerMessageCatalog;

    public com.vmware.vim25.LocalizationManagerMessageCatalog[] getLocalizationManagerMessageCatalog() {
        if ((LocalizationManagerMessageCatalog) == null) {
            return (NULL_LOCALIZATION_MANAGER_MESSAGE_CATALOG_ARRAY);
        }
        return LocalizationManagerMessageCatalog;
    }

    public void setLocalizationManagerMessageCatalog(com.vmware.vim25.LocalizationManagerMessageCatalog[] LocalizationManagerMessageCatalog) {
        this.LocalizationManagerMessageCatalog = LocalizationManagerMessageCatalog;
    }

}
