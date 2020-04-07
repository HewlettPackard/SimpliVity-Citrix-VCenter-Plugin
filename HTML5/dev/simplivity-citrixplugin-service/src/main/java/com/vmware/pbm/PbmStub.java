/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.pbm;

import com.vmware.vim25.InvalidArgument;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.ws.Argument;
import com.vmware.vim25.ws.WSClient;

public class PbmStub {
    private WSClient wsc;

    public PbmStub(String url, boolean ignoreCert, String sessionStr) throws java.net.MalformedURLException {
        this.wsc = new WSClient(url, ignoreCert);
        wsc.setSoapAction(WSClient.PBM_SOAP_ACTION);
        wsc.setCookie(sessionStr);
    }

    public WSClient getWsc() {
        return wsc;
    }

    public PbmCapabilityMetadataPerCategory[] fetchCapabilityMetadata(ManagedObjectReference _this, PbmProfileResourceType resourceType,
            String vendorUuid) throws java.rmi.RemoteException, RuntimeFault {
        Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("resourceType", "PbmProfileResourceType", resourceType);
        paras[2] = new Argument("vendorUuid", "String", vendorUuid);
        return (PbmCapabilityMetadataPerCategory[]) wsc.invoke("PbmFetchCapabilityMetadata", paras, "PbmCapabilityMetadataPerCategory[]", WSClient.PBM_NAMESPACE);
    }

    public PbmProfile[] retrieveContent(ManagedObjectReference _this, PbmProfileId[] profileIds) throws java.rmi.RemoteException, RuntimeFault, InvalidArgument {
        Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("profileIds", "PbmProfileId[]", profileIds);
        return (PbmProfile[]) wsc.invoke("PbmRetrieveContent", paras, "PbmProfile[]", WSClient.PBM_NAMESPACE);
    }

    public PbmProfileId[] queryProfile(ManagedObjectReference _this, PbmProfileResourceType resourceType, String profileCategory)
            throws java.rmi.RemoteException, RuntimeFault, InvalidArgument {
        Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("resourceType", "PbmProfileResourceType", resourceType);
        paras[2] = new Argument("profileCategory", "String", profileCategory);
        return (PbmProfileId[]) wsc.invoke("PbmQueryProfile", paras, "PbmProfileId[]", WSClient.PBM_NAMESPACE);
    }

    public PbmProfileId[] queryAssociatedProfile(ManagedObjectReference _this, PbmServerObjectRef entity) throws java.rmi.RemoteException, PbmFault, RuntimeFault {
        Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "PbmServerObjectRef", entity);
        return (PbmProfileId[]) wsc.invoke("PbmQueryAssociatedProfile", paras, "PbmProfileId[]", WSClient.PBM_NAMESPACE);
    }

    public PbmCapabilityVendorResourceTypeInfo[] fetchVendorInfo(ManagedObjectReference _this,
            PbmProfileResourceType entity) throws java.rmi.RemoteException, PbmFault, RuntimeFault {
        Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("resourceType", "PbmProfileResourceType", entity);
        return (PbmCapabilityVendorResourceTypeInfo[]) wsc.invoke("PbmFetchVendorInfo", paras,
                "PbmCapabilityVendorResourceTypeInfo[]", WSClient.PBM_NAMESPACE);
    }

    public PbmProfileId createProfile(ManagedObjectReference _this, PbmCapabilityProfileCreateSpec entity)
            throws java.rmi.RemoteException, PbmFault, RuntimeFault {
        Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("createSpec", "PbmCapabilityProfileCreateSpec", entity);
        return (PbmProfileId) wsc.invoke("PbmCreate", paras, "PbmProfileId", WSClient.PBM_NAMESPACE);
    }

    public PbmProfileOperationOutcome[] deleteProfile(ManagedObjectReference _this, PbmProfileId[] entity)
            throws java.rmi.RemoteException, PbmFault, RuntimeFault {
        Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("profileId", "ArrayOfPbmProfileId", entity);
        return (PbmProfileOperationOutcome[]) wsc.invoke("PbmDelete", paras, "PbmProfileOperationOutcome[]",
                WSClient.PBM_NAMESPACE);
    }
}
