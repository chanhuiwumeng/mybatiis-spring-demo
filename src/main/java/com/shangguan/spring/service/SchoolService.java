package com.shangguan.spring.service;

import com.shangguan.spring.beans.School;
public interface SchoolService{


    int deleteByPrimaryKey(Integer schId);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Integer schId);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

}
