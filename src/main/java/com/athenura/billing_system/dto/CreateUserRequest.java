package com.athenura.billing_system.dto;

import com.athenura.billing_system.user.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {

    private String name;
    private String email;
    private String password;
    private Role role;
}
