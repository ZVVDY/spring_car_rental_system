package com.academy.dto;

import com.academy.model.entity.Person;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UsersDto {

    private Integer id;
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private Boolean credentialsNonExpired;
    private Boolean accountEnabled;
    private String password;
    private String userName;
    private Person person;
}
