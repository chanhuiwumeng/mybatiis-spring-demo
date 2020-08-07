package com.shangguan.spring.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.shangguan.spring.mapper.SchoolMapper;
import com.shangguan.spring.beans.School;
import com.shangguan.spring.service.SchoolService;
@Service
public class SchoolServiceImpl implements SchoolService{

    @Resource
    private SchoolMapper schoolMapper;

    @Override
    public int deleteByPrimaryKey(Integer schId) {
        return schoolMapper.deleteByPrimaryKey(schId);
    }

    @Override
    public int insert(School record) {
        return schoolMapper.insert(record);
    }

    @Override
    public int insertSelective(School record) {
        return schoolMapper.insertSelective(record);
    }

    @Override
    public School selectByPrimaryKey(Integer schId) {
        return schoolMapper.selectByPrimaryKey(schId);
    }

    @Override
    public int updateByPrimaryKeySelective(School record) {
        return schoolMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(School record) {
        return schoolMapper.updateByPrimaryKey(record);
    }

}
