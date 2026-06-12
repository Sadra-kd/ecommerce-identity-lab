package com.khodadadzadeh.ecommerce_identity_lab.exception;

import org.springframework.http.HttpStatus;

public abstract class BusinessException extends RuntimeException {

    private final String messageKey;
    private final Object[] args;

    protected BusinessException(String messageKey, Object... args) {
        super(messageKey);
        this.messageKey = messageKey;
        this.args = args;
    }

    public abstract HttpStatus httpStatus();

    public String messageKey() {
        return messageKey;
    }

    public Object[] messageArgs() {
        return args;
    }
}
