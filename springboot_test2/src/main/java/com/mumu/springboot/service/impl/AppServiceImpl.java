package com.mumu.springboot.service.impl;

import com.mumu.springboot.bean.Vip;
import com.mumu.springboot.dao.VipDao;
import com.mumu.springboot.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service("appService")
public class AppServiceImpl implements AppService {
    @Value("${app.path:/}")
    private String appPath;

    @Autowired
    private VipDao vipDao;

    public void print() {
        System.out.println(appPath);
    }

    @Override
    public Vip getById(Long id) {
        return vipDao.selectById(id);
    }
}
