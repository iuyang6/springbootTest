package com.example.test.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.test.entity.Login;

@Repository
public interface ILoginDao {
	
	Login login(@Param("username") String username ,@Param("password") String password);
	
}
