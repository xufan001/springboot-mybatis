package com.springboot.mybatis.service;


import com.springboot.mybatis.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
