package com.mumu.springboot.service;

import com.mumu.springboot.bean.Vip;

public interface AppService {
    void print();
    Vip getById(Long id);
}
