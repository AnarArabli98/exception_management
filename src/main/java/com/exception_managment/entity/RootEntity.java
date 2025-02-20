package com.exception_managment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RootEntity<T> {

    private boolean result;
    private String errorMessage;
    private T data;

    public static  <T> RootEntity<T> ok(T data) {
        RootEntity<T> rootEntity = new RootEntity<T>();
        rootEntity.setResult(true);
        rootEntity.setData(data);
        rootEntity.setErrorMessage(null);
        return rootEntity;
    }
    public static  <T> RootEntity<T> error(String errorMessage) {
        RootEntity<T> rootEntity = new RootEntity<T>();
        rootEntity.setResult(false);
        rootEntity.setErrorMessage(errorMessage);
        rootEntity.setData(null);
        return rootEntity;
    }
}
