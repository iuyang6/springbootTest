package com.example.test.service.impl;

import com.example.test.dao.INyzfDao;
import com.example.test.entity.Nyzf;
import com.example.test.service.INyzfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NyzfService implements INyzfService {
    @Autowired
    private INyzfDao iNyzfDao;

    @Override
    public void add(int id, String zName, String zUser, String zLocation, String zTime, String zImages) {
        iNyzfDao.add(id, zName, zUser, zLocation, zTime, zImages);
    }

    @Override
    public List<Nyzf> listById() {
        return iNyzfDao.listById();
    }
}
