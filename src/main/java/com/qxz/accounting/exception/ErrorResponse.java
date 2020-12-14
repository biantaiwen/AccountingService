package com.qxz.accounting.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    private BizErrorCode code;
    private ErrorType errorType;
    private String message;
    private int statusCode;
}
