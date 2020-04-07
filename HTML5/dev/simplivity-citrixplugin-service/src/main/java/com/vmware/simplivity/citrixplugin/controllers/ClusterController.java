/* Copyright (c) 2018 VMware, Inc. All rights reserved. */

package com.vmware.simplivity.citrixplugin.controllers;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vmware.simplivity.citrixplugin.model.ClusterAndHostInfo;
import com.vmware.simplivity.citrixplugin.model.Message;
import com.vmware.simplivity.citrixplugin.services.ClusterService;

/**
 * A controller which returns information about vSphere objects.
 */
@Controller
public class ClusterController extends BaseRestController {
	Logger logger = Logger.getLogger(ClusterController.class);
	private final ClusterService _clusterService;

	@Autowired
	public ClusterController(ClusterService clusterService) {
		_clusterService = clusterService;
	}

	/**
	 * De-configuration.
	 * 
	 * @return message.
	 */
	@RequestMapping(value = "/clusterInfo", method = RequestMethod.GET)
	@ResponseBody
	public ClusterAndHostInfo clusterInfo()
			throws Exception {
		return _clusterService.getClusterInfo();
	}
	
	/**
	 * De-configuration.
	 * 
	 * @return message.
	 */
	@RequestMapping(value = "/hostInfo/{cluster}", method = RequestMethod.GET)
	@ResponseBody
	public ClusterAndHostInfo getHostInfo(@PathVariable("cluster") String clusterName)
			throws Exception {
		logger.debug("Enetered into getHostInfo controller"+clusterName);
		return _clusterService.getHosts(clusterName);
	}
}
