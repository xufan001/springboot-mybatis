package com.springboot.mybatis.service.impl;


import com.springboot.mybatis.dao.EmployeeDao;
import com.springboot.mybatis.pojo.Employee;
import com.springboot.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> findAll() {

        return employeeDao.findAll();
    }
}
