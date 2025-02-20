package com.exception_managment.controller.impl;

import com.exception_managment.controller.RestEmployeeController;
import com.exception_managment.dto.DtoEmployee;
import com.exception_managment.entity.RootEntity;
import com.exception_managment.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeCntrollerImpl extends RestBaseController implements RestEmployeeController {

    @Autowired
    private IEmployeeService employeeService;
//    private EmployeeServiceImpl employeeServiceImpl;

    @GetMapping("/list/{id}")
    @Override
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {

        return ok(employeeService.findEmployeeById(id));
    }
}
