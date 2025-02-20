package com.exception_managment.handler;

import lombok.Data;

@Data
public class ApiError<E> {

    private Integer statusCode;

    private Exception<E> exception;
}
