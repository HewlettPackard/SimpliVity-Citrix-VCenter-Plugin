/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

package com.vmware.simplivity.citrixplugin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vmware.simplivity.citrixplugin.model.ConfigureInputData;
import com.vmware.simplivity.citrixplugin.model.Message;
import com.vmware.simplivity.citrixplugin.services.ConfigurationService;

/**
 * A controller which returns information about vSphere objects.
 */
@Controller
public class ConfigurationController extends BaseRestController {
	private final ConfigurationService _configurationService;

	@Autowired
	public ConfigurationController(ConfigurationService configurationService) {
		_configurationService = configurationService;
	}

	/**
	 * Configuration.
	 * 
	 * @return message.
	 */
	@RequestMapping(value = "/configure", method = RequestMethod.POST)
	@ResponseBody
	public Message configure(@RequestBody ConfigureInputData configureInputData)
			throws Exception {
		return _configurationService.configure(configureInputData);
	}
}
