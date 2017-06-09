package com.seckill.exception;

/**
 * Created by wangxf on 2017/6/9.
 */
public class ServiceException extends Exception {
    public ServiceException(){
        super();
    }

    public ServiceException(Throwable cause){
        super(cause);
    }

    public ServiceException(String message){
        super(message);
    }

    public ServiceException(String message,Throwable cause){
        super(message,cause);
    }

}
