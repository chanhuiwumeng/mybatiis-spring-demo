package com.shangguan.spring.mapper;

import com.shangguan.spring.beans.School;

import java.util.List;

public interface SchoolMapper {
    int deleteByPrimaryKey(Integer schId);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Integer schId);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

    List<School> queryAll();
}