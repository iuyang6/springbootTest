package com.example.test.dao;

import com.example.test.entity.Nyzf;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INyzfDao {

    void add(@Param("id") int id, @Param("zName") String zName,
             @Param("zUser") String zUser, @Param("zLocation") String zLocation, @Param("zTime") String zTime,
             @Param("zImages") String zImages);

    List<Nyzf> listById();
}
