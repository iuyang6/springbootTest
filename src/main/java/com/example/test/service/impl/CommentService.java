package com.example.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.dao.ICommentDao;
import com.example.test.entity.Comment;
import com.example.test.service.ICommentService;

@Service
public class CommentService implements ICommentService{
	
	@Autowired
	private ICommentDao iCommentDao;
	
	@Override
	public void add(int u_id, int target_id, String var, String image, int count) {
		iCommentDao.add(u_id, target_id, var, image, count);
	}
	
	@Override
	public List<Comment> listByTid(int target_id) {
		
		return iCommentDao.listByTid(target_id);
	}
	
}
