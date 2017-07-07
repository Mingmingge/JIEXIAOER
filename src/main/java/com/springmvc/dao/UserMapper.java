package com.springmvc.dao;

import com.springmvc.entity.User;

import java.util.ArrayList;

public interface UserMapper {
    int deleteByPrimaryKey(String name);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    ArrayList<User> selectSelective(User user);
}