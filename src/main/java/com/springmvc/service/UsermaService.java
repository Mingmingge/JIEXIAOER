package com.springmvc.service;

import com.springmvc.dao.UsermaMapper;
import com.springmvc.entity.Userma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hulimin on 2017/7/6.
 */
@Service

public class UsermaService {

    @Autowired

    private UsermaMapper usermaMapper;

    public int insert(Userma userma){

        return usermaMapper.insertSelective(userma);


    }


}
