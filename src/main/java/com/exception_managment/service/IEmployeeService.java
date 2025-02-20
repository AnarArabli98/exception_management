package com.exception_managment.service;

import com.exception_managment.dto.DtoEmployee;
import com.exception_managment.entity.Employee;

public interface IEmployeeService {
    public DtoEmployee findEmployeeById(Long id);
}
