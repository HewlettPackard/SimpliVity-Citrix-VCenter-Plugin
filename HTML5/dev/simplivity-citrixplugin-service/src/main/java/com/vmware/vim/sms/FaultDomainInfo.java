//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 09:16:35 AM EDT 
//


package com.vmware.vim.sms;

import com.vmware.vim25.FaultDomainId;
import com.vmware.vim25.ManagedObjectReference;


/**
 * 
 */
@SuppressWarnings("all")
public class FaultDomainInfo
    extends FaultDomainId
{

    public String name;
    public String description;
    public String storageArrayId;
    private final static FaultDomainId[] NULL_CHILDREN_ARRAY = new FaultDomainId[ 0 ] ;
    public FaultDomainId[] children;
    public ManagedObjectReference provider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStorageArrayId() {
        return storageArrayId;
    }

    public void setStorageArrayId(String storageArrayId) {
        this.storageArrayId = storageArrayId;
    }

    public FaultDomainId[] getChildren() {
        if ((children) == null) {
            return (NULL_CHILDREN_ARRAY);
        }
        return children;
    }

    public void setChildren(FaultDomainId[] children) {
        this.children = children;
    }

    public ManagedObjectReference getProvider() {
        return provider;
    }

    public void setProvider(ManagedObjectReference provider) {
        this.provider = provider;
    }

}
