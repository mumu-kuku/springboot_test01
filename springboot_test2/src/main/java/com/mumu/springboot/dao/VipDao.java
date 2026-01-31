package com.mumu.springboot.dao;

import com.mumu.springboot.bean.Vip;
import org.springframework.stereotype.Repository;

@Repository
public interface VipDao {
    int deleteByPrimaryKey(Long id);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectById(Long id);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);
}