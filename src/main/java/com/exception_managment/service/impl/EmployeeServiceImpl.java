package com.exception_managment.service.impl;

import com.exception_managment.dto.DtoDepartment;
import com.exception_managment.dto.DtoEmployee;
import com.exception_managment.entity.Department;
import com.exception_managment.entity.Employee;
import com.exception_managment.exception.BaseException;
import com.exception_managment.exception.ErrorMessage;
import com.exception_managment.exception.MessageType;
import com.exception_managment.repository.EmployeeRepository;
import com.exception_managment.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id) {
        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();

        Optional<Employee>  optional = employeeRepository.findById(id);
        if(optional.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_FOUND,id.toString()));

        }
        Employee employee1 = optional.get();
        Department department = employee1.getDepartment();

        BeanUtils.copyProperties(employee1, dtoEmployee);
        BeanUtils.copyProperties(department, dtoDepartment);
        dtoEmployee.setDtoDepartment(dtoDepartment);
        return dtoEmployee;



    }
}
