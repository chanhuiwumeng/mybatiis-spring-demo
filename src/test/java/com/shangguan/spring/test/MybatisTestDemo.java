package com.shangguan.spring.test;

import com.shangguan.spring.beans.School;
import com.shangguan.spring.mapper.SchoolMapper;
import com.shangguan.spring.service.SchoolService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName: MybatisTestDemo
 * @Description:
 * @Author: 一尘
 * @Date: 2020 年 08 月 07 9:54
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-core.xml"})
public class MybatisTestDemo {
    @Autowired
    SqlSessionFactory  sqlSessionFactory ;
    @Autowired
    SchoolService  schoolService;
    SchoolMapper mapper = null;

    @Before
    public  void getMapper(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
       mapper = sqlSession.getMapper(SchoolMapper.class);
    }
     @Test
    public  void queryById(){
         School school = mapper.selectByPrimaryKey(1);
         System.out.println(school);
     }


    @Test
    public  void queryAll(){
        List<School> school = mapper.queryAll();
        System.out.println(school);
    }


    @Test
    public  void updateSchool(){
        School  school = new School();
        school.setSchName("西安思源学院");
        school.setSchAddress("白鹿原");
        school.setSchDescription("真不知道怎么样");
        school.setSchId(1);
        System.out.println(mapper.updateByPrimaryKeySelective(school));
    }
}
