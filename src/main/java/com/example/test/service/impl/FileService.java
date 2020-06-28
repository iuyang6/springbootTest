package com.example.test.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.test.entity.Resp;
import com.example.test.service.IFileService;
import java.io.File;

@Service
public class FileService implements IFileService{

	@Override
	public Resp<String> upload(MultipartFile file) {
		if(file.isEmpty()){
			return Resp.fail("400", "文件为空！");
		}
		String originalFilename = file.getOriginalFilename();
		String fileName = System.currentTimeMillis()+"."+originalFilename.substring(originalFilename.lastIndexOf(".")+1);
		String filePath = "D:\\upload\\";
		File dest = new File(filePath+fileName);
		
		if(dest.getParentFile().exists())
		dest.getParentFile().mkdirs();
		try {
			file.transferTo(dest);
		} catch (Exception e) {
			e.printStackTrace();
			return Resp.fail("500", originalFilename + "上传失败！");
		}
		return Resp.success(fileName);
	}
}
