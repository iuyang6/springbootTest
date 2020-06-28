package com.example.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.test.entity.Comment;

@Repository
public interface ICommentDao {
	
	void add(@Param("u_id") int u_id,@Param("target_id") int target_id,
			@Param("var") String var,@Param("image") String image,@Param("count") int count);

	List<Comment> listByTid(@Param("target_id") int target_id);
}	
 