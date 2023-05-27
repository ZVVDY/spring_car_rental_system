package com.academy.dto;

import com.academy.model.entity.Person;
import com.academy.model.entity.Role;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
public class UserDto {

    private Integer id;
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private Boolean credentialsNonExpired;
    private Boolean accountEnabled;
    private String password;
    private String userName;
    private List<Role> roles;
}
