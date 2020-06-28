 package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.Comment;
import com.example.test.service.ICommentService;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {
	@Autowired
	private ICommentService iCommentService;
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	private void add(@RequestBody Comment comment) {
		iCommentService.add(comment.getU_id(), comment.getTarget_id(), 
				comment.getVar(), comment.getImgae(), comment.getCount());
	}
	
	@RequestMapping(value = "/listByTid",method = RequestMethod.POST)
	private List<Comment> listByTid(@RequestParam int target_id) {
		
		return iCommentService.listByTid(target_id);
	}
	
}
