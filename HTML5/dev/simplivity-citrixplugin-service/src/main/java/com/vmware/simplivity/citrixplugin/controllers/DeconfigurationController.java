/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

package com.vmware.simplivity.citrixplugin.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vmware.simplivity.citrixplugin.model.BaseInputData;
import com.vmware.simplivity.citrixplugin.model.Message;
import com.vmware.simplivity.citrixplugin.services.DeconfigurationService;

/**
 * A controller which returns information about vSphere objects.
 */
@Controller
public class DeconfigurationController extends BaseRestController {
	Logger logger = Logger.getLogger(DeconfigurationController.class);
	private final DeconfigurationService _deconfigurationService;

	@Autowired
	public DeconfigurationController(DeconfigurationService deconfigurationService) {
		_deconfigurationService = deconfigurationService;
	}

	/**
	 * De-configuration.
	 * 
	 * @return message.
	 */
	@RequestMapping(value = "/deconfigureService", method = RequestMethod.POST)
	@ResponseBody
	public Message configure(@RequestBody BaseInputData baseInputData)
			throws Exception {
		return _deconfigurationService.deconfigure(baseInputData);
	}
}
