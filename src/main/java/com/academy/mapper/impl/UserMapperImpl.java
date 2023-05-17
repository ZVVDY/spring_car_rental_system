package com.academy.mapper.impl;

import com.academy.dto.UsersDto;
import com.academy.mapper.UserMapper;
import com.academy.model.entity.Users;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    @Override
    public UsersDto toDto(Users model) {
        return null;
    }

    @Override
    public Users toModel(UsersDto usersDto) {
        return null;
    }

    @Override
    public List<UsersDto> modelsToDto(List<Users> users) {
        return null;
    }

    @Override
    public List<Users> dtoToModels(List<UsersDto> cards) {
        return null;
    }
}
