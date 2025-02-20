package com.exception_managment.controller.impl;

import com.exception_managment.entity.RootEntity;

public class RestBaseController {

    public <T> RootEntity<T> ok(T data) {
       return RootEntity.ok(data);

    }
    public <T> RootEntity<T> error(String errorMessage) {
        return RootEntity.error(errorMessage);

    }
}
