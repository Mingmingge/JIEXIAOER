package com.springmvc.dao;

import com.springmvc.entity.Userchat;
import com.springmvc.entity.UserchatWithBLOBs;
import java.util.Date;

public interface UserchatMapper {
    int deleteByPrimaryKey(Date createtime);

    int insert(UserchatWithBLOBs record);

    int insertSelective(UserchatWithBLOBs record);

    UserchatWithBLOBs selectByPrimaryKey(Date createtime);

    int updateByPrimaryKeySelective(UserchatWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserchatWithBLOBs record);

    int updateByPrimaryKey(Userchat record);
}