package com.example.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.dao.ILatLngDao;
import com.example.test.entity.LatLng;
import com.example.test.service.ILatLngService;

@Service
public class LatLngService implements ILatLngService{
	
	@Autowired
	private ILatLngDao iLatLngDao;

	@Override
	public LatLng findByName(String name) {
		return iLatLngDao.findByName(name);
	}
}
