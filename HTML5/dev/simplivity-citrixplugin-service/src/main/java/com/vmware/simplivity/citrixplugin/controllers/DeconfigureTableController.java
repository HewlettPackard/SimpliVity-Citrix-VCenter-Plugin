/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

package com.vmware.simplivity.citrixplugin.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vmware.simplivity.citrixplugin.model.DeconfigureTableEntries;
import com.vmware.simplivity.citrixplugin.services.DeconfigureTableService;

/**
 * A controller which returns information about vSphere objects.
 */
@Controller
public class DeconfigureTableController extends BaseRestController {
	Logger logger = Logger.getLogger(DeconfigureTableController.class);
	private final DeconfigureTableService _deconfigurationTableService;

	@Autowired
	public DeconfigureTableController(DeconfigureTableService deconfigurationTableService) {
		_deconfigurationTableService = deconfigurationTableService;
	}

	/**
	 * De-configuration.
	 * 
	 * @return message.
	 */
	@RequestMapping(value = "/deconfigureTable", method = RequestMethod.GET)
	@ResponseBody
	public DeconfigureTableEntries configure()
			throws Exception {
		return _deconfigurationTableService.getDeconfigureEntries();
	}
}
