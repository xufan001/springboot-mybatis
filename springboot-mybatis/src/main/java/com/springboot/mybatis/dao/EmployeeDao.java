package com.springboot.mybatis.dao;


import com.springboot.mybatis.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeDao {

    @Select("select * from employee")
    List<Employee> findAll();
}
