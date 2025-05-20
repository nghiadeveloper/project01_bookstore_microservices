package com.nghiasoftware.service_authentication.controller;

import com.nghiasoftware.service_authentication.payload.response.BaseResponse;
import com.nghiasoftware.service_authentication.services.AuthenticationServices;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Encoders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.crypto.SecretKey;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthenticationController {

    @Autowired
    private AuthenticationServices authenticationServices;

    @PostMapping("/sign-in")
    public ResponseEntity<?> signIn(@RequestParam String email, @RequestParam String password) {
        String token = authenticationServices.authenticate(email, password);

        BaseResponse response = new BaseResponse();
        response.setData(token);

        return ResponseEntity.ok(response);
    }
}
