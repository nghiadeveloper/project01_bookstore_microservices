package com.nghiasoftware.service_authentication.entity;

import com.nghiasoftware.service_authentication.enumable.StatusUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "users")
public class Users {

    @Id
    private String id;

    private String email;
    private String password;
    private int attemp;

    @Enumerated(EnumType.STRING)
    private StatusUser status;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
