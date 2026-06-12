package com.khodadadzadeh.ecommerce_identity_lab.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BusinessException {

    public NotFoundException(String messageKey, Object... args) {
        super(messageKey, args);
    }

    @Override
    public HttpStatus httpStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
