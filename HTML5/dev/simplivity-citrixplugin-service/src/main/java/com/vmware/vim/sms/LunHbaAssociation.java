//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostHostBusAdapter;


/**
 * 
 */
@SuppressWarnings("all")
public class LunHbaAssociation
    extends DynamicData
{

    public String canonicalName;
    private final static HostHostBusAdapter[] NULL_HBA_ARRAY = new HostHostBusAdapter[ 0 ] ;
    public HostHostBusAdapter[] hba;

    public String getCanonicalName() {
        return canonicalName;
    }

    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
    }

    public HostHostBusAdapter[] getHba() {
        if ((hba) == null) {
            return (NULL_HBA_ARRAY);
        }
        return hba;
    }

    public void setHba(HostHostBusAdapter[] hba) {
        this.hba = hba;
    }

}
