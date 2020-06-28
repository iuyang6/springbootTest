package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.test.entity.Resp;
import com.example.test.service.IFileService;

@RestController
@RequestMapping(value = "/file")
public class FileController {
	
	@Autowired
	private IFileService iFileService;
	
	@RequestMapping(value = "/upload",method = RequestMethod.POST)
	private Resp<String> upload(@RequestParam("file")MultipartFile file) {
		
		return iFileService.upload(file);
	}

}
