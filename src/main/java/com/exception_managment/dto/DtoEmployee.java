package com.exception_managment.dto;

import lombok.Data;

@Data
public class DtoEmployee {
    private Long  id;
    private String  firstName;
    private String lastName;

    private DtoDepartment dtoDepartment;
}
