/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.vim25.mo;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vmware.pbm.PbmCapabilityMetadataPerCategory;
import com.vmware.pbm.PbmFault;
import com.vmware.pbm.PbmProfile;
import com.vmware.pbm.PbmProfileId;
import com.vmware.pbm.PbmProfileResourceType;
import com.vmware.pbm.PbmServerObjectRef;
import com.vmware.vim25.InvalidArgument;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;

public class PbmProfileProfileManager extends ManagedObject {
    public PbmProfileProfileManager(ServerConnection sc, ManagedObjectReference mor)
    {
        super(sc, mor);
    }

    public List<PbmCapabilityMetadataPerCategory> fetchCapabilityMetadata(PbmProfileResourceType resourceType, String vendorUuid)
        throws RemoteException, RuntimeFault {
        List<PbmCapabilityMetadataPerCategory> metadata = new ArrayList();

        PbmCapabilityMetadataPerCategory[] categories = getPbmService().fetchCapabilityMetadata(getMOR(), resourceType, vendorUuid);
        if (categories != null) {
            metadata.addAll(Arrays.asList(categories));
        }

        return metadata;
    }

    public List<PbmProfile> getProfiles(PbmProfileResourceType resourceType, String profileCategory) throws RemoteException, InvalidArgument, RuntimeFault {
        List<PbmProfile> profiles = new ArrayList();

        List<PbmProfileId> profileIds = queryProfile(resourceType, profileCategory);
        if (!profileIds.isEmpty()) {
            for (PbmProfile profile : retrieveContent(profileIds)) {
                profiles.add(profile);
            }
        }

        return profiles;
    }

    public List<PbmProfileId> queryProfile(PbmProfileResourceType resourceType, String profileCategory) throws RemoteException, InvalidArgument, RuntimeFault {
        List<PbmProfileId> profileIds = new ArrayList();

        PbmProfileId[] ids = getPbmService().queryProfile(getMOR(), resourceType, profileCategory);
        if (ids != null) {
            profileIds.addAll(Arrays.asList(ids));
        }

        return profileIds;
    }

    public List<PbmProfile> retrieveContent(List<PbmProfileId> profileIds) throws RemoteException, InvalidArgument, RuntimeFault {
        List<PbmProfile> profiles = new ArrayList();

        PbmProfile[] profileArray = getPbmService().retrieveContent(getMOR(), profileIds.toArray(new PbmProfileId[] {}));
        if (profileArray != null) {
            profiles.addAll(Arrays.asList(profileArray));
        }

        return profiles;
    }

    public List<PbmProfileId> queryAssociatedProfile(PbmServerObjectRef entity) throws RemoteException, PbmFault, RuntimeFault {
        List<PbmProfileId> profileIds = new ArrayList();

        PbmProfileId[] ids = getPbmService().queryAssociatedProfile(getMOR(), entity);
        if (ids != null) {
            profileIds.addAll(Arrays.asList(ids));
        }

        return profileIds;
    }
}
