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
public class DvsPortReconfiguredEvent
    extends DvsEvent
{

    private final static String[] NULL_PORT_KEY_ARRAY = new String[ 0 ] ;
    public String[] portKey;
    private final static ChangesInfoEventArgument[] NULL_CONFIG_CHANGES_ARRAY = new ChangesInfoEventArgument[ 0 ] ;
    public ChangesInfoEventArgument[] configChanges;

    public String[] getPortKey() {
        if ((portKey) == null) {
            return (NULL_PORT_KEY_ARRAY);
        }
        return portKey;
    }

    public void setPortKey(String[] portKey) {
        this.portKey = portKey;
    }

    public ChangesInfoEventArgument[] getConfigChanges() {
        if ((configChanges) == null) {
            return (NULL_CONFIG_CHANGES_ARRAY);
        }
        return configChanges;
    }

    public void setConfigChanges(ChangesInfoEventArgument[] configChanges) {
        this.configChanges = configChanges;
    }

}
