package com.nghiasoftware.service_product.exception;

import com.nghiasoftware.service_product.payload.response.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CentralExpception {

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<?> handleProductNotFound(Exception e) {
        BaseResponse response = new BaseResponse();
        response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.setMessage(e.getMessage());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }

}
