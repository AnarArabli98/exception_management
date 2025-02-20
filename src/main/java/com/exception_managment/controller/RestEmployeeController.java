package com.exception_managment.controller;

import com.exception_managment.dto.DtoEmployee;
import com.exception_managment.entity.RootEntity;

public interface RestEmployeeController {
    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
