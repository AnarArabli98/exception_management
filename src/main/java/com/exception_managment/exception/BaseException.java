package com.exception_managment.exception;

public class BaseException extends RuntimeException{

    public BaseException(){

    }

    public BaseException(ErrorMessage errorMessage){
        super(errorMessage.prepareMessage());
    }
}
