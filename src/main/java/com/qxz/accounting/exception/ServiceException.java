package com.qxz.accounting.exception;

import lombok.Data;

@Data
public class ServiceException extends RuntimeException {
    private int statusCode;
    private BizErrorCode errorCode; // biz error code
    private ErrorType errorType; // Service, Client, Unknown

    public ServiceException(String message) {
        super(message);
    }
}
