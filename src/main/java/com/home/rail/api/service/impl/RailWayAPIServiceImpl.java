package com.home.rail.api.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.rail.api.service.IRailWayAPIService;

@RestController
public class RailWayAPIServiceImpl implements IRailWayAPIService{

	@Override
	@RequestMapping(value = "/pnrStatus", method = RequestMethod.GET)
	public String getPNRStatus() {
		return "PNR";
	}
	
}
