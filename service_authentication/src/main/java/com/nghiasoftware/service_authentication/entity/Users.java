package com.nghiasoftware.service_authentication.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity(name = "users")
public class Users {

    @Id
    private String id;

    private String email;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
