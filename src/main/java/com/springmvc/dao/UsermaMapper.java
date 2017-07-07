package com.springmvc.dao;

import com.springmvc.entity.Userma;

public interface UsermaMapper {
    int deleteByPrimaryKey(String name);

    int insert(Userma record);

    int insertSelective(Userma record);

    Userma selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Userma record);

    int updateByPrimaryKey(Userma record);
}