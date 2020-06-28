package com.example.test.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.test.entity.Resp;

public interface IFileService {
	Resp<String> upload(MultipartFile file);
}
