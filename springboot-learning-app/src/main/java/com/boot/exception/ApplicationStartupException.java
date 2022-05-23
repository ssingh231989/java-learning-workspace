package com.boot.exception;

public class ApplicationStartupException extends RuntimeException {

    public ApplicationStartupException(Throwable e){
        super(e);
    }

    public ApplicationStartupException(String message,Throwable e){
        super(message,e);
    }
}
