package com.example.test.service;

import com.example.test.entity.Nyzf;

import java.util.List;

public interface INyzfService {
	
	void add(int id,String zName,String zUser,String zLocation,String zTime,String zImages);
	
	List<Nyzf> listById();
}
