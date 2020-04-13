/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.pbm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PbmUtil {

    /**
     * Returns the Storage Resource Type Object
     *
     * @return
     */
    public static PbmProfileResourceType getStorageResourceType() {
        PbmProfileResourceType resourceType = new PbmProfileResourceType();
        resourceType.setResourceType(PbmProfileResourceTypeEnum.STORAGE.toString());
        return resourceType;
    }

    /**
     * Build a PbmCapabilityPropertyInstance Object
     *
     * @param propertyInstanceId
     * @param propertyInstanceValue
     * @return
     */
    public static PbmCapabilityPropertyInstance buildPbmCapabilityPropertyInstance(String propertyInstanceId,
            Object propertyInstanceValue) {
        // Create a New Property Instance based on the Stripe Width Capability
        PbmCapabilityPropertyInstance prop = new PbmCapabilityPropertyInstance();
        prop.setId(propertyInstanceId);
        prop.setValue(propertyInstanceValue);

        return prop;
    }

    /**
     * Build a PbmCapabilityInstance Object
     *
     * @param capabilityUniqueId
     * @param capabilityUniqueNamespace
     * @param propInstances
     * @return
     */
    public static PbmCapabilityInstance buildPbmCapabilityInstance(String capabilityUniqueId,
            String capabilityUniqueNamespace,
            List<PbmCapabilityPropertyInstance> propInstances) {

        // Associate Property Instance with a Rule
        PbmCapabilityConstraintInstance rule = new PbmCapabilityConstraintInstance();
        rule.setPropertyInstance(propInstances.toArray(new PbmCapabilityPropertyInstance[propInstances.size()]));

        // Associate Rule with a Capability Instance
        PbmCapabilityInstance capability = new PbmCapabilityInstance();
        PbmCapabilityMetadataUniqueId metadataUniqueId = new PbmCapabilityMetadataUniqueId();
        metadataUniqueId.setId(capabilityUniqueId);
        metadataUniqueId.setNamespace(capabilityUniqueNamespace);
        capability.setId(metadataUniqueId);

        List<PbmCapabilityConstraintInstance> listCapabilityConstraintInstances = new ArrayList<PbmCapabilityConstraintInstance>();
        if (capability.getConstraint().length > 0) {
            listCapabilityConstraintInstances.addAll(Arrays.asList(capability.getConstraint()));
        }
        listCapabilityConstraintInstances.add(rule);

        capability.setConstraint(listCapabilityConstraintInstances
                .toArray(new PbmCapabilityConstraintInstance[listCapabilityConstraintInstances.size()]));

        return capability;
    }

}

