package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.LatLng;
import com.example.test.service.ILatLngService;

@RestController
@RequestMapping(value = "/latlng")
public class LatLngController {
	
	@Autowired
	private ILatLngService iLatLngService;
	
	@RequestMapping(value = "/findbyname",method = RequestMethod.POST)
	private LatLng findByName(@RequestParam String name) {
		return iLatLngService.findByName(name);
	}
}
