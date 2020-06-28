package com.example.test.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.test.entity.LatLng;

@Repository
public interface ILatLngDao {
	LatLng findByName(@Param("name") String name);
}
