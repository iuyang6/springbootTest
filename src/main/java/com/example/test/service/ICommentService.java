package com.example.test.service;

import java.util.List;

import com.example.test.entity.Comment;

public interface ICommentService {
	
	void add(int u_id,int target_id,String var,String image,int count);
	
	List<Comment> listByTid(int target_id);
}
