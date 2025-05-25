package com.nghiasoftware.service_authentication.exception;

import com.nghiasoftware.service_authentication.payload.response.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CentralExpception {

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<?> handleException(Exception e) {
        BaseResponse response = new BaseResponse();
        response.setCode(HttpStatus.UNAUTHORIZED.value());
        response.setMessage("An error occurred: " + e.getMessage());

        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(response);
    }

}
