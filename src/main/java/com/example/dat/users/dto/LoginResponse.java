package com.example.dat.users.dto;

import com.example.dat.role.entity.Role;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LoginResponse {

    private String token;
    private List<Role> roles;
}
