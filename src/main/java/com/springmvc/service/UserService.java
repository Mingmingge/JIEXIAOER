package com.springmvc.service;

import com.springmvc.dao.UserMapper;
import com.springmvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by hulimin on 2017/7/6.
 */
@Service
public class UserService {

    @Autowired

    private UserMapper userMapper;

    public int insert(User user){
        return userMapper.insertSelective(user);
    }
    public User selectByPrimaryKey(String name){
        return userMapper.selectByPrimaryKey(name);

    }
    public int deleteByPrimaryKey(String name){
        return userMapper.deleteByPrimaryKey(name);

    }

    public int updateByPrimaryKeySelective(User user){
        return userMapper.updateByPrimaryKey(user);

    }

    public ArrayList<User> selectSelective(User user){
        return userMapper.selectSelective(user);
    }

}
