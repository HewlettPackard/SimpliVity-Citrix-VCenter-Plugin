/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.vim25.mo;

import java.rmi.RemoteException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.nimblestorage.hi.utils.Logger;
import com.vmware.vim25.DynamicProperty;
import com.vmware.vim25.InvalidProperty;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ObjectContent;
import com.vmware.vim25.ObjectSpec;
import com.vmware.vim25.PropertyFilterSpec;
import com.vmware.vim25.PropertySpec;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.SelectionSpec;
import com.vmware.vim25.mo.util.MorUtil;
import com.vmware.vim25.mo.util.PropertyCollectorUtil;

public class InventoryNavigator
{
    private static final Logger logger = Logger.getLogger(InventoryNavigator.class);

	private ManagedEntity rootEntity = null;
	private SelectionSpec[] selectionSpecs = null;

	public InventoryNavigator(ManagedEntity rootEntity)
	{
		this.rootEntity = rootEntity;
	}

	public void setSelectionSpecs(SelectionSpec[] selectionSpecs) {
		this.selectionSpecs = selectionSpecs;
	}

	/**
	 * Retrieve container contents from specified parent recursively if requested.
	 * @param recurse retrieve contents recursively from the root down
	 * @throws RemoteException
	 * @throws RuntimeFault
	 * @throws InvalidProperty
	 */
	public ManagedEntity[] searchManagedEntities(boolean recurse) throws InvalidProperty, RuntimeFault, RemoteException
	{
		String[][] typeinfo = new String[][] { new String[] { "ManagedEntity", }};
		return searchManagedEntities(typeinfo, recurse);
	}

	/**
    * Get the first ManagedObjectReference from current node for the specified type
    */
	public ManagedEntity[] searchManagedEntities(String type) throws InvalidProperty, RuntimeFault, RemoteException
	{
		String[][] typeinfo = new String[][] { new String[] { type,  "name",}, };
		return searchManagedEntities(typeinfo, true);
	}

	/**
	* Retrieve content recursively with multiple properties.
	* the typeinfo array contains typename + properties to retrieve.
	*
	* @param typeinfo 2D array of properties for each typename
	* @param recurse retrieve contents recursively from the root down
	*
	* @return retrieved object contents
	 * @throws RemoteException
	 * @throws RuntimeFault
	 * @throws InvalidProperty
	*/
	public ManagedEntity[] searchManagedEntities(String[][] typeinfo, boolean recurse ) throws InvalidProperty, RuntimeFault, RemoteException
	{
		ObjectContent[] ocs = retrieveObjectContents(typeinfo, recurse);
		return createManagedEntities(ocs);
	}

    private ObjectContent[] retrieveObjectContents(String[][] typeinfo, boolean recurse) throws InvalidProperty,
            RuntimeFault, RemoteException {
        if (typeinfo == null || typeinfo.length == 0) {
            return null;
        }

        PropertyCollector pc = rootEntity.getServerConnection().getServiceInstance().getPropertyCollector();

        if (recurse && selectionSpecs == null) {
            // Nimble Storage only supports vSphere 4.0 and above
            selectionSpecs = PropertyCollectorUtil.buildFullTraversal();
        }

        PropertySpec[] propspecary = PropertyCollectorUtil.buildPropertySpecArray(typeinfo);

        ObjectSpec os = new ObjectSpec();
        os.setObj(rootEntity.getMOR());
        os.setSkip(Boolean.FALSE);
        os.setSelectSet(selectionSpecs);

        PropertyFilterSpec spec = new PropertyFilterSpec();
        spec.setObjectSet(new ObjectSpec[] { os });
        spec.setPropSet(propspecary);

        return pc.retrieveProperties(new PropertyFilterSpec[] { spec });
	}

	private ManagedEntity[] createManagedEntities(ObjectContent[] ocs)
	{
		if(ocs==null)
		{
			return new ManagedEntity[] {};
		}
		ManagedEntity[] mes = new ManagedEntity[ocs.length];

		for(int i=0; i<mes.length; i++)
		{
			ManagedObjectReference mor = ocs[i].getObj();
			mes[i] = MorUtil.createExactManagedEntity(rootEntity.getServerConnection(), mor);
		}
		return mes;
	}

   /**
    * Get the ManagedObjectReference for an item under the
    * specified parent node that has the type and name specified.
    *
    * @param type type of the managed object
    * @param name name to match
    * @return First ManagedEntity object of the type / name pair found
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidProperty
    */
	public ManagedEntity searchManagedEntity(String type, String name) throws InvalidProperty, RuntimeFault, RemoteException
	{
		if (name == null || name.length() == 0)
		{
			return null;
		}

		if(type==null)
		{
			type = "ManagedEntity";
		}

		String[][] typeinfo = new String[][] { new String[] { type,  "name",}, };

		ObjectContent[] ocs = retrieveObjectContents(typeinfo, true);

		if (ocs==null || ocs.length == 0)
		{
			return null;
		}

		for (int i = 0; i < ocs.length; i++)
		{
			DynamicProperty[] propSet = ocs[i].getPropSet();

			// This is null if the property has not been configured on the object yet
			if (propSet == null) {
                ManagedObjectReference moref = ocs[i].getObj();
                logger.debug("PropSet for moref {0} requesting name {1} and type {2} returned null", moref, name, type);
			    continue;
			}

			if (propSet.length > 0)
			{
				String nameInPropSet = (String) propSet[0].getVal();
				if(name.equalsIgnoreCase(nameInPropSet))
				{
					ManagedObjectReference mor = ocs[i].getObj();
					return MorUtil.createExactManagedEntity(rootEntity.getServerConnection(), mor);
				}
			}
		}
		return null;
	}

   /**
    * Get the ManagedObjectReference for an item under the
    * specified parent node that has the key and value specified.
    *
    * @param type type of the managed object
    * @param property the property which to retrieve from the managed entity
    * @return First ManagedEntity object of the type / property-value found
    *
    * @throws RemoteException
    * @throws RuntimeFault
    * @throws InvalidProperty
    */
   /* public ManagedEntity searchManagedEntity(String type, String property, String value) throws InvalidProperty, RuntimeFault, RemoteException {
        List<ManagedEntity> mes = searchManagedEntities(type, property, Lists.newArrayList(value));
        if (mes.isEmpty()) {
            return null;
        } else if (mes.size() > 1) {
            throw new IllegalStateException(
                    MessageFormat.format("More than one managed entity found for property {0} with value {1}", property, value));
        }

        return mes.get(0);
    }*/

   /* public List<ManagedEntity> searchManagedEntities(String type, String property, List<String> values) throws InvalidProperty, RuntimeFault, RemoteException {
        if (Strings.isNullOrEmpty(property) || values.isEmpty()) {
            return Collections.emptyList();
        }

        if (type == null) {
            type = "ManagedEntity";
        }

        String[][] typeinfo = new String[][] { new String[] { type, property, }, };

        ObjectContent[] ocs = retrieveObjectContents(typeinfo, true);

        if (ocs == null || ocs.length == 0) {
            return Collections.emptyList();
        }

        Set<String> propertyValues = values.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        int numOfManagedEntitiesFound = 0;

        List<ManagedEntity> mes = new ArrayList<>();

        for (int i = 0; i < ocs.length; i++) {
            DynamicProperty[] propSet = ocs[i].getPropSet();

            // This is null if the property has not been configured on the object yet
            if (propSet == null) {
                ManagedObjectReference moref = ocs[i].getObj();
                logger.debug("PropSet for moref {0} requesting type {1} and property {2} returned null", moref, type, property);
                continue;
            }

            if (propSet.length > 0) {
                String valueInPropSet = (String) propSet[0].getVal();
                if (propertyValues.contains(valueInPropSet.toLowerCase())) {
                    ManagedObjectReference mor = ocs[i].getObj();
                    mes.add(MorUtil.createExactManagedEntity(rootEntity.getServerConnection(), mor));
                    numOfManagedEntitiesFound++;

                    if (numOfManagedEntitiesFound == propertyValues.size()) {
                        // Found all managed entities
                        break;
                    }
                }
            }
        }

        return mes;
    }*/
}
