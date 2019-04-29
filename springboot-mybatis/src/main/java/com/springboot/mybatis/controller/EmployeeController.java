package com.springboot.mybatis.controller;




import com.springboot.mybatis.pojo.Employee;
import com.springboot.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *这是一个简单的springboot整合mybatis的demo,供初学者参考
 */
@RestController  //RestController=RequestMapping+Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询所有员工
     * @return
     */
    @RequestMapping("/all")
    public List<Employee> findAll(){

        return employeeService.findAll();
    }
}
