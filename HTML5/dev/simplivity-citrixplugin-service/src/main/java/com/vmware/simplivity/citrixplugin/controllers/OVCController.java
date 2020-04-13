/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

package com.vmware.simplivity.citrixplugin.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vmware.simplivity.citrixplugin.model.Message;
import com.vmware.simplivity.citrixplugin.model.OVCData;
import com.vmware.simplivity.citrixplugin.services.OVCService;

/**
 * A controller which saves the OVC information.
 */
@Controller
public class OVCController extends BaseRestController {
	private Logger logger = Logger.getLogger(OVCController.class);
	private final OVCService _ovcService;

	@Autowired
	public OVCController(OVCService ovcService) {
		_ovcService = ovcService;
	}

	/**
	 * Set the OVC data.
	 * 
	 * @return status.
	 */
	@RequestMapping(value = "/setovcdata", method = RequestMethod.POST)
	@ResponseBody
	public Message setOVCData(@RequestBody OVCData ovcData) throws Exception {
		logger.debug("Entered OVCController:" + ovcData);
		return _ovcService.setOVCData(ovcData);
	}
	
	@RequestMapping(value = "/isovcdataset", method = RequestMethod.GET)
	@ResponseBody
	public Message isOVCDataSet() throws Exception {
		return _ovcService.isOVCDataSet();
	}
	
	@RequestMapping(value = "/isplatformset", method = RequestMethod.GET)
	@ResponseBody
	public Message isNonSimplivityPlatform() throws Exception {
		return _ovcService.isNonSimplivityPlatform();
	}
}
