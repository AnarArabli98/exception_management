package com.exception_managment.handler;

import lombok.Data;

import java.util.Date;

@Data
public class Exception<E> {

    private String hostName;
    private Date createTime;
    private String path;
    private E message;
}
