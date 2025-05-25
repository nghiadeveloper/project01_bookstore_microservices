package com.nghiasoftware.service_authentication.services.imp;

import com.nghiasoftware.service_authentication.entity.Users;
import com.nghiasoftware.service_authentication.exception.DataNotFound;
import com.nghiasoftware.service_authentication.repository.UserRepository;
import com.nghiasoftware.service_authentication.services.AuthenticationServices;
import com.nghiasoftware.service_authentication.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServicesImp implements AuthenticationServices {

    @Autowired
    private JwtHelper jwtHelper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String signIn(String email, String password) {
        Users users = userRepository.findByEmail(email).orElseThrow(() -> new DataNotFound("User not found with email: " + email));
        if (!passwordEncoder.matches(password, users.getPassword())) {
            throw new DataNotFound("Invalid password for user: " + email);
        }else{
            return jwtHelper.generateToken(users.getEmail());
        }
    }

}
