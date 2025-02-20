package com.exception_managment.exception;

import lombok.Getter;

@Getter
public enum MessageType {

    NO_RECORD_FOUND("1001","Tapilmadi!"),
    GENERAL_ERROR("4004","Xeta bas verdi!");

    private String code;
    private String message;

    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
