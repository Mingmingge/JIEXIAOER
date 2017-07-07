package com.springmvc.service;

import com.springmvc.dao.UserchatMapper;
import com.springmvc.entity.Userchat;
import com.springmvc.entity.UserchatWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hulimin on 2017/7/7.
 */
@Service
public class UserchatService {

    @Autowired
    private UserchatMapper userchatMapper;

    public int insert(UserchatWithBLOBs userchatWithBLOBs){

        return userchatMapper.insertSelective(userchatWithBLOBs);
    }
}
