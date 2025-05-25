package com.nghiasoftware.service_authentication.payload.request;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;
    private String password;
}
