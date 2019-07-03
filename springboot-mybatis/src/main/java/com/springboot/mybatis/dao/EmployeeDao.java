package com.springboot.mybatis.dao;


import com.springboot.mybatis.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeDao {

   // @Select("select * from employee")
    //简单sql可使用如上注解
    List<Employee> findAll();
}
