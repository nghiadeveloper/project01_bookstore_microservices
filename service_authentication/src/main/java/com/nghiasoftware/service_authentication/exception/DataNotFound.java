package com.nghiasoftware.service_authentication.exception;

import lombok.Data;

@Data
public class DataNotFound extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String message;

    public DataNotFound(String message) {
        super(message);
        this.message = message;
    }

    public DataNotFound(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

}
