/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

package com.vmware.simplivity.citrixplugin.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vmware.simplivity.citrixplugin.model.ConfigureInputData;
import com.vmware.simplivity.citrixplugin.services.ReadCfgFileService;

/**
 * A controller which returns information about vSphere objects.
 */
@Controller
public class ReadCfgFileController extends BaseRestController {
	Logger logger = Logger.getLogger(ReadCfgFileController.class);
	private final ReadCfgFileService _readCfgFileService;

	@Autowired
	public ReadCfgFileController(ReadCfgFileService readCfgFileService) {
		_readCfgFileService = readCfgFileService;
	}

	/**
	 * Read configuration file
	 * 
	 * @return ConfigureInputData.
	 */
	@RequestMapping(value = "/readCfgFile", method = RequestMethod.GET)
	@ResponseBody
	public ConfigureInputData configure()
			throws Exception {
		return _readCfgFileService.readcfgfile();
	}}
